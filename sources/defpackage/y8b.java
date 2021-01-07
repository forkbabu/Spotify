package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: y8b  reason: default package */
public final /* synthetic */ class y8b implements g {
    public static final /* synthetic */ y8b a = new y8b();

    private /* synthetic */ y8b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to observe on product observer", new Object[0]);
    }
}
