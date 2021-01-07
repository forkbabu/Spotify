package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ch6  reason: default package */
public final /* synthetic */ class ch6 implements g {
    public static final /* synthetic */ ch6 a = new ch6();

    private /* synthetic */ ch6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to observe preview player state for auto playback on end", new Object[0]);
    }
}
