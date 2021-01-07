package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: a9b  reason: default package */
public final /* synthetic */ class a9b implements g {
    public static final /* synthetic */ a9b a = new a9b();

    private /* synthetic */ a9b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to observe on product observer", new Object[0]);
    }
}
