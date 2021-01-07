package com.spotify.encore.consumer.components.impl.trackrow;

import android.app.Activity;
import com.squareup.picasso.Picasso;

public final class DefaultTrackRow_Factory implements fjf<DefaultTrackRow> {
    private final wlf<Activity> activityProvider;
    private final wlf<Picasso> picassoProvider;

    public DefaultTrackRow_Factory(wlf<Activity> wlf, wlf<Picasso> wlf2) {
        this.activityProvider = wlf;
        this.picassoProvider = wlf2;
    }

    public static DefaultTrackRow_Factory create(wlf<Activity> wlf, wlf<Picasso> wlf2) {
        return new DefaultTrackRow_Factory(wlf, wlf2);
    }

    public static DefaultTrackRow newInstance(Activity activity, Picasso picasso) {
        return new DefaultTrackRow(activity, picasso);
    }

    @Override // defpackage.wlf
    public DefaultTrackRow get() {
        return newInstance(this.activityProvider.get(), this.picassoProvider.get());
    }
}
