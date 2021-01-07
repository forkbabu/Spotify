package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.h;
import kotlin.sequences.e;

/* access modifiers changed from: package-private */
public final class b implements e<jnf> {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final rmf<CharSequence, Integer, Pair<Integer, Integer>> d;

    public static final class a implements Iterator<jnf>, zmf {
        private int a = -1;
        private int b;
        private int c;
        private jnf f;
        private int n;
        final /* synthetic */ b o;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.o = bVar;
            int c2 = knf.c(bVar.b, 0, bVar.a.length());
            this.b = c2;
            this.c = c2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < r6.o.c) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.a = r1
                r0 = 0
                r6.f = r0
                goto L_0x009e
            L_0x000c:
                kotlin.text.b r0 = r6.o
                int r0 = kotlin.text.b.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.n
                int r0 = r0 + r3
                r6.n = r0
                kotlin.text.b r4 = r6.o
                int r4 = kotlin.text.b.d(r4)
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.c
                kotlin.text.b r4 = r6.o
                java.lang.CharSequence r4 = kotlin.text.b.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                int r0 = r6.b
                jnf r1 = new jnf
                kotlin.text.b r4 = r6.o
                java.lang.CharSequence r4 = kotlin.text.b.c(r4)
                int r4 = kotlin.text.e.g(r4)
                r1.<init>(r0, r4)
                r6.f = r1
                r6.c = r2
                goto L_0x009c
            L_0x0047:
                kotlin.text.b r0 = r6.o
                rmf r0 = kotlin.text.b.b(r0)
                kotlin.text.b r4 = r6.o
                java.lang.CharSequence r4 = kotlin.text.b.c(r4)
                int r5 = r6.c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x0077
                int r0 = r6.b
                jnf r1 = new jnf
                kotlin.text.b r4 = r6.o
                java.lang.CharSequence r4 = kotlin.text.b.c(r4)
                int r4 = kotlin.text.e.g(r4)
                r1.<init>(r0, r4)
                r6.f = r1
                r6.c = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.b
                jnf r4 = defpackage.knf.e(r4, r2)
                r6.f = r4
                int r2 = r2 + r0
                r6.b = r2
                if (r0 != 0) goto L_0x0099
                r1 = 1
            L_0x0099:
                int r2 = r2 + r1
                r6.c = r2
            L_0x009c:
                r6.a = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.b.a.a():void");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == -1) {
                a();
            }
            return this.a == 1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public jnf next() {
            if (this.a == -1) {
                a();
            }
            if (this.a != 0) {
                jnf jnf = this.f;
                if (jnf != null) {
                    this.f = null;
                    this.a = -1;
                    return jnf;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: rmf<? super java.lang.CharSequence, ? super java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence charSequence, int i, int i2, rmf<? super CharSequence, ? super Integer, Pair<Integer, Integer>> rmf) {
        h.e(charSequence, "input");
        h.e(rmf, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = rmf;
    }

    @Override // kotlin.sequences.e
    public Iterator<jnf> iterator() {
        return new a(this);
    }
}
