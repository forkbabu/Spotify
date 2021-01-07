package com.spotify.music.libs.yourepisodes.views.tooltip;

import android.app.Activity;
import com.spotify.mobile.android.util.prefs.i;

public final class l implements fjf<YourEpisodesTooltipPrefsImpl> {
    private final wlf<Activity> a;
    private final wlf<i> b;
    private final wlf<String> c;

    public l(wlf<Activity> wlf, wlf<i> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new YourEpisodesTooltipPrefsImpl(this.a.get(), this.b.get(), this.c.get());
    }
}
