package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import defpackage.i17;
import io.reactivex.disposables.c;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.v;
import io.reactivex.y;
import java.util.Collection;

/* access modifiers changed from: package-private */
/* renamed from: o17  reason: default package */
public class o17 {
    private final q a = new q();
    private final q17 b;
    private final String c;
    private final y d;
    private final CompletableSubject e = CompletableSubject.R();
    private final io.reactivex.subjects.a<h76> f = io.reactivex.subjects.a.h1();
    private final io.reactivex.subjects.a<a> g;
    private final p h;
    private s17 i;

    /* renamed from: o17$a */
    public static abstract class a {

        /* renamed from: o17$a$a  reason: collision with other inner class name */
        public interface AbstractC0652a {
        }

        public static AbstractC0652a a() {
            i17.b bVar = new i17.b();
            bVar.d(HubsImmutableViewModel.EMPTY);
            i17.b bVar2 = bVar;
            bVar2.e(false);
            i17.b bVar3 = bVar2;
            bVar3.c(false);
            i17.b bVar4 = bVar3;
            bVar4.b(false);
            return bVar4;
        }

        public abstract boolean b();

        public abstract boolean c();

        public abstract HubsImmutableViewModel d();

        public abstract boolean e();

        public abstract AbstractC0652a f();
    }

    public o17(q17 q17, String str, y yVar) {
        i17.b bVar = (i17.b) a.a();
        bVar.e(true);
        this.g = io.reactivex.subjects.a.i1(bVar.a());
        this.h = new p();
        this.b = q17;
        this.c = str;
        this.d = yVar;
    }

    public static void b(o17 o17, a aVar) {
        o17.getClass();
        if (aVar.c()) {
            ((j17) o17.i).E();
        } else if (aVar.e()) {
        } else {
            if (aVar.d().body().isEmpty() || aVar.b()) {
                ((j17) o17.i).C();
                return;
            }
            ((j17) o17.i).D(ImmutableList.copyOf((Collection) aVar.d().body()));
        }
    }

    public void a(s17 s17) {
        this.i = s17;
        if (s17 != null) {
            this.h.b(this.g.subscribe(new d17(this)));
        } else {
            this.h.b(c.a());
        }
    }

    public /* synthetic */ v c(h76 h76) {
        boolean z = h76.f().b() != null;
        if (h76.m() || !this.g.j1().e()) {
            i17.b bVar = (i17.b) this.g.j1().f();
            bVar.b(z);
            bVar.e(false);
            bVar.c(false);
            return s.i0(bVar.a());
        }
        s<R> j0 = this.b.a(this.c).r0(a17.a).j0(new e17(z));
        i17.b bVar2 = (i17.b) a.a();
        bVar2.b(z);
        bVar2.c(true);
        bVar2.e(true);
        return j0.E0(s.i0(bVar2.a()));
    }

    public void d(Bundle bundle) {
        HubsImmutableViewModel hubsImmutableViewModel;
        if (bundle != null && (hubsImmutableViewModel = (HubsImmutableViewModel) bundle.getParcelable(o17.class.getName())) != null) {
            io.reactivex.subjects.a<a> aVar = this.g;
            i17.b bVar = (i17.b) a.a();
            bVar.c(false);
            i17.b bVar2 = bVar;
            bVar2.e(false);
            i17.b bVar3 = bVar2;
            bVar3.d(hubsImmutableViewModel);
            aVar.onNext(bVar3.a());
        }
    }

    public void e(Bundle bundle) {
        bundle.putParcelable(o17.class.getName(), this.g.j1().d());
    }

    public void f(int i2) {
        if (i2 <= 5) {
            this.e.onComplete();
        }
    }

    public void g(h76 h76) {
        this.f.onNext(h76);
    }

    public void h() {
        this.a.c();
        q qVar = this.a;
        s o0 = this.e.g(this.f.F(c17.a).J0(new z07(this))).o0(this.d);
        io.reactivex.subjects.a<a> aVar = this.g;
        aVar.getClass();
        qVar.a(o0.subscribe(new g17(aVar), b17.a));
    }

    public void i() {
        this.a.c();
    }
}
