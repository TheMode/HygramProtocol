package fr.hygram.packet.server.frame;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ServerPacketIdentifier;

public class ServerFrameSpriteDeletePacket implements PacketHandler {

    public String identifier;

    @Override
    public void write(PacketWriter writer) {
        writer.writeString(identifier);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readString(string -> {
            identifier = string;
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ServerPacketIdentifier.FRAME_SPRITE_DELETE_PACKET;
    }
}
