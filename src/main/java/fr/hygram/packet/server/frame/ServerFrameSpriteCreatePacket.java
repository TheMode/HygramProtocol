package fr.hygram.packet.server.frame;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ServerPacketIdentifier;

public class ServerFrameSpriteCreatePacket implements PacketHandler {

    public String identifier;
    public String textureIdentifier;
    public float size;

    @Override
    public void write(PacketWriter writer) {
        writer.writeString(identifier);
        writer.writeString(textureIdentifier);
        writer.writeFloat(size);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readString(string -> identifier = string);
        reader.readString(string -> textureIdentifier = string);
        reader.readFloat(value -> {
            size = value;
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ServerPacketIdentifier.FRAME_SPRITE_CREATE_PACKET;
    }
}
