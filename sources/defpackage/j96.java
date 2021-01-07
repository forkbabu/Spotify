package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: j96  reason: default package */
public final /* synthetic */ class j96 implements g {
    public static final /* synthetic */ j96 a = new j96();

    private /* synthetic */ j96() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "P2sHeaderPresenter: failed to change follow state for playlist", new Object[0]);
    }
}
