package defpackage;

/* renamed from: j50  reason: default package */
public abstract class j50 {
    public static j50 a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new g50(cls.getSimpleName());
        }
        return new h50(cls.getSimpleName());
    }

    public abstract void b(String str);

    public abstract void c(String str);

    public abstract void d(String str);
}
