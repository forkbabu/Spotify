package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: v76  reason: default package */
public final /* synthetic */ class v76 implements g {
    public static final /* synthetic */ v76 a = new v76();

    private /* synthetic */ v76() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "DownloadTogglePresenter: Error downloading/undownloading playlist", new Object[0]);
    }
}
