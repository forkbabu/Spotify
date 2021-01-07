package com.spotify.encore.consumer.di;

import com.spotify.encore.consumer.EncoreConsumer;
import com.spotify.encore.consumer.di.EncoreConsumerSubComponent;
import kotlin.jvm.internal.h;

public final class EncoreConsumerBindingModule {
    public static final EncoreConsumerBindingModule INSTANCE = new EncoreConsumerBindingModule();

    private EncoreConsumerBindingModule() {
    }

    public final EncoreConsumer provideEncoreConsumer(EncoreConsumerSubComponent.Factory factory) {
        h.e(factory, "encoreConsumerComponent");
        return factory.create();
    }
}
