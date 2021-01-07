package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ww1  reason: default package */
public final /* synthetic */ class ww1 implements g {
    public static final /* synthetic */ ww1 a = new ww1();

    private /* synthetic */ ww1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d("Categorization failed. Could not resolve category for AccessoryConnector: %s", (Throwable) obj);
    }
}
