package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

/* renamed from: hd4  reason: default package */
public final /* synthetic */ class hd4 implements l {
    public static final /* synthetic */ hd4 a = new hd4();

    private /* synthetic */ hd4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.o(th, "Browse request failed", new Object[0]);
        return re4.d(th);
    }
}
