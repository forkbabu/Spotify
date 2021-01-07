package defpackage;

import com.spotify.music.connection.g;
import com.spotify.music.connection.l;
import com.spotify.pageloader.l0;
import com.spotify.pageloader.m0;
import io.reactivex.s;

/* renamed from: vh5  reason: default package */
public class vh5 {
    private final l a;
    private final ol5 b;
    private final hl5 c;
    private final k1e<b91> d;

    public vh5(l lVar, ol5 ol5, hl5 hl5, k1e<b91> k1e) {
        this.a = lVar;
        this.b = ol5;
        this.c = hl5;
        this.d = k1e;
    }

    public static s a(vh5 vh5, Throwable th) {
        vh5.getClass();
        if (m0.b(th) instanceof l0.d) {
            return vh5.b.c();
        }
        return s.P(th);
    }

    public /* synthetic */ s b(g.c cVar) {
        return this.c.a();
    }

    public /* synthetic */ s c(g.b bVar) {
        return this.b.c();
    }

    public /* synthetic */ s d(g.a aVar) {
        return this.c.b();
    }

    public s<b91> e() {
        return this.a.a().J0(new mh5(this)).q0(new jh5(this)).q(this.d);
    }
}
