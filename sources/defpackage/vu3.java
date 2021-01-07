package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: vu3  reason: default package */
public final /* synthetic */ class vu3 implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ vu3(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("[AdEventPoster] Error in reporting event: %s, error message: %s", this.a, ((Throwable) obj).getMessage());
    }
}
