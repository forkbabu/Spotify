package com.sensory.speech.snsr;

public enum SnsrRC {
    OK,
    EOF,
    ERROR,
    NOT_OPEN,
    NOT_FOUND,
    NO_MEMORY,
    WRONG_MODE,
    INTERRUPTED,
    INVALID_ARG,
    INVALID_MODE,
    CANNOT_REOPEN,
    INVALID_HANDLE,
    NOT_IMPLEMENTED,
    DELIM_NOT_FOUND,
    FORMAT_NOT_SUPPORTED,
    BUFFER_OVERRUN,
    BUFFER_UNDERRUN,
    RESERVED_A,
    ARG_OUT_OF_RANGE,
    CHANNEL_EXISTS,
    CHANNEL_NOT_BUFFERED,
    CHANNEL_NOT_FOUND,
    CHANNELS_NOT_COMPATIBLE,
    CONFIGURATION_INCONSISTENT,
    CONFIGURATION_MISSING,
    CONNECTION_NOT_FOUND,
    DST_CHANNEL_NOT_FOUND,
    DST_ELEMENT_NOT_IN_BIN,
    DST_PORT_IN_USE,
    ELEMENT_ID_NOT_KNOWN,
    ELEMENT_INIT_FAILED,
    ELEMENT_INIT_INCOMPLETE,
    ELEMENT_IS_NOT_A_BIN,
    ELEMENT_NOT_IN_BIN,
    ELEMENT_NOT_ROOT_BIN,
    ELEMENT_REGISTRATION_FAILED,
    INCORRECT_SETTING_TYPE,
    LICENSE_NOT_VALID,
    ITERATION_LIMIT,
    ELEMENT_API_VIOLATION,
    NAME_NOT_UNIQUE,
    NOT_ENOUGH_SPACE,
    NOT_INITIALIZED,
    PUSH_FAILED,
    REPEAT,
    SETTING_FAILED,
    SETTING_IS_READ_ONLY,
    SETTING_NOT_AVAILABLE,
    SETTING_NOT_FOUND,
    SKIP,
    SRC_CHANNEL_NOT_FOUND,
    SRC_ELEMENT_NOT_IN_BIN,
    SRC_PORT_IN_USE,
    STOP,
    STREAM,
    STREAM_END,
    UNKNOWN_OBJECT_TYPE,
    VALUE_NOT_SET,
    CODE_MODEL_TOO_OLD,
    RESERVED_B,
    NO_MODEL,
    REQUIRE_MISMATCH,
    VERSION_MISMATCH,
    LIBRARY_HEADER,
    LIBRARY_TOO_OLD,
    TIMED_OUT;
    
    private final int swigValue;

    private static class SwigNext {
        private static int next;

        private SwigNext() {
        }

        static /* synthetic */ int access$008() {
            int i = next;
            next = i + 1;
            return i;
        }
    }

    private SnsrRC() {
        this.swigValue = SwigNext.access$008();
    }

    public static SnsrRC swigToEnum(int i) {
        SnsrRC[] snsrRCArr = (SnsrRC[]) SnsrRC.class.getEnumConstants();
        if (i < snsrRCArr.length && i >= 0 && snsrRCArr[i].swigValue == i) {
            return snsrRCArr[i];
        }
        for (SnsrRC snsrRC : snsrRCArr) {
            if (snsrRC.swigValue == i) {
                return snsrRC;
            }
        }
        throw new IllegalArgumentException("No enum " + SnsrRC.class + " with value " + i);
    }

    public final int swigValue() {
        return this.swigValue;
    }

    private SnsrRC(int i) {
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }

    private SnsrRC(SnsrRC snsrRC) {
        int i = snsrRC.swigValue;
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }
}
