package defpackage;

import java.util.Map;

/* renamed from: z61  reason: default package */
public final class z61 implements p61 {
    private final a71 b;
    private final p61 c;

    private z61(a71 a71, p61 p61) {
        a71.getClass();
        this.b = a71;
        p61.getClass();
        this.c = p61;
    }

    public static p61 b(Map<String, a71> map, a71 a71, p61 p61) {
        return new z61(new y61(map, a71), p61);
    }

    @Override // defpackage.p61
    public void a(n61 n61) {
        o81 o81 = (o81) n61.d().events().get(n61.e());
        if (o81 != null) {
            this.b.b(o81, n61);
        } else {
            this.c.a(n61);
        }
    }
}
