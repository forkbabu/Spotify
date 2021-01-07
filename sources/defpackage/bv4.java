package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: bv4  reason: default package */
public final /* synthetic */ class bv4 implements g {
    public static final /* synthetic */ bv4 a = new bv4();

    private /* synthetic */ bv4() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.d("failed to process android status", new Object[0]);
    }
}
