package fr.hygram.packet.processor;

import fr.hygram.packet.PacketHandler;

import java.util.LinkedList;

public class PacketExecutor {

    private LinkedList<PacketHandler> queue = new LinkedList<>();

    public void addPacket(PacketHandler clientPacket) {
        synchronized (queue) {
            this.queue.add(clientPacket);
        }
    }

    public LinkedList<PacketHandler> getQueue() {
        return queue;
    }
}
