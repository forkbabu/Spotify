package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: y52  reason: default package */
public final /* synthetic */ class y52 implements g {
    public final /* synthetic */ c62 a;

    public /* synthetic */ y52(c62 c62) {
        this.a = c62;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.getClass();
        Logger.e((Throwable) obj, "Failed to listen for playback errors.", new Object[0]);
    }
}
