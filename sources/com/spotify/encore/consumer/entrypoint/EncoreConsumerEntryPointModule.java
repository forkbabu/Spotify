package com.spotify.encore.consumer.entrypoint;

import android.app.Activity;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class EncoreConsumerEntryPointModule {
    public static final EncoreConsumerEntryPointModule INSTANCE = new EncoreConsumerEntryPointModule();

    private EncoreConsumerEntryPointModule() {
    }

    public static final EncoreConsumerEntryPoint provideEncoreConsumerEntryPoint(Activity activity, Picasso picasso) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        return new EncoreConsumerEntryPoint(activity, picasso);
    }
}
