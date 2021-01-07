package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: rp8  reason: default package */
public final /* synthetic */ class rp8 implements g {
    public static final /* synthetic */ rp8 a = new rp8();

    private /* synthetic */ rp8() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to get a search result", new Object[0]);
    }
}
