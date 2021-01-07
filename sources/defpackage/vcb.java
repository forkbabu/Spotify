package defpackage;

import com.spotify.music.lyrics.core.experience.model.LyricsWrapper;
import com.spotify.music.lyrics.core.experience.model.b;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: vcb  reason: default package */
public final class vcb<T, R> implements l<LyricsWrapper, b.C0304b> {
    public static final vcb a = new vcb();

    vcb() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b.C0304b apply(LyricsWrapper lyricsWrapper) {
        LyricsWrapper lyricsWrapper2 = lyricsWrapper;
        h.e(lyricsWrapper2, "lyricsWrapper");
        return new b.C0304b(lyricsWrapper2);
    }
}
