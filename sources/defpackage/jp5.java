package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import java.util.concurrent.TimeUnit;

/* renamed from: jp5  reason: default package */
public final class jp5 implements fjf<s<SessionState>> {
    private final wlf<yn1> a;

    public jp5(wlf<yn1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get().a().C(ap5.a).q(600, TimeUnit.MILLISECONDS, a.a()).s());
    }
}
