package defpackage;

import android.app.Activity;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.s;

/* renamed from: xa2  reason: default package */
public final class xa2 implements fjf<wa2> {
    private final wlf<ab2> a;
    private final wlf<db2> b;
    private final wlf<lb2> c;
    private final wlf<nb2> d;
    private final wlf<Activity> e;
    private final wlf<s<Boolean>> f;

    public xa2(wlf<ab2> wlf, wlf<db2> wlf2, wlf<lb2> wlf3, wlf<nb2> wlf4, wlf<Activity> wlf5, wlf<s<Boolean>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        ab2 ab2 = this.a.get();
        db2 db2 = this.b.get();
        lb2 lb2 = this.c.get();
        nb2 nb2 = this.d.get();
        lb2 lb22 = lb2;
        PartnerType partnerType = PartnerType.GOOGLE_MAPS;
        return new wa2(this.e.get(), db2.a(partnerType), ab2.a(partnerType), lb22, nb2, this.f.get());
    }
}
