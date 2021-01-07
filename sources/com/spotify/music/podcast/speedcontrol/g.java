package com.spotify.music.podcast.speedcontrol;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

/* access modifiers changed from: package-private */
public class g {
    private final ImmutableList<Integer> a;

    g(boolean z, boolean z2) {
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.mo53add((ImmutableList.Builder) 50);
        builder.mo53add((ImmutableList.Builder) 80);
        builder.mo53add((ImmutableList.Builder) 100);
        builder.mo53add((ImmutableList.Builder) 120);
        builder.mo53add((ImmutableList.Builder) Integer.valueOf((int) AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150));
        if (z) {
            builder.mo53add((ImmutableList.Builder) 180);
        }
        builder.mo53add((ImmutableList.Builder) 200);
        if (z) {
            builder.mo53add((ImmutableList.Builder) 250);
        }
        builder.mo53add((ImmutableList.Builder) 300);
        if (z && z2) {
            builder.mo53add((ImmutableList.Builder) 350);
        }
        this.a = builder.build();
    }

    public ImmutableList<Integer> a() {
        return this.a;
    }
}
