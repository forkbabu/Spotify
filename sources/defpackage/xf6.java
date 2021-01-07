package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: xf6  reason: default package */
public final /* synthetic */ class xf6 implements g {
    public static final /* synthetic */ xf6 a = new xf6();

    private /* synthetic */ xf6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "InlinePlayButtonPresenter: Failed to play.", new Object[0]);
    }
}
