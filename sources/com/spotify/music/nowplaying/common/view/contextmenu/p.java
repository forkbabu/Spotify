package com.spotify.music.nowplaying.common.view.contextmenu;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.d4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.nowplaying.common.view.contextmenu.o;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.u8;
import defpackage.d42;
import defpackage.j32;

public class p {
    private final Context a;
    private final c b;
    private final b42 c;
    private final h32 d;
    private final ajf<u> e;
    private final ajf<s> f;
    private final hnd g;
    private final u8 h;

    public p(Context context, c cVar, b42 b42, h32 h32, ajf<u> ajf, ajf<s> ajf2, hnd hnd, u8 u8Var) {
        this.a = context;
        this.b = cVar;
        this.c = b42;
        this.d = h32;
        this.e = ajf;
        this.f = ajf2;
        this.g = hnd;
        this.h = u8Var;
    }

    public r3 a(o oVar, boolean z, r rVar) {
        ifd ifd = kfd.I0;
        boolean z2 = false;
        if (l0.z(rVar.d()).q() == LinkType.SHOW_EPISODE) {
            o.b b2 = oVar.b();
            ContextTrack contextTrack = rVar.c().track().get();
            j32.b c2 = this.d.b(rVar.d(), MoreObjects.nullToEmpty(contextTrack.metadata().get("title")), rVar.a(), z, contextTrack.metadata()).f(kxd.m(contextTrack)).a(this.b).d(b2.e()).c(b2.d());
            c2.g(true);
            j32.j s = c2.h(b2.c()).p(kxd.m(contextTrack) || (kxd.l(contextTrack) && this.h.b())).s(false);
            if (!kxd.m(contextTrack) && b2.h()) {
                z2 = true;
            }
            j32.h k = s.k(z2);
            k.l(!b2.b());
            k.i(b2.f());
            k.r(b2.g());
            k.e(ifd);
            return k.b();
        }
        o.c c3 = oVar.c();
        PlayerState c4 = rVar.c();
        ContextTrack contextTrack2 = c4.track().get();
        d42.f w = this.c.b(rVar.d(), MoreObjects.nullToEmpty(contextTrack2.metadata().get("title")), rVar.a(), z, contextTrack2.metadata()).a(this.b).t((MoreObjects.isNullOrEmpty(contextTrack2.metadata().get("album_uri")) ^ true) && c3.d()).g(!MoreObjects.isNullOrEmpty(contextTrack2.metadata().get("artist_uri"))).r(c3.m()).w(false);
        w.i(c3.f());
        w.v(c3.g());
        w.c(c3.c());
        w.f(!c3.l());
        w.l(!c3.b());
        w.p(c3.i());
        w.k(c3.n());
        w.m(kfd.w0.equals(new ifd(c4.playOrigin().featureIdentifier())));
        w.o(this.g);
        w.e(ifd);
        if (c3.k()) {
            u uVar = this.e.get();
            uVar.getClass();
            w.x(new d4(c4.restrictions().disallowTogglingShuffleReasons().isEmpty(), uVar.a(c4), new g(uVar)));
        }
        if (c3.h()) {
            s sVar = this.f.get();
            sVar.getClass();
            w.s(new d4(bqd.c(c4.restrictions()), sVar.a(c4), new e(sVar)));
        }
        return w.b();
    }

    public void b(r rVar, o oVar, boolean z) {
        Context context = this.a;
        c cVar = this.b;
        int i = ContextMenuFragment.J0;
        ContextMenuFragment.f5(a(oVar, z, rVar), (androidx.fragment.app.c) context, cVar);
    }
}
