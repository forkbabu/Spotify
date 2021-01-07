package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.n;
import java.util.Collections;
import java.util.Set;

public abstract class f<T extends IInterface> extends b<T> implements a.f {
    private final c I;
    private final Set<Scope> J;
    private final Account K;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected f(@androidx.annotation.RecentlyNonNull android.content.Context r10, @androidx.annotation.RecentlyNonNull android.os.Looper r11, int r12, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.c r13, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.f r14, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.n r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.g r3 = com.google.android.gms.common.internal.g.a(r10)
            com.google.android.gms.common.d r4 = com.google.android.gms.common.d.f()
            java.lang.String r0 = "null reference"
            if (r14 == 0) goto L_0x0057
            if (r15 == 0) goto L_0x0051
            com.google.android.gms.common.internal.z r6 = new com.google.android.gms.common.internal.z
            r6.<init>(r14)
            com.google.android.gms.common.internal.a0 r7 = new com.google.android.gms.common.internal.a0
            r7.<init>(r15)
            java.lang.String r8 = r13.i()
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.I = r13
            android.accounts.Account r10 = r13.a()
            r9.K = r10
            java.util.Set r10 = r13.d()
            java.util.Iterator r11 = r10.iterator()
        L_0x0033:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x004e
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L_0x0046
            goto L_0x0033
        L_0x0046:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L_0x004e:
            r9.J = r10
            return
        L_0x0051:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r0)
            throw r10
        L_0x0057:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r0)
            goto L_0x005e
        L_0x005d:
            throw r10
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.f.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.n):void");
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public final c Y() {
        return this.I;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> i() {
        return f() ? this.J : Collections.emptySet();
    }

    @Override // com.google.android.gms.common.internal.b
    @RecentlyNullable
    public final Account r() {
        return this.K;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    @RecentlyNonNull
    public final Set<Scope> y() {
        return this.J;
    }

    @Deprecated
    protected f(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull c cVar, @RecentlyNonNull c.a aVar, @RecentlyNonNull c.b bVar) {
        this(context, looper, i, cVar, (com.google.android.gms.common.api.internal.f) aVar, (n) bVar);
    }
}
