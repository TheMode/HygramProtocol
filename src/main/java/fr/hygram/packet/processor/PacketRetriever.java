package fr.hygram.packet.processor;

import com.esotericsoftware.reflectasm.ConstructorAccess;
import fr.hygram.packet.PacketHandler;

public class PacketRetriever {

    private static final int SIZE = 0xFF;

    private ConstructorAccess[] constructorAccesses = new ConstructorAccess[SIZE];

    public void register(int id, Class<? extends PacketHandler> packet) {
        constructorAccesses[id] = ConstructorAccess.get(packet);
    }

    public PacketHandler retrievePacket(short packetId) {
        //System.out.println("RECEIVED PACKET 0x" + Integer.toHexString(id));
        if (packetId > SIZE)
            throw new IllegalStateException("Packet ID 0x" + Integer.toHexString(packetId) + " has been tried to be parsed, debug needed");

        ConstructorAccess<? extends PacketHandler> constructorAccess = constructorAccesses[packetId];
        if (constructorAccess == null)
            throw new IllegalStateException("Packet id 0x" + Integer.toHexString(packetId) + " isn't registered!");

        PacketHandler packet = constructorAccess.newInstance();
        return packet;
    }

}
