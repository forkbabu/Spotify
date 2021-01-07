package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: tg2  reason: default package */
public final /* synthetic */ class tg2 implements g {
    public static final /* synthetic */ tg2 a = new tg2();

    private /* synthetic */ tg2() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = xg2.j;
        Logger.e((Throwable) obj, "Failed observing play queue", new Object[0]);
    }
}
