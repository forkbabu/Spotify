package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: fl6  reason: default package */
public final /* synthetic */ class fl6 implements g {
    public static final /* synthetic */ fl6 a = new fl6();

    private /* synthetic */ fl6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "PlaylistHeaderPresenter: Failed to play.", new Object[0]);
    }
}
