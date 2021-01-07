package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ek1  reason: default package */
public final /* synthetic */ class ek1 implements g {
    public static final /* synthetic */ ek1 a = new ek1();

    private /* synthetic */ ek1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Couldn't switch playback to local.", new Object[0]);
    }
}
