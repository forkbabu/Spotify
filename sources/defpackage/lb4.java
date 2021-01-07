package defpackage;

import com.spotify.mobile.android.rx.w;
import io.reactivex.s;

/* renamed from: lb4  reason: default package */
public final class lb4 implements fjf<s<we4>> {
    private final wlf<w> a;

    public lb4(wlf<w> wlf) {
        this.a = wlf;
    }

    public static s<we4> a(w wVar) {
        return s.n(wVar.a("type"), wVar.a("shows-collection"), y94.a).E();
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
