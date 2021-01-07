package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.internal.measurement.w7;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class y3 extends b6 {
    private static final AtomicReference<String[]> c = new AtomicReference<>();
    private static final AtomicReference<String[]> d = new AtomicReference<>();
    private static final AtomicReference<String[]> e = new AtomicReference<>();

    y3(f5 f5Var) {
        super(f5Var);
    }

    private final boolean A() {
        return this.a.I() && this.a.l().B(3);
    }

    private static String w(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        if (atomicReference != null) {
            g.c(strArr.length == strArr2.length);
            for (int i = 0; i < strArr.length; i++) {
                if (z9.v0(str, strArr[i])) {
                    synchronized (atomicReference) {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    }
                    return str2;
                }
            }
            return str;
        }
        throw new NullPointerException("null reference");
    }

    private final String x(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder V0 = je.V0("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                str = t((Bundle) obj);
            } else {
                str = String.valueOf(obj);
            }
            if (str != null) {
                if (V0.length() != 1) {
                    V0.append(", ");
                }
                V0.append(str);
            }
        }
        V0.append("]");
        return V0.toString();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.b6
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String t(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!A()) {
            return bundle.toString();
        }
        StringBuilder V0 = je.V0("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (V0.length() != 8) {
                V0.append(", ");
            }
            V0.append(y(str2));
            V0.append("=");
            if (!w7.b() || !super.j().r(t.y0)) {
                V0.append(bundle.get(str2));
            } else {
                Object obj = bundle.get(str2);
                if (obj instanceof Bundle) {
                    str = x(new Object[]{obj});
                } else if (obj instanceof Object[]) {
                    str = x((Object[]) obj);
                } else if (obj instanceof ArrayList) {
                    str = x(((ArrayList) obj).toArray());
                } else {
                    str = String.valueOf(obj);
                }
                V0.append(str);
            }
        }
        V0.append("}]");
        return V0.toString();
    }

    /* access modifiers changed from: protected */
    public final String u(r rVar) {
        String str;
        if (!A()) {
            return rVar.toString();
        }
        StringBuilder V0 = je.V0("origin=");
        V0.append(rVar.c);
        V0.append(",name=");
        V0.append(v(rVar.a));
        V0.append(",params=");
        m mVar = rVar.b;
        if (mVar == null) {
            str = null;
        } else if (!A()) {
            str = mVar.toString();
        } else {
            str = t(mVar.p2());
        }
        V0.append(str);
        return V0.toString();
    }

    /* access modifiers changed from: protected */
    public final String v(String str) {
        if (str == null) {
            return null;
        }
        if (!A()) {
            return str;
        }
        return w(str, c6.c, c6.a, c);
    }

    /* access modifiers changed from: protected */
    public final String y(String str) {
        if (str == null) {
            return null;
        }
        if (!A()) {
            return str;
        }
        return w(str, f6.b, f6.a, d);
    }

    /* access modifiers changed from: protected */
    public final String z(String str) {
        if (str == null) {
            return null;
        }
        if (!A()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return w(str, e6.b, e6.a, e);
        }
        return "experiment_id(" + str + ")";
    }
}
