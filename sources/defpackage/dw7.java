package defpackage;

import com.spotify.ubi.specification.factories.k3;
import com.spotify.ubi.specification.factories.l3;

/* renamed from: dw7  reason: default package */
public class dw7 {
    private final ere a;
    private final k3 b;
    private final l3 c;

    public dw7(ere ere, k3 k3Var, l3 l3Var) {
        this.a = ere;
        this.b = k3Var;
        this.c = l3Var;
    }

    public void a(String str, String str2) {
        this.a.a(this.c.b(str).a(str2));
    }

    public void b(String str, String str2) {
        this.a.a(this.c.b(str).b(str2));
    }

    public void c(String str, String str2, boolean z) {
        if (z) {
            this.a.a(this.c.b(str).c(str2));
        } else {
            this.a.a(this.b.b(str).a(str2));
        }
    }
}
