package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: nt9  reason: default package */
public final /* synthetic */ class nt9 implements g {
    public static final /* synthetic */ nt9 a = new nt9();

    private /* synthetic */ nt9() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to update settings", new Object[0]);
    }
}
