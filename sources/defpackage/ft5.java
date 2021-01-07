package defpackage;

import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.features.nowplayingbar.domain.c;
import com.spotify.music.features.nowplayingbar.domain.d;
import com.spotify.music.onboarding.freetier.education.a;
import io.reactivex.w;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: ft5  reason: default package */
public final class ft5 {
    public static final w<c, d> a(com.spotify.player.controls.d dVar, t8a t8a, nsb nsb, uba uba, pl9 pl9, a aVar, y yVar) {
        h.e(dVar, "playerControls");
        h.e(t8a, "likedContent");
        h.e(nsb, "navigator");
        h.e(uba, "connectNavigator");
        h.e(pl9, "preCurationDialogTrigger");
        h.e(aVar, "freeTierEducationManager");
        h.e(yVar, "mainScheduler");
        m f = i.f();
        f.h(c.a.class, new zs5(dVar));
        f.d(c.b.class, new at5(t8a));
        f.e(c.d.class, new ct5(nsb), yVar);
        f.c(c.C0236c.class, new bt5(uba), yVar);
        f.b(c.e.class, new dt5(pl9));
        f.b(c.f.class, new et5(aVar));
        w<c, d> i = f.i();
        h.d(i, "RxMobius.subtypeEffectHa…anager))\n        .build()");
        return i;
    }
}
