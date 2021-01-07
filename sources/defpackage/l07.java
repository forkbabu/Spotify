package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: l07  reason: default package */
public final /* synthetic */ class l07 implements g {
    public static final /* synthetic */ l07 a = new l07();

    private /* synthetic */ l07() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "ExtenderPresenter: Error getting connection state", new Object[0]);
    }
}
