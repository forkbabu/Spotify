package defpackage;

import com.spotify.ubi.specification.factories.q3;

/* renamed from: ma8  reason: default package */
public class ma8 implements gb8 {
    private final ere a;
    private final q3.c.b b;

    public ma8(ere ere, q3.c.b bVar) {
        this.a = ere;
        this.b = bVar;
    }

    @Override // defpackage.gb8
    public void log(String str) {
        this.a.a(this.b.a(str));
    }
}
