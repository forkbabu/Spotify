package io.netty.handler.codec.http;

import io.netty.util.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c0 {
    @Deprecated
    static final k a = new k();
    public static final /* synthetic */ int b = 0;

    static {
        String str = ((Object) q.a) + "=";
        if (str.getClass() == c.class) {
            c cVar = (c) str;
        } else {
            new c(str);
        }
        if (";".getClass() != c.class) {
            new c(";");
        }
    }

    public static boolean a(t tVar) {
        return tVar.f().f(p.l, q.b, true);
    }

    public static void b(t tVar, boolean z) {
        if (z) {
            tVar.f().c(p.l, q.b);
            tVar.f().t(p.c);
            return;
        }
        List<String> l = tVar.f().l(p.l);
        if (!l.isEmpty()) {
            ArrayList arrayList = new ArrayList(l);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (q.b.i((CharSequence) it.next())) {
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                tVar.f().t(p.l);
            } else {
                tVar.f().x(p.l, arrayList);
            }
        }
    }
}
