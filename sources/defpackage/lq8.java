package defpackage;

import io.reactivex.a;
import io.reactivex.e;

/* renamed from: lq8  reason: default package */
public class lq8 {
    private final kq8 a;
    private final fq8 b;
    private final boolean c;

    public lq8(kq8 kq8, fq8 fq8, boolean z) {
        this.a = kq8;
        this.b = fq8;
        this.c = z;
    }

    private a a(boolean z) {
        return this.b.a().N0(1).Q(new jq8(this)).K0(new iq8(this, z));
    }

    public /* synthetic */ boolean b(Boolean bool) {
        return this.c || !bool.booleanValue();
    }

    public /* synthetic */ e c(boolean z, Boolean bool) {
        return this.a.a(z);
    }

    public a d() {
        return a(true);
    }

    public a e() {
        return a(false);
    }
}
