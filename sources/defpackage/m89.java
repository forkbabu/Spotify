package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import io.reactivex.functions.l;

/* renamed from: m89  reason: default package */
public final /* synthetic */ class m89 implements l {
    public static final /* synthetic */ m89 a = new m89();

    private /* synthetic */ m89() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Error on play a track from collection", new Object[0]);
        return s0.s(false);
    }
}
