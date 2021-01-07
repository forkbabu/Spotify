package defpackage;

import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.email.a;
import defpackage.zu8;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: dv8  reason: default package */
public final class dv8 {
    public static final w<zu8, ev8> a(ov8 ov8, a aVar) {
        h.e(ov8, "remoteService");
        h.e(aVar, "emailDelegate");
        m f = i.f();
        h.e(ov8, "remoteService");
        f.h(zu8.c.class, new cv8(ov8));
        h.e(ov8, "service");
        f.h(zu8.a.class, new av8(ov8));
        h.e(aVar, "emailDelegate");
        f.d(zu8.b.class, new bv8(aVar));
        w<zu8, ev8> i = f.i();
        h.d(i, "subtypeEffectHandler<Upd…       )\n        .build()");
        return i;
    }
}
