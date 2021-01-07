package defpackage;

/* renamed from: ir0  reason: default package */
class ir0 implements er0 {
    private final boolean a;
    private final fr0 b;
    private final lr0 c;

    public ir0(boolean z, fr0 fr0, lr0 lr0) {
        this.a = z;
        this.b = fr0;
        this.c = lr0;
    }

    @Override // defpackage.er0
    public boolean a() {
        return this.a || this.b.isEnabled();
    }

    @Override // defpackage.er0
    public boolean b() {
        return a() && this.c.b();
    }
}
