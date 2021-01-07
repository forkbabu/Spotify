package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.a;

/* renamed from: uu3  reason: default package */
public final /* synthetic */ class uu3 implements a {
    public final /* synthetic */ String a;

    public /* synthetic */ uu3(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        Logger.b("[AdEventPoster] %s reported successfully", this.a);
    }
}
