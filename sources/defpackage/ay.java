package defpackage;

/* renamed from: ay  reason: default package */
public final class ay extends wx {
    private final wx a;
    private final float b;

    public ay(wx wxVar, float f) {
        this.a = wxVar;
        this.b = f;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.wx
    public boolean b() {
        return this.a.b();
    }

    @Override // defpackage.wx
    public void c(float f, float f2, float f3, fy fyVar) {
        this.a.c(f, f2 - this.b, f3, fyVar);
    }
}
