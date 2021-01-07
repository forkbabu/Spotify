package defpackage;

import com.spotify.music.carmodehome.page.DisposableItemPresenterLifecycleObserver;
import com.spotify.music.carmodehome.shelf.d;
import com.spotify.music.carmodehome.shelf.g;

/* renamed from: lr2  reason: default package */
public final class lr2 implements fjf<kr2> {
    private final wlf<g> a;
    private final wlf<d> b;
    private final wlf<DisposableItemPresenterLifecycleObserver> c;

    public lr2(wlf<g> wlf, wlf<d> wlf2, wlf<DisposableItemPresenterLifecycleObserver> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kr2(this.a, this.b, this.c);
    }
}
