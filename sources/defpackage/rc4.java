package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

/* renamed from: rc4  reason: default package */
public final /* synthetic */ class rc4 implements l {
    public static final /* synthetic */ rc4 a = new rc4();

    private /* synthetic */ rc4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.o(th, "Browse online request failed", new Object[0]);
        return re4.d(th);
    }
}
