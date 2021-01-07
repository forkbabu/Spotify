package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: wkd  reason: default package */
public final /* synthetic */ class wkd implements g {
    public static final /* synthetic */ wkd a = new wkd();

    private /* synthetic */ wkd() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to observe Superbird connection.", new Object[0]);
    }
}
