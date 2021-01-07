package com.sensory.speech.snsr;

public enum SnsrDataFormat {
    CONFIG,
    SUBSET_INIT,
    RUNTIME,
    SOURCE;
    
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

    private SnsrDataFormat() {
        this.swigValue = SwigNext.access$008();
    }

    public static SnsrDataFormat swigToEnum(int i) {
        SnsrDataFormat[] snsrDataFormatArr = (SnsrDataFormat[]) SnsrDataFormat.class.getEnumConstants();
        if (i < snsrDataFormatArr.length && i >= 0 && snsrDataFormatArr[i].swigValue == i) {
            return snsrDataFormatArr[i];
        }
        for (SnsrDataFormat snsrDataFormat : snsrDataFormatArr) {
            if (snsrDataFormat.swigValue == i) {
                return snsrDataFormat;
            }
        }
        throw new IllegalArgumentException("No enum " + SnsrDataFormat.class + " with value " + i);
    }

    public final int swigValue() {
        return this.swigValue;
    }

    private SnsrDataFormat(int i) {
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }

    private SnsrDataFormat(SnsrDataFormat snsrDataFormat) {
        int i = snsrDataFormat.swigValue;
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }
}
