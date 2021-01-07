package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: pp3  reason: default package */
public final /* synthetic */ class pp3 implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ pp3(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("rejectOptOutOffer failed for %s slot: %s", this.a, (Throwable) obj);
    }
}
