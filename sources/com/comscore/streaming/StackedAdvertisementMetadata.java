package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

public class StackedAdvertisementMetadata extends CppJavaBinder {
    private long a;

    public static class Builder extends CppJavaBinder {
        long a;

        public Builder() {
            try {
                this.a = StackedAdvertisementMetadata.newCppInstanceBuilderNative();
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public StackedAdvertisementMetadata build() {
            try {
                return new StackedAdvertisementMetadata(StackedAdvertisementMetadata.buildNative(this.a));
            } catch (UnsatisfiedLinkError e) {
                printException(e);
                return new StackedAdvertisementMetadata(0);
            }
        }

        public Builder customLabels(Map<String, String> map) {
            try {
                StackedAdvertisementMetadata.customLabelsNative(this.a, map);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        /* access modifiers changed from: protected */
        @Override // com.comscore.util.cpp.CppJavaBinder
        public void destroyCppObject() {
            try {
                StackedAdvertisementMetadata.destroyCppInstanceBuilderNative(this.a);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }

        public Builder fee(int i) {
            try {
                StackedAdvertisementMetadata.feeNative(this.a, i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder placementId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.placementIdNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder serverCampaignId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.serverCampaignIdNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder siteId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.siteIdNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder title(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.titleNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }

        public Builder uniqueId(String str) {
            if (str == null) {
                return this;
            }
            try {
                StackedAdvertisementMetadata.uniqueIdNative(this.a, str);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return this;
        }
    }

    StackedAdvertisementMetadata(long j) {
        this.a = j;
    }

    /* access modifiers changed from: private */
    public static native long buildNative(long j);

    /* access modifiers changed from: private */
    public static native void customLabelsNative(long j, Map<String, String> map);

    /* access modifiers changed from: private */
    public static native void destroyCppInstanceBuilderNative(long j);

    private native void destroyCppInstanceNative(long j);

    /* access modifiers changed from: private */
    public static native void feeNative(long j, int i);

    /* access modifiers changed from: private */
    public static native long newCppInstanceBuilderNative();

    /* access modifiers changed from: private */
    public static native void placementIdNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void serverCampaignIdNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void siteIdNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void titleNative(long j, String str);

    /* access modifiers changed from: private */
    public static native void uniqueIdNative(long j, String str);

    /* access modifiers changed from: package-private */
    public long a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        destroyCppInstanceNative(a());
    }
}
