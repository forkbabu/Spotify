package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: qi3  reason: default package */
public final /* synthetic */ class qi3 implements g {
    public static final /* synthetic */ qi3 a = new qi3();

    private /* synthetic */ qi3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to load list of playlists.", new Object[0]);
    }
}
