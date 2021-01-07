package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: c16  reason: default package */
public final /* synthetic */ class c16 implements g {
    public static final /* synthetic */ c16 a = new c16();

    private /* synthetic */ c16() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to subscribe to modified observable", new Object[0]);
    }
}
