package defpackage;

import com.spotify.music.carmodehome.page.DisposableItemPresenterLifecycleObserver;
import com.spotify.music.carmodehome.shortcuts.f;
import com.spotify.music.carmodehome.shortcuts.i;

/* renamed from: rr2  reason: default package */
public final class rr2 implements fjf<qr2> {
    private final wlf<i> a;
    private final wlf<f> b;
    private final wlf<DisposableItemPresenterLifecycleObserver> c;

    public rr2(wlf<i> wlf, wlf<f> wlf2, wlf<DisposableItemPresenterLifecycleObserver> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qr2(this.a, this.b, this.c);
    }
}
