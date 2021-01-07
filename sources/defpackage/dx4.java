package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: dx4  reason: default package */
public final /* synthetic */ class dx4 implements g {
    public static final /* synthetic */ dx4 a = new dx4();

    private /* synthetic */ dx4() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Unable to get playlist", new Object[0]);
    }
}
