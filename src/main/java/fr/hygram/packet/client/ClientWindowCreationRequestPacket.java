package fr.hygram.packet.client;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ClientPacketIdentifier;

public class ClientWindowCreationRequestPacket implements PacketHandler {

    @Override
    public void write(PacketWriter writer) {

    }

    @Override
    public void read(PacketReader reader, Runnable callback) {

    }

    @Override
    public byte getId() {
        return ClientPacketIdentifier.WINDOW_CREATION_REQUEST_PACKET;
    }
}
