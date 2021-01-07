package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: sub  reason: default package */
public final /* synthetic */ class sub implements g {
    public static final /* synthetic */ sub a = new sub();

    private /* synthetic */ sub() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d("error: %s", ((Throwable) obj).getMessage());
    }
}
