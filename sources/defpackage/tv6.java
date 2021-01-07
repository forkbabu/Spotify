package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: tv6  reason: default package */
public final /* synthetic */ class tv6 implements g {
    public static final /* synthetic */ tv6 a = new tv6();

    private /* synthetic */ tv6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to add/remove playlist.", new Object[0]);
    }
}
