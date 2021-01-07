package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class p5<T> implements y5<T> {
    private final l5 a;
    private final l6<?, ?> b;
    private final boolean c;
    private final w3<?> d;

    private p5(l6<?, ?> l6Var, w3<?> w3Var, l5 l5Var) {
        this.b = l6Var;
        this.c = w3Var.e(l5Var);
        this.d = w3Var;
        this.a = l5Var;
    }

    static <T> p5<T> j(l6<?, ?> l6Var, w3<?> w3Var, l5 l5Var) {
        return new p5<>(l6Var, w3Var, l5Var);
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final T a() {
        return (T) ((f4.b) this.a.g()).r();
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final int b(T t) {
        int hashCode = this.b.e(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.b(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final int c(T t) {
        l6<?, ?> l6Var = this.b;
        int i = l6Var.i(l6Var.e(t)) + 0;
        return this.c ? i + this.d.b(t).q() : i;
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final boolean d(T t, T t2) {
        if (!this.b.e(t).equals(this.b.e(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.b(t).equals(this.d.b(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final boolean e(T t) {
        return this.d.b(t).p();
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final void f(T t) {
        this.b.h(t);
        this.d.g(t);
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final void g(T t, T t2) {
        l6<?, ?> l6Var = this.b;
        int i = z5.e;
        l6Var.d(t, l6Var.g(l6Var.e(t), l6Var.e(t2)));
        if (this.c) {
            w3<?> w3Var = this.d;
            a4<?> b2 = w3Var.b(t2);
            if (!b2.a.isEmpty()) {
                w3Var.f(t).f(b2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final void h(T t, byte[] bArr, int i, int i2, g3 g3Var) {
        T t2 = t;
        n6 n6Var = t2.zzb;
        if (n6Var == n6.a()) {
            n6Var = n6.g();
            t2.zzb = n6Var;
        }
        t.u();
        f4.f fVar = null;
        while (i < i2) {
            int i3 = o2.i(bArr, i, g3Var);
            int i4 = g3Var.a;
            if (i4 == 11) {
                int i5 = 0;
                zzgm zzgm = null;
                while (i3 < i2) {
                    i3 = o2.i(bArr, i3, g3Var);
                    int i6 = g3Var.a;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (fVar != null) {
                                u5.a();
                                throw new NoSuchMethodError();
                            } else if (i8 == 2) {
                                i3 = o2.z(bArr, i3, g3Var);
                                zzgm = (zzgm) g3Var.c;
                            }
                        }
                    } else if (i8 == 0) {
                        i3 = o2.i(bArr, i3, g3Var);
                        i5 = g3Var.a;
                        fVar = (f4.f) this.d.c(g3Var.d, this.a, i5);
                    }
                    if (i6 == 12) {
                        break;
                    }
                    i3 = o2.a(i6, bArr, i3, i2, g3Var);
                }
                if (zzgm != null) {
                    n6Var.c((i5 << 3) | 2, zzgm);
                }
                i = i3;
            } else if ((i4 & 7) == 2) {
                fVar = (f4.f) this.d.c(g3Var.d, this.a, i4 >>> 3);
                if (fVar == null) {
                    i = o2.c(i4, bArr, i3, i2, n6Var, g3Var);
                } else {
                    u5.a();
                    throw new NoSuchMethodError();
                }
            } else {
                i = o2.a(i4, bArr, i3, i2, g3Var);
            }
        }
        if (i != i2) {
            throw zzig.d();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final void i(T t, z6 z6Var) {
        Iterator<Map.Entry<?, Object>> o = this.d.b(t).o();
        while (o.hasNext()) {
            Map.Entry<?, Object> next = o.next();
            b4 b4Var = (b4) next.getKey();
            if (b4Var.c() != zzlh.MESSAGE || b4Var.e() || b4Var.f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof p4) {
                ((t3) z6Var).i(b4Var.a(), ((p4) next).a().d());
            } else {
                ((t3) z6Var).i(b4Var.a(), next.getValue());
            }
        }
        l6<?, ?> l6Var = this.b;
        l6Var.f(l6Var.e(t), z6Var);
    }
}
