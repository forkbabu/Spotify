package defpackage;

import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import defpackage.uy1;
import io.reactivex.w;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: dz1  reason: default package */
public final class dz1 {
    public static final w<uy1, vy1> a(nmf<Integer, z<hx1>> nmf, sy1 sy1) {
        h.e(nmf, "storyProvider");
        h.e(sy1, "storytellingContainerLogger");
        m f = i.f();
        h.e(nmf, "storyProvider");
        f.h(uy1.a.class, new bz1(nmf));
        h.e(sy1, "storytellingContainerLogger");
        f.b(uy1.b.class, new cz1(sy1));
        return f.i();
    }
}
