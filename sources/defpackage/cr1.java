package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: cr1  reason: default package */
public final /* synthetic */ class cr1 implements g {
    public static final /* synthetic */ cr1 a = new cr1();

    private /* synthetic */ cr1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = cs1.k;
        Logger.e((Throwable) obj, "Failed getting the player state", new Object[0]);
    }
}
