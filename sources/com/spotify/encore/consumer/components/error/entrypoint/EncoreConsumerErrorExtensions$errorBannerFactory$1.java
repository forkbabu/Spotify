package com.spotify.encore.consumer.components.error.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.error.api.errorbanner.ErrorBanner;
import com.spotify.encore.consumer.components.error.impl.errorbanner.DefaultErrorBanner;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerErrorExtensions$errorBannerFactory$1 implements ComponentFactory<Component<ErrorBanner.Model, ErrorBanner.Events>, ErrorBanner.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Error $this_errorBannerFactory;

    EncoreConsumerErrorExtensions$errorBannerFactory$1(EncoreConsumerEntryPoint.Error error) {
        this.$this_errorBannerFactory = error;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<ErrorBanner.Model, ErrorBanner.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultErrorBanner make(ErrorBanner.Configuration configuration) {
        return new DefaultErrorBanner(this.$this_errorBannerFactory.getActivity());
    }
}
