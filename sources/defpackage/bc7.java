package defpackage;

import defpackage.dc7;
import java.util.List;

/* renamed from: bc7  reason: default package */
public class bc7 implements dc7.a {
    private final oa7 a;
    private final m8a b;

    public bc7(oa7 oa7, m8a m8a) {
        this.a = oa7;
        this.b = m8a;
    }

    @Override // defpackage.dc7.a
    public void a(String str) {
        this.b.a(str);
        this.a.j(true, str);
    }

    @Override // defpackage.dc7.a
    public void b(String str, List<String> list) {
        for (String str2 : list) {
            this.b.b(str2);
        }
        this.b.b(str);
        this.a.j(false, str);
    }
}
