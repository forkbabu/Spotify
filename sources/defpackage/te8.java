package defpackage;

import java.util.Set;

/* renamed from: te8  reason: default package */
public class te8 implements ve8, we8 {
    private final Set<ve8> a;
    private final Set<we8> b;

    public te8(Set<ve8> set, Set<we8> set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.ve8
    public void a(b91 b91, b91 b912) {
        for (ve8 ve8 : this.a) {
            ve8.a(b91, b912);
        }
    }

    @Override // defpackage.we8
    public void b(b91 b91, String str, String str2) {
        for (we8 we8 : this.b) {
            we8.b(b91, str, str2);
        }
    }
}
