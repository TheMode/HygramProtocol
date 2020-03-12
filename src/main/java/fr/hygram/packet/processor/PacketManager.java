package fr.hygram.packet.processor;

import com.github.simplenet.Client;
import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;

public class PacketManager {

    private PacketRetriever packetRetriever;

    public PacketManager(PacketRetriever packetRetriever) {
        this.packetRetriever = packetRetriever;
    }

    public void processPacket(Client client, PacketExecutor packetExecutor) {
        client.readByteAlways(packetId -> {
            PacketHandler clientPacket = packetRetriever.retrievePacket(packetId);

            PacketReader packetReader = new PacketReader(client);

            clientPacket.read(packetReader, () -> {
                packetExecutor.addPacket(clientPacket);
            });

        });

    }

}
