package com.sensory.speech.snsr;

public enum SnsrStreamAudioFormat {
    DEFAULT,
    DEFAULT_LOW_LATENCY,
    LPCM_S16_16K,
    LPCM_S16_16K_SAMPLES,
    LPCM_S16_16K_LOW_LATENCY,
    DEVICE,
    DEVICE_LOW_LATENCY,
    DEVICE_RATE_MODE,
    DEVICE_RATE_MODE_LOW_LATENCY,
    DEVID,
    DEVID_LOW_LATENCY,
    DEVID_RATE_MODE,
    DEVID_RATE_MODE_LOW_LATENCY;
    
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

    private SnsrStreamAudioFormat() {
        this.swigValue = SwigNext.access$008();
    }

    public static SnsrStreamAudioFormat swigToEnum(int i) {
        SnsrStreamAudioFormat[] snsrStreamAudioFormatArr = (SnsrStreamAudioFormat[]) SnsrStreamAudioFormat.class.getEnumConstants();
        if (i < snsrStreamAudioFormatArr.length && i >= 0 && snsrStreamAudioFormatArr[i].swigValue == i) {
            return snsrStreamAudioFormatArr[i];
        }
        for (SnsrStreamAudioFormat snsrStreamAudioFormat : snsrStreamAudioFormatArr) {
            if (snsrStreamAudioFormat.swigValue == i) {
                return snsrStreamAudioFormat;
            }
        }
        throw new IllegalArgumentException("No enum " + SnsrStreamAudioFormat.class + " with value " + i);
    }

    public final int swigValue() {
        return this.swigValue;
    }

    private SnsrStreamAudioFormat(int i) {
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }

    private SnsrStreamAudioFormat(SnsrStreamAudioFormat snsrStreamAudioFormat) {
        int i = snsrStreamAudioFormat.swigValue;
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }
}
