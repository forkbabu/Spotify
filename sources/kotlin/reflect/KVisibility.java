package kotlin.reflect;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class KVisibility extends Enum<KVisibility> {
    private static final /* synthetic */ KVisibility[] a = {new KVisibility("PUBLIC", 0), new KVisibility("PROTECTED", 1), new KVisibility("INTERNAL", 2), new KVisibility("PRIVATE", 3)};

    private KVisibility(String str, int i) {
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) a.clone();
    }
}
