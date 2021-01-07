package defpackage;

import android.database.Observable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a61;
import java.util.Map;

/* renamed from: q61  reason: default package */
public class q61 {
    private final s61 a;
    private final d b;
    private final r61 c;
    private final c d = new c(null);
    private final a61 e = a61.a.b(new a());
    private w61<?> f;
    private s81 g;
    private final x51<s81, s81> h = new b();

    /* renamed from: q61$a */
    class a implements a61 {
        a() {
        }

        @Override // defpackage.a61
        public s81 a(s81 s81) {
            return q61.this.c.b(s81).b();
        }
    }

    /* renamed from: q61$b */
    class b extends x51<s81, s81> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.x51
        public s81 a() {
            if (q61.this.g != null) {
                return q61.this.e.a(q61.this.g);
            }
            return null;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.x51
        public s81 b() {
            return q61.this.g;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q61$c */
    public static final class c extends Observable<e> {
        c(a aVar) {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((e) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    /* renamed from: q61$d */
    private final class d extends k61 {
        d(r61 r61) {
            super(r61);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.k61
        public void e(Parcelable parcelable, Map<String, Parcelable> map) {
            if (q61.this.g != null && q61.this.g.id() != null) {
                map.put(q61.this.g.id(), parcelable);
            }
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.k61
        public Parcelable g(Map<String, Parcelable> map) {
            if (q61.this.g == null || q61.this.g.id() == null) {
                return null;
            }
            return map.get(q61.this.g.id());
        }
    }

    /* renamed from: q61$e */
    public interface e {
        void a();
    }

    public q61(w51 w51) {
        r61 r61 = new r61(w51);
        this.c = r61;
        d dVar = new d(r61);
        this.b = dVar;
        this.a = new s61(w51, r61, dVar);
    }

    public x51<s81, s81> d() {
        return this.h;
    }

    public View e(ViewGroup viewGroup) {
        s81 s81 = this.g;
        if (s81 == null) {
            return null;
        }
        w61<?> a2 = this.a.a(this.f, s81, viewGroup, -1);
        this.f = a2;
        return a2.e();
    }

    public void f() {
        this.a.b().a();
        this.d.a();
    }

    public void g(Parcelable parcelable) {
        this.b.d(parcelable);
    }

    public Parcelable h() {
        return this.b.f();
    }

    public void i(e eVar) {
        this.d.registerObserver(eVar);
    }

    public void j(s81 s81) {
        if (s81 == null) {
            this.c.a();
            this.b.c();
            w61<?> w61 = this.f;
            if (w61 != null) {
                this.a.c(w61);
                this.f = null;
            }
        }
        this.g = s81;
    }
}
