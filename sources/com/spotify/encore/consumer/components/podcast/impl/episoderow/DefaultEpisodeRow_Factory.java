package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.app.Activity;
import com.spotify.encore.consumer.elements.downloadbutton.LottieIconStateMachine;
import com.squareup.picasso.Picasso;

public final class DefaultEpisodeRow_Factory implements fjf<DefaultEpisodeRow> {
    private final wlf<Activity> activityProvider;
    private final wlf<LottieIconStateMachine> lottieIconStateMachineProvider;
    private final wlf<Picasso> picassoProvider;

    public DefaultEpisodeRow_Factory(wlf<Activity> wlf, wlf<Picasso> wlf2, wlf<LottieIconStateMachine> wlf3) {
        this.activityProvider = wlf;
        this.picassoProvider = wlf2;
        this.lottieIconStateMachineProvider = wlf3;
    }

    public static DefaultEpisodeRow_Factory create(wlf<Activity> wlf, wlf<Picasso> wlf2, wlf<LottieIconStateMachine> wlf3) {
        return new DefaultEpisodeRow_Factory(wlf, wlf2, wlf3);
    }

    public static DefaultEpisodeRow newInstance(Activity activity, Picasso picasso, LottieIconStateMachine lottieIconStateMachine) {
        return new DefaultEpisodeRow(activity, picasso, lottieIconStateMachine);
    }

    @Override // defpackage.wlf
    public DefaultEpisodeRow get() {
        return newInstance(this.activityProvider.get(), this.picassoProvider.get(), this.lottieIconStateMachineProvider.get());
    }
}
