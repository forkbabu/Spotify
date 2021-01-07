package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: l3b  reason: default package */
public class l3b implements a5b {
    private final g6b a;
    private final n3b b;
    private final y c;

    l3b(g6b g6b, n3b n3b, y yVar) {
        g6b.getClass();
        this.a = g6b;
        n3b.getClass();
        this.b = n3b;
        yVar.getClass();
        this.c = yVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public s<b91> a(s7b s7b, g gVar) {
        s7b s7b2 = s7b;
        return this.a.a(s7b2, gVar).J(10, TimeUnit.SECONDS, this.c).E(new s1b(s7b2)).A(this.b).P();
    }
}
