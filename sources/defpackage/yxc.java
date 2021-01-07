package defpackage;

/* renamed from: yxc  reason: default package */
public class yxc implements cyc {
    private final ayc a;
    private final wxc b;

    yxc(wxc wxc, ayc ayc) {
        this.b = wxc;
        this.a = ayc;
    }

    @Override // defpackage.cyc
    public void a() {
        this.a.a();
        this.b.a();
    }

    @Override // defpackage.cyc
    public void b() {
        this.b.c();
    }

    @Override // defpackage.cyc
    public void logout() {
        this.a.getClass();
        this.b.b();
    }
}
