package defpackage;

import com.google.android.gms.wearable.a;
import com.google.android.gms.wearable.b;
import com.google.android.gms.wearable.c;

/* renamed from: wv  reason: default package */
public final class wv implements b {
    private final c.b a;

    public wv(c.b bVar) {
        this.a = bVar;
    }

    @Override // com.google.android.gms.wearable.b
    public final void a(a aVar, int i, int i2) {
        this.a.a(vv.u(aVar), i, i2);
    }

    @Override // com.google.android.gms.wearable.b
    public final void b(a aVar, int i, int i2) {
        this.a.d(vv.u(aVar), i, i2);
    }

    @Override // com.google.android.gms.wearable.b
    public final void c(a aVar) {
        this.a.b(vv.u(aVar));
    }

    @Override // com.google.android.gms.wearable.b
    public final void d(a aVar, int i, int i2) {
        this.a.c(vv.u(aVar), i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wv.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((wv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
