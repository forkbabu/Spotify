package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jb  reason: default package */
public abstract class jb<K, A> {
    final List<b> a = new ArrayList(1);
    private boolean b = false;
    private final d<K> c;
    protected float d = 0.0f;
    protected he<A> e;
    private A f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    /* renamed from: jb$b */
    public interface b {
        void a();
    }

    /* renamed from: jb$c */
    private static final class c<T> implements d<T> {
        c(a aVar) {
        }

        @Override // defpackage.jb.d
        public boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // defpackage.jb.d
        public fe<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // defpackage.jb.d
        public boolean c(float f) {
            return false;
        }

        @Override // defpackage.jb.d
        public float d() {
            return 0.0f;
        }

        @Override // defpackage.jb.d
        public float e() {
            return 1.0f;
        }

        @Override // defpackage.jb.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: jb$d */
    public interface d<T> {
        boolean a(float f);

        fe<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    /* renamed from: jb$e */
    private static final class e<T> implements d<T> {
        private final List<? extends fe<T>> a;
        private fe<T> b;
        private fe<T> c = null;
        private float d = -1.0f;

        e(List<? extends fe<T>> list) {
            this.a = list;
            this.b = f(0.0f);
        }

        private fe<T> f(float f) {
            List<? extends fe<T>> list = this.a;
            fe<T> feVar = (fe) list.get(list.size() - 1);
            if (f >= feVar.e()) {
                return feVar;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                fe<T> feVar2 = (fe) this.a.get(size);
                if (this.b != feVar2 && feVar2.a(f)) {
                    return feVar2;
                }
            }
            return (fe) this.a.get(0);
        }

        @Override // defpackage.jb.d
        public boolean a(float f) {
            fe<T> feVar = this.c;
            fe<T> feVar2 = this.b;
            if (feVar == feVar2 && this.d == f) {
                return true;
            }
            this.c = feVar2;
            this.d = f;
            return false;
        }

        @Override // defpackage.jb.d
        public fe<T> b() {
            return this.b;
        }

        @Override // defpackage.jb.d
        public boolean c(float f) {
            if (this.b.a(f)) {
                return !this.b.h();
            }
            this.b = f(f);
            return true;
        }

        @Override // defpackage.jb.d
        public float d() {
            return ((fe) this.a.get(0)).e();
        }

        @Override // defpackage.jb.d
        public float e() {
            List<? extends fe<T>> list = this.a;
            return ((fe) list.get(list.size() - 1)).b();
        }

        @Override // defpackage.jb.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: jb$f */
    private static final class f<T> implements d<T> {
        private final fe<T> a;
        private float b = -1.0f;

        f(List<? extends fe<T>> list) {
            this.a = (fe) list.get(0);
        }

        @Override // defpackage.jb.d
        public boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // defpackage.jb.d
        public fe<T> b() {
            return this.a;
        }

        @Override // defpackage.jb.d
        public boolean c(float f) {
            return !this.a.h();
        }

        @Override // defpackage.jb.d
        public float d() {
            return this.a.e();
        }

        @Override // defpackage.jb.d
        public float e() {
            return this.a.b();
        }

        @Override // defpackage.jb.d
        public boolean isEmpty() {
            return false;
        }
    }

    jb(List<? extends fe<K>> list) {
        d<K> dVar;
        d<K> dVar2;
        if (list.isEmpty()) {
            dVar = new c<>(null);
        } else {
            if (list.size() == 1) {
                dVar2 = new f<>(list);
            } else {
                dVar2 = new e<>(list);
            }
            dVar = dVar2;
        }
        this.c = dVar;
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    /* access modifiers changed from: protected */
    public fe<K> b() {
        fe<K> b2 = this.c.b();
        com.airbnb.lottie.c.a("BaseKeyframeAnimation#getCurrentKeyframe");
        return b2;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }

    /* access modifiers changed from: protected */
    public float d() {
        fe<K> b2 = b();
        if (b2.h()) {
            return 0.0f;
        }
        return b2.d.getInterpolation(e());
    }

    /* access modifiers changed from: package-private */
    public float e() {
        if (this.b) {
            return 0.0f;
        }
        fe<K> b2 = b();
        if (b2.h()) {
            return 0.0f;
        }
        return (this.d - b2.e()) / (b2.b() - b2.e());
    }

    public float f() {
        return this.d;
    }

    public A g() {
        float d2 = d();
        if (this.e == null && this.c.a(d2)) {
            return this.f;
        }
        A h2 = h(b(), d2);
        this.f = h2;
        return h2;
    }

    /* access modifiers changed from: package-private */
    public abstract A h(fe<K> feVar, float f2);

    public void i() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    public void j() {
        this.b = true;
    }

    public void k(float f2) {
        if (!this.c.isEmpty()) {
            if (this.g == -1.0f) {
                this.g = this.c.d();
            }
            float f3 = this.g;
            if (f2 < f3) {
                if (f3 == -1.0f) {
                    this.g = this.c.d();
                }
                f2 = this.g;
            } else if (f2 > c()) {
                f2 = c();
            }
            if (f2 != this.d) {
                this.d = f2;
                if (this.c.c(f2)) {
                    i();
                }
            }
        }
    }

    public void l(he<A> heVar) {
        he<A> heVar2 = this.e;
        this.e = heVar;
    }
}
