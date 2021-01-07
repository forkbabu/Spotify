package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: oha  reason: default package */
public final /* synthetic */ class oha implements g {
    public static final /* synthetic */ oha a = new oha();

    private /* synthetic */ oha() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d("Error when subscribing to PlayerState: %s", ((Throwable) obj).getMessage());
    }
}
