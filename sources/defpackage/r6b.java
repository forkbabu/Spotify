package defpackage;

/* renamed from: r6b  reason: default package */
public final class r6b {
    private static boolean a(String str) {
        str.getClass();
        return str.isEmpty();
    }

    public static boolean b(p6b p6b, p6b p6b2, p6b p6b3) {
        p6b3.getClass();
        p6b2.getClass();
        p6b.getClass();
        String c = p6b.c();
        String c2 = p6b2.c();
        String c3 = p6b3.c();
        if ((a(c) && a(c2) && !a(c3)) || p6b3.b() != p6b.b()) {
            return false;
        }
        if (c2.equals(c3)) {
            return true;
        }
        if (!c.startsWith(c3) && !c3.startsWith(c)) {
            return false;
        }
        if (c2.isEmpty() || ((!c.startsWith(c2) && !c2.startsWith(c)) || Math.abs(c.length() - c3.length()) < Math.abs(c.length() - c2.length()))) {
            return true;
        }
        return false;
    }
}
