package com.google.android.gms.cast.internal;

/* access modifiers changed from: package-private */
public final class m implements s {
    private final /* synthetic */ s a;
    private final /* synthetic */ n b;

    m(n nVar, s sVar) {
        this.b = nVar;
        this.a = sVar;
    }

    @Override // com.google.android.gms.cast.internal.s
    public final void a(long j) {
        s sVar = this.a;
        if (sVar != null) {
            sVar.a(j);
        }
    }

    @Override // com.google.android.gms.cast.internal.s
    public final void b(long j, int i, Object obj) {
        this.b.g = null;
        s sVar = this.a;
        if (sVar != null) {
            sVar.b(j, i, obj);
        }
    }
}
