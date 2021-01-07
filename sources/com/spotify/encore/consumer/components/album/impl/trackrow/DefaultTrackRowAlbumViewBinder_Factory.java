package com.spotify.encore.consumer.components.album.impl.trackrow;

import android.app.Activity;

public final class DefaultTrackRowAlbumViewBinder_Factory implements fjf<DefaultTrackRowAlbumViewBinder> {
    private final wlf<Activity> activityProvider;

    public DefaultTrackRowAlbumViewBinder_Factory(wlf<Activity> wlf) {
        this.activityProvider = wlf;
    }

    public static DefaultTrackRowAlbumViewBinder_Factory create(wlf<Activity> wlf) {
        return new DefaultTrackRowAlbumViewBinder_Factory(wlf);
    }

    public static DefaultTrackRowAlbumViewBinder newInstance(Activity activity) {
        return new DefaultTrackRowAlbumViewBinder(activity);
    }

    @Override // defpackage.wlf
    public DefaultTrackRowAlbumViewBinder get() {
        return newInstance(this.activityProvider.get());
    }
}
