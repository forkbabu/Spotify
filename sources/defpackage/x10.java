package defpackage;

import com.google.firebase.components.d;
import com.google.firebase.components.p;
import java.util.Iterator;
import java.util.Set;

/* renamed from: x10  reason: default package */
public class x10 implements b20 {
    private final String a;
    private final y10 b;

    x10(Set<z10> set, y10 y10) {
        this.a = c(set);
        this.b = y10;
    }

    public static d<b20> b() {
        d.b a2 = d.a(b20.class);
        a2.b(p.g(z10.class));
        a2.f(w10.b());
        return a2.d();
    }

    private static String c(Set<z10> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<z10> it = set.iterator();
        while (it.hasNext()) {
            z10 next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.b20
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + c(this.b.b());
    }
}
