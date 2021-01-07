package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: v86  reason: default package */
public final /* synthetic */ class v86 implements g {
    public static final /* synthetic */ v86 a = new v86();

    private /* synthetic */ v86() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "FilterAndSortPresenter failed to listen to filterAndSortController.observeSort()", new Object[0]);
    }
}
