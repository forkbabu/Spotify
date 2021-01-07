package defpackage;

import com.spotify.android.flags.g;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.a;
import com.spotify.music.h;
import com.spotify.music.r;
import com.spotify.music.v;
import defpackage.tfb;
import io.reactivex.w;

/* renamed from: cgb  reason: default package */
public final class cgb {
    public static final w<tfb, ufb> a(a aVar, com.spotify.music.w wVar, g gVar, v vVar, r rVar, h hVar) {
        kotlin.jvm.internal.h.e(aVar, "startLoggedInSessionDelegate");
        kotlin.jvm.internal.h.e(wVar, "uiVisibleDelegate");
        kotlin.jvm.internal.h.e(gVar, "handleFlagsChangedDelegate");
        kotlin.jvm.internal.h.e(vVar, "handleSessionStateChangedDelegate");
        kotlin.jvm.internal.h.e(rVar, "uiHiddenDelegate");
        kotlin.jvm.internal.h.e(hVar, "goToLoginDelegate");
        m f = i.f();
        f.b(tfb.b.class, new xfb(0, hVar));
        f.d(tfb.e.class, new bgb(aVar, wVar, gVar, vVar));
        f.b(tfb.g.class, new xfb(1, wVar));
        f.d(tfb.c.class, new zfb(gVar));
        f.d(tfb.d.class, new agb(vVar));
        f.b(tfb.f.class, new xfb(2, rVar));
        f.d(tfb.a.class, new yfb(rVar, hVar));
        w<tfb, ufb> i = f.i();
        kotlin.jvm.internal.h.d(i, "RxMobius.subtypeEffectHa…   )\n            .build()");
        return i;
    }
}
