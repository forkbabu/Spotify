package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: pa6  reason: default package */
public final /* synthetic */ class pa6 implements g {
    public static final /* synthetic */ pa6 a = new pa6();

    private /* synthetic */ pa6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "RefreshHeaderPresenter: failed to change follow state for playlist.", new Object[0]);
    }
}
