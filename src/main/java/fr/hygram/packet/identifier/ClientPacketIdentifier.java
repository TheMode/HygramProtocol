package fr.hygram.packet.identifier;

public class ClientPacketIdentifier {

    public static final short CONNECTION_TYPE_PACKET = 0x00;
    public static final short PASSWORD_PACKET = 0x01;
    public static final short DEVICE_INFO_PACKET = 0x02;

    public static final short GUEST_INFO_PACKET = 0x03;

    public static final short PONG_PACKET = 0x04;

    // Inputs
    public static final short MOUSE_POSITION_PACKET = 0x10;
    public static final short MOUSE_CLICK_PACKET = 0x11;
    public static final short KEYBOARD_ACTION_PACKET = 0x12;

}
