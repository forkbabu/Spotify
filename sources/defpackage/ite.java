package defpackage;

import com.spotify.mobile.android.rx.v;
import io.reactivex.z;

/* renamed from: ite  reason: default package */
public final class ite implements fjf<z<Boolean>> {
    private final wlf<v> a;

    public ite(wlf<v> wlf) {
        this.a = wlf;
    }

    public static z<Boolean> a(v vVar) {
        return new io.reactivex.internal.operators.observable.v(vVar.a(em9.c).h0(1)).R(Boolean.FALSE);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
