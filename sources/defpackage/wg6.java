package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: wg6  reason: default package */
public final /* synthetic */ class wg6 implements g {
    public static final /* synthetic */ wg6 a = new wg6();

    private /* synthetic */ wg6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.o((Throwable) obj, "ItemListInteractor::onPlayPauseClicked failed to toggle play.", new Object[0]);
    }
}
