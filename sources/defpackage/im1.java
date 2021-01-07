package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: im1  reason: default package */
public final /* synthetic */ class im1 implements g {
    public static final /* synthetic */ im1 a = new im1();

    private /* synthetic */ im1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "[FetchAdIdTaskPlugin] Unable to get AdInfo", new Object[0]);
    }
}
