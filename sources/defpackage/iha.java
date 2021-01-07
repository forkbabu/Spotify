package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.f;
import io.reactivex.s;
import io.reactivex.t;
import java.util.HashSet;
import java.util.Set;

/* renamed from: iha  reason: default package */
public class iha implements hha {
    static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("accept-redirect-uri");
    static final SpSharedPreferences.b<Object, Boolean> d = SpSharedPreferences.b.e("listening-history-tooltip-dismissed");
    private final SpSharedPreferences<Object> a;
    private final Set<f<Boolean>> b = new HashSet(1);

    public iha(SpSharedPreferences<Object> spSharedPreferences) {
        spSharedPreferences.getClass();
        this.a = spSharedPreferences;
    }

    @Override // defpackage.hha
    public void a(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(hm9.a, z);
        b2.i();
    }

    @Override // defpackage.hha
    public void b(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(hm9.c, z);
        b2.i();
    }

    @Override // defpackage.hha
    public boolean c() {
        return this.a.d(hm9.d, false);
    }

    @Override // defpackage.hha
    public void d() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(hm9.d, true);
        b2.i();
    }

    @Override // defpackage.hha
    public void e() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(d, true);
        b2.i();
    }

    @Override // defpackage.hha
    public boolean f() {
        return !this.a.d(d, false);
    }

    @Override // defpackage.hha
    public boolean g() {
        return this.a.d(hm9.a, false);
    }

    @Override // defpackage.hha
    public boolean h() {
        return this.a.d(c, true);
    }

    @Override // defpackage.hha
    public s<Boolean> i() {
        return s.y(new cha(this));
    }

    @Override // defpackage.hha
    public s<Boolean> j() {
        return this.a.p(hm9.c).j0(dha.a);
    }

    @Override // defpackage.hha
    public void k(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(hm9.b, z);
        b2.i();
        for (f<Boolean> fVar : this.b) {
            fVar.onNext(Boolean.valueOf(z));
        }
    }

    @Override // defpackage.hha
    public void l(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(c, z);
        b2.i();
    }

    public void m(t tVar) {
        this.b.add(tVar);
        tVar.onNext(Boolean.valueOf(this.a.d(hm9.b, false)));
        tVar.e(new eha(this, tVar));
    }

    public /* synthetic */ void n(t tVar) {
        this.b.remove(tVar);
    }
}
