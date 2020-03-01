package fr.hygram.packet.client;

import fr.hygram.utils.ConnectionType;
import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ClientPacketIdentifier;

public class ClientConnectionTypePacket implements PacketHandler {

    public ConnectionType connectionType;

    @Override
    public void write(PacketWriter writer) {
        writer.writeInt(connectionType.ordinal());
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readInteger(value -> {
            connectionType = ConnectionType.values()[value];
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ClientPacketIdentifier.CONNECTION_TYPE_PACKET;
    }
}
