package fr.hygram.packet;

import com.github.simplenet.Client;
import com.github.simplenet.utility.exposed.consumer.BooleanConsumer;
import com.github.simplenet.utility.exposed.consumer.ByteConsumer;
import com.github.simplenet.utility.exposed.consumer.FloatConsumer;
import com.github.simplenet.utility.exposed.consumer.ShortConsumer;
import fr.hygram.utils.StringConsumer;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PacketReader {

    private Client client;

    public PacketReader(Client client) {
        this.client = client;
    }

    public void readBoolean(BooleanConsumer consumer) {
        client.readBoolean(consumer);
    }

    public void readByte(ByteConsumer consumer) {
        client.readByte(consumer);
    }

    public void readShort(ShortConsumer consumer) {
        client.readShort(consumer);
    }

    public void readInteger(IntConsumer consumer) {
        client.readInt(consumer);
    }

    public void readLong(LongConsumer consumer) {
        client.readLong(consumer);
    }

    public void readFloat(FloatConsumer consumer) {
        client.readFloat(consumer);
    }

    public void readDouble(DoubleConsumer consumer) {
        client.readDouble(consumer);
    }

    public void readString(StringConsumer consumer) {
        client.readString(s -> consumer.accept(s));
    }

}
