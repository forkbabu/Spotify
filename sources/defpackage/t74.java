package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: t74  reason: default package */
public final class t74 {
    private static void a(List<Integer> list, int i) {
        if (i != 0 && s2.b(i, -16777216) >= 3.0d) {
            list.add(Integer.valueOf(i));
        }
    }

    public static int b(e7 e7Var) {
        LinkedList linkedList = new LinkedList();
        if (e7Var != null) {
            a(linkedList, e7Var.j(0));
            a(linkedList, e7Var.h(0));
            a(linkedList, e7Var.g(0));
            a(linkedList, e7Var.f(0));
            a(linkedList, e7Var.d(0));
            a(linkedList, e7Var.c(0));
            a(linkedList, e7Var.e(0));
        }
        if (!linkedList.isEmpty()) {
            return ovd.a(((Integer) linkedList.get(0)).intValue(), 0.5f);
        }
        return -14145496;
    }
}
