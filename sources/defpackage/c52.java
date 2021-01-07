package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: c52  reason: default package */
public final class c52 implements i52 {
    private final String b;

    private c52(String str) {
        this.b = str;
    }

    public static c52 c(String str) {
        return new c52(str);
    }

    @Override // defpackage.i52
    public boolean a(String str) {
        return this.b.length() == str.length();
    }

    @Override // defpackage.i52
    public boolean b(String str) {
        return this.b.equals(str);
    }
}
