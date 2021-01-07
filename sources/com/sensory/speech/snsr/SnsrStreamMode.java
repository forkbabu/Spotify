package com.sensory.speech.snsr;

public enum SnsrStreamMode {
    READ,
    WRITE;
    
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

    private SnsrStreamMode() {
        this.swigValue = SwigNext.access$008();
    }

    public static SnsrStreamMode swigToEnum(int i) {
        SnsrStreamMode[] snsrStreamModeArr = (SnsrStreamMode[]) SnsrStreamMode.class.getEnumConstants();
        if (i < snsrStreamModeArr.length && i >= 0 && snsrStreamModeArr[i].swigValue == i) {
            return snsrStreamModeArr[i];
        }
        for (SnsrStreamMode snsrStreamMode : snsrStreamModeArr) {
            if (snsrStreamMode.swigValue == i) {
                return snsrStreamMode;
            }
        }
        throw new IllegalArgumentException("No enum " + SnsrStreamMode.class + " with value " + i);
    }

    public final int swigValue() {
        return this.swigValue;
    }

    private SnsrStreamMode(int i) {
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }

    private SnsrStreamMode(SnsrStreamMode snsrStreamMode) {
        int i = snsrStreamMode.swigValue;
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }
}
