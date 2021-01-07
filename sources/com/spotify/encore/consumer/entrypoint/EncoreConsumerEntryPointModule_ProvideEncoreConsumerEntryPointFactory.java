package com.spotify.encore.consumer.entrypoint;

import android.app.Activity;
import com.squareup.picasso.Picasso;

public final class EncoreConsumerEntryPointModule_ProvideEncoreConsumerEntryPointFactory implements fjf<EncoreConsumerEntryPoint> {
    private final wlf<Activity> activityProvider;
    private final wlf<Picasso> picassoProvider;

    public EncoreConsumerEntryPointModule_ProvideEncoreConsumerEntryPointFactory(wlf<Activity> wlf, wlf<Picasso> wlf2) {
        this.activityProvider = wlf;
        this.picassoProvider = wlf2;
    }

    public static EncoreConsumerEntryPointModule_ProvideEncoreConsumerEntryPointFactory create(wlf<Activity> wlf, wlf<Picasso> wlf2) {
        return new EncoreConsumerEntryPointModule_ProvideEncoreConsumerEntryPointFactory(wlf, wlf2);
    }

    public static EncoreConsumerEntryPoint provideEncoreConsumerEntryPoint(Activity activity, Picasso picasso) {
        EncoreConsumerEntryPoint provideEncoreConsumerEntryPoint = EncoreConsumerEntryPointModule.provideEncoreConsumerEntryPoint(activity, picasso);
        yif.g(provideEncoreConsumerEntryPoint, "Cannot return null from a non-@Nullable @Provides method");
        return provideEncoreConsumerEntryPoint;
    }

    @Override // defpackage.wlf
    public EncoreConsumerEntryPoint get() {
        return provideEncoreConsumerEntryPoint(this.activityProvider.get(), this.picassoProvider.get());
    }
}
