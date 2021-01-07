package defpackage;

/* renamed from: y0b  reason: default package */
public final class y0b {
    public static boolean a(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        if (str.isEmpty() && str2.isEmpty() && !str3.isEmpty()) {
            return false;
        }
        if (str2.equals(str3)) {
            return true;
        }
        if (!str.startsWith(str3) && !str3.startsWith(str)) {
            return false;
        }
        if (str2.isEmpty() || ((!str.startsWith(str2) && !str2.startsWith(str)) || Math.abs(str.length() - str3.length()) < Math.abs(str.length() - str2.length()))) {
            return true;
        }
        return false;
    }
}
