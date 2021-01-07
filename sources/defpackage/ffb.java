package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ffb  reason: default package */
public final /* synthetic */ class ffb implements g {
    public final /* synthetic */ qfb a;

    public /* synthetic */ ffb(qfb qfb) {
        this.a = qfb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        qfb qfb = this.a;
        Throwable th = (Throwable) obj;
        qfb.getClass();
        Logger.d("Error while updating vocal removal state.", new Object[0]);
        ofb ofb = qfb.g;
        ofb.getClass();
        ofb.f();
    }
}
