package com.spotify.http;

import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.http.wg.a;
import com.spotify.http.wg.b;
import com.spotify.http.wg.d;
import java.util.Set;
import okhttp3.v;
import okhttp3.y;

public class w {
    private final y a;
    private final y b;
    private final y c;
    private final y d;

    public w(wlf<WebgateTokenProvider> wlf, cqe cqe, q qVar, q qVar2, b bVar, t tVar, Set<v> set, Set<v> set2) {
        z42.a("Not called on main looper");
        s sVar = new s(tVar, cqe);
        d dVar = new d(bVar, cqe);
        a aVar = new a(bVar, wlf);
        mn0 mn0 = new mn0(qVar);
        y yVar = new y();
        y.b q = yVar.q();
        q.j().addAll(set2);
        this.a = q.c();
        y.b q2 = yVar.q();
        qVar.d(q2);
        q2.j().addAll(set);
        y.b b2 = sm0.a().b(q2);
        b2.h(sVar);
        y c2 = b2.c();
        this.d = c2;
        y.b q3 = c2.q();
        q3.a(dVar);
        q3.a(aVar);
        q3.a(mn0);
        q3.j().addAll(set2);
        this.b = q3.c();
        y.b q4 = c2.q();
        qVar2.d(b2);
        this.c = q4.c();
    }

    public y a() {
        return this.b;
    }

    public y b() {
        return this.c;
    }

    public y c() {
        return this.a;
    }
}
