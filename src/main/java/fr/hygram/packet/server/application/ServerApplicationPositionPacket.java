package fr.hygram.packet.server.application;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ServerPacketIdentifier;

public class ServerApplicationPositionPacket implements PacketHandler {

    public float x, y, z;
    public float width, height;

    @Override
    public void write(PacketWriter writer) {
        writer.writeFloat(x);
        writer.writeFloat(y);
        writer.writeFloat(z);
        writer.writeFloat(width);
        writer.writeFloat(height);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readFloat(value -> x = value);
        reader.readFloat(value -> y = value);
        reader.readFloat(value -> z = value);
        reader.readFloat(value -> width = value);
        reader.readFloat(value -> {
            height = value;
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ServerPacketIdentifier.APPLICATION_POSITION_PACKET;
    }
}
