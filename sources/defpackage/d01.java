package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: d01  reason: default package */
public final /* synthetic */ class d01 implements g {
    public static final /* synthetic */ d01 a = new d01();

    private /* synthetic */ d01() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to complete the autologin request", new Object[0]);
    }
}
