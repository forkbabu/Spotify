package com.comscore;

import com.comscore.ClientConfiguration;

public class PublisherConfiguration extends ClientConfiguration {
    private PublisherUniqueDeviceIdListener c;

    public static class Builder extends ClientConfiguration.Builder<Builder, PublisherConfiguration> {
        private PublisherUniqueDeviceIdListener a;

        public Builder() {
        }

        private Builder(Builder builder) {
            super(builder);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Builder a() {
            return new Builder(this);
        }

        @Override // com.comscore.ClientConfiguration.Builder
        public PublisherConfiguration build() {
            return new PublisherConfiguration(this, this.a);
        }

        public Builder publisherId(String str) {
            setClientId(str);
            return this;
        }

        public Builder publisherUniqueDeviceIdListener(PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener) {
            this.a = publisherUniqueDeviceIdListener;
            return this;
        }

        /* access modifiers changed from: protected */
        @Override // com.comscore.ClientConfiguration.Builder
        public Builder self() {
            return this;
        }
    }

    PublisherConfiguration(long j) {
        ((ClientConfiguration) this).a = j;
    }

    private PublisherConfiguration(Builder builder, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener) {
        super(builder);
        this.c = publisherUniqueDeviceIdListener;
        try {
            ((ClientConfiguration) this).a = newCppInstanceNative(builder, publisherUniqueDeviceIdListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private static native void destroyCppInstanceNative(long j, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener);

    private static native String getPublisherIdNative(long j);

    private static native long newCppInstanceNative(Builder builder, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener);

    /* access modifiers changed from: protected */
    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        destroyCppInstanceNative(((ClientConfiguration) this).a, this.c);
    }

    public String getPublisherId() {
        try {
            return getPublisherIdNative(((ClientConfiguration) this).a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }
}
