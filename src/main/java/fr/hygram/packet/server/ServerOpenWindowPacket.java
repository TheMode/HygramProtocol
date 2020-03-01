package fr.hygram.packet.server;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ServerPacketIdentifier;

public class ServerOpenWindowPacket implements PacketHandler {

    public String title;
    public int width, height;

    @Override
    public void write(PacketWriter writer) {
        writer.writeString(title);
        writer.writeInt(width);
        writer.writeInt(height);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readString(value -> title = value);
        reader.readInteger(value -> width = value);
        reader.readInteger(i -> {
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ServerPacketIdentifier.OPEN_WINDOW_PACKET;
    }
}
