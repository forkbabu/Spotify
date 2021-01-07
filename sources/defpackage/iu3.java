package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: iu3  reason: default package */
public final /* synthetic */ class iu3 implements g {
    public static final /* synthetic */ iu3 a = new iu3();

    private /* synthetic */ iu3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = ku3.d;
        Logger.b("Ad Targeting - Error in making request to targeting endpoint: %s", ((Throwable) obj).getMessage());
    }
}
