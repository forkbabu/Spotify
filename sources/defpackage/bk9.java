package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.navigation.d;
import com.spotify.remoteconfig.d7;
import io.reactivex.disposables.b;
import io.reactivex.schedulers.a;
import io.reactivex.y;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: bk9  reason: default package */
public class bk9 {
    private final d7 a;
    private final rj9 b;
    private final zj9 c;
    private final xj9 d;
    private d e;
    private b f;
    private b g;

    public bk9(d7 d7Var, rj9 rj9, zj9 zj9, xj9 xj9) {
        this.a = d7Var;
        this.b = rj9;
        this.c = zj9;
        this.d = xj9;
    }

    public void a() {
        if (this.a.a()) {
            this.c.f(true);
            this.e.e(false);
        }
    }

    public /* synthetic */ void b(Optional optional) {
        this.e.e(this.d.a(optional));
    }

    public /* synthetic */ void c(v vVar) {
        if (!vVar.f() || vVar.a() == null) {
            Logger.b(vVar.g(), new Object[0]);
        } else {
            this.c.e((tj9) vVar.a());
        }
    }

    public void d() {
        if (this.a.a() && this.d.a(this.c.a())) {
            this.e.e(true);
        }
    }

    public void e() {
        if (this.a.a()) {
            b bVar = this.f;
            if (bVar != null && !bVar.d()) {
                this.f.dispose();
            }
            b bVar2 = this.g;
            if (bVar2 != null && !bVar2.d()) {
                this.g.dispose();
            }
            this.e = null;
        }
    }

    public void f(d dVar) {
        this.e = dVar;
    }

    public void g() {
        if (this.a.a() && this.e != null) {
            b bVar = this.g;
            if (bVar != null && !bVar.d()) {
                this.g.dispose();
            }
            this.g = this.c.d().subscribe(new oj9(this), new nj9(this));
            z<v<tj9>> a2 = this.b.a();
            y c2 = a.c();
            y a3 = a.a();
            b bVar2 = this.f;
            if (bVar2 != null && !bVar2.d()) {
                this.f.dispose();
            }
            this.f = a2.H(c2).B(a3).subscribe(new pj9(this), new nj9(this));
        }
    }
}
