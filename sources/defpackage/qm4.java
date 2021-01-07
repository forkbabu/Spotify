package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: qm4  reason: default package */
public final /* synthetic */ class qm4 implements g {
    public static final /* synthetic */ qm4 a = new qm4();

    private /* synthetic */ qm4() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, "Captured error: %s", th);
    }
}
