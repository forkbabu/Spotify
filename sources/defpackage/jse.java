package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.a;

/* renamed from: jse  reason: default package */
public final /* synthetic */ class jse implements a {
    public final /* synthetic */ sse a;

    public /* synthetic */ jse(sse sse) {
        this.a = sse;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        sse sse = this.a;
        sse.a(sse);
        Logger.b("[Voice] recreating utterance id %s", sse.c());
    }
}
