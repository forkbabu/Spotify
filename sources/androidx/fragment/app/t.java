package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.x;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.a;

public abstract class t extends a {
    private final o c;
    private final int d;
    private x e = null;
    private Fragment f = null;
    private boolean g;

    @Deprecated
    public t(o oVar) {
        this.c = oVar;
        this.d = 0;
    }

    private static String s(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.e == null) {
            this.e = new a(this.c);
        }
        this.e.l(fragment);
        if (fragment.equals(this.f)) {
            this.f = null;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // androidx.viewpager.widget.a
    public void c(ViewGroup viewGroup) {
        x xVar = this.e;
        if (xVar != null) {
            if (!this.g) {
                try {
                    this.g = true;
                    a aVar = (a) xVar;
                    aVar.m();
                    aVar.r.O(aVar, true);
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            }
            this.e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object h(ViewGroup viewGroup, int i) {
        if (this.e == null) {
            this.e = new a(this.c);
        }
        long j = (long) i;
        Fragment U = this.c.U(s(viewGroup.getId(), j));
        if (U != null) {
            this.e.e(new x.a(7, U));
        } else {
            U = r(i);
            this.e.n(viewGroup.getId(), U, s(viewGroup.getId(), j), 1);
        }
        if (U != this.f) {
            U.x4(false);
            if (this.d == 1) {
                this.e.u(U, Lifecycle.State.STARTED);
            } else {
                U.F4(false);
            }
        }
        return U;
    }

    @Override // androidx.viewpager.widget.a
    public boolean i(View view, Object obj) {
        return ((Fragment) obj).P == view;
    }

    @Override // androidx.viewpager.widget.a
    public void l(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable m() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void n(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.x4(false);
                if (this.d == 1) {
                    if (this.e == null) {
                        this.e = new a(this.c);
                    }
                    this.e.u(this.f, Lifecycle.State.STARTED);
                } else {
                    this.f.F4(false);
                }
            }
            fragment.x4(true);
            if (this.d == 1) {
                if (this.e == null) {
                    this.e = new a(this.c);
                }
                this.e.u(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.F4(true);
            }
            this.f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void p(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract Fragment r(int i);
}
