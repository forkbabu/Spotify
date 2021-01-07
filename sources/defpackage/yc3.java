package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

/* renamed from: yc3  reason: default package */
public final class yc3 implements fjf<s<String>> {
    private final wlf<g<SessionState>> a;

    public yc3(wlf<g<SessionState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get().C(oc3.a).C(qc3.a).h0(1).O(rc3.a));
    }
}
