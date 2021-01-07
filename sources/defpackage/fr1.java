package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: fr1  reason: default package */
public final /* synthetic */ class fr1 implements g {
    public static final /* synthetic */ fr1 a = new fr1();

    private /* synthetic */ fr1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = fs1.k;
        Logger.e((Throwable) obj, "Failed getting the player state", new Object[0]);
    }
}
