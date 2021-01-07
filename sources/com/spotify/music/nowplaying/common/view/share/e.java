package com.spotify.music.nowplaying.common.view.share;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.share.g;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.share.sharedata.r;
import io.reactivex.disposables.a;

public class e implements g.a {
    private final io.reactivex.g<PlayerState> a;
    private final asb b;
    private final jzc c;
    private final c d;
    private final drd e;
    private final a f = new a();
    private g g;
    private PlayerState h = PlayerState.EMPTY;

    public e(io.reactivex.g<PlayerState> gVar, asb asb, jzc jzc, drd drd, c cVar) {
        this.a = gVar;
        this.b = asb;
        this.c = jzc;
        this.e = drd;
        this.d = cVar;
    }

    public static void a(e eVar, PlayerState playerState) {
        eVar.h = playerState;
        LinkType q = l0.z(playerState.track().get().uri()).q();
        eVar.g.setEnabled(q == LinkType.TRACK || q == LinkType.SHOW_EPISODE);
    }

    public void b() {
        String str;
        ContextTrack contextTrack = this.h.track().get();
        LinkType q = l0.z(contextTrack.uri()).q();
        ImmutableMap<String, String> metadata = contextTrack.metadata();
        String str2 = metadata.get("title");
        String str3 = metadata.get("artist_name");
        if (MoreObjects.isNullOrEmpty(str3)) {
            str = "";
        } else {
            if (q != LinkType.SHOW_EPISODE) {
                str3 = this.b.f(str3);
            }
            str = str3;
        }
        String c2 = kxd.c(contextTrack);
        String contextUri = this.d.apply(this.h) ? this.h.contextUri() : null;
        this.e.j();
        r.a h2 = r.h(contextTrack.uri());
        h2.c(contextUri);
        this.c.c(pzc.c(c2, MoreObjects.nullToEmpty(str2), str, h2.build()).build(), rzc.a, C0707R.string.integration_id_now_playing);
    }

    public void c(g gVar) {
        gVar.getClass();
        this.g = gVar;
        gVar.setListener(this);
        this.f.b(this.a.subscribe(new b(this)));
    }

    public void d() {
        this.g.setListener(null);
        this.f.f();
    }
}
