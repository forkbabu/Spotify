package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class o extends m implements Iterable<m> {
    final u1<m> r = new u1<>(10);
    private int s;
    private String t;

    class a implements Iterator<m> {
        private int a = -1;
        private boolean b = false;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a + 1 < o.this.r.q();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public m next() {
            if (hasNext()) {
                this.b = true;
                u1<m> u1Var = o.this.r;
                int i = this.a + 1;
                this.a = i;
                return u1Var.r(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.b) {
                o.this.r.r(this.a).x(null);
                o.this.r.p(this.a);
                this.a--;
                this.b = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public o(v<? extends o> vVar) {
        super(vVar);
    }

    public final m A(int i) {
        return E(i, true);
    }

    /* access modifiers changed from: package-private */
    public final m E(int i, boolean z) {
        m g = this.r.g(i, null);
        if (g != null) {
            return g;
        }
        if (!z || n() == null) {
            return null;
        }
        return n().A(i);
    }

    /* access modifiers changed from: package-private */
    public String H() {
        if (this.t == null) {
            this.t = Integer.toString(this.s);
        }
        return this.t;
    }

    public final int I() {
        return this.s;
    }

    @Override // androidx.navigation.m
    public String i() {
        return k() != 0 ? super.i() : "the root navigation";
    }

    @Override // java.lang.Iterable
    public final Iterator<m> iterator() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.navigation.m
    public m.a o(l lVar) {
        m.a o = super.o(lVar);
        a aVar = new a();
        while (aVar.hasNext()) {
            m.a o2 = ((m) aVar.next()).o(lVar);
            if (o2 != null && (o == null || o2.compareTo(o) > 0)) {
                o = o2;
            }
        }
        return o;
    }

    @Override // androidx.navigation.m
    public void t(Context context, AttributeSet attributeSet) {
        super.t(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, c7.d);
        int resourceId = obtainAttributes.getResourceId(0, 0);
        this.s = resourceId;
        this.t = null;
        this.t = m.j(context, resourceId);
        obtainAttributes.recycle();
    }

    @Override // androidx.navigation.m
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        m A = A(this.s);
        if (A == null) {
            String str = this.t;
            if (str == null) {
                sb.append("0x");
                sb.append(Integer.toHexString(this.s));
            } else {
                sb.append(str);
            }
        } else {
            sb.append("{");
            sb.append(A.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    public final void z(m mVar) {
        if (mVar.k() != 0) {
            m f = this.r.f(mVar.k());
            if (f != mVar) {
                if (mVar.n() == null) {
                    if (f != null) {
                        f.x(null);
                    }
                    mVar.x(this);
                    this.r.n(mVar.k(), mVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            return;
        }
        throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
    }
}
