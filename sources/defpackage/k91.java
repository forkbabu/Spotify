package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: k91  reason: default package */
public class k91 {
    private final a a;

    /* renamed from: k91$a */
    public interface a {
        s81 a(s81 s81);
    }

    public k91(a aVar) {
        h.e(aVar, "converter");
        this.a = aVar;
    }

    private final List<s81> a(List<? extends s81> list) {
        if (list.isEmpty()) {
            return null;
        }
        boolean z = false;
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        for (T t : list) {
            List<s81> a2 = a(t.children());
            if (a2 != null) {
                t = t.toBuilder().m(a2).l();
                z = true;
            }
            s81 a3 = this.a.a(t);
            if (a3 != null) {
                t = a3;
                z = true;
            }
            arrayList.add(t);
        }
        if (z) {
            return arrayList;
        }
        return null;
    }

    public b91 b(b91 b91) {
        b91 g;
        h.e(b91, "hubsViewModel");
        List<s81> a2 = a(b91.body());
        return (a2 == null || (g = b91.toBuilder().e(a2).g()) == null) ? b91 : g;
    }
}
