package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import java.util.Iterator;

public final class k {
    final String a;
    final String b;
    private final String c;
    final long d;
    final long e;
    final m f;

    private k(f5 f5Var, String str, String str2, String str3, long j, long j2, m mVar) {
        g.i(str2);
        g.i(str3);
        if (mVar != null) {
            this.a = str2;
            this.b = str3;
            this.c = TextUtils.isEmpty(str) ? null : str;
            this.d = j;
            this.e = j2;
            if (j2 != 0 && j2 > j) {
                f5Var.l().H().c("Event created with reverse previous/current timestamps. appId, name", a4.w(str2), a4.w(str3));
            }
            this.f = mVar;
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: package-private */
    public final k a(f5 f5Var, long j) {
        return new k(f5Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        StringBuilder U0 = je.U0(valueOf.length() + je.N0(str2, je.N0(str, 33)), "Event{appId='", str, "', name='", str2);
        U0.append("', params=");
        U0.append(valueOf);
        U0.append('}');
        return U0.toString();
    }

    k(f5 f5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        m mVar;
        g.i(str2);
        g.i(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            f5Var.l().H().b("Event created with reverse previous/current timestamps. appId", a4.w(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            mVar = new m(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    f5Var.l().E().a("Param name can't be null");
                    it.remove();
                } else {
                    Object G = f5Var.F().G(next, bundle2.get(next));
                    if (G == null) {
                        f5Var.l().H().b("Param value can't be null", f5Var.G().y(next));
                        it.remove();
                    } else {
                        f5Var.F().M(bundle2, next, G);
                    }
                }
            }
            mVar = new m(bundle2);
        }
        this.f = mVar;
    }
}
