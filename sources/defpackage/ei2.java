package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ei2  reason: default package */
public final /* synthetic */ class ei2 implements g {
    public static final /* synthetic */ ei2 a = new ei2();

    private /* synthetic */ ei2() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.o((Throwable) obj, "Error while observing recently played items for shortcuts", new Object[0]);
    }
}
