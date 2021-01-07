package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ra6  reason: default package */
public final /* synthetic */ class ra6 implements g {
    public static final /* synthetic */ ra6 a = new ra6();

    private /* synthetic */ ra6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "RefreshHeaderPresenter failed to wait for scroll to position", new Object[0]);
    }
}
