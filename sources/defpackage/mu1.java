package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: mu1  reason: default package */
public final /* synthetic */ class mu1 implements g {
    public static final /* synthetic */ mu1 a = new mu1();

    private /* synthetic */ mu1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Playback failed.", new Object[0]);
    }
}
