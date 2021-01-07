package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: w8c  reason: default package */
public final /* synthetic */ class w8c implements g {
    public static final /* synthetic */ w8c a = new w8c();

    private /* synthetic */ w8c() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.c((Throwable) obj, "User mix can't be marked offline", new Object[0]);
    }
}
