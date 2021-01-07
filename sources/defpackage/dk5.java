package defpackage;

import com.google.common.collect.Collections2;
import com.spotify.music.features.home.common.cache.a;
import com.spotify.music.features.home.common.cache.b;
import com.spotify.music.features.home.common.datasource.f;
import com.spotify.music.features.home.common.datasource.h;
import com.spotify.music.features.home.common.datasource.j;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: dk5  reason: default package */
public class dk5 extends f {
    private final sxd j;

    public dk5(y yVar, boolean z, boolean z2, nf5 nf5, wlf<h81> wlf, h hVar, j jVar, a<byte[]> aVar, b bVar, sxd sxd) {
        super(yVar, z, z2, nf5, wlf, hVar, jVar, aVar, bVar);
        sxd.getClass();
        this.j = sxd;
    }

    public static s g(dk5 dk5, b91 b91) {
        dk5.getClass();
        String[] stringArray = b91.custom().stringArray("ondemand");
        if (stringArray == null || stringArray.length <= 0) {
            return s.i0(b91);
        }
        sxd sxd = dk5.j;
        HashSet newHashSetWithExpectedSize = Collections2.newHashSetWithExpectedSize(stringArray.length);
        Collections.addAll(newHashSetWithExpectedSize, stringArray);
        return sxd.c(newHashSetWithExpectedSize).g(s.i0(b91));
    }

    @Override // com.spotify.music.features.home.common.datasource.f, defpackage.pf5
    public s<b91> a() {
        return super.a().J0(new ck5(this));
    }

    @Override // com.spotify.music.features.home.common.datasource.f, defpackage.pf5
    public s<b91> b() {
        return super.b().J0(new ck5(this));
    }

    @Override // com.spotify.music.features.home.common.datasource.f
    public s<b91> f() {
        return super.f().J0(new ck5(this));
    }
}
