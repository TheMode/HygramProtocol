package fr.hygram.client;

import fr.hygram.packet.processor.PacketExecutor;

public class ClientHandler {

    private PacketExecutor packetExecutor;

    public ClientHandler() {
        this.packetExecutor = new PacketExecutor();
    }

    public PacketExecutor getPacketExecutor() {
        return packetExecutor;
    }
}
