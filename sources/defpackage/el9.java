package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: el9  reason: default package */
public final /* synthetic */ class el9 implements g {
    public static final /* synthetic */ el9 a = new el9();

    private /* synthetic */ el9() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, th.getMessage(), new Object[0]);
    }
}
