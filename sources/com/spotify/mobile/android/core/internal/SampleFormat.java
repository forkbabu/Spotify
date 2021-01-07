package com.spotify.mobile.android.core.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.d;
import kotlin.jvm.internal.f;

public enum SampleFormat {
    INT16(16, 2),
    FLOAT(17, 4);
    
    public static final Companion Companion = new Companion(null);
    private static final Map<Integer, SampleFormat> coreEnumMap;
    private static final Map<Integer, SampleFormat> encodingMap;
    private final int coreEnum;
    private final int encoding;

    public static final class Companion {
        private Companion() {
        }

        public final SampleFormat fromCoreEnum(int i) {
            return (SampleFormat) SampleFormat.coreEnumMap.get(Integer.valueOf(i));
        }

        public final SampleFormat fromEncoding(Integer num) {
            return num != null ? (SampleFormat) SampleFormat.encodingMap.get(num) : SampleFormat.INT16;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    static {
        int w = d.w(2);
        SampleFormat[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(w < 16 ? 16 : w);
        for (SampleFormat sampleFormat : values) {
            linkedHashMap.put(Integer.valueOf(sampleFormat.coreEnum), sampleFormat);
        }
        coreEnumMap = linkedHashMap;
        SampleFormat[] values2 = values();
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w);
        for (SampleFormat sampleFormat2 : values2) {
            linkedHashMap2.put(Integer.valueOf(sampleFormat2.encoding), sampleFormat2);
        }
        encodingMap = linkedHashMap2;
    }

    private SampleFormat(int i, int i2) {
        this.coreEnum = i;
        this.encoding = i2;
    }

    public final int getCoreEnum() {
        return this.coreEnum;
    }

    public final int getEncoding() {
        return this.encoding;
    }
}
