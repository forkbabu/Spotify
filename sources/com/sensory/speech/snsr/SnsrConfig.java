package com.sensory.speech.snsr;

public enum SnsrConfig {
    CONFIG_SECURITY_CHIP;
    
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

    private SnsrConfig() {
        this.swigValue = SwigNext.access$008();
    }

    public static SnsrConfig swigToEnum(int i) {
        SnsrConfig[] snsrConfigArr = (SnsrConfig[]) SnsrConfig.class.getEnumConstants();
        if (i < snsrConfigArr.length && i >= 0 && snsrConfigArr[i].swigValue == i) {
            return snsrConfigArr[i];
        }
        for (SnsrConfig snsrConfig : snsrConfigArr) {
            if (snsrConfig.swigValue == i) {
                return snsrConfig;
            }
        }
        throw new IllegalArgumentException("No enum " + SnsrConfig.class + " with value " + i);
    }

    public final int swigValue() {
        return this.swigValue;
    }

    private SnsrConfig(int i) {
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }

    private SnsrConfig(SnsrConfig snsrConfig) {
        int i = snsrConfig.swigValue;
        this.swigValue = i;
        int unused = SwigNext.next = i + 1;
    }
}
