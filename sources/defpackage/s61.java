package defpackage;

import android.util.SparseArray;
import defpackage.s51;
import java.util.ArrayList;

/* renamed from: s61  reason: default package */
public class s61 {
    private final SparseArray<b> a;
    private final w51 b;
    private final r61 c;
    private final s51.b d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s61(defpackage.w51 r3) {
        /*
            r2 = this;
            r61 r0 = new r61
            r0.<init>(r3)
            k61 r1 = new k61
            r1.<init>(r0)
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s61.<init>(w51):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.w61<?> a(defpackage.w61<?> r4, defpackage.s81 r5, android.view.ViewGroup r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0017
            r61 r1 = r3.c
            v61 r1 = r1.b(r5)
            int r1 = r1.a()
            int r2 = r4.c()
            if (r1 != r2) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            r3.c(r4)
        L_0x0017:
            r4 = r0
        L_0x0018:
            if (r4 != 0) goto L_0x0046
            r61 r4 = r3.c
            v61 r4 = r4.b(r5)
            int r4 = r4.a()
            android.util.SparseArray<s61$b> r1 = r3.a
            java.lang.Object r1 = r1.get(r4)
            s61$b r1 = (defpackage.s61.b) r1
            if (r1 != 0) goto L_0x0038
            s61$b r1 = new s61$b
            r1.<init>(r0)
            android.util.SparseArray<s61$b> r0 = r3.a
            r0.put(r4, r1)
        L_0x0038:
            w61 r0 = r1.a()
            if (r0 == 0) goto L_0x0040
            r4 = r0
            goto L_0x0046
        L_0x0040:
            w51 r0 = r3.b
            w61 r4 = defpackage.w61.b(r4, r6, r0)
        L_0x0046:
            r61 r6 = r3.c
            v61 r5 = r6.b(r5)
            s81 r5 = r5.b()
            s51$b r6 = r3.d
            r4.a(r7, r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s61.a(w61, s81, android.view.ViewGroup, int):w61");
    }

    /* access modifiers changed from: package-private */
    public r61 b() {
        return this.c;
    }

    public void c(w61<?> w61) {
        this.a.get(w61.c()).b(w61);
    }

    /* access modifiers changed from: private */
    /* renamed from: s61$b */
    public static final class b {
        private final ArrayList<w61<?>> a = new ArrayList<>(5);
        private int b = 5;

        private b() {
        }

        /* access modifiers changed from: package-private */
        public w61<?> a() {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<w61<?>> arrayList = this.a;
            return arrayList.remove(arrayList.size() - 1);
        }

        public boolean b(w61<?> w61) {
            return this.a.size() < this.b && this.a.add(w61);
        }

        b(a aVar) {
        }
    }

    s61(w51 w51, r61 r61, s51.b bVar) {
        this.a = new SparseArray<>();
        w51.getClass();
        this.b = w51;
        r61.getClass();
        this.c = r61;
        this.d = bVar;
    }
}
