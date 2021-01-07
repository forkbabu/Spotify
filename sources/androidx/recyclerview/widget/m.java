package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class m {
    private static final Comparator<g> a = new a();

    static class a implements Comparator<g> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(g gVar, g gVar2) {
            g gVar3 = gVar;
            g gVar4 = gVar2;
            int i = gVar3.a - gVar4.a;
            return i == 0 ? gVar3.b - gVar4.b : i;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i, int i2);

        public abstract boolean b(int i, int i2);

        public Object c(int i, int i2) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class c {
        private final List<g> a;
        private final int[] b;
        private final int[] c;
        private final b d;
        private final int e;
        private final int f;
        private final boolean g;

        c(b bVar, List<g> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            int e2 = bVar.e();
            this.e = e2;
            int d2 = bVar.d();
            this.f = d2;
            this.g = z;
            g gVar = list.isEmpty() ? null : list.get(0);
            if (!(gVar != null && gVar.a == 0 && gVar.b == 0)) {
                g gVar2 = new g();
                gVar2.a = 0;
                gVar2.b = 0;
                gVar2.d = false;
                gVar2.c = 0;
                gVar2.e = false;
                list.add(0, gVar2);
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                g gVar3 = this.a.get(size);
                int i = gVar3.a;
                int i2 = gVar3.c;
                int i3 = i + i2;
                int i4 = gVar3.b + i2;
                if (this.g) {
                    while (e2 > i3) {
                        int i5 = e2 - 1;
                        if (this.b[i5] == 0) {
                            b(e2, d2, size, false);
                        }
                        e2 = i5;
                    }
                    while (d2 > i4) {
                        int i6 = d2 - 1;
                        if (this.c[i6] == 0) {
                            b(e2, d2, size, true);
                        }
                        d2 = i6;
                    }
                }
                for (int i7 = 0; i7 < gVar3.c; i7++) {
                    int i8 = gVar3.a + i7;
                    int i9 = gVar3.b + i7;
                    int i10 = this.d.a(i8, i9) ? 1 : 2;
                    this.b[i8] = (i9 << 5) | i10;
                    this.c[i9] = (i8 << 5) | i10;
                }
                e2 = gVar3.a;
                d2 = gVar3.b;
            }
        }

        private boolean b(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                g gVar = this.a.get(i3);
                int i6 = gVar.a;
                int i7 = gVar.c;
                int i8 = i6 + i7;
                int i9 = gVar.b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i4 - 1; i11 >= i8; i11--) {
                        if (this.d.b(i11, i5)) {
                            if (!this.d.a(i11, i5)) {
                                i10 = 4;
                            }
                            this.c[i5] = (i11 << 5) | 16;
                            this.b[i11] = (i5 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.d.b(i5, i12)) {
                            if (!this.d.a(i5, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.b[i13] = (i12 << 5) | 16;
                            this.c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = gVar.a;
                i2 = gVar.b;
                i3--;
            }
            return false;
        }

        private static e c(List<e> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                e eVar = list.get(size);
                if (eVar.a == i && eVar.c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        public void a(w wVar) {
            e eVar;
            int i;
            g gVar;
            if (wVar instanceof e) {
                eVar = (e) wVar;
            } else {
                eVar = new e(wVar);
            }
            ArrayList arrayList = new ArrayList();
            int i2 = this.e;
            int i3 = this.f;
            int size = this.a.size() - 1;
            while (size >= 0) {
                g gVar2 = this.a.get(size);
                int i4 = gVar2.c;
                int i5 = gVar2.a + i4;
                int i6 = gVar2.b + i4;
                int i7 = 4;
                if (i5 < i2) {
                    int i8 = i2 - i5;
                    if (!this.g) {
                        eVar.b(i5, i8);
                    } else {
                        int i9 = i8 - 1;
                        while (i9 >= 0) {
                            int[] iArr = this.b;
                            int i10 = i5 + i9;
                            int i11 = iArr[i10] & 31;
                            if (i11 == 0) {
                                i = size;
                                gVar = gVar2;
                                int i12 = 1;
                                eVar.b(i10, 1);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((e) it.next()).b -= i12;
                                    i12 = 1;
                                }
                            } else if (i11 == i7 || i11 == 8) {
                                int i13 = iArr[i10] >> 5;
                                e c2 = c(arrayList, i13, false);
                                i = size;
                                gVar = gVar2;
                                eVar.d(i10, c2.b - 1);
                                if (i11 == 4) {
                                    eVar.c(c2.b - 1, 1, this.d.c(i10, i13));
                                }
                            } else if (i11 == 16) {
                                arrayList.add(new e(i10, i10, true));
                                i = size;
                                gVar = gVar2;
                            } else {
                                StringBuilder W0 = je.W0("unknown flag for pos ", i10, " ");
                                W0.append(Long.toBinaryString((long) i11));
                                throw new IllegalStateException(W0.toString());
                            }
                            i9--;
                            i7 = 4;
                            size = i;
                            gVar2 = gVar;
                        }
                    }
                }
                g gVar3 = gVar2;
                if (i6 < i3) {
                    int i14 = i3 - i6;
                    if (this.g) {
                        while (true) {
                            i14--;
                            if (i14 < 0) {
                                break;
                            }
                            int[] iArr2 = this.c;
                            int i15 = i6 + i14;
                            int i16 = iArr2[i15] & 31;
                            if (i16 == 0) {
                                int i17 = 1;
                                eVar.a(i5, 1);
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((e) it2.next()).b += i17;
                                    i17 = 1;
                                }
                            } else if (i16 == 4 || i16 == 8) {
                                int i18 = iArr2[i15] >> 5;
                                eVar.d(c(arrayList, i18, true).b, i5);
                                if (i16 == 4) {
                                    eVar.c(i5, 1, this.d.c(i18, i15));
                                }
                            } else if (i16 == 16) {
                                arrayList.add(new e(i15, i5, false));
                            } else {
                                StringBuilder W02 = je.W0("unknown flag for pos ", i15, " ");
                                W02.append(Long.toBinaryString((long) i16));
                                throw new IllegalStateException(W02.toString());
                            }
                        }
                    } else {
                        eVar.a(i5, i14);
                    }
                }
                int i19 = i4 - 1;
                while (i19 >= 0) {
                    int[] iArr3 = this.b;
                    int i20 = gVar3.a + i19;
                    if ((iArr3[i20] & 31) == 2) {
                        eVar.c(i20, 1, this.d.c(i20, gVar3.b + i19));
                    }
                    i19--;
                    gVar3 = gVar3;
                }
                i2 = gVar3.a;
                i3 = gVar3.b;
                size--;
            }
            eVar.e();
        }
    }

    public static abstract class d<T> {
        public abstract boolean a(T t, T t2);

        public abstract boolean b(T t, T t2);
    }

    /* access modifiers changed from: private */
    public static class e {
        int a;
        int b;
        boolean c;

        public e(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static class f {
        int a;
        int b;
        int c;
        int d;

        public f() {
        }

        public f(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* access modifiers changed from: package-private */
    public static class g {
        int a;
        int b;
        int c;
        boolean d;
        boolean e;

        g() {
        }
    }

    public static c a(b bVar) {
        return b(bVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0090, code lost:
        if (r5[r20 - 1] < r5[r20 + 1]) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0117, code lost:
        r22 = r2;
        r20 = r3;
        r21 = r8;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0123, code lost:
        if (r2 > r9) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0125, code lost:
        r8 = r2 + r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0129, code lost:
        if (r8 == (r9 + r14)) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012d, code lost:
        if (r8 == (r6 + r14)) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012f, code lost:
        r11 = r0 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013b, code lost:
        if (r7[r11 - 1] >= r7[r11 + 1]) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0140, code lost:
        r11 = r7[(r0 + r8) + 1] - 1;
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014c, code lost:
        r11 = r7[(r0 + r8) - 1];
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0153, code lost:
        r15 = r11 - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0155, code lost:
        if (r11 <= 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0157, code lost:
        if (r15 <= 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0159, code lost:
        r25 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0167, code lost:
        if (r27.b((r10 + r11) - 1, (r12 + r15) - 1) == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0169, code lost:
        r11 = r11 - 1;
        r15 = r15 - 1;
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0171, code lost:
        r25 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0173, code lost:
        r3 = r0 + r8;
        r7[r3] = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0177, code lost:
        if (r4 != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0179, code lost:
        if (r8 < r6) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017b, code lost:
        if (r8 > r9) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0181, code lost:
        if (r5[r3] < r7[r3]) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0183, code lost:
        r2 = new androidx.recyclerview.widget.m.g();
        r4 = r7[r3];
        r2.a = r4;
        r2.b = r4 - r8;
        r2.c = r5[r3] - r7[r3];
        r2.d = r13;
        r2.e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019c, code lost:
        r2 = r2 + 2;
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a2, code lost:
        r9 = r9 + 1;
        r15 = r15;
        r3 = r20;
        r8 = r21;
        r2 = r22;
        r11 = r11;
        r13 = r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.m.c b(androidx.recyclerview.widget.m.b r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 653
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.b(androidx.recyclerview.widget.m$b, boolean):androidx.recyclerview.widget.m$c");
    }
}
