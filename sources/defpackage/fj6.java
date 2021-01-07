package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: fj6  reason: default package */
public final /* synthetic */ class fj6 implements g {
    public static final /* synthetic */ fj6 a = new fj6();

    private /* synthetic */ fj6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "SingleAdapterItemListPresenter: Failed to auto play.", new Object[0]);
    }
}
