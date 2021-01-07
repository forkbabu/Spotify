package com.spotify.music.features.album.di;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.google.common.base.MoreObjects;
import com.google.common.collect.FluentIterable;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;

public class AlbumAutoPlayUrlHandler {
    private final String a;
    private final String b;
    private final o61 c;
    private final q d = new q();
    private boolean e;
    private PlayerState f = PlayerState.EMPTY;

    public AlbumAutoPlayUrlHandler(final g<PlayerState> gVar, String str, String str2, o61 o61, n nVar) {
        this.b = str;
        this.a = str2;
        this.c = o61;
        nVar.A().a(new m() {
            /* class com.spotify.music.features.album.di.AlbumAutoPlayUrlHandler.AnonymousClass1 */

            @w(Lifecycle.Event.ON_PAUSE)
            public void onPause() {
                AlbumAutoPlayUrlHandler.this.d.c();
            }

            @w(Lifecycle.Event.ON_RESUME)
            public void onResume() {
                AlbumAutoPlayUrlHandler.this.d.a(gVar.subscribe(new a(this)));
            }
        });
    }

    public void c(b91 b91, sz3 sz3) {
        if (!this.e) {
            boolean z = true;
            this.e = true;
            if (!MoreObjects.isNullOrEmpty(this.a)) {
                String str = this.a;
                s81 s81 = (s81) FluentIterable.from(b91.body()).firstMatch(new d(str)).orNull();
                if (s81 != null) {
                    if (!this.f.isPlaying() || this.f.isPaused() || !this.f.track().isPresent() || !this.f.track().get().uri().equals(str)) {
                        z = false;
                    }
                    if (!z) {
                        this.c.a(n61.b("click", s81));
                    }
                    ((d04) sz3.a).e(b91.body().indexOf(s81));
                    return;
                }
                return;
            }
            s81 s812 = (s81) FluentIterable.from(b91.body()).transform(b.a).firstMatch(c.a).orNull();
            if (s812 != null) {
                String str2 = this.b;
                if (!this.f.isPlaying() || this.f.isPaused() || !this.f.contextUri().equals(str2)) {
                    z = false;
                }
                if (!z) {
                    this.c.a(n61.b("click", s812));
                }
            }
            if (s812 == null) {
                Logger.d("Can't find shuffle button view model.", new Object[0]);
            }
        }
    }
}
