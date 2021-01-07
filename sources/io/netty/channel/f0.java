package io.netty.channel;

import io.netty.buffer.j;
import io.netty.buffer.l;
import io.netty.channel.m0;

public final class f0 implements m0 {
    public static final m0 b = new f0(8);
    private final m0.a a;

    /* access modifiers changed from: private */
    public static final class b implements m0.a {
        private final int a;

        b(int i, a aVar) {
            this.a = i;
        }

        public int a(Object obj) {
            if (obj instanceof j) {
                return ((j) obj).m1();
            }
            if (obj instanceof l) {
                return ((l) obj).content().m1();
            }
            if (obj instanceof k0) {
                return 0;
            }
            return this.a;
        }
    }

    public f0(int i) {
        if (i >= 0) {
            this.a = new b(i, null);
            return;
        }
        throw new IllegalArgumentException(je.q0("unknownSize: ", i, " (expected: >= 0)"));
    }

    @Override // io.netty.channel.m0
    public m0.a a() {
        return this.a;
    }
}
