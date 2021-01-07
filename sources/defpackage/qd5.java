package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: qd5  reason: default package */
public final /* synthetic */ class qd5 implements g {
    public static final /* synthetic */ qd5 a = new qd5();

    private /* synthetic */ qd5() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Go: Failed to play TTS", new Object[0]);
    }
}
