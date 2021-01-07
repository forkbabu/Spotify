package defpackage;

import defpackage.gvd;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: ivd  reason: default package */
public class ivd implements gvd.c {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    ivd(gvd gvd, float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.gvd.c
    public float a(float f, float f2, float f3) {
        return nud.o(this.a, this.b, this.c, this.d, f3);
    }

    public String toString() {
        return String.format(Locale.US, "map(%.2f, %.2f, %.2f, %.2f)", Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d));
    }
}
