package defpackage;

/* renamed from: fj9  reason: default package */
public abstract class fj9 implements ej9 {
    public static fj9 b(String str, String str2) {
        return new yi9(str, str2, null, null);
    }

    public abstract String a();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public fj9 f(String str) {
        return new yi9(d(), e(), str, a());
    }

    public fj9 g(String str) {
        return new yi9(d(), str, c(), a());
    }
}
