package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: r86  reason: default package */
public final /* synthetic */ class r86 implements g {
    public static final /* synthetic */ r86 a = new r86();

    private /* synthetic */ r86() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "FilterAndSortPresenter failed to listen to filterAndSortController.observeFind()", new Object[0]);
    }
}
