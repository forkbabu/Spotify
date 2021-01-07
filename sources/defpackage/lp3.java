package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: lp3  reason: default package */
public final /* synthetic */ class lp3 implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ lp3(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("acceptOptInOffer intent failed for %s slot: %s", this.a, (Throwable) obj);
    }
}
