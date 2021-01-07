package com.spotify.music.features.freetierartist.datasource;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import java.util.Map;

public class q {
    private final wlf<h81> a;
    private final boolean b;
    private final h85 c;
    private final w d;
    private final p e;

    public q(wlf<h81> wlf, boolean z, h85 h85, p pVar, w wVar) {
        wlf.getClass();
        this.a = wlf;
        this.b = z;
        this.c = h85;
        this.e = pVar;
        this.d = wVar;
    }

    public s<b91> a(String str) {
        str.getClass();
        if (this.b) {
            return new v(this.a.get().a());
        }
        l0 z = l0.z(str);
        MoreObjects.checkArgument(z.q() == LinkType.ARTIST, "SpotifyLink needs to be of link type Artist");
        return new v(this.c.a()).J0(new a(this, z.i()));
    }

    public io.reactivex.v b(String str, Map map) {
        return this.e.a(str, map).P().q(this.d);
    }
}
