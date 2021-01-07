package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.n;

/* renamed from: rd5  reason: default package */
public final /* synthetic */ class rd5 implements n {
    public static final /* synthetic */ rd5 a = new rd5();

    private /* synthetic */ rd5() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        Logger.e((Throwable) obj, "Go: Failed to open Spotify login page", new Object[0]);
        return true;
    }
}
