package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: np5  reason: default package */
public final /* synthetic */ class np5 implements g {
    public static final /* synthetic */ np5 a = new np5();

    private /* synthetic */ np5() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to retrieve view model", new Object[0]);
    }
}
