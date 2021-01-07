package kotlin.coroutines.intrinsics;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class CoroutineSingletons extends Enum<CoroutineSingletons> {
    public static final CoroutineSingletons a;
    private static final /* synthetic */ CoroutineSingletons[] b;

    static {
        CoroutineSingletons coroutineSingletons = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        a = coroutineSingletons;
        b = new CoroutineSingletons[]{coroutineSingletons, new CoroutineSingletons("UNDECIDED", 1), new CoroutineSingletons("RESUMED", 2)};
    }

    private CoroutineSingletons(String str, int i) {
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) b.clone();
    }
}
