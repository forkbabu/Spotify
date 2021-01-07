package com.spotify.encore.consumer.components.error.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.error.api.errorbanner.ErrorBanner;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerErrorExtensions {
    public static final ComponentFactory<Component<ErrorBanner.Model, ErrorBanner.Events>, ErrorBanner.Configuration> errorBannerFactory(EncoreConsumerEntryPoint.Error error) {
        h.e(error, "$this$errorBannerFactory");
        return new EncoreConsumerErrorExtensions$errorBannerFactory$1(error);
    }
}
