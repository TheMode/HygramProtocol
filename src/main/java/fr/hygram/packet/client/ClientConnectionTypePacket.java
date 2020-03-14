package fr.hygram.packet.client;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ClientPacketIdentifier;
import fr.hygram.utils.ConnectionType;

public class ClientConnectionTypePacket implements PacketHandler {

    public ConnectionType connectionType;

    // Password for user, Joincode for guest
    public String pass;

    @Override
    public void write(PacketWriter writer) {
        writer.writeInt(connectionType.ordinal());
        writer.writeString(pass);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readInteger(value -> connectionType = ConnectionType.values()[value]);
        reader.readString(value -> {
            pass = value;
            callback.run();
        });
    }

    @Override
    public byte getId() {
        return ClientPacketIdentifier.CONNECTION_TYPE_PACKET;
    }
}
