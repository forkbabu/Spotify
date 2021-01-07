package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.d0;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

/* renamed from: q4b  reason: default package */
public class q4b {
    private final s<d5b> a;
    private final d3b b;
    private final String c;
    private final pz0 d;
    private final String e;
    private final qz0 f;

    q4b(d3b d3b, s<d5b> sVar, String str, qz0 qz0, pz0 pz0, String str2) {
        this.a = sVar;
        this.b = d3b;
        this.c = str;
        this.d = pz0;
        this.e = str2;
        y6b a2 = y6b.a(20);
        this.f = qz0.b(str).d(a2.e(), a2.d());
    }

    public static z a(q4b q4b, String str) {
        return q4b.f.c(str).build().A(new p2b(q4b));
    }

    public d0 b(z zVar) {
        d3b d3b = this.b;
        g c2 = g.c();
        e3b e3b = (e3b) d3b;
        e3b.getClass();
        return zVar.s(new k1b(e3b, c2));
    }

    public /* synthetic */ s7b c(Map map) {
        return new t7b(this.c, map, this.d, this.e);
    }

    public z<b91> d() {
        return this.a.j0(m1b.a).j0(new q2b(this)).a0(new r2b(this)).T();
    }
}
