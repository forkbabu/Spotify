package defpackage;

/* renamed from: uf3  reason: default package */
public class uf3 {
    private final boolean a;
    private final boolean b;
    private final vf3 c;

    public uf3(vf3 vf3, boolean z, boolean z2) {
        this.c = vf3;
        this.a = z;
        this.b = z2;
    }

    public void a() {
        if (this.a && !this.b) {
            this.c.a();
        }
    }

    public void b() {
        if (this.a && !this.b) {
            this.c.reset();
        }
    }
}
