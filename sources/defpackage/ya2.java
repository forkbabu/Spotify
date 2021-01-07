package defpackage;

import android.app.Activity;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.s;

/* renamed from: ya2  reason: default package */
public final class ya2 implements fjf<wa2> {
    private final wlf<ab2> a;
    private final wlf<db2> b;
    private final wlf<rb2> c;
    private final wlf<tb2> d;
    private final wlf<Activity> e;
    private final wlf<s<Boolean>> f;

    public ya2(wlf<ab2> wlf, wlf<db2> wlf2, wlf<rb2> wlf3, wlf<tb2> wlf4, wlf<Activity> wlf5, wlf<s<Boolean>> wlf6) {
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
        rb2 rb2 = this.c.get();
        rb2 rb22 = rb2;
        tb2 tb2 = this.d.get();
        PartnerType partnerType = PartnerType.WAZE;
        return new wa2(this.e.get(), db2.a(partnerType), ab2.a(partnerType), rb22, tb2, this.f.get());
    }
}
