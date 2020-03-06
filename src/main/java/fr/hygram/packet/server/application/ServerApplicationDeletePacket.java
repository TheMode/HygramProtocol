package fr.hygram.packet.server.application;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ServerPacketIdentifier;

public class ServerApplicationDeletePacket implements PacketHandler {

    public int applicationId;

    @Override
    public void write(PacketWriter writer) {
        writer.writeInt(applicationId);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readInteger(value -> {
            applicationId = value;
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ServerPacketIdentifier.APPLICATION_DELETE_PACKET;
    }
}
