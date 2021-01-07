package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class StreamingConfiguration extends CppJavaBinder {
    private long a;
    private WeakHashMap<String, StreamingPublisherConfiguration> b;
    private final Object c;

    public static class Builder extends CppJavaBinder {
        long a = 0;

        public Builder() {
            try {
                this.a = StreamingConfiguration.newCppInstanceBuilderNative();
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder autoResumeStateOnAssetChange(boolean z) {
            try {
                StreamingConfiguration.autoResumeStateOnAssetChangeNative(this.a, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public StreamingConfiguration build() {
            return new StreamingConfiguration(StreamingConfiguration.buildNative(this.a));
        }

        public Builder customStartMinimumPlayback(long j) {
            try {
                StreamingConfiguration.customStartMinimumPlaybackNative(this.a, j);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        /* access modifiers changed from: protected */
        @Override // com.comscore.util.cpp.CppJavaBinder
        public void destroyCppObject() {
            try {
                StreamingConfiguration.destroyCppInstanceBuilderNative(this.a);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0007 A[LOOP:0: B:3:0x0007->B:21:0x0007, LOOP_END, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.comscore.streaming.StreamingConfiguration.Builder heartbeatIntervals(java.util.List<java.util.Map<java.lang.String, java.lang.Long>> r5) {
            /*
                r4 = this;
                if (r5 != 0) goto L_0x0003
                return r4
            L_0x0003:
                java.util.Iterator r0 = r5.iterator()
            L_0x0007:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0040
                java.lang.Object r1 = r0.next()
                java.util.Map r1 = (java.util.Map) r1
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x001b:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0007
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                boolean r3 = r3 instanceof java.lang.String
                if (r3 == 0) goto L_0x0038
                java.lang.Object r2 = r2.getValue()
                boolean r2 = r2 instanceof java.lang.Long
                if (r2 == 0) goto L_0x0038
                goto L_0x001b
            L_0x0038:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "intervals must be and object of type ArrayList<HashMap<String, Long>>"
                r5.<init>(r0)
                throw r5
            L_0x0040:
                long r0 = r4.a     // Catch:{ UnsatisfiedLinkError -> 0x0046 }
                com.comscore.streaming.StreamingConfiguration.b(r0, r5)     // Catch:{ UnsatisfiedLinkError -> 0x0046 }
                goto L_0x004a
            L_0x0046:
                r5 = move-exception
                r4.printException(r5)
            L_0x004a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comscore.streaming.StreamingConfiguration.Builder.heartbeatIntervals(java.util.List):com.comscore.streaming.StreamingConfiguration$Builder");
        }

        public Builder heartbeatMeasurement(boolean z) {
            try {
                StreamingConfiguration.heartbeatMeasurementNative(this.a, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder includedPublishers(List<String> list) {
            try {
                StreamingConfiguration.includedPublishersNative(this.a, list);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder includedPublishers(String... strArr) {
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, strArr);
            includedPublishers(arrayList);
            return this;
        }

        public Builder keepAliveInterval(long j) {
            try {
                StreamingConfiguration.keepAliveIntervalNative(this.a, j);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder keepAliveMeasurement(boolean z) {
            try {
                StreamingConfiguration.keepAliveMeasurementNative(this.a, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder labels(Map<String, String> map) {
            try {
                StreamingConfiguration.labelsNative(this.a, map);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder pauseOnBuffering(boolean z) {
            try {
                StreamingConfiguration.pauseOnBufferingNative(this.a, z);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder pauseOnBufferingInterval(long j) {
            try {
                StreamingConfiguration.pauseOnBufferingIntervalNative(this.a, j);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder playbackIntervalMergeTolerance(long j) {
            try {
                StreamingConfiguration.playbackIntervalMergeToleranceNative(this.a, j);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }
    }

    private StreamingConfiguration(long j) {
        this.a = 0;
        this.c = new Object();
        this.a = j;
        this.b = new WeakHashMap<>();
    }

    public StreamingConfiguration(StreamingConfiguration streamingConfiguration) {
        this.a = 0;
        this.c = new Object();
        try {
            this.a = copyNative(streamingConfiguration.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private native void addLabelsNative(long j, Map<String, String> map);

    /* access modifiers changed from: private */
    public static native void autoResumeStateOnAssetChangeNative(long j, boolean z);

    /* access modifiers changed from: private */
    public static native long buildNative(long j);

    private native long copyNative(long j);

    /* access modifiers changed from: private */
    public static native void customStartMinimumPlaybackNative(long j, long j2);

    /* access modifiers changed from: private */
    public static native void destroyCppInstanceBuilderNative(long j);

    private native void destroyCppInstanceNative(long j);

    /* access modifiers changed from: private */
    public static native void heartbeatIntervalsNative(long j, List<Map<String, Long>> list);

    /* access modifiers changed from: private */
    public static native void heartbeatMeasurementNative(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void includedPublishersNative(long j, List<String> list);

    /* access modifiers changed from: private */
    public static native void keepAliveIntervalNative(long j, long j2);

    /* access modifiers changed from: private */
    public static native void keepAliveMeasurementNative(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void labelsNative(long j, Map<String, String> map);

    /* access modifiers changed from: private */
    public static native long newCppInstanceBuilderNative();

    /* access modifiers changed from: private */
    public static native void pauseOnBufferingIntervalNative(long j, long j2);

    /* access modifiers changed from: private */
    public static native void pauseOnBufferingNative(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void playbackIntervalMergeToleranceNative(long j, long j2);

    private native void removeAllLabelsNative(long j);

    private native void removeLabelNative(long j, String str);

    private native void setLabelNative(long j, String str, String str2);

    /* access modifiers changed from: package-private */
    public long a() {
        return this.a;
    }

    public void addLabels(Map<String, String> map) {
        try {
            addLabelsNative(this.a, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        try {
            destroyCppInstanceNative(this.a);
            this.a = 0;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public StreamingPublisherConfiguration getStreamingPublisherConfiguration(String str) {
        synchronized (this.c) {
            StreamingPublisherConfiguration streamingPublisherConfiguration = this.b.get(str);
            if (streamingPublisherConfiguration != null) {
                return streamingPublisherConfiguration;
            }
            StreamingPublisherConfiguration streamingPublisherConfiguration2 = new StreamingPublisherConfiguration(this, str);
            this.b.put(str, streamingPublisherConfiguration2);
            return streamingPublisherConfiguration2;
        }
    }

    public void removeAllLabels() {
        try {
            removeAllLabelsNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeLabel(String str) {
        try {
            removeLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabel(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                setLabelNative(this.a, str, str2);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }
}
