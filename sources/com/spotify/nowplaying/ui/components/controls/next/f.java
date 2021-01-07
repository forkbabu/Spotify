package com.spotify.nowplaying.ui.components.controls.next;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.nowplaying.ui.components.controls.next.i;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import java.util.Collections;

public class f implements i.a {
    private final d a;
    private final g<PlayerState> b;
    private final j c;
    private final h d;
    private final e e;
    private final q f = new q();
    private PlayerState g = PlayerState.EMPTY;
    private i h;

    public f(d dVar, g<PlayerState> gVar, j jVar, h hVar, e eVar) {
        this.a = dVar;
        this.b = gVar;
        this.c = jVar;
        this.d = hVar;
        this.e = eVar;
    }

    public static void a(f fVar, PlayerState playerState) {
        fVar.g = playerState;
        ImmutableSet<String> disallowSkippingNextReasons = playerState.restrictions().disallowSkippingNextReasons();
        fVar.h.setNextEnabled(disallowSkippingNextReasons.isEmpty() || disallowSkippingNextReasons.equals(Collections.singleton(DisallowReasons.MFT)));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.i.a
    public void b() {
        String str;
        e eVar = this.e;
        String uri = this.g.track().get().uri();
        PlayerState playerState = this.g;
        if (playerState.nextTracks().isEmpty()) {
            str = "";
        } else {
            str = playerState.nextTracks().get(0).uri();
        }
        eVar.z(uri, str);
        this.d.a(this.g);
        ImmutableSet<String> disallowSkippingNextReasons = this.g.restrictions().disallowSkippingNextReasons();
        if (disallowSkippingNextReasons.isEmpty()) {
            this.f.a(this.a.a(c.i()).subscribe());
        } else if (disallowSkippingNextReasons.contains(DisallowReasons.MFT)) {
            this.c.call();
        }
    }

    public void c(i iVar) {
        iVar.getClass();
        this.h = iVar;
        iVar.setListener(this);
        this.f.a(this.b.subscribe(new b(this)));
    }

    public void d() {
        this.h.setListener(null);
        this.f.c();
    }
}
