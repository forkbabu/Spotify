package com.comscore.streaming;

import com.comscore.streaming.StreamingConfiguration;
import com.comscore.util.cpp.CppJavaBinder;

public class StreamingAnalytics extends CppJavaBinder {
    private final Object a;
    private long b;
    private StreamingConfiguration c;
    private StreamingExtendedAnalytics d;

    public StreamingAnalytics() {
        this(null);
    }

    public StreamingAnalytics(StreamingConfiguration streamingConfiguration) {
        this.a = new Object();
        this.b = 0;
        streamingConfiguration = streamingConfiguration == null ? new StreamingConfiguration.Builder().build() : streamingConfiguration;
        this.c = streamingConfiguration;
        try {
            this.b = newCppInstanceNative(streamingConfiguration.a());
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private native void addListenerNative(long j, StreamingListener streamingListener);

    private native void createPlaybackSessionNative(long j);

    private native void destroyCppInstanceNative(long j);

    private native String getPlaybackSessionIdNative(long j);

    private native void loopPlaybackSessionNative(long j);

    private native long newCppInstanceNative(long j);

    private native void notifyBufferStartNative(long j);

    private native void notifyBufferStopNative(long j);

    private native void notifyChangePlaybackRateNative(long j, float f);

    private native void notifyEndNative(long j);

    private native void notifyPauseNative(long j);

    private native void notifyPlayNative(long j);

    private native void notifySeekStartNative(long j);

    private native void removeListenerNative(long j, StreamingListener streamingListener);

    private native void setDvrWindowLengthNative(long j, long j2);

    private native void setImplementationIdNative(long j, String str);

    private native void setMediaPlayerNameNative(long j, String str);

    private native void setMediaPlayerVersionNative(long j, String str);

    private native void setMetadataNative(long j, long j2);

    private native void setProjectIdNative(long j, String str);

    private native void startFromDvrWindowOffsetNative(long j, long j2);

    private native void startFromPositionNative(long j, long j2);

    private native void startFromSegmentNative(long j, int i);

    /* access modifiers changed from: package-private */
    public long a() {
        return this.b;
    }

    public void addListener(StreamingListener streamingListener) {
        try {
            addListenerNative(this.b, streamingListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void createPlaybackSession() {
        try {
            createPlaybackSessionNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        try {
            destroyCppInstanceNative(this.b);
            this.b = 0;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof StreamingAnalytics) && ((StreamingAnalytics) obj).b == this.b;
    }

    public StreamingConfiguration getConfiguration() {
        return this.c;
    }

    public StreamingExtendedAnalytics getExtendedAnalytics() {
        if (this.d == null) {
            synchronized (this.a) {
                if (this.d == null) {
                    this.d = new StreamingExtendedAnalytics(this);
                }
            }
        }
        return this.d;
    }

    public String getPlaybackSessionId() {
        try {
            return getPlaybackSessionIdNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public void loopPlaybackSession() {
        try {
            loopPlaybackSessionNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyBufferStart() {
        try {
            notifyBufferStartNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyBufferStop() {
        try {
            notifyBufferStopNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyChangePlaybackRate(float f) {
        try {
            notifyChangePlaybackRateNative(this.b, f);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyEnd() {
        try {
            notifyEndNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyPause() {
        try {
            notifyPauseNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifyPlay() {
        try {
            notifyPlayNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void notifySeekStart() {
        try {
            notifySeekStartNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeListener(StreamingListener streamingListener) {
        try {
            removeListenerNative(this.b, streamingListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setDvrWindowLength(long j) {
        try {
            setDvrWindowLengthNative(this.b, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setImplementationId(String str) {
        if (str != null) {
            try {
                setImplementationIdNative(this.b, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setMediaPlayerName(String str) {
        if (str != null) {
            try {
                setMediaPlayerNameNative(this.b, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setMediaPlayerVersion(String str) {
        if (str != null) {
            try {
                setMediaPlayerVersionNative(this.b, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setMetadata(AssetMetadata assetMetadata) {
        if (assetMetadata != null) {
            try {
                setMetadataNative(this.b, assetMetadata.b());
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setProjectId(String str) {
        if (str != null) {
            try {
                setProjectIdNative(this.b, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void startFromDvrWindowOffset(long j) {
        try {
            startFromDvrWindowOffsetNative(this.b, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void startFromPosition(long j) {
        try {
            startFromPositionNative(this.b, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void startFromSegment(int i) {
        try {
            startFromSegmentNative(this.b, i);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
