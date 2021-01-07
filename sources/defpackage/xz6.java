package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: xz6  reason: default package */
public final /* synthetic */ class xz6 implements g {
    public static final /* synthetic */ xz6 a = new xz6();

    private /* synthetic */ xz6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to observe data.", new Object[0]);
    }
}
