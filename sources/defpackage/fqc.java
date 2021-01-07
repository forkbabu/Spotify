package defpackage;

import android.graphics.Bitmap;
import defpackage.eqc;

/* renamed from: fqc  reason: default package */
public class fqc {
    private final hqc a;
    private final a b;
    private jqc c;

    /* renamed from: fqc$a */
    public interface a {
    }

    public fqc(hqc hqc, a aVar) {
        this.a = hqc;
        this.b = aVar;
    }

    public void a() {
        jqc a2 = ((iqc) this.a).a(this.c, new eqc.b());
        this.c = a2;
        ((lpc) this.b).g(a2);
    }

    public void b(Bitmap bitmap, boolean z) {
        jqc a2 = ((iqc) this.a).a(this.c, new eqc.c(bitmap, z));
        this.c = a2;
        ((lpc) this.b).g(a2);
    }

    public void c() {
        jqc a2 = ((iqc) this.a).a(this.c, new eqc.d());
        this.c = a2;
        ((lpc) this.b).g(a2);
    }

    public void d() {
        jqc a2 = ((iqc) this.a).a(this.c, new eqc.e());
        this.c = a2;
        ((lpc) this.b).g(a2);
    }

    public void e(Bitmap bitmap, boolean z, int i, int i2) {
        jqc a2 = ((iqc) this.a).a(this.c, new eqc.f(bitmap, z, i, i2));
        this.c = a2;
        ((lpc) this.b).g(a2);
    }

    public void f() {
        jqc a2 = ((iqc) this.a).a(this.c, new eqc.g());
        this.c = a2;
        ((lpc) this.b).g(a2);
    }

    public void g(String str, String str2, String str3, boolean z, int i) {
        jqc a2 = ((iqc) this.a).a(this.c, new eqc.a(str, str2, str3, z, i));
        this.c = a2;
        ((lpc) this.b).g(a2);
    }
}
