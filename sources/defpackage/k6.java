package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import defpackage.n6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: k6  reason: default package */
public abstract class k6 {
    private final Context a;
    private final d b;
    private final c c = new c();
    private a f;
    private j6 n;
    private boolean o;
    private l6 p;
    private boolean q;

    /* renamed from: k6$a */
    public static abstract class a {
    }

    /* renamed from: k6$b */
    public static abstract class b extends e {
        private final Object a = new Object();
        Executor b;
        d c;
        Collection<c> d;

        /* access modifiers changed from: package-private */
        /* renamed from: k6$b$a */
        public class a implements Runnable {
            final /* synthetic */ Collection a;

            a(Collection collection) {
                this.a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                d dVar = bVar.c;
                Collection<c> collection = this.a;
                n6.d dVar2 = n6.d.this;
                if (bVar == dVar2.p) {
                    dVar2.o.F(collection);
                }
            }
        }

        /* renamed from: k6$b$b  reason: collision with other inner class name */
        class RunnableC0632b implements Runnable {
            final /* synthetic */ Collection a;

            RunnableC0632b(Collection collection) {
                this.a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                d dVar = bVar.c;
                Collection<c> collection = this.a;
                n6.d dVar2 = n6.d.this;
                if (bVar == dVar2.p) {
                    dVar2.o.F(collection);
                }
            }
        }

        /* renamed from: k6$b$c */
        public static final class c {
            final i6 a;
            final int b;
            final boolean c;
            final boolean d;
            final boolean e;

            c(i6 i6Var, int i, boolean z, boolean z2, boolean z3) {
                this.a = i6Var;
                this.b = i;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k6$b$d */
        public interface d {
        }

        public String j() {
            return null;
        }

        public String k() {
            return null;
        }

        public final void l(Collection<c> collection) {
            synchronized (this.a) {
                Executor executor = this.b;
                if (executor != null) {
                    executor.execute(new RunnableC0632b(collection));
                } else {
                    this.d = new ArrayList(collection);
                }
            }
        }

        public abstract void m(String str);

        public abstract void n(String str);

        /* access modifiers changed from: package-private */
        public void o(Executor executor, d dVar) {
            synchronized (this.a) {
                if (executor == null) {
                    throw new NullPointerException("Executor shouldn't be null");
                } else if (dVar != null) {
                    this.b = executor;
                    this.c = dVar;
                    Collection<c> collection = this.d;
                    if (collection != null && !collection.isEmpty()) {
                        Collection<c> collection2 = this.d;
                        this.d = null;
                        this.b.execute(new a(collection2));
                    }
                } else {
                    throw new NullPointerException("Listener shouldn't be null");
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k6$c */
    public final class c extends Handler {
        c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                k6.this.l();
            } else if (i == 2) {
                k6.this.m();
            }
        }
    }

    /* renamed from: k6$d */
    public static final class d {
        private final ComponentName a;

        d(ComponentName componentName) {
            if (componentName != null) {
                this.a = componentName;
                return;
            }
            throw new IllegalArgumentException("componentName must not be null");
        }

        public ComponentName a() {
            return this.a;
        }

        public String b() {
            return this.a.getPackageName();
        }

        public String toString() {
            StringBuilder V0 = je.V0("ProviderMetadata{ componentName=");
            V0.append(this.a.flattenToShortString());
            V0.append(" }");
            return V0.toString();
        }
    }

    /* renamed from: k6$e */
    public static abstract class e {
        public void d() {
        }

        public void e() {
        }

        public void f(int i) {
        }

        public void g() {
        }

        public void h(int i) {
            g();
        }

        public void i(int i) {
        }
    }

    k6(Context context, d dVar) {
        if (context != null) {
            this.a = context;
            this.b = dVar;
            return;
        }
        throw new IllegalArgumentException("context must not be null");
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.q = false;
        a aVar = this.f;
        if (aVar != null) {
            n6.d.this.z(this, this.p);
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        this.o = false;
        v(this.n);
    }

    public final Context n() {
        return this.a;
    }

    public final l6 o() {
        return this.p;
    }

    public final j6 p() {
        return this.n;
    }

    public final Handler q() {
        return this.c;
    }

    public final d r() {
        return this.b;
    }

    public b s(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public e t(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public e u(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return t(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public void v(j6 j6Var) {
    }

    public final void w(a aVar) {
        n6.c();
        this.f = aVar;
    }

    public final void x(l6 l6Var) {
        n6.c();
        if (this.p != l6Var) {
            this.p = l6Var;
            if (!this.q) {
                this.q = true;
                this.c.sendEmptyMessage(1);
            }
        }
    }

    public final void y(j6 j6Var) {
        n6.c();
        if (!e2.g(this.n, j6Var)) {
            this.n = j6Var;
            if (!this.o) {
                this.o = true;
                this.c.sendEmptyMessage(2);
            }
        }
    }
}
