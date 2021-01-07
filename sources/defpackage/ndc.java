package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.y;

/* renamed from: ndc  reason: default package */
public final class ndc implements fjf<mdc> {
    private final wlf<hla> a;
    private final wlf<mcc> b;
    private final wlf<e92> c;
    private final wlf<mla> d;
    private final wlf<y> e;
    private final wlf<SpSharedPreferences<Object>> f;

    public ndc(wlf<hla> wlf, wlf<mcc> wlf2, wlf<e92> wlf3, wlf<mla> wlf4, wlf<y> wlf5, wlf<SpSharedPreferences<Object>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mdc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
