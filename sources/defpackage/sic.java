package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: sic  reason: default package */
public final /* synthetic */ class sic implements g {
    public static final /* synthetic */ sic a = new sic();

    private /* synthetic */ sic() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to start playback for episode using playlist endpoint player.", new Object[0]);
    }
}
