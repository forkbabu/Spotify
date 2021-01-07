package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: e5d  reason: default package */
public final /* synthetic */ class e5d implements g {
    public static final /* synthetic */ e5d a = new e5d();

    private /* synthetic */ e5d() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "social listening device: Failed observing SocialListeningDeviceModel", new Object[0]);
    }
}
