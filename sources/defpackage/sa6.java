package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: sa6  reason: default package */
public final /* synthetic */ class sa6 implements g {
    public static final /* synthetic */ sa6 a = new sa6();

    private /* synthetic */ sa6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "RefreshHeaderPresenter: failed to play.", new Object[0]);
    }
}
