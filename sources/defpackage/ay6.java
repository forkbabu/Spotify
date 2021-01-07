package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ay6  reason: default package */
public final /* synthetic */ class ay6 implements g {
    public static final /* synthetic */ ay6 a = new ay6();

    private /* synthetic */ ay6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error downloading/undownloading playlist", new Object[0]);
    }
}
