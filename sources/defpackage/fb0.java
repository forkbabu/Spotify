package defpackage;

/* renamed from: fb0  reason: default package */
public class fb0 implements vud {
    public static final jvd<Integer> c = jvd.b(0);
    public static final jvd<Integer> d = jvd.b(266);
    private final ab0 a;
    private tud b;

    public fb0(ab0 ab0) {
        this.a = ab0;
    }

    @Override // defpackage.vud
    public void a(float f) {
        this.a.A().setAlpha(this.b.a(f));
    }

    @Override // defpackage.vud
    public int b() {
        return d.a().intValue() + c.a().intValue();
    }

    @Override // defpackage.vud
    public void k() {
        float b2 = (float) b();
        this.b = new tud(((float) c.a().intValue()) / b2, ((float) d.a().intValue()) / b2, this.a.A().getAlpha(), 0.0f, ta0.c);
    }
}
