package fr.hygram.packet.identifier;

public class ServerPacketIdentifier {

    public static final short LOGIN_SUCCESS_PACKET = 0x00;
    // Ask the client to open a window (glfw for example)
    public static final short OPEN_WINDOW_PACKET = 0x01;

    // Used to give the windowId and ask the client to create a framebuffer
    public static final short CREATE_APPLICATION_PACKET = 0x02;

    public static final short DELETE_APPLICATION_PACKET = 0x03;

    // All data contained in the next framebuffer to render
    // Should also contain a md5 representing the whole FrameDataContainer (all assets it contains)
    // Framebuffer data is ignored if files aren't up-to-date
    public static final short APPLICATION_FRAMEBUFFER_PACKET = 0x04;

    // In case of a problem, send all assets md5 to check which wrong is outdated to clear and re-download them
    public static final short APPLICATION_ASSET_LIST_PACKET = 0x05;

    // All missing assets data to update the client
    public static final short APPLICATION_ASSET_DATA_PACKET = 0x06;

    public static final short APPLICATION_POSITION_CHANGE_PACKET = 0x07;

    public static final short PING_PACKET = 0x0A;

}
