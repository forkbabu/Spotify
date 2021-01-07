package defpackage;

import defpackage.gvd;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: hvd  reason: default package */
public class hvd implements gvd.c {
    final /* synthetic */ gvd a;
    final /* synthetic */ gvd b;

    hvd(gvd gvd, gvd gvd2) {
        this.b = gvd;
        this.a = gvd2;
    }

    @Override // defpackage.gvd.c
    public float a(float f, float f2, float f3) {
        return this.a.c.a(this.b.f(), this.b.e(), this.b.c.a(f, f2, f3));
    }

    public String toString() {
        return String.format(Locale.US, "%s -> %s", this.b.c, this.a.c);
    }
}
