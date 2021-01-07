package defpackage;

import java.util.List;

/* renamed from: u61  reason: default package */
public class u61 extends e91 {
    private final s81 b;
    private final t61 c;
    private final t61 f;

    private u61(b91 b91, t61 t61, t61 t612, s81 s81) {
        super(b91);
        t61.getClass();
        this.c = t61;
        t612.getClass();
        this.f = t612;
        this.b = s81;
    }

    public static u61 b(b91 b91, t61 t61, t61 t612, s81 s81) {
        return new u61(b91, t61, t612, s81);
    }

    @Override // defpackage.b91
    public List body() {
        return this.c;
    }

    @Override // defpackage.b91
    public s81 header() {
        return this.b;
    }

    @Override // defpackage.b91
    public List overlays() {
        return this.f;
    }
}
