package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: zob  reason: default package */
public class zob {
    private final xr3 a;
    private final y b;
    private final y c;

    public zob(xr3 xr3, y yVar, y yVar2) {
        this.a = xr3;
        this.b = yVar;
        this.c = yVar2;
    }

    public g<Ad> a() {
        return this.a.a().Y0(BackpressureStrategy.LATEST).C(xob.a).O(wob.a).s().e0(this.b).Q(this.c);
    }
}
