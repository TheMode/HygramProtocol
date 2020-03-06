package fr.hygram.packet.server.frame;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ServerPacketIdentifier;

public class ServerFrameSpriteEditPacket implements PacketHandler {

    public String identifier;
    public byte[] data;

    @Override
    public void write(PacketWriter writer) {
        writer.writeString(identifier);
        writer.writeInt(data.length);
        writer.writeBytes(data);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readString(string -> identifier = string);
        reader.readInteger(size -> {
            reader.readBytes(size, bytes -> {
                data = bytes;
                callback.run();
            });
        });
    }

    @Override
    public byte getId() {
        return ServerPacketIdentifier.FRAME_SPRITE_EDIT_PACKET;
    }
}
