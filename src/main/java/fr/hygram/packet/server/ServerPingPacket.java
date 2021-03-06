package fr.hygram.packet.server;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ServerPacketIdentifier;

public class ServerPingPacket implements PacketHandler {

    public long number;

    @Override
    public void write(PacketWriter writer) {
        writer.writeLong(number);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readLong(value -> {
            number = value;
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ServerPacketIdentifier.PING_PACKET;
    }
}
