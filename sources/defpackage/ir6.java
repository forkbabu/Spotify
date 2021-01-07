package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: ir6  reason: default package */
public final /* synthetic */ class ir6 implements g {
    public static final /* synthetic */ ir6 a = new ir6();

    private /* synthetic */ ir6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Playlist: Failed resyncing. its OK!", new Object[0]);
    }
}
