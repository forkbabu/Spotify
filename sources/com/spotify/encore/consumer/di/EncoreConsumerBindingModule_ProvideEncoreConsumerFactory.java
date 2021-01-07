package com.spotify.encore.consumer.di;

import com.spotify.encore.consumer.EncoreConsumer;
import com.spotify.encore.consumer.di.EncoreConsumerSubComponent;

public final class EncoreConsumerBindingModule_ProvideEncoreConsumerFactory implements fjf<EncoreConsumer> {
    private final wlf<EncoreConsumerSubComponent.Factory> encoreConsumerComponentProvider;

    public EncoreConsumerBindingModule_ProvideEncoreConsumerFactory(wlf<EncoreConsumerSubComponent.Factory> wlf) {
        this.encoreConsumerComponentProvider = wlf;
    }

    public static EncoreConsumerBindingModule_ProvideEncoreConsumerFactory create(wlf<EncoreConsumerSubComponent.Factory> wlf) {
        return new EncoreConsumerBindingModule_ProvideEncoreConsumerFactory(wlf);
    }

    public static EncoreConsumer provideEncoreConsumer(EncoreConsumerSubComponent.Factory factory) {
        EncoreConsumer provideEncoreConsumer = EncoreConsumerBindingModule.INSTANCE.provideEncoreConsumer(factory);
        yif.g(provideEncoreConsumer, "Cannot return null from a non-@Nullable @Provides method");
        return provideEncoreConsumer;
    }

    @Override // defpackage.wlf
    public EncoreConsumer get() {
        return provideEncoreConsumer(this.encoreConsumerComponentProvider.get());
    }
}
