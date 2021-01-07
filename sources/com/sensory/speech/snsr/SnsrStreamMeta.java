package com.sensory.speech.snsr;

public enum SnsrStreamMeta {
    BYTES_READ,
    BYTES_WRITTEN,
    IS_OPEN,
    IS_READABLE,
    IS_WRITABLE,
    OPEN_COUNT;
    
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

    private SnsrStreamMeta() {
        this.swigValue = SwigNext.access$008();
    }

    public static SnsrStreamMeta swigToEnum(int i) {
        SnsrStreamMeta[] snsrStreamMetaArr = (SnsrStreamMeta[]) SnsrStreamMeta.class.getEnumConstants();
        if (i < snsrStreamMetaArr.length && i >= 0 && snsrStreamMetaArr[i].swigValue == i) {
            return snsrStreamMetaArr[i];
        }
        for (SnsrStreamMeta snsrStreamMeta : snsrStreamMetaArr) {
            if (snsrStreamMeta.swigValue == i) {
                return snsrStreamMeta;
            }
        }
        throw new IllegalArgumentException("No enum " + SnsrStreamMeta.class + " with value " + i);
    }

    public final int swigValue() {
        return this.swigValue;
    }

    private SnsrStreamMeta(int i) {
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }

    private SnsrStreamMeta(SnsrStreamMeta snsrStreamMeta) {
        int i = snsrStreamMeta.swigValue;
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }
}
