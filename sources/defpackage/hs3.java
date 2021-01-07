package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: hs3  reason: default package */
public final /* synthetic */ class hs3 implements g {
    public static final /* synthetic */ hs3 a = new hs3();

    private /* synthetic */ hs3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to apply reward", new Object[0]);
    }
}
