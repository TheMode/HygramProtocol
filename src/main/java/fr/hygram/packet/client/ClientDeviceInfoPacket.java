package fr.hygram.packet.client;

import fr.hygram.screen.ClientDevice;
import fr.hygram.screen.DeviceOrientation;
import fr.hygram.screen.DeviceType;
import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ClientPacketIdentifier;

public class ClientDeviceInfoPacket implements PacketHandler {

    public ClientDevice clientDevice;

    private int screenWidth, screenHeight;
    private int physicalScreenWidth, getPhysicalScreenHeight;
    private DeviceType deviceType;
    private DeviceOrientation deviceOrientation;

    @Override
    public void write(PacketWriter writer) {
        writer.writeInt(clientDevice.getScreenWidth());
        writer.writeInt(clientDevice.getScreenHeight());

        writer.writeInt(clientDevice.getPhysicalScreenWidth());
        writer.writeInt(clientDevice.getPhysicalScreenHeight());

        writer.writeInt(clientDevice.getDeviceType().ordinal());

        writer.writeInt(clientDevice.getDeviceOrientation().ordinal());
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readInteger(value -> screenWidth = value);
        reader.readInteger(value -> screenHeight = value);
        reader.readInteger(value -> physicalScreenWidth = value);
        reader.readInteger(value -> getPhysicalScreenHeight = value);
        reader.readInteger(value -> deviceType = DeviceType.values()[value]);
        reader.readInteger(value -> {
            deviceOrientation = DeviceOrientation.values()[value];
            clientDevice = new ClientDevice(screenWidth, screenHeight,
                    physicalScreenWidth, getPhysicalScreenHeight, deviceType, deviceOrientation);
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ClientPacketIdentifier.DEVICE_INFO_PACKET;
    }
}
