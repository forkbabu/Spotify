package defpackage;

import android.view.ViewGroup;
import com.spotify.music.carmodehome.page.DisposableItemPresenterLifecycleObserver;
import com.spotify.music.carmodehome.shelf.d;
import com.spotify.music.carmodehome.shelf.g;

/* renamed from: kr2  reason: default package */
public final class kr2 {
    private final wlf<g> a;
    private final wlf<d> b;
    private final wlf<DisposableItemPresenterLifecycleObserver> c;

    public kr2(wlf<g> wlf, wlf<d> wlf2, wlf<DisposableItemPresenterLifecycleObserver> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public jr2 b(ViewGroup viewGroup) {
        g gVar = this.a.get();
        a(gVar, 1);
        d dVar = this.b.get();
        a(dVar, 2);
        DisposableItemPresenterLifecycleObserver disposableItemPresenterLifecycleObserver = this.c.get();
        a(disposableItemPresenterLifecycleObserver, 3);
        a(viewGroup, 4);
        return new jr2(gVar, dVar, disposableItemPresenterLifecycleObserver, viewGroup);
    }
}
