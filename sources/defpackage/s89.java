package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import io.reactivex.functions.l;

/* renamed from: s89  reason: default package */
public final /* synthetic */ class s89 implements l {
    public static final /* synthetic */ s89 a = new s89();

    private /* synthetic */ s89() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Error on shuffle play a track from collection", new Object[0]);
        return s0.s(false);
    }
}
