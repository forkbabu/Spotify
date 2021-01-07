package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.app.Activity;
import com.spotify.encore.consumer.elements.downloadbutton.LottieIconStateMachine;

public final class PodcastComponentBindingsModule_ProvideLottieIconStateMachineFactory implements fjf<LottieIconStateMachine> {
    private final wlf<Activity> activityProvider;

    public PodcastComponentBindingsModule_ProvideLottieIconStateMachineFactory(wlf<Activity> wlf) {
        this.activityProvider = wlf;
    }

    public static PodcastComponentBindingsModule_ProvideLottieIconStateMachineFactory create(wlf<Activity> wlf) {
        return new PodcastComponentBindingsModule_ProvideLottieIconStateMachineFactory(wlf);
    }

    public static LottieIconStateMachine provideLottieIconStateMachine(Activity activity) {
        LottieIconStateMachine provideLottieIconStateMachine = PodcastComponentBindingsModule.INSTANCE.provideLottieIconStateMachine(activity);
        yif.g(provideLottieIconStateMachine, "Cannot return null from a non-@Nullable @Provides method");
        return provideLottieIconStateMachine;
    }

    @Override // defpackage.wlf
    public LottieIconStateMachine get() {
        return provideLottieIconStateMachine(this.activityProvider.get());
    }
}
