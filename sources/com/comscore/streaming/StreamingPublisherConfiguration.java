package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.lang.ref.WeakReference;
import java.util.Map;

public class StreamingPublisherConfiguration extends CppJavaBinder {
    private WeakReference<StreamingConfiguration> a;
    private String b;

    StreamingPublisherConfiguration(StreamingConfiguration streamingConfiguration, String str) {
        this.a = new WeakReference<>(streamingConfiguration);
        this.b = str;
    }

    private native void addLabelsNative(long j, String str, Map<String, String> map);

    private native void removeAllLabelsNative(long j, String str);

    private native void removeLabelNative(long j, String str, String str2);

    private native void setLabelNative(long j, String str, String str2, String str3);

    public void addLabels(Map<String, String> map) {
        try {
            StreamingConfiguration streamingConfiguration = this.a.get();
            if (streamingConfiguration != null) {
                addLabelsNative(streamingConfiguration.a(), this.b, map);
            }
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
    }

    public void removeAllLabels() {
        try {
            StreamingConfiguration streamingConfiguration = this.a.get();
            if (streamingConfiguration != null) {
                removeAllLabelsNative(streamingConfiguration.a(), this.b);
            }
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeLabel(String str) {
        try {
            StreamingConfiguration streamingConfiguration = this.a.get();
            if (streamingConfiguration != null) {
                removeLabelNative(streamingConfiguration.a(), this.b, str);
            }
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabel(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                StreamingConfiguration streamingConfiguration = this.a.get();
                if (streamingConfiguration != null) {
                    setLabelNative(streamingConfiguration.a(), this.b, str, str2);
                }
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }
}
