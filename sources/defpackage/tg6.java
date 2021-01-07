package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: tg6  reason: default package */
public final /* synthetic */ class tg6 implements g {
    public static final /* synthetic */ tg6 a = new tg6();

    private /* synthetic */ tg6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.o((Throwable) obj, "ItemListInteractor failed fetch playback configuration snapshot.", new Object[0]);
    }
}
