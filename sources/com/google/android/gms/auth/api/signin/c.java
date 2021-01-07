package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.g;

public class c extends b<GoogleSignInOptions> {
    private static int k = 1;

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    static final class a {
        private static final /* synthetic */ int[] a = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    c(android.content.Context r4, com.google.android.gms.auth.api.signin.GoogleSignInOptions r5) {
        /*
            r3 = this;
            com.google.android.gms.common.api.a<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r0 = defpackage.oq.f
            com.google.android.gms.common.api.internal.a r1 = new com.google.android.gms.common.api.internal.a
            r1.<init>()
            com.google.android.gms.common.api.b$a$a r2 = new com.google.android.gms.common.api.b$a$a
            r2.<init>()
            r2.c(r1)
            com.google.android.gms.common.api.b$a r1 = r2.a()
            r3.<init>(r4, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.c.<init>(android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    private final synchronized int x() {
        if (k == 1) {
            Context m = m();
            d f = d.f();
            int c = f.c(m, 12451000);
            if (c == 0) {
                k = 4;
            } else if (f.a(m, c, null) != null || DynamiteModule.a(m, "com.google.android.gms.auth.api.fallback") == 0) {
                k = 2;
            } else {
                k = 3;
            }
        }
        return k;
    }

    public Intent u() {
        Context m = m();
        int i = i.a[x() - 1];
        if (i == 1) {
            return i.e(m, (GoogleSignInOptions) l());
        }
        if (i != 2) {
            return i.g(m, (GoogleSignInOptions) l());
        }
        return i.b(m, (GoogleSignInOptions) l());
    }

    public g<Void> v() {
        return n.b(i.f(c(), m(), x() == 3));
    }

    public g<Void> w() {
        return n.b(i.c(c(), m(), x() == 3));
    }
}
