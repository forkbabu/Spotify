package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: av4  reason: default package */
public final /* synthetic */ class av4 implements g {
    public static final /* synthetic */ av4 a = new av4();

    private /* synthetic */ av4() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error observing data saver enabled state", new Object[0]);
    }
}
