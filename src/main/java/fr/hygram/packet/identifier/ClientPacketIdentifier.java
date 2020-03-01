package fr.hygram.packet.identifier;

public class ClientPacketIdentifier {

    // Should specify if he connects as a guest or user and give information accordingly (password or joincode)
    public static final byte CONNECTION_TYPE_PACKET = 0x00;
    public static final byte DEVICE_INFO_PACKET = 0x02;

    public static final byte PONG_PACKET = 0x0A;

    // Inputs
    public static final byte MOUSE_POSITION_PACKET = 0x10;
    public static final byte MOUSE_CLICK_PACKET = 0x11;
    public static final byte KEYBOARD_ACTION_PACKET = 0x12;

}
