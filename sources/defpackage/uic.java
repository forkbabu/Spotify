package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: uic  reason: default package */
public final /* synthetic */ class uic implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ uic(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("Failed to fetch episode context: %s", this.a), new Object[0]);
    }
}
