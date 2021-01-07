package defpackage;

/* renamed from: wd3  reason: default package */
public class wd3 implements vd3 {
    private final a71 a;
    private final a71 b;

    public wd3(a71 a71, a71 a712) {
        this.b = a71;
        this.a = a712;
    }

    @Override // defpackage.vd3
    public void a(s81 s81) {
        o81 o81 = (o81) s81.events().get("rightAccessoryClick");
        n61 b2 = n61.b("rightAccessoryClick", s81);
        if (o81 != null) {
            this.a.b(o81, b2);
        }
    }

    @Override // defpackage.vd3
    public void b() {
    }

    @Override // defpackage.vd3
    public void c(s81 s81) {
        o81 o81 = (o81) s81.events().get("click");
        n61 b2 = n61.b("click", s81);
        if (o81 != null) {
            this.b.b(o81, b2);
        }
    }
}
