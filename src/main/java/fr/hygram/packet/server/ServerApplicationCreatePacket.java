package fr.hygram.packet.server;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ServerPacketIdentifier;

public class ServerApplicationCreatePacket implements PacketHandler {

    public String applicationName;
    public int applicationId;
    public int width, height;

    @Override
    public void write(PacketWriter writer) {
        writer.writeString(applicationName);
        writer.writeInt(applicationId);
        writer.writeInt(width);
        writer.writeInt(height);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readString(value -> applicationName = value);
        reader.readInteger(value -> applicationId = value);
        reader.readInteger(value -> width = value);
        reader.readInteger(i -> {
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ServerPacketIdentifier.APPLICATION_CREATE_PACKET;
    }
}
