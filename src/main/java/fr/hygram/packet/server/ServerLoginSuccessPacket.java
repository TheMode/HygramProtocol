package fr.hygram.packet.server;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ServerPacketIdentifier;

public class ServerLoginSuccessPacket implements PacketHandler {

    @Override
    public void write(PacketWriter writer) {

    }

    @Override
    public void read(PacketReader reader, Runnable callback) {

    }

    @Override
    public byte getId() {
        return ServerPacketIdentifier.LOGIN_SUCCESS_PACKET;
    }
}
