package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

public abstract class x {
    ArrayList<a> a = new ArrayList<>();
    int b;
    int c;
    int d;
    int e;
    int f;
    boolean g;
    boolean h = true;
    String i;
    int j;
    CharSequence k;
    int l;
    CharSequence m;
    ArrayList<String> n;
    ArrayList<String> o;
    boolean p = false;
    ArrayList<Runnable> q;

    /* access modifiers changed from: package-private */
    public static final class a {
        int a;
        Fragment b;
        int c;
        int d;
        int e;
        int f;
        Lifecycle.State g;
        Lifecycle.State h;

        a() {
        }

        a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.g = state;
            this.h = state;
        }

        a(int i, Fragment fragment, Lifecycle.State state) {
            this.a = i;
            this.b = fragment;
            this.g = fragment.Y;
            this.h = state;
        }
    }

    x(k kVar, ClassLoader classLoader) {
    }

    public x b(int i2, Fragment fragment) {
        n(i2, fragment, null, 1);
        return this;
    }

    public x c(int i2, Fragment fragment, String str) {
        n(i2, fragment, str, 1);
        return this;
    }

    public x d(Fragment fragment, String str) {
        n(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.d = this.c;
        aVar.e = this.d;
        aVar.f = this.e;
    }

    public x f(View view, String str) {
        if (e0.p()) {
            String s = q4.s(view);
            if (s != null) {
                if (this.n == null) {
                    this.n = new ArrayList<>();
                    this.o = new ArrayList<>();
                } else if (this.o.contains(str)) {
                    throw new IllegalArgumentException(je.y0("A shared element with the target name '", str, "' has already been added to the transaction."));
                } else if (this.n.contains(s)) {
                    throw new IllegalArgumentException(je.y0("A shared element with the source name '", s, "' has already been added to the transaction."));
                }
                this.n.add(s);
                this.o.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public x g(String str) {
        if (this.h) {
            this.g = true;
            this.i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public x h(Fragment fragment) {
        e(new a(7, fragment));
        return this;
    }

    public abstract int i();

    public abstract int j();

    public abstract void k();

    public abstract x l(Fragment fragment);

    public x m() {
        if (!this.g) {
            this.h = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public abstract void n(int i2, Fragment fragment, String str, int i3);

    public abstract boolean o();

    public abstract x p(Fragment fragment);

    public x q(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            n(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public x r(Runnable runnable) {
        m();
        if (this.q == null) {
            this.q = new ArrayList<>();
        }
        this.q.add(runnable);
        return this;
    }

    public x s(int i2, int i3) {
        this.b = i2;
        this.c = i3;
        this.d = 0;
        this.e = 0;
        return this;
    }

    public x t(int i2, int i3, int i4, int i5) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        return this;
    }

    public abstract x u(Fragment fragment, Lifecycle.State state);

    public abstract x v(Fragment fragment);

    public x w(boolean z) {
        this.p = z;
        return this;
    }

    public x x(int i2) {
        this.f = i2;
        return this;
    }
}
