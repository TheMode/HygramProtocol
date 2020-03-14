package fr.hygram.utils;

import com.github.simplenet.packet.Packet;
import fr.hygram.packet.PacketHandler;
import fr.hygram.packet.PacketWriter;

public class PacketUtils {

    public static Packet writePacket(PacketHandler packetHandler) {
        Packet packet = Packet.builder();
        PacketWriter packetWriter = new PacketWriter(packet);

        packet.putByte(packetHandler.getId());
        packetHandler.write(packetWriter);

        return packet;
    }

}
