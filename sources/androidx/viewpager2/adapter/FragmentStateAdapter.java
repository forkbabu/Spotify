package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;

public abstract class FragmentStateAdapter extends RecyclerView.e<d> implements e {
    final Lifecycle c;
    final o f;
    final q1<Fragment> n = new q1<>(10);
    private final q1<Fragment.e> o = new q1<>(10);
    private final q1<Integer> p = new q1<>(10);
    private FragmentMaxLifecycleEnforcer q;
    boolean r = false;
    private boolean s = false;

    /* access modifiers changed from: package-private */
    public class FragmentMaxLifecycleEnforcer {
        private ViewPager2.g a;
        private RecyclerView.g b;
        private l c;
        private ViewPager2 d;
        private long e = -1;

        /* access modifiers changed from: package-private */
        public class a extends ViewPager2.g {
            a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void a(int i) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void c(int i) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        /* access modifiers changed from: package-private */
        public class b extends a {
            b() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.g
            public void a() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        private ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* access modifiers changed from: package-private */
        public void b(RecyclerView recyclerView) {
            ViewPager2 a2 = a(recyclerView);
            this.d = a2;
            a aVar = new a();
            this.a = aVar;
            a2.e(aVar);
            b bVar = new b();
            this.b = bVar;
            FragmentStateAdapter.this.T(bVar);
            AnonymousClass3 r2 = new l() {
                /* class androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.AnonymousClass3 */

                @Override // androidx.lifecycle.l
                public void p(n nVar, Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.c = r2;
            FragmentStateAdapter.this.c.a(r2);
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView) {
            a(recyclerView).j(this.a);
            FragmentStateAdapter.this.W(this.b);
            FragmentStateAdapter.this.c.c(this.c);
            this.d = null;
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z) {
            Fragment g;
            if (!FragmentStateAdapter.this.j0() && this.d.getScrollState() == 0 && !FragmentStateAdapter.this.n.m()) {
                FragmentStateAdapter.this.getClass();
                int currentItem = this.d.getCurrentItem();
                FragmentStateAdapter.this.getClass();
                if (currentItem < 2) {
                    FragmentStateAdapter.this.getClass();
                    long j = (long) currentItem;
                    if ((j != this.e || z) && (g = FragmentStateAdapter.this.n.g(j)) != null && g.e3()) {
                        this.e = j;
                        x i = FragmentStateAdapter.this.f.i();
                        Fragment fragment = null;
                        for (int i2 = 0; i2 < FragmentStateAdapter.this.n.r(); i2++) {
                            long n = FragmentStateAdapter.this.n.n(i2);
                            Fragment s = FragmentStateAdapter.this.n.s(i2);
                            if (s.e3()) {
                                if (n != this.e) {
                                    i.u(s, Lifecycle.State.STARTED);
                                } else {
                                    fragment = s;
                                }
                                s.x4(n == this.e);
                            }
                        }
                        if (fragment != null) {
                            i.u(fragment, Lifecycle.State.RESUMED);
                        }
                        if (!i.o()) {
                            i.k();
                        }
                    }
                }
            }
        }
    }

    private static abstract class a extends RecyclerView.g {
        a(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i, int i2, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i, int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i, int i2) {
            a();
        }
    }

    public FragmentStateAdapter(Fragment fragment) {
        o E2 = fragment.E2();
        Lifecycle A = fragment.A();
        this.f = E2;
        this.c = A;
        U(true);
    }

    private static boolean c0(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long f0(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.p.r(); i2++) {
            if (this.p.s(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.p.n(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    private void i0(long j) {
        ViewParent parent;
        Fragment j2 = this.n.j(j, null);
        if (j2 != null) {
            if (!(j2.a3() == null || (parent = j2.a3().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!Y(j)) {
                this.o.p(j);
            }
            if (!j2.e3()) {
                this.n.p(j);
            } else if (j0()) {
                this.s = true;
            } else {
                if (j2.e3() && Y(j)) {
                    this.o.o(j, this.f.H0(j2));
                }
                x i = this.f.i();
                i.p(j2);
                i.k();
                this.n.p(j);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void J(RecyclerView recyclerView) {
        if (this.q == null) {
            FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
            this.q = fragmentMaxLifecycleEnforcer;
            fragmentMaxLifecycleEnforcer.b(recyclerView);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(d dVar, int i) {
        d dVar2 = dVar;
        long x = dVar2.x();
        int id = ((FrameLayout) dVar2.a).getId();
        Long f0 = f0(id);
        if (!(f0 == null || f0.longValue() == x)) {
            i0(f0.longValue());
            this.p.p(f0.longValue());
        }
        this.p.o(x, Integer.valueOf(id));
        long j = (long) i;
        if (!this.n.e(j)) {
            Fragment Z = Z(i);
            Z.w4(this.o.g(j));
            this.n.o(j, Z);
        }
        FrameLayout frameLayout = (FrameLayout) dVar2.a;
        if (q4.v(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new a(this, frameLayout, dVar2));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        b0();
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public d M(ViewGroup viewGroup, int i) {
        return d.h0(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void N(RecyclerView recyclerView) {
        this.q.c(recyclerView);
        this.q = null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public /* bridge */ /* synthetic */ boolean O(d dVar) {
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void P(d dVar) {
        g0(dVar);
        b0();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void R(d dVar) {
        Long f0 = f0(((FrameLayout) dVar.a).getId());
        if (f0 != null) {
            i0(f0.longValue());
            this.p.p(f0.longValue());
        }
    }

    /* access modifiers changed from: package-private */
    public void X(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public boolean Y(long j) {
        return j >= 0 && j < ((long) u());
    }

    public abstract Fragment Z(int i);

    @Override // androidx.viewpager2.adapter.e
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.o.r() + this.n.r());
        for (int i = 0; i < this.n.r(); i++) {
            long n2 = this.n.n(i);
            Fragment g = this.n.g(n2);
            if (g != null && g.e3()) {
                this.f.z0(bundle, je.t0("f#", n2), g);
            }
        }
        for (int i2 = 0; i2 < this.o.r(); i2++) {
            long n3 = this.o.n(i2);
            if (Y(n3)) {
                bundle.putParcelable(je.t0("s#", n3), this.o.g(n3));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.e
    public final void b(Parcelable parcelable) {
        if (!this.o.m() || !this.n.m()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (c0(str, "f#")) {
                this.n.o(Long.parseLong(str.substring(2)), this.f.Y(bundle, str));
            } else if (c0(str, "s#")) {
                long parseLong = Long.parseLong(str.substring(2));
                Fragment.e eVar = (Fragment.e) bundle.getParcelable(str);
                if (Y(parseLong)) {
                    this.o.o(parseLong, eVar);
                }
            } else {
                throw new IllegalArgumentException(je.x0("Unexpected key in savedState: ", str));
            }
        }
        if (!this.n.m()) {
            this.s = true;
            this.r = true;
            b0();
            final Handler handler = new Handler(Looper.getMainLooper());
            final c cVar = new c(this);
            this.c.a(new l(this) {
                /* class androidx.viewpager2.adapter.FragmentStateAdapter.AnonymousClass5 */

                @Override // androidx.lifecycle.l
                public void p(n nVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        handler.removeCallbacks(cVar);
                        nVar.A().c(this);
                    }
                }
            });
            handler.postDelayed(cVar, 10000);
        }
    }

    /* access modifiers changed from: package-private */
    public void b0() {
        Fragment j;
        View a3;
        if (this.s && !j0()) {
            o1 o1Var = new o1();
            for (int i = 0; i < this.n.r(); i++) {
                long n2 = this.n.n(i);
                if (!Y(n2)) {
                    o1Var.add(Long.valueOf(n2));
                    this.p.p(n2);
                }
            }
            if (!this.r) {
                this.s = false;
                for (int i2 = 0; i2 < this.n.r(); i2++) {
                    long n3 = this.n.n(i2);
                    boolean z = true;
                    if (!this.p.e(n3) && ((j = this.n.j(n3, null)) == null || (a3 = j.a3()) == null || a3.getParent() == null)) {
                        z = false;
                    }
                    if (!z) {
                        o1Var.add(Long.valueOf(n3));
                    }
                }
            }
            Iterator it = o1Var.iterator();
            while (it.hasNext()) {
                i0(((Long) it.next()).longValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g0(final d dVar) {
        Fragment g = this.n.g(dVar.x());
        if (g != null) {
            FrameLayout frameLayout = (FrameLayout) dVar.a;
            View a3 = g.a3();
            if (!g.e3() && a3 != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (g.e3() && a3 == null) {
                this.f.A0(new b(this, g, frameLayout), false);
            } else if (!g.e3() || a3.getParent() == null) {
                if (g.e3()) {
                    X(a3, frameLayout);
                } else if (!j0()) {
                    this.f.A0(new b(this, g, frameLayout), false);
                    x i = this.f.i();
                    StringBuilder V0 = je.V0("f");
                    V0.append(dVar.x());
                    i.d(g, V0.toString());
                    i.u(g, Lifecycle.State.STARTED);
                    i.k();
                    this.q.d(false);
                } else if (!this.f.j0()) {
                    this.c.a(new l() {
                        /* class androidx.viewpager2.adapter.FragmentStateAdapter.AnonymousClass2 */

                        @Override // androidx.lifecycle.l
                        public void p(n nVar, Lifecycle.Event event) {
                            if (!FragmentStateAdapter.this.j0()) {
                                nVar.A().c(this);
                                if (q4.v((FrameLayout) dVar.a)) {
                                    FragmentStateAdapter.this.g0(dVar);
                                }
                            }
                        }
                    });
                }
            } else if (a3.getParent() != frameLayout) {
                X(a3, frameLayout);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean j0() {
        return this.f.o0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) i;
    }
}
