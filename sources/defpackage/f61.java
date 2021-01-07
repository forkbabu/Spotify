package defpackage;

/* renamed from: f61  reason: default package */
public final class f61 {
    private final b91 a;
    private final q51 b;
    private final boolean c;

    /* renamed from: f61$b */
    public static final class b {
        private final b91 a;
        private q51 b = new z51();
        private boolean c;

        public b(b91 b91) {
            this.a = b91;
        }

        public f61 a() {
            return new f61(this.a, this.b, this.c, null);
        }

        public b b(boolean z) {
            this.c = z;
            return this;
        }

        public b c(q51 q51) {
            this.b = q51;
            return this;
        }
    }

    f61(b91 b91, q51 q51, boolean z, a aVar) {
        this.a = b91;
        this.b = q51;
        this.c = z;
    }

    public b91 a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public q51 c() {
        return this.b;
    }
}
