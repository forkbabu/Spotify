package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ah6  reason: default package */
public final /* synthetic */ class ah6 implements g {
    public static final /* synthetic */ ah6 a = new ah6();

    private /* synthetic */ ah6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to observe preview player state.", new Object[0]);
    }
}
