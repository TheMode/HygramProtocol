package fr.hygram.packet.server.asset;

import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketReader;
import fr.hygram.packet.PacketWriter;
import fr.hygram.packet.identifier.ServerPacketIdentifier;

public class ServerApplicationAssetListPacket implements PacketHandler {

    public String combinedMd5;

    @Override
    public void write(PacketWriter writer) {
        writer.writeString(combinedMd5);
    }

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readString(value -> combinedMd5 = value);
    }

    @Override
    public byte getId() {
        return ServerPacketIdentifier.APPLICATION_ASSET_LIST_PACKET;
    }
}
