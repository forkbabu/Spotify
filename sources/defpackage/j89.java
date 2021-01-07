package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import io.reactivex.functions.l;

/* renamed from: j89  reason: default package */
public final /* synthetic */ class j89 implements l {
    public static final /* synthetic */ j89 a = new j89();

    private /* synthetic */ j89() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Error on download all tracks from collection", new Object[0]);
        return s0.r(false);
    }
}
