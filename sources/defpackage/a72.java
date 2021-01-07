package defpackage;

/* renamed from: a72  reason: default package */
public final class a72 implements b72 {
    public static final a72 b = new a72("appload");
    private final String a;

    private a72(String str) {
        this.a = str;
    }

    public static a72 b(String str) {
        return new a72(str);
    }

    @Override // defpackage.b72
    public String a() {
        return this.a;
    }
}
