package com.spotify.music.features.followfeed;

import com.spotify.music.freetiercommon.models.a;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class c {
    public static String a(a aVar) {
        return aVar.getPreviewId() + aVar.getUri();
    }

    public static final Set<Integer> b(jnf jnf, jnf jnf2) {
        h.e(jnf, "previousRange");
        h.e(jnf2, "newRange");
        if (jnf2.d() < 0 || jnf2.e() < 0) {
            return EmptySet.a;
        }
        Set Z = d.Z(new jnf(jnf.d(), jnf.e()));
        Set<Integer> Z2 = d.Z(new jnf(jnf2.d(), jnf2.e()));
        if (jnf.d() == jnf.e() && jnf.d() == 0) {
            return Z2;
        }
        h.e(Z2, "$this$subtract");
        h.e(Z, "other");
        Set<Integer> Y = d.Y(Z2);
        d.F(Y, Z);
        return Y;
    }
}
