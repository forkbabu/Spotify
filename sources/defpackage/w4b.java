package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: w4b  reason: default package */
public class w4b implements a5b {
    private final f7b a;
    private final g3b b;
    private final y c;
    private final g6b d;

    public w4b(f7b f7b, g3b g3b, y yVar, g6b g6b) {
        f7b.getClass();
        this.a = f7b;
        g3b.getClass();
        this.b = g3b;
        yVar.getClass();
        this.c = yVar;
        this.d = g6b;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public s<b91> a(s7b s7b, g gVar) {
        z<d7b<b91>> zVar;
        s7b s7b2 = s7b;
        g gVar2 = gVar;
        gVar2.getClass();
        if ((gVar2 instanceof g.b) || (gVar2 instanceof g.a)) {
            zVar = z.z(d7b.a());
        } else {
            zVar = this.d.a(s7b2, gVar2);
        }
        return s.d1(zVar.P().r0(new v2b(s7b2)), this.a.a(s7b2).P().T0(3, TimeUnit.SECONDS, this.c).r0(new u2b(s7b2)), this.b);
    }
}
