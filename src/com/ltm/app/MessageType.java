package com.ltm.app;

public enum MessageType {
    TEXT(1), EMOJI(2), FILE(3), IMAGE(4);

    private final int value;

    public int getValue() {
        return value;
    }

    private MessageType(int value) {
        this.value = value;
    }

    public static MessageType toMessageType(int value) {
        switch (value) {
            case 1:
                return TEXT;
            case 2:
                return EMOJI;
            case 3:
                return FILE;
            default:
                return IMAGE;
        }
    }
}
