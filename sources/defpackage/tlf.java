package defpackage;

/* renamed from: tlf  reason: default package */
public interface tlf {
    public static final int a = Integer.getInteger("jctools.cacheLineSize", 64).intValue();

    static {
        ulf.a.pageSize();
        Runtime.getRuntime().availableProcessors();
    }
}
