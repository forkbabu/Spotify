package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: wv6  reason: default package */
public final /* synthetic */ class wv6 implements g {
    public static final /* synthetic */ wv6 a = new wv6();

    private /* synthetic */ wv6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to add/remove playlist.", new Object[0]);
    }
}
