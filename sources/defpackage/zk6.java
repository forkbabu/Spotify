package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: zk6  reason: default package */
public final /* synthetic */ class zk6 implements g {
    public static final /* synthetic */ zk6 a = new zk6();

    private /* synthetic */ zk6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "PlaylistHeaderPresenter failed to wait for scroll to position", new Object[0]);
    }
}
