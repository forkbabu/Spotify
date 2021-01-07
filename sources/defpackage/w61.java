package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.s51;

/* renamed from: w61  reason: default package */
public final class w61<V extends View> {
    private final int a;
    private final V b;
    private final s51<V> c;
    private final w51 d;
    private b e;

    /* access modifiers changed from: private */
    /* renamed from: w61$b */
    public static class b {
        public final s81 a;
        public final int b;

        b(s81 s81, int i, a aVar) {
            s81.getClass();
            this.a = s81;
            this.b = i;
        }
    }

    private w61(int i, V v, s51<V> s51, w51 w51) {
        this.a = i;
        v.getClass();
        this.b = v;
        s51.getClass();
        this.c = s51;
        w51.getClass();
        this.d = w51;
        w51.a().c(i, v, w51);
    }

    public static w61<?> b(int i, ViewGroup viewGroup, w51 w51) {
        s51<?> a2 = w51.g().a(i);
        if (a2 == null) {
            a2 = w51.d();
        }
        return new w61<>(i, a2.h(viewGroup, w51), a2, w51);
    }

    public void a(int i, s81 s81, s51.b bVar) {
        this.e = new b(s81, i, null);
        this.d.a().b(this.a, this.b, s81, this.d);
        this.c.c(this.b, s81, this.d, bVar);
        this.d.a().a(this.a, this.b, s81, this.d);
    }

    public int c() {
        return this.a;
    }

    public s81 d() {
        b bVar = this.e;
        if (bVar != null) {
            return bVar.a;
        }
        throw new IllegalArgumentException("View not bound to any component!");
    }

    public V e() {
        return this.b;
    }

    public void f(s51.a<View> aVar, int... iArr) {
        this.c.b(this.b, d(), aVar, iArr);
    }

    public String toString() {
        StringBuilder T0 = je.T0(128, "HubsViewHolder[");
        T0.append(Integer.toHexString(hashCode()));
        T0.append(" view: ");
        T0.append(this.b);
        T0.append(", binder: ");
        T0.append(this.c);
        T0.append(", binderId: ");
        T0.append(this.a);
        if (this.e != null) {
            T0.append(", position: ");
            b bVar = this.e;
            if (bVar != null) {
                T0.append(bVar.b);
                T0.append(", model: ");
                T0.append(d());
            } else {
                throw new IllegalArgumentException("View not bound to any component!");
            }
        } else {
            T0.append(", not bound");
        }
        T0.append(']');
        return T0.toString();
    }
}
