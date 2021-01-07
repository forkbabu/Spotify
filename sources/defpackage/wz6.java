package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: wz6  reason: default package */
public final /* synthetic */ class wz6 implements g {
    public static final /* synthetic */ wz6 a = new wz6();

    private /* synthetic */ wz6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error: Can not read user from SessionState", new Object[0]);
    }
}
