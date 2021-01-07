package com.spotify.music.playlist.extender;

import android.app.Activity;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.TrackRowPlaylistExtender;
import com.spotify.music.libs.viewuri.c;
import com.spotify.remoteconfig.z9;

public final class y implements fjf<x> {
    private final wlf<Activity> a;
    private final wlf<c> b;
    private final wlf<Integer> c;
    private final wlf<b42> d;
    private final wlf<ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration>> e;
    private final wlf<z9> f;

    public y(wlf<Activity> wlf, wlf<c> wlf2, wlf<Integer> wlf3, wlf<b42> wlf4, wlf<ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration>> wlf5, wlf<z9> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
