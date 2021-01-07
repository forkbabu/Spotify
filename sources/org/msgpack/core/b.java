package org.msgpack.core;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

public class b {
    public static final Charset a = Charset.forName(Constants.ENCODING);
    static final a b = new C0663b().a();

    public static class a {
        private final boolean a;
        private final boolean b;
        private final CodingErrorAction c;
        private final CodingErrorAction d;
        private final int e;
        private final int f;

        public a(boolean z, boolean z2, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2, int i, int i2, int i3, int i4, int i5) {
            boolean z3 = true;
            boolean z4 = i4 > 0;
            yif.e(z4, "packer buffer size must be larger than 0: " + i4);
            boolean z5 = i2 > 0;
            yif.e(z5, "string encoder buffer size must be larger than 0: " + i2);
            z3 = i3 <= 0 ? false : z3;
            yif.e(z3, "string decoder buffer size must be larger than 0: " + i3);
            this.a = z;
            this.b = z2;
            this.c = codingErrorAction;
            this.d = codingErrorAction2;
            this.e = i4;
            this.f = i5;
        }

        public CodingErrorAction a() {
            return this.c;
        }

        public CodingErrorAction b() {
            return this.d;
        }

        public int c() {
            return this.e;
        }

        public int d() {
            return this.f;
        }

        public boolean e() {
            return this.b;
        }

        public boolean f() {
            return this.a;
        }
    }

    /* renamed from: org.msgpack.core.b$b  reason: collision with other inner class name */
    public static class C0663b {
        private CodingErrorAction a;
        private CodingErrorAction b;
        private int c = Integer.MAX_VALUE;
        private int d = 8192;
        private int e = 8192;
        private int f = 8192;
        private int g = 512;

        public C0663b() {
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.a = codingErrorAction;
            this.b = codingErrorAction;
        }

        public a a() {
            return new a(true, true, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}
