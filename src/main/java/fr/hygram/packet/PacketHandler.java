package fr.hygram.packet;

public interface PacketHandler {

    void write(PacketWriter writer);

    void read(PacketReader reader, Runnable callback);

    int getId();

}
