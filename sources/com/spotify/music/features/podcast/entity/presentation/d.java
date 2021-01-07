package com.spotify.music.features.podcast.entity.presentation;

import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.music.podcastentityrow.v;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;

public class d {
    private final boolean a;
    private final v b;
    private boolean c;

    public d(boolean z, v vVar) {
        this.a = z;
        this.b = vVar;
    }

    public void a(qyd qyd) {
        if (this.a && !this.c) {
            this.c = true;
            Show d = qyd.d();
            if (d.b() != Show.ConsumptionOrder.RECENT) {
                String f = d.f();
                if (d.k() && !MoreObjects.isNullOrEmpty(f)) {
                    this.b.a((Episode[]) qyd.getItems().toArray(new Episode[0]), this.b.b(f, (Episode[]) qyd.getItems().toArray(new Episode[0])));
                    return;
                }
            }
            this.b.a((Episode[]) qyd.getItems().toArray(new Episode[0]), 0);
        }
    }

    public void b(Bundle bundle) {
        bundle.putBoolean("autoplay_completed", this.c);
    }

    public void c(Bundle bundle) {
        if (bundle != null) {
            this.c = bundle.getBoolean("autoplay_completed", false);
        }
    }
}
