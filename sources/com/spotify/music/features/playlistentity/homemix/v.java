package com.spotify.music.features.playlistentity.homemix;

import com.google.common.collect.ImmutableList;
import defpackage.zo6;
import defpackage.zt6;

public class v implements zo6.c {
    private final wlf<fe6> a;
    private final wlf<xb6> b;
    private final wlf<dd6> c;
    private final wlf<ImmutableList<gu6>> d;
    private final wlf<zt6.b.a> e;

    public v(wlf<fe6> wlf, wlf<xb6> wlf2, wlf<dd6> wlf3, wlf<ImmutableList<gu6>> wlf4, wlf<zt6.b.a> wlf5) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.zo6.c
    public zo6 create() {
        fe6 fe6 = this.a.get();
        a(fe6, 1);
        fe6 fe62 = fe6;
        xb6 xb6 = this.b.get();
        a(xb6, 2);
        xb6 xb62 = xb6;
        dd6 dd6 = this.c.get();
        a(dd6, 3);
        dd6 dd62 = dd6;
        ImmutableList<gu6> immutableList = this.d.get();
        a(immutableList, 4);
        ImmutableList<gu6> immutableList2 = immutableList;
        zt6.b.a aVar = this.e.get();
        a(aVar, 5);
        return new s(fe62, xb62, dd62, immutableList2, aVar);
    }
}
