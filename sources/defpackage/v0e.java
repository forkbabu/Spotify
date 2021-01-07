package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.rxjava2.DisposableSetLifecycleObserver;
import com.spotify.rxjava2.q;

/* renamed from: v0e  reason: default package */
public final class v0e implements fjf<q> {
    private final wlf<Fragment> a;

    public v0e(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        q qVar = new q();
        this.a.get().A().a(new DisposableSetLifecycleObserver(qVar));
        return qVar;
    }
}
