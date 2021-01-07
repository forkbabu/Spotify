package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: j8c  reason: default package */
public final /* synthetic */ class j8c implements g {
    public static final /* synthetic */ j8c a = new j8c();

    private /* synthetic */ j8c() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to listen for offline errors.", new Object[0]);
    }
}
