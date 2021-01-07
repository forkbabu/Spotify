package defpackage;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: sq9  reason: default package */
public final class sq9 {
    private static final Pattern a = Pattern.compile("^#([A-Fa-f0-9]{6})$");

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
            a(linkedList, e7Var.e(0));
            a(linkedList, e7Var.g(0));
            a(linkedList, e7Var.f(0));
            a(linkedList, e7Var.d(0));
            a(linkedList, e7Var.c(0));
        }
        if (!linkedList.isEmpty()) {
            return ((Integer) linkedList.get(0)).intValue();
        }
        return -1;
    }

    public static boolean c(String str) {
        return str != null && a.matcher(str).matches();
    }
}
