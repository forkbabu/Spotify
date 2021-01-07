package defpackage;

/* renamed from: z62  reason: default package */
public final class z62 implements b72 {
    public static final z62 b = new z62("endplay");
    public static final z62 c = new z62("trackdone");
    public static final z62 d = new z62("trackerror");
    public static final z62 e = new z62("unexpected-exit");
    public static final z62 f = new z62("unexpected-exit-while-paused");
    public static final z62 g = new z62("unknown");
    private final String a;

    private z62(String str) {
        this.a = str;
    }

    @Override // defpackage.b72
    public String a() {
        return this.a;
    }
}
