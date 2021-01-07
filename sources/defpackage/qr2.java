package defpackage;

import android.view.ViewGroup;
import com.spotify.music.carmodehome.page.DisposableItemPresenterLifecycleObserver;
import com.spotify.music.carmodehome.shortcuts.f;
import com.spotify.music.carmodehome.shortcuts.i;

/* renamed from: qr2  reason: default package */
public final class qr2 {
    private final wlf<i> a;
    private final wlf<f> b;
    private final wlf<DisposableItemPresenterLifecycleObserver> c;

    public qr2(wlf<i> wlf, wlf<f> wlf2, wlf<DisposableItemPresenterLifecycleObserver> wlf3) {
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

    public pr2 b(ViewGroup viewGroup) {
        i iVar = this.a.get();
        a(iVar, 1);
        f fVar = this.b.get();
        a(fVar, 2);
        DisposableItemPresenterLifecycleObserver disposableItemPresenterLifecycleObserver = this.c.get();
        a(disposableItemPresenterLifecycleObserver, 3);
        a(viewGroup, 4);
        return new pr2(iVar, fVar, disposableItemPresenterLifecycleObserver, viewGroup);
    }
}
