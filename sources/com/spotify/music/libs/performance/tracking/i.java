package com.spotify.music.libs.performance.tracking;

import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import io.reactivex.functions.g;
import java.lang.ref.WeakReference;

public final /* synthetic */ class i implements g {
    public final /* synthetic */ WeakReference a;

    public /* synthetic */ i(WeakReference weakReference) {
        this.a = weakReference;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ViewLoadingTracker viewLoadingTracker;
        WeakReference weakReference = this.a;
        ej9 ej9 = (ej9) obj;
        if ((ej9 instanceof fj9) && (viewLoadingTracker = (ViewLoadingTracker) weakReference.get()) != null) {
            viewLoadingTracker.r(((fj9) ej9).d());
        }
    }
}
