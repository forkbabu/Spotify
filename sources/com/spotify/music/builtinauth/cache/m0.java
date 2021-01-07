package com.spotify.music.builtinauth.cache;

import androidx.room.j;
import androidx.room.m;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.List;

public class m0 implements l0 {
    private final AuthCacheRoomDatabase a;
    private final j0 b;
    private final y c;

    public m0(AuthCacheRoomDatabase authCacheRoomDatabase, j0 j0Var, y yVar) {
        this.b = j0Var;
        this.a = authCacheRoomDatabase;
        this.c = yVar;
    }

    @Override // com.spotify.music.builtinauth.cache.l0
    public z<a0> a(a0 a0Var) {
        c0 t = this.a.t();
        String c2 = a0Var.c();
        String f = a0Var.f();
        String e = a0Var.e();
        String b2 = a0Var.b();
        d0 d0Var = (d0) t;
        d0Var.getClass();
        j d = j.d("SELECT * FROM cachedClientInfo WHERE client_id = ? AND redirect_uri = ? AND package_name = ? AND app_signature = ?", 4);
        if (c2 == null) {
            d.O1(1);
        } else {
            d.a1(1, c2);
        }
        if (f == null) {
            d.O1(2);
        } else {
            d.a1(2, f);
        }
        if (e == null) {
            d.O1(3);
        } else {
            d.a1(3, e);
        }
        if (b2 == null) {
            d.O1(4);
        } else {
            d.a1(4, b2);
        }
        z b3 = m.b(new h0(d0Var, d));
        j0 j0Var = this.b;
        j0Var.getClass();
        return b3.A(new y(j0Var)).D(c.a).m(f.a).H(this.c);
    }

    @Override // com.spotify.music.builtinauth.cache.l0
    public a b(a0 a0Var) {
        b0 a2 = b0.a(a0Var);
        d0 d0Var = (d0) this.a.t();
        d0Var.getClass();
        return a.v(new f0(d0Var, a2)).D(h.a).G(this.c);
    }

    @Override // com.spotify.music.builtinauth.cache.l0
    public z<List<a0>> c() {
        d0 d0Var = (d0) this.a.t();
        d0Var.getClass();
        s x = m.b(new i0(d0Var, j.d("SELECT * FROM cachedClientInfo", 0))).x(a.a);
        j0 j0Var = this.b;
        j0Var.getClass();
        return x.j0(new y(j0Var)).Z0().D(i.a).m(b.a).H(this.c);
    }

    @Override // com.spotify.music.builtinauth.cache.l0
    public z<Integer> clear() {
        d0 d0Var = (d0) this.a.t();
        d0Var.getClass();
        return z.y(new g0(d0Var)).C(z.z(-1)).m(e.a).H(this.c);
    }

    @Override // com.spotify.music.builtinauth.cache.l0
    public a d(a0 a0Var) {
        c0 t = this.a.t();
        b0 a2 = b0.a(a0Var);
        d0 d0Var = (d0) t;
        d0Var.getClass();
        return a.v(new e0(d0Var, a2)).D(d.a).q(g.a).G(this.c);
    }
}
