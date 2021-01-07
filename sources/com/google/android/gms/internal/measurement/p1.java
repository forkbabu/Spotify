package com.google.android.gms.internal.measurement;

import android.content.Context;

/* access modifiers changed from: package-private */
public final class p1 extends j2 {
    private final Context a;
    private final p2<zzdx<x1>> b;

    p1(Context context, p2<zzdx<x1>> p2Var) {
        this.a = context;
        this.b = p2Var;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.j2
    public final Context a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.j2
    public final p2<zzdx<x1>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        p2<zzdx<x1>> p2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            j2 j2Var = (j2) obj;
            if (this.a.equals(j2Var.a()) && ((p2Var = this.b) != null ? p2Var.equals(j2Var.b()) : j2Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        p2<zzdx<x1>> p2Var = this.b;
        return hashCode ^ (p2Var == null ? 0 : p2Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder U0 = je.U0(valueOf2.length() + valueOf.length() + 46, "FlagsContext{context=", valueOf, ", hermeticFileOverrides=", valueOf2);
        U0.append("}");
        return U0.toString();
    }
}
