package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: jub  reason: default package */
public final /* synthetic */ class jub implements g {
    public static final /* synthetic */ jub a = new jub();

    private /* synthetic */ jub() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d("Error when subscribing: %s", ((Throwable) obj).getMessage());
    }
}
