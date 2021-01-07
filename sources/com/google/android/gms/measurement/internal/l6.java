package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.g9;
import java.util.Iterator;
import java.util.TreeSet;

final /* synthetic */ class l6 implements Runnable {
    private final i6 a;
    private final Bundle b;

    l6(i6 i6Var, Bundle bundle) {
        this.a = i6Var;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        i6 i6Var = this.a;
        Bundle bundle = this.b;
        if (g9.b() && i6Var.j().r(t.H0)) {
            if (bundle == null) {
                i6Var.h().C.b(new Bundle());
                return;
            }
            Bundle a2 = i6Var.h().C.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    i6Var.f();
                    if (z9.Y(obj)) {
                        i6Var.f().j0(27, null, null, 0);
                    }
                    i6Var.l().J().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (z9.w0(str)) {
                    i6Var.l().J().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a2.remove(str);
                } else if (i6Var.f().d0("param", str, 100, obj)) {
                    i6Var.f().M(a2, str, obj);
                }
            }
            i6Var.f();
            int w = i6Var.j().w();
            if (a2.size() > w) {
                Iterator it = new TreeSet(a2.keySet()).iterator();
                int i = 0;
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    i++;
                    if (i > w) {
                        a2.remove(str2);
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                i6Var.f().j0(26, null, null, 0);
                i6Var.l().J().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            i6Var.h().C.b(a2);
            i6Var.r().D(a2);
        }
    }
}
