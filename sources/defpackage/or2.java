package defpackage;

import com.spotify.music.carmodehome.page.DisposableItemPresenterLifecycleObserver;
import com.spotify.music.carmodehome.shortcuts.b;
import com.spotify.music.carmodehome.shortcuts.i;

/* renamed from: or2  reason: default package */
public final class or2 implements fjf<nr2> {
    private final wlf<i> a;
    private final wlf<b> b;
    private final wlf<DisposableItemPresenterLifecycleObserver> c;

    public or2(wlf<i> wlf, wlf<b> wlf2, wlf<DisposableItemPresenterLifecycleObserver> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nr2(this.a, this.b, this.c);
    }
}
