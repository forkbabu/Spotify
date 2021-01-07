package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: s76  reason: default package */
public final /* synthetic */ class s76 implements g {
    public static final /* synthetic */ s76 a = new s76();

    private /* synthetic */ s76() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "DownloadTogglePresenter failed to change follow state for playlist", new Object[0]);
    }
}
