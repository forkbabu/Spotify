package com.spotify.encore.consumer.di;

import com.spotify.encore.consumer.EncoreConsumer;

public interface EncoreConsumerSubComponent extends EncoreConsumer {

    public interface Factory {
        EncoreConsumerSubComponent create();
    }
}
