package defpackage;

import kotlin.jvm.internal.f;

/* renamed from: iq6  reason: default package */
public abstract class iq6 {

    /* renamed from: iq6$a */
    public static final class a extends iq6 {
        private final int a;

        public a() {
            this(0, 1);
        }

        public a(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, int i2) {
            super(null);
            i = (i2 & 1) != 0 ? 30 : i;
            this.a = i;
        }
    }

    /* renamed from: iq6$b */
    public static final class b extends iq6 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private iq6() {
    }

    public iq6(f fVar) {
    }
}
