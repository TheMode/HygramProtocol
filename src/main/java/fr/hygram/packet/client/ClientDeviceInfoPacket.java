package fr.hygram.packet.client;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ClientPacketIdentifier;
import fr.hygram.screen.ClientDevice;

public class ClientDeviceInfoPacket implements PacketHandler {

    public ClientDevice clientDevice;

    @Override
    public void write(PacketWriter writer) {
        writer.writeClientDevice(clientDevice);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readClientDevice(value -> {
            clientDevice = value;
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ClientPacketIdentifier.DEVICE_INFO_PACKET;
    }
}
