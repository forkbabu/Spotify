package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.podcast.episode.inspector.tracklist.model.d;
import io.reactivex.s;

/* renamed from: t87  reason: default package */
public class t87 implements s87 {
    private final b87 a;
    private final n97 b;
    private final a97 c;

    public t87(b87 b87, a97 a97, n97 n97) {
        this.a = b87;
        this.c = a97;
        this.b = n97;
    }

    @Override // defpackage.s87
    public s<k87> a(l0 l0Var) {
        s<d> P = this.a.a(l0Var).P();
        s<m97> c2 = this.b.c();
        a97 a97 = this.c;
        a97.getClass();
        return s.n(P, c2, new l87(a97)).E();
    }
}
