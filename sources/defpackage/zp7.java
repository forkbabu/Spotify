package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: zp7  reason: default package */
public final /* synthetic */ class zp7 implements g {
    public static final /* synthetic */ zp7 a = new zp7();

    private /* synthetic */ zp7() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, th.getMessage(), new Object[0]);
    }
}
