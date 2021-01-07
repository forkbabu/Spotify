package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: t96  reason: default package */
public final /* synthetic */ class t96 implements g {
    public static final /* synthetic */ t96 a = new t96();

    private /* synthetic */ t96() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "P2sHeaderPresenter failed to wait for scroll to position", new Object[0]);
    }
}
