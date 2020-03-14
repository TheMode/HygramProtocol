package fr.hygram.packet.identifier;

public class ClientPacketIdentifier {

    // Should specify if he connects as a guest or user and give information accordingly (password or joincode)
    public static final byte CONNECTION_TYPE_PACKET = 0x00;
    public static final byte DEVICE_INFO_PACKET = 0x01;

    public static final byte WINDOW_CREATION_REQUEST_PACKET = 0x02;

    // if the client does not have all correct assets, request the list from the server
    // Sent after APPLICATION_FRAMEBUFFER_PACKET
    public static final short APPLICATION_ASSET_LIST_REQUEST_PACKET = 0x10;

    // Send all missing files md5
    // Sent after APPLICATION_ASSET_LIST_PACKET
    public static final short APPLICATION_ASSET_REQUEST_PACKET = 0x11;

    // Tell the server that all files have been installed successfully
    public static final short APPLICATION_ASSET_SUCCESS = 0x12;

    public static final byte PONG_PACKET = 0x20;

    // Inputs
    public static final byte MOUSE_POSITION_PACKET = 0x30;
    public static final byte MOUSE_CLICK_PACKET = 0x31;
    public static final byte KEYBOARD_ACTION_PACKET = 0x32;

}
