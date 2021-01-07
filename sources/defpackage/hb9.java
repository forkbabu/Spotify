package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.datasource.w3;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.b;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: hb9  reason: default package */
public class hb9 {
    private final wlf<jb9> a;
    private final wlf<b> b;
    private final wlf<MusicPagesFiltering> c;
    private final wlf<lb9> d;
    private final wlf<y> e;
    private final wlf<lf9> f;

    public hb9(wlf<jb9> wlf, wlf<b> wlf2, wlf<MusicPagesFiltering> wlf3, wlf<lb9> wlf4, wlf<y> wlf5, wlf<lf9> wlf6) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public gb9 b(w3 w3Var, String str, s<String> sVar) {
        jb9 jb9 = this.a.get();
        a(jb9, 1);
        jb9 jb92 = jb9;
        b bVar = this.b.get();
        a(bVar, 2);
        b bVar2 = bVar;
        MusicPagesFiltering musicPagesFiltering = this.c.get();
        a(musicPagesFiltering, 3);
        MusicPagesFiltering musicPagesFiltering2 = musicPagesFiltering;
        lb9 lb9 = this.d.get();
        a(lb9, 4);
        lb9 lb92 = lb9;
        y yVar = this.e.get();
        a(yVar, 5);
        y yVar2 = yVar;
        lf9 lf9 = this.f.get();
        a(lf9, 6);
        a(w3Var, 7);
        a(str, 8);
        a(sVar, 9);
        return new gb9(jb92, bVar2, musicPagesFiltering2, lb92, yVar2, lf9, w3Var, str, sVar);
    }
}
