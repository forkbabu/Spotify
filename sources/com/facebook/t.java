package com.facebook;

import android.content.Intent;
import com.facebook.internal.f0;
import com.facebook.internal.h0;

public final class t {
    private static volatile t d;
    private final e6 a;
    private final s b;
    private r c;

    t(e6 e6Var, s sVar) {
        h0.f(e6Var, "localBroadcastManager");
        h0.f(sVar, "profileCache");
        this.a = e6Var;
        this.b = sVar;
    }

    static t b() {
        if (d == null) {
            synchronized (t.class) {
                if (d == null) {
                    d = new t(e6.b(k.d()), new s());
                }
            }
        }
        return d;
    }

    private void e(r rVar, boolean z) {
        r rVar2 = this.c;
        this.c = rVar;
        if (z) {
            if (rVar != null) {
                this.b.c(rVar);
            } else {
                this.b.a();
            }
        }
        if (!f0.b(rVar2, rVar)) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", rVar2);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", rVar);
            this.a.d(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public r a() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        r b2 = this.b.b();
        if (b2 == null) {
            return false;
        }
        e(b2, false);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d(r rVar) {
        e(rVar, true);
    }
}
