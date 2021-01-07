package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: yx6  reason: default package */
public final /* synthetic */ class yx6 implements g {
    public static final /* synthetic */ yx6 a = new yx6();

    private /* synthetic */ yx6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "OfflineSyncPresenterInteractor: failed to change follow state for playlist", new Object[0]);
    }
}
