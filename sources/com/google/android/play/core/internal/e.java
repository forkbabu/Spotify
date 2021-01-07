package com.google.android.play.core.internal;

/* access modifiers changed from: package-private */
public final class e extends b {
    final /* synthetic */ l b;

    e(l lVar) {
        this.b = lVar;
    }

    @Override // com.google.android.play.core.internal.b
    public final void a() {
        if (this.b.k != null) {
            this.b.b.f("Unbind from service.", new Object[0]);
            this.b.a.unbindService(this.b.j);
            this.b.e = false;
            this.b.k = null;
            this.b.j = null;
        }
    }
}
