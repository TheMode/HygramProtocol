package fr.hygram.packet;

import com.github.simplenet.packet.Packet;

import java.util.UUID;
import java.util.function.Consumer;

public class PacketWriter {

    private Packet packet;

    public PacketWriter(Packet packet) {
        this.packet = packet;
    }

    public void writeBoolean(boolean b) {
        packet.putBoolean(b);
    }

    public void writeByte(byte b) {
        packet.putByte(b);
    }

    public void writeShort(short s) {
        packet.putShort(s);
    }

    public void writeInt(int i) {
        packet.putInt(i);
    }

    public void writeLong(long l) {
        packet.putLong(l);
    }

    public void writeFloat(float f) {
        packet.putFloat(f);
    }

    public void writeDouble(double d) {
        packet.putDouble(d);
    }

    public void writeString(String string) {
        packet.putString(string);
    }

    public void writeBytes(byte[] bytes) {
        packet.putBytes(bytes);
    }

    public void write(Consumer<Packet> consumer) {
        if (consumer != null)
            consumer.accept(packet);
    }

    public void writeUuid(UUID uuid) {
        writeLong(uuid.getMostSignificantBits());
        writeLong(uuid.getLeastSignificantBits());
    }

}
