package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: sp3  reason: default package */
public final /* synthetic */ class sp3 implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ sp3(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        Logger.b("rejectOptOutOffer success for %s slot and advance to next track", this.a);
    }
}
