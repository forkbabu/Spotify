package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

/* renamed from: nm4  reason: default package */
public final /* synthetic */ class nm4 implements g {
    public static final /* synthetic */ nm4 a = new nm4();

    private /* synthetic */ nm4() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.g("Capture response: %s", (Response) obj);
    }
}
