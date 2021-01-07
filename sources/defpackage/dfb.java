package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: dfb  reason: default package */
public final /* synthetic */ class dfb implements g {
    public final /* synthetic */ qfb a;

    public /* synthetic */ dfb(qfb qfb) {
        this.a = qfb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        qfb qfb = this.a;
        qfb.getClass();
        Logger.e((Throwable) obj, "Failed to observe settings from Sing Along. Disabling the feature for this song", new Object[0]);
        ofb ofb = qfb.g;
        ofb.getClass();
        ofb.p();
    }
}
