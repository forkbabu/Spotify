package defpackage;

import defpackage.gvd;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: fvd  reason: default package */
public final class fvd implements gvd.c {
    final /* synthetic */ float a;

    fvd(float f) {
        this.a = f;
    }

    @Override // defpackage.gvd.c
    public float a(float f, float f2, float f3) {
        return this.a;
    }

    public String toString() {
        return String.format(Locale.US, "point(%.2f)", Float.valueOf(this.a));
    }
}
