package com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader;

import android.app.Activity;

public final class DefaultYourEpisodesHeader_Factory implements fjf<DefaultYourEpisodesHeader> {
    private final wlf<Activity> activityProvider;

    public DefaultYourEpisodesHeader_Factory(wlf<Activity> wlf) {
        this.activityProvider = wlf;
    }

    public static DefaultYourEpisodesHeader_Factory create(wlf<Activity> wlf) {
        return new DefaultYourEpisodesHeader_Factory(wlf);
    }

    public static DefaultYourEpisodesHeader newInstance(Activity activity) {
        return new DefaultYourEpisodesHeader(activity);
    }

    @Override // defpackage.wlf
    public DefaultYourEpisodesHeader get() {
        return newInstance(this.activityProvider.get());
    }
}
