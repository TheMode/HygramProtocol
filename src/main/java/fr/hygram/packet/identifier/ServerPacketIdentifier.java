package fr.hygram.packet.identifier;

public class ServerPacketIdentifier {

    public static final short LOGIN_SUCCESS_PACKET = 0x00;
    // Ask the client to open a window (glfw for example)
    public static final short OPEN_WINDOW_PACKET = 0x01;

    // Used to give the windowId and ask the client to create a FBO
    public static final short APPLICATION_CREATE_PACKET = 0x10;

    public static final short APPLICATION_DELETE_PACKET = 0x11;

    // Manage the position and the size of the client FBO
    public static final short APPLICATION_POSITION_PACKET = 0x12;

    // In case of a problem, send all assets md5 to check which wrong is outdated to clear and re-download them
    // Sent after APPLICATION_ASSET_LIST_REQUEST_PACKET
    public static final short APPLICATION_ASSET_LIST_PACKET = 0x13;

    // All missing assets data to update the client
    // Sent after APPLICATION_ASSET_REQUEST_PACKET
    public static final short APPLICATION_ASSET_DATA_PACKET = 0x14;

    // All data contained in the next framebuffer to render
    // Should also contain a md5 representing the whole FrameDataContainer (all assets it contains)
    // Framebuffer data is ignored if files aren't up-to-date
    public static final short FRAME_SPRITE_CREATE_PACKET = 0x20;

    public static final short FRAME_SPRITE_DELETE_PACKET = 0x21;

    public static final short FRAME_SPRITE_EDIT_PACKET = 0x22;

    public static final short PING_PACKET = 0x30;

}
