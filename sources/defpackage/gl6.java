package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: gl6  reason: default package */
public final /* synthetic */ class gl6 implements g {
    public static final /* synthetic */ gl6 a = new gl6();

    private /* synthetic */ gl6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "PlaylistHeaderPresenter: Failed to play.", new Object[0]);
    }
}
