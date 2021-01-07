package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ju1  reason: default package */
public final /* synthetic */ class ju1 implements g {
    public static final /* synthetic */ ju1 a = new ju1();

    private /* synthetic */ ju1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, th.getMessage(), new Object[0]);
    }
}
