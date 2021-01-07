package com.spotify.pageloader;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.n;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.pageloader.l0;

public class PageLoaderView<T> extends ConstraintLayout {
    public static final /* synthetic */ int A = 0;
    private final d<T> a;
    private final w0 b;
    private final u0 c;
    private final c f;
    private final f n;
    private l0<T> o;
    private s0 p;
    private boolean q;
    private boolean r;
    private View s;
    private e t;
    private final ViewGroup u;
    private final b<a1> v;
    private Runnable w;
    private final Runnable x;
    private final Runnable y;
    private final androidx.lifecycle.e z = new androidx.lifecycle.e() {
        /* class com.spotify.pageloader.PageLoaderView.AnonymousClass1 */

        @Override // androidx.lifecycle.g
        public void V(n nVar) {
            if (PageLoaderView.this.p != null) {
                PageLoaderView.this.J();
            }
        }

        @Override // androidx.lifecycle.g
        public void a0(n nVar) {
            if (PageLoaderView.this.p != null) {
                PageLoaderView.E(PageLoaderView.this);
            }
        }

        @Override // androidx.lifecycle.g
        public /* synthetic */ void d0(n nVar) {
            androidx.lifecycle.d.f(this, nVar);
        }

        @Override // androidx.lifecycle.g
        public /* synthetic */ void h0(n nVar) {
            androidx.lifecycle.d.b(this, nVar);
        }

        @Override // androidx.lifecycle.g
        public /* synthetic */ void n(n nVar) {
            androidx.lifecycle.d.a(this, nVar);
        }

        @Override // androidx.lifecycle.g
        public /* synthetic */ void o0(n nVar) {
            androidx.lifecycle.d.e(this, nVar);
        }
    };

    public static class a<T> {
        private final d<T> a = new d<>(null);
        private c b;
        private f c;
        private Runnable d;
        private Runnable e;

        public PageLoaderView<T> a(Context context) {
            return new PageLoaderView<>(context, this.a, this.b, this.c, this.d, this.e, null);
        }

        public a<T> b(sg0<T, s0> sg0) {
            this.a.d = sg0;
            return this;
        }

        public a<T> c(Runnable runnable) {
            this.d = runnable;
            return this;
        }

        public a<T> d(f fVar) {
            this.c = fVar;
            return this;
        }

        public a<T> e(sg0<T, s0> sg0) {
            this.a.b = sg0;
            return this;
        }

        public a<T> f(c cVar) {
            this.b = cVar;
            return this;
        }

        public a<T> g(tg0<s0> tg0) {
            this.a.c = tg0;
            return this;
        }

        public a<T> h(Runnable runnable) {
            this.e = runnable;
            return this;
        }

        public a<T> i(tg0<w0> tg0) {
            this.a.a = tg0;
            return this;
        }
    }

    /* access modifiers changed from: private */
    public static class b<V extends k0> {
        private final ViewStub a;
        private final sg0<View, V> b;
        private V c;

        b(ViewStub viewStub, sg0<View, V> sg0) {
            this.a = viewStub;
            this.b = sg0;
        }

        static k0 a(b bVar) {
            if (bVar.c == null) {
                bVar.c = bVar.b.apply(bVar.a.inflate());
            }
            return bVar.c;
        }

        static void b(b bVar) {
            V v = bVar.c;
            if (v != null) {
                v.b();
            }
        }
    }

    public interface c {
        void a();

        void b(View view);

        void c();

        void d(Bundle bundle);

        void e();

        Bundle f();

        void g();
    }

    /* access modifiers changed from: private */
    public static class d<T> {
        public tg0<w0> a;
        public sg0<T, s0> b;
        public tg0<s0> c;
        public sg0<T, s0> d;

        d(AnonymousClass1 r1) {
        }
    }

    public interface f {
        void a();

        void b();

        void c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageLoaderView(Context context, d dVar, c cVar, f fVar, Runnable runnable, Runnable runnable2, AnonymousClass1 r8) {
        super(context);
        context.getClass();
        LayoutInflater.from(context).inflate(C0707R.layout.pageloader, this);
        setId(C0707R.id.page_loader_view);
        this.u = (ViewGroup) findViewById(C0707R.id.content);
        this.v = new b<>((ViewStub) findViewById(C0707R.id.toast_stub), new m(this));
        ViewStub viewStub = (ViewStub) findViewById(C0707R.id.debug_error_text_stub);
        dVar.getClass();
        this.a = dVar;
        dVar.b.getClass();
        dVar.a.getClass();
        this.b = dVar.a.get();
        this.c = new u0(getResources());
        this.f = cVar;
        this.n = fVar;
        this.x = new j(this, runnable);
        this.y = new u(this, runnable2);
    }

    static void E(PageLoaderView pageLoaderView) {
        if (pageLoaderView.r) {
            pageLoaderView.p.stop();
            pageLoaderView.r = false;
        }
    }

