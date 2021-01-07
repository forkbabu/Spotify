package defpackage;

import com.spotify.music.features.podcast.episode.datasource.z;
import com.spotify.music.features.podcast.episode.l0;
import com.spotify.music.features.podcast.episode.o0;
import io.reactivex.s;

/* renamed from: pb7  reason: default package */
public final class pb7 {
    private final wlf<l0> a;
    private final wlf<o0> b;

    public pb7(wlf<l0> wlf, wlf<o0> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public ob7 b(s<z> sVar) {
        l0 l0Var = this.a.get();
        a(l0Var, 1);
        o0 o0Var = this.b.get();
        a(o0Var, 2);
        a(sVar, 3);
        return new ob7(l0Var, o0Var, sVar);
    }
}
