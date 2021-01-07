package defpackage;

import com.spotify.music.nowplaying.common.view.contextmenu.o;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: qwb  reason: default package */
public final /* synthetic */ class qwb implements l {
    public final /* synthetic */ vl2 a;

    public /* synthetic */ qwb(vl2 vl2) {
        this.a = vl2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        boolean a2 = this.a.a(playerState.track().get());
        boolean z = agd.i(playerState.contextUri()) || agd.h(playerState.contextUri());
        o.c.a a3 = o.c.a();
        a3.c(true);
        a3.m(true);
        a3.k(true);
        a3.h(true);
        a3.f(false);
        a3.g(!z);
        a3.n(true);
        a3.i(a2);
        o.c a4 = a3.a();
        o.a a5 = o.a();
        a5.c(a4);
        return a5.a();
    }
}
