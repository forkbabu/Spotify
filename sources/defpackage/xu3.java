package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: xu3  reason: default package */
public final /* synthetic */ class xu3 implements g {
    public static final /* synthetic */ xu3 a = new xu3();

    private /* synthetic */ xu3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("ADS: Accessory Update Failed. Throwable message: %s", ((Throwable) obj).getMessage());
    }
}
