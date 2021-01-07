package defpackage;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.loader.content.b;
import defpackage.c6;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* access modifiers changed from: package-private */
/* renamed from: d6  reason: default package */
public class d6 extends c6 {
    private final n a;
    private final c b;

    /* renamed from: d6$a */
    public static class a<D> extends u<D> implements b.a<D> {
        private final int k;
        private final Bundle l;
        private final androidx.loader.content.b<D> m;
        private n n;
        private b<D> o;
        private androidx.loader.content.b<D> p;

        a(int i, Bundle bundle, androidx.loader.content.b<D> bVar, androidx.loader.content.b<D> bVar2) {
            this.k = i;
            this.l = bundle;
            this.m = bVar;
            this.p = bVar2;
            bVar.g(i, this);
        }

        @Override // androidx.loader.content.b.a
        public void a(androidx.loader.content.b<D> bVar, D d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                super.n(d);
                androidx.loader.content.b<D> bVar2 = this.p;
                if (bVar2 != null) {
                    bVar2.h();
                    this.p = null;
                    return;
                }
                return;
            }
            l(d);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void j() {
            this.m.i();
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void k() {
            this.m.j();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.v<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void m(v<? super D> vVar) {
            super.m(vVar);
            this.n = null;
            this.o = null;
        }

        @Override // androidx.lifecycle.u, androidx.lifecycle.LiveData
        public void n(D d) {
            super.n(d);
            androidx.loader.content.b<D> bVar = this.p;
            if (bVar != null) {
                bVar.h();
                this.p = null;
            }
        }

        /* access modifiers changed from: package-private */
        public androidx.loader.content.b<D> o(boolean z) {
            this.m.b();
            this.m.a();
            b<D> bVar = this.o;
            if (bVar != null) {
                super.m(bVar);
                this.n = null;
                this.o = null;
                if (z) {
                    bVar.d();
                }
            }
            this.m.k(this);
            if ((bVar == null || bVar.c()) && !z) {
                return this.m;
            }
            this.m.h();
            return this.p;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            this.m.c(je.x0(str, "  "), fileDescriptor, printWriter, strArr);
            if (this.o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.o);
                this.o.b(je.x0(str, "  "), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            androidx.loader.content.b<D> bVar = this.m;
            Object e = e();
            bVar.getClass();
            StringBuilder sb = new StringBuilder(64);
            e2.a(e, sb);
            sb.append("}");
            printWriter.println(sb.toString());
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        /* access modifiers changed from: package-private */
        public void q() {
            n nVar = this.n;
            b<D> bVar = this.o;
            if (nVar != null && bVar != null) {
                super.m(bVar);
                h(nVar, bVar);
            }
        }

        /* access modifiers changed from: package-private */
        public androidx.loader.content.b<D> r(n nVar, c6.a<D> aVar) {
            b<D> bVar = new b<>(this.m, aVar);
            h(nVar, bVar);
            b<D> bVar2 = this.o;
            if (bVar2 != null) {
                m(bVar2);
            }
            this.n = nVar;
            this.o = bVar;
            return this.m;
        }

        public String toString() {
            StringBuilder T0 = je.T0(64, "LoaderInfo{");
            T0.append(Integer.toHexString(System.identityHashCode(this)));
            T0.append(" #");
            T0.append(this.k);
            T0.append(" : ");
            e2.a(this.m, T0);
            T0.append("}}");
            return T0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d6$b */
    public static class b<D> implements v<D> {
        private final androidx.loader.content.b<D> a;
        private final c6.a<D> b;
        private boolean c = false;

        b(androidx.loader.content.b<D> bVar, c6.a<D> aVar) {
            this.a = bVar;
            this.b = aVar;
        }

        @Override // androidx.lifecycle.v
        public void a(D d) {
            this.b.a(this.a, d);
            this.c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.c) {
                this.b.c(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    /* renamed from: d6$c */
    static class c extends e0 {
        private static final g0.b e = new a();
        private u1<a> c = new u1<>(10);
        private boolean d = false;

        /* renamed from: d6$c$a */
        static class a implements g0.b {
            a() {
            }

            @Override // androidx.lifecycle.g0.b
            public <T extends e0> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c i(h0 h0Var) {
            return (c) new g0(h0Var, e).a(c.class);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.e0
        public void e() {
            int q = this.c.q();
            for (int i = 0; i < q; i++) {
                this.c.r(i).o(true);
            }
            this.c.c();
        }

        public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.c.q() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.c.q(); i++) {
                    a r = this.c.r(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.c.m(i));
                    printWriter.print(": ");
                    printWriter.println(r.toString());
                    r.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            this.d = false;
        }

        /* access modifiers changed from: package-private */
        public <D> a<D> j(int i) {
            return this.c.g(i, null);
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return this.d;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            int q = this.c.q();
            for (int i = 0; i < q; i++) {
                this.c.r(i).q();
            }
        }

        /* access modifiers changed from: package-private */
        public void m(int i, a aVar) {
            this.c.n(i, aVar);
        }

        /* access modifiers changed from: package-private */
        public void n(int i) {
            this.c.o(i);
        }

        /* access modifiers changed from: package-private */
        public void o() {
            this.d = true;
        }
    }

    d6(n nVar, h0 h0Var) {
        this.a = nVar;
        this.b = c.i(h0Var);
    }

    @Override // defpackage.c6
    public void a(int i) {
        if (this.b.k()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a j = this.b.j(i);
            if (j != null) {
                j.o(true);
                this.b.n(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    @Override // defpackage.c6
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.g(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.c6
    public <D> androidx.loader.content.b<D> d(int i, Bundle bundle, c6.a<D> aVar) {
        if (this.b.k()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a<D> j = this.b.j(i);
            if (j != null) {
                return j.r(this.a, aVar);
            }
            try {
                this.b.o();
                androidx.loader.content.b<D> b2 = aVar.b(i, null);
                if (b2 != null) {
                    if (b2.getClass().isMemberClass()) {
                        if (!Modifier.isStatic(b2.getClass().getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b2);
                        }
                    }
                    a aVar2 = new a(i, null, b2, null);
                    this.b.m(i, aVar2);
                    this.b.h();
                    return aVar2.r(this.a, aVar);
                }
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            } catch (Throwable th) {
                this.b.h();
                throw th;
            }
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    @Override // defpackage.c6
    public void e() {
        this.b.l();
    }

    public String toString() {
        StringBuilder T0 = je.T0(128, "LoaderManager{");
        T0.append(Integer.toHexString(System.identityHashCode(this)));
        T0.append(" in ");
        e2.a(this.a, T0);
        T0.append("}}");
        return T0.toString();
    }
}