    private void G(l0<T> l0Var, Object obj) {
        if (obj == null) {
            throw new IllegalStateException("factory for " + l0Var + " is not specified");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void J() {
        Bundle bundle;
        if (!this.r) {
            if (this.t != null) {
                l0<T> l0Var = this.o;
                if (l0Var != null && (l0Var instanceof l0.b)) {
                    if (this.u.getChildCount() > 0) {
                        this.u.getChildAt(0).restoreHierarchyState(this.t.a);
                    }
                    s0 s0Var = this.p;
                    if ((s0Var instanceof z0) && (bundle = this.t.c) != null) {
                        ((z0) s0Var).d(bundle);
                    }
                    this.t = null;
                }
            }
            this.p.start();
            this.r = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setCurrentPageElement(com.spotify.pageloader.s0 r14) {
        /*
        // Method dump skipped, instructions count: 432
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.pageloader.PageLoaderView.setCurrentPageElement(com.spotify.pageloader.s0):void");
    }

    /* access modifiers changed from: private */
    public void setState(l0<T> l0Var) {
        l0Var.getClass();
        if (this.o == null || l0Var.getClass() != this.o.getClass()) {
            this.o = l0Var;
            try {
                setCurrentPageElement((s0) l0Var.d(new g(this), new k(this), new v(this), new i(this), new t(this), new h(this)));
            } catch (Exception e2) {
                this.o = new l0.f(e2);
                setCurrentPageElement(this.b);
            }
        }
    }

    public /* synthetic */ s0 P(l0.f fVar) {
        return this.b;
    }

    public /* synthetic */ s0 U(l0.c cVar) {
        return this.b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: sg0<T, com.spotify.pageloader.s0> */
    /* JADX WARN: Multi-variable type inference failed */
    public s0 V(l0.b bVar) {
        G(bVar, this.a.b);
        s0 s0Var = (s0) this.a.b.apply(bVar.i());
        if (s0Var.getView() != null) {
            Logger.n("Your loaded PageElement %s has a view before being initialized. This might indicate that you are reusing injected views instead of creating a new one in initView", s0Var);
        }
        return s0Var;
    }

    public s0 W(l0.e eVar) {
        eVar.getClass();
        G(eVar, this.a.c);
        return this.a.c.get();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: sg0<T, com.spotify.pageloader.s0> */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s0 Y(l0.a aVar) {
        G(aVar, this.a.d);
        return (s0) this.a.d.apply(aVar.i());
    }

    public /* synthetic */ s0 a0(l0.d dVar) {
        return this.b;
    }

    public /* synthetic */ void b0(Runnable runnable) {
        if (runnable != null) {
            f fVar = this.n;
            if (fVar != null) {
                fVar.b();
            }
            runnable.run();
        }
    }

    public /* synthetic */ void d0(Runnable runnable) {
        if (runnable != null) {
            f fVar = this.n;
            if (fVar != null) {
                fVar.c();
            }
            runnable.run();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void e0(View view) {
        this.o.e(q.a, p.a, l.a, e.a, new f(this), new n(this));
    }

    public /* synthetic */ void f0(l0.d dVar) {
        Runnable runnable;
        int ordinal = dVar.j().ordinal();
        if (ordinal == 0) {
            this.x.run();
        } else if (ordinal == 1 || ordinal == 2) {
            this.y.run();
        } else if (ordinal == 3 && (runnable = this.w) != null) {
            runnable.run();
        }
    }

    public /* synthetic */ void g0(l0.f fVar) {
        Runnable runnable = this.w;
        if (runnable != null) {
            runnable.run();
        }
    }

    public s0 getCurrentPageElement() {
        return this.p;
    }

    public /* synthetic */ void h0(t0 t0Var) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.a();
        }
        f fVar = this.n;
        if (fVar != null) {
            fVar.a();
        }
        t0Var.b();
    }

    public void j0(n nVar, t0<T> t0Var) {
        t0Var.getClass();
        this.w = new o(this, t0Var);
        t0Var.a().h(nVar, new r(this));
        nVar.A().a(this.z);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.p != null && this.q) {
            this.u.removeView(this.s);
            this.s = null;
            this.q = false;
        }
        c cVar = this.f;
        if (cVar != null) {
            cVar.e();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        c cVar = this.f;
        if (!(cVar == null || (bundle = eVar.b) == null)) {
            cVar.d(bundle);
        }
        this.t = eVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        boolean z2 = false;
        if (this.u.getChildCount() > 0) {
            eVar.a = new SparseArray<>();
            this.u.getChildAt(0).saveHierarchyState(eVar.a);
        }
        c cVar = this.f;
        if (cVar != null) {
            eVar.b = cVar.f();
        }
        l0<T> l0Var = this.o;
        if (l0Var != null && (l0Var instanceof l0.b) && (this.p instanceof z0)) {
            z2 = true;
        }
        if (z2) {
            eVar.c = ((z0) this.p).f();
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public SparseArray<Parcelable> a;
        public Bundle b;
        public Bundle c;

        static class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new e[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel, PageLoaderView.class.getClassLoader());
            }
        }

        protected e(Parcelable parcelable) {
            super(parcelable);
            this.a = new SparseArray<>();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.os.Parcel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeSparseArray(this.a);
            gf0.v(parcel, this.b, 0);
            gf0.v(parcel, this.c, 0);
        }

        protected e(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            this.a = parcel.readSparseArray(classLoader);
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) gf0.n(parcel, creator);
            this.b = bundle;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            Bundle bundle2 = (Bundle) gf0.n(parcel, creator);
            this.c = bundle2;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
        }
    }
}
