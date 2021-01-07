package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: qa6  reason: default package */
public final /* synthetic */ class qa6 implements g {
    public static final /* synthetic */ qa6 a = new qa6();

    private /* synthetic */ qa6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "RefreshHeaderPresenter: failed to play.", new Object[0]);
    }
}
