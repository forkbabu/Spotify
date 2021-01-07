package defpackage;

import android.app.Activity;
import androidx.appcompat.app.g;
import com.spotify.rxjava2.DisposableSetLifecycleObserver;
import com.spotify.rxjava2.q;

/* renamed from: k8a  reason: default package */
public final class k8a implements fjf<m8a> {
    private final wlf<Activity> a;
    private final wlf<n8a> b;
    private final wlf<lbb> c;
    private final wlf<ih0> d;
    private final wlf<rbb> e;

    public k8a(wlf<Activity> wlf, wlf<n8a> wlf2, wlf<lbb> wlf3, wlf<ih0> wlf4, wlf<rbb> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static k8a a(wlf<Activity> wlf, wlf<n8a> wlf2, wlf<lbb> wlf3, wlf<ih0> wlf4, wlf<rbb> wlf5) {
        return new k8a(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        m8a m8a = (n8a) this.b.get();
        ih0 ih0 = this.d.get();
        rbb rbb = this.e.get();
        if (this.c.get().c()) {
            q qVar = new q();
            ((g) activity).A().a(new DisposableSetLifecycleObserver(qVar));
            m8a = new l8a(m8a, qVar, ih0, rbb);
        }
        yif.g(m8a, "Cannot return null from a non-@Nullable @Provides method");
        return m8a;
    }
}
