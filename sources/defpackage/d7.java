package defpackage;

import android.graphics.Color;
import defpackage.e7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* access modifiers changed from: package-private */
/* renamed from: d7  reason: default package */
public final class d7 {
    private static final Comparator<b> f = new a();
    final int[] a;
    final int[] b;
    final List<e7.e> c;
    final e7.c[] d;
    private final float[] e = new float[3];

    /* renamed from: d7$a */
    static class a implements Comparator<b> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(b bVar, b bVar2) {
            return bVar2.d() - bVar.d();
        }
    }

    /* renamed from: d7$b */
    private class b {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
            b();
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            return (this.b + 1) - this.a > 1;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            d7 d7Var = d7.this;
            int[] iArr = d7Var.a;
            int[] iArr2 = d7Var.b;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = 0;
            for (int i9 = this.a; i9 <= this.b; i9++) {
                int i10 = iArr[i9];
                i8 += iArr2[i10];
                int i11 = (i10 >> 10) & 31;
                int i12 = (i10 >> 5) & 31;
                int i13 = i10 & 31;
                if (i11 > i5) {
                    i5 = i11;
                }
                if (i11 < i2) {
                    i2 = i11;
                }
                if (i12 > i6) {
                    i6 = i12;
                }
                if (i12 < i3) {
                    i3 = i12;
                }
                if (i13 > i7) {
                    i7 = i13;
                }
                if (i13 < i4) {
                    i4 = i13;
                }
            }
            this.d = i2;
            this.e = i5;
            this.f = i3;
            this.g = i6;
            this.h = i4;
            this.i = i7;
            this.c = i8;
        }

        /* access modifiers changed from: package-private */
        public final e7.e c() {
            d7 d7Var = d7.this;
            int[] iArr = d7Var.a;
            int[] iArr2 = d7Var.b;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = this.a; i6 <= this.b; i6++) {
                int i7 = iArr[i6];
                int i8 = iArr2[i7];
                i3 += i8;
                i2 += ((i7 >> 10) & 31) * i8;
                i4 += ((i7 >> 5) & 31) * i8;
                i5 += i8 * (i7 & 31);
            }
            float f2 = (float) i3;
            return new e7.e(d7.a(Math.round(((float) i2) / f2), Math.round(((float) i4) / f2), Math.round(((float) i5) / f2)), i3);
        }

        /* access modifiers changed from: package-private */
        public final int d() {
            return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
        }

        /* access modifiers changed from: package-private */
        public final b e() {
            int i2;
            int i3 = this.b;
            int i4 = this.a;
            int i5 = 0;
            if ((i3 + 1) - i4 > 1) {
                int i6 = this.e - this.d;
                int i7 = this.g - this.f;
                int i8 = this.i - this.h;
                int i9 = (i6 < i7 || i6 < i8) ? (i7 < i6 || i7 < i8) ? -1 : -2 : -3;
                d7 d7Var = d7.this;
                int[] iArr = d7Var.a;
                int[] iArr2 = d7Var.b;
                d7.b(iArr, i9, i4, i3);
                Arrays.sort(iArr, this.a, this.b + 1);
                d7.b(iArr, i9, this.a, this.b);
                int i10 = this.c / 2;
                int i11 = this.a;
                while (true) {
                    int i12 = this.b;
                    if (i11 > i12) {
                        i2 = this.a;
                        break;
                    }
                    i5 += iArr2[iArr[i11]];
                    if (i5 >= i10) {
                        i2 = Math.min(i12 - 1, i11);
                        break;
                    }
                    i11++;
                }
                b bVar = new b(i2 + 1, this.b);
                this.b = i2;
                b();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    d7(int[] iArr, int i, e7.c[] cVarArr) {
        b bVar;
        this.d = cVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int c2 = c(Color.blue(i3), 8, 5) | (c(Color.red(i3), 8, 5) << 10) | (c(Color.green(i3), 8, 5) << 5);
            iArr[i2] = c2;
            iArr2[c2] = iArr2[c2] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int a2 = a((i5 >> 10) & 31, (i5 >> 5) & 31, i5 & 31);
                float[] fArr = this.e;
                int i6 = s2.b;
                s2.a(Color.red(a2), Color.green(a2), Color.blue(a2), fArr);
                if (d(a2, this.e)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i4 <= i) {
            this.c = new ArrayList();
            for (int i9 = 0; i9 < i4; i9++) {
                int i10 = iArr3[i9];
                this.c.add(new e7.e(a((i10 >> 10) & 31, (i10 >> 5) & 31, i10 & 31), iArr2[i10]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f);
        priorityQueue.offer(new b(0, this.a.length - 1));
        while (priorityQueue.size() < i && (bVar = (b) priorityQueue.poll()) != null && bVar.a()) {
            priorityQueue.offer(bVar.e());
            priorityQueue.offer(bVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            e7.e c3 = ((b) it.next()).c();
            if (!d(c3.d(), c3.b())) {
                arrayList.add(c3);
            }
        }
        this.c = arrayList;
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(c(i, 5, 8), c(i2, 5, 8), c(i3, 5, 8));
    }

    static void b(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    private static int c(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private boolean d(int i, float[] fArr) {
        e7.c[] cVarArr = this.d;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.d[i2].a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
