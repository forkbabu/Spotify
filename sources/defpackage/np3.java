package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: np3  reason: default package */
public final /* synthetic */ class np3 implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ np3(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        Logger.b("success for %s slot and skipped to next track (video)", this.a);
    }
}
