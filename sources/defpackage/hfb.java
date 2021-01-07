package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: hfb  reason: default package */
public final /* synthetic */ class hfb implements g {
    public final /* synthetic */ qfb a;

    public /* synthetic */ hfb(qfb qfb) {
        this.a = qfb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        qfb qfb = this.a;
        Throwable th = (Throwable) obj;
        qfb.getClass();
        Logger.d("Error while fetching karaoke mask.", new Object[0]);
        ofb ofb = qfb.g;
        ofb.getClass();
        ofb.f();
    }
}
