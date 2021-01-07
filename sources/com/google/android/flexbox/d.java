package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public class d {
    private final a a;
    private boolean[] b;
    int[] c;
    long[] d;
    private long[] e;

    static class b {
        List<c> a;
        int b;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a = null;
            this.b = 0;
        }
    }

    /* access modifiers changed from: private */
    public static class c implements Comparable<c> {
        int a;
        int b;

        private c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            c cVar2 = cVar;
            int i = this.b;
            int i2 = cVar2.b;
            if (i != i2) {
                return i - i2;
            }
            return this.a - cVar2.a;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("Order{order=");
            V0.append(this.b);
            V0.append(", index=");
            return je.A0(V0, this.a, '}');
        }

        c(a aVar) {
        }
    }

    d(a aVar) {
        this.a = aVar;
    }

    private int[] A(int i, List<c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (c cVar : list) {
            int i3 = cVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, cVar.b);
            i2++;
        }
        return iArr;
    }

    private void B(View view, int i, int i2) {
        int i3;
        b bVar = (b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bVar.z1()) - bVar.X1()) - this.a.l(view), bVar.Q()), bVar.T0());
        long[] jArr = this.e;
        if (jArr != null) {
            i3 = o(jArr[i2]);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        E(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.a.p(i2, view);
    }

    private void C(View view, int i, int i2) {
        int i3;
        b bVar = (b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bVar.h0()) - bVar.w1()) - this.a.l(view), bVar.a2()), bVar.e2());
        long[] jArr = this.e;
        if (jArr != null) {
            i3 = (int) jArr[i2];
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        E(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.a.p(i2, view);
    }

    private void E(int i, int i2, int i3, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }

    private void a(List<c> list, c cVar, int i, int i2) {
        cVar.m = i2;
        this.a.n(cVar);
        cVar.p = i;
        list.add(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.Q()
            r4 = 1
            if (r1 >= r3) goto L_0x001a
            int r1 = r0.Q()
            goto L_0x0024
        L_0x001a:
            int r3 = r0.T0()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.T0()
        L_0x0024:
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.a2()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.a2()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.e2()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.e2()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.E(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.a
            r0.p(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.d.c(android.view.View, int):void");
    }

    private List<c> e(List<c> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        cVar.g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private List<c> f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            c cVar = new c(null);
            cVar.b = ((b) this.a.j(i2).getLayoutParams()).getOrder();
            cVar.a = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void n(int i, int i2, c cVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d2;
        int i8;
        double d3;
        float f = cVar.j;
        float f2 = 0.0f;
        if (f > 0.0f && i3 >= (i5 = cVar.e)) {
            float f3 = ((float) (i3 - i5)) / f;
            cVar.e = i4 + cVar.f;
            if (!z) {
                cVar.g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < cVar.h) {
                int i11 = cVar.o + i9;
                View o = this.a.o(i11);
                if (o == null || o.getVisibility() == 8) {
                    i6 = i5;
                } else {
                    b bVar = (b) o.getLayoutParams();
                    int flexDirection = this.a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int measuredWidth = o.getMeasuredWidth();
                        long[] jArr = this.e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i11];
                        }
                        int measuredHeight = o.getMeasuredHeight();
                        long[] jArr2 = this.e;
                        i6 = i5;
                        if (jArr2 != null) {
                            measuredHeight = o(jArr2[i11]);
                        }
                        if (!this.b[i11] && bVar.o0() > 0.0f) {
                            float o0 = (bVar.o0() * f3) + ((float) measuredWidth);
                            if (i9 == cVar.h - 1) {
                                o0 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(o0);
                            if (round > bVar.T0()) {
                                round = bVar.T0();
                                this.b[i11] = true;
                                cVar.j -= bVar.o0();
                                z2 = true;
                            } else {
                                float f5 = (o0 - ((float) round)) + f4;
                                double d4 = (double) f5;
                                if (d4 > 1.0d) {
                                    round++;
                                    Double.isNaN(d4);
                                    Double.isNaN(d4);
                                    d2 = d4 - 1.0d;
                                } else {
                                    if (d4 < -1.0d) {
                                        round--;
                                        Double.isNaN(d4);
                                        Double.isNaN(d4);
                                        d2 = d4 + 1.0d;
                                    }
                                    f4 = f5;
                                }
                                f5 = (float) d2;
                                f4 = f5;
                            }
                            int p = p(i2, bVar, cVar.m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            o.measure(makeMeasureSpec, p);
                            int measuredWidth2 = o.getMeasuredWidth();
                            int measuredHeight2 = o.getMeasuredHeight();
                            E(i11, makeMeasureSpec, p, o);
                            this.a.p(i11, o);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i10, measuredHeight + bVar.h0() + bVar.w1() + this.a.l(o));
                        cVar.e = measuredWidth + bVar.z1() + bVar.X1() + cVar.e;
                        i7 = max;
                    } else {
                        int measuredHeight3 = o.getMeasuredHeight();
                        long[] jArr3 = this.e;
                        if (jArr3 != null) {
                            measuredHeight3 = o(jArr3[i11]);
                        }
                        int measuredWidth3 = o.getMeasuredWidth();
                        long[] jArr4 = this.e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i11];
                        }
                        if (this.b[i11] || bVar.o0() <= f2) {
                            i8 = i5;
                        } else {
                            float o02 = (bVar.o0() * f3) + ((float) measuredHeight3);
                            if (i9 == cVar.h - 1) {
                                o02 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(o02);
                            if (round2 > bVar.e2()) {
                                round2 = bVar.e2();
                                this.b[i11] = true;
                                cVar.j -= bVar.o0();
                                i8 = i5;
                                z2 = true;
                            } else {
                                float f6 = (o02 - ((float) round2)) + f4;
                                i8 = i5;
                                double d5 = (double) f6;
                                if (d5 > 1.0d) {
                                    round2++;
                                    Double.isNaN(d5);
                                    Double.isNaN(d5);
                                    d3 = d5 - 1.0d;
                                } else if (d5 < -1.0d) {
                                    round2--;
                                    Double.isNaN(d5);
                                    Double.isNaN(d5);
                                    d3 = d5 + 1.0d;
                                } else {
                                    f4 = f6;
                                }
                                f4 = (float) d3;
                            }
                            int q = q(i, bVar, cVar.m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            o.measure(q, makeMeasureSpec2);
                            measuredWidth3 = o.getMeasuredWidth();
                            int measuredHeight4 = o.getMeasuredHeight();
                            E(i11, q, makeMeasureSpec2, o);
                            this.a.p(i11, o);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i10, measuredWidth3 + bVar.z1() + bVar.X1() + this.a.l(o));
                        cVar.e = measuredHeight3 + bVar.h0() + bVar.w1() + cVar.e;
                        i6 = i8;
                    }
                    cVar.g = Math.max(cVar.g, i7);
                    i10 = i7;
                }
                i9++;
                i5 = i6;
                f2 = 0.0f;
            }
            if (z2 && i5 != cVar.e) {
                n(i, i2, cVar, i3, i4, true);
            }
        }
    }

    private int p(int i, b bVar, int i2) {
        a aVar = this.a;
        int k = aVar.k(i, aVar.getPaddingTop() + this.a.getPaddingBottom() + bVar.h0() + bVar.w1() + i2, bVar.getHeight());
        int size = View.MeasureSpec.getSize(k);
        if (size > bVar.e2()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.e2(), View.MeasureSpec.getMode(k));
        }
        return size < bVar.a2() ? View.MeasureSpec.makeMeasureSpec(bVar.a2(), View.MeasureSpec.getMode(k)) : k;
    }

    private int q(int i, b bVar, int i2) {
        a aVar = this.a;
        int h = aVar.h(i, aVar.getPaddingLeft() + this.a.getPaddingRight() + bVar.z1() + bVar.X1() + i2, bVar.getWidth());
        int size = View.MeasureSpec.getSize(h);
        if (size > bVar.T0()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.T0(), View.MeasureSpec.getMode(h));
        }
        return size < bVar.Q() ? View.MeasureSpec.makeMeasureSpec(bVar.Q(), View.MeasureSpec.getMode(h)) : h;
    }

    private int r(b bVar, boolean z) {
        if (z) {
            return bVar.w1();
        }
        return bVar.X1();
    }

    private int s(b bVar, boolean z) {
        if (z) {
            return bVar.X1();
        }
        return bVar.w1();
    }

    private int t(b bVar, boolean z) {
        if (z) {
            return bVar.h0();
        }
        return bVar.z1();
    }

    private int u(b bVar, boolean z) {
        if (z) {
            return bVar.z1();
        }
        return bVar.h0();
    }

    private boolean v(int i, int i2, c cVar) {
        return i == i2 - 1 && cVar.a() != 0;
    }

    private void z(int i, int i2, c cVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = cVar.e;
        float f = cVar.k;
        float f2 = 0.0f;
        if (f > 0.0f && i3 <= i9) {
            float f3 = ((float) (i9 - i3)) / f;
            cVar.e = i4 + cVar.f;
            if (!z) {
                cVar.g = Integer.MIN_VALUE;
            }
            int i10 = 0;
            boolean z2 = false;
            int i11 = 0;
            float f4 = 0.0f;
            while (i10 < cVar.h) {
                int i12 = cVar.o + i10;
                View o = this.a.o(i12);
                if (o == null || o.getVisibility() == 8) {
                    i6 = i9;
                    i5 = i10;
                } else {
                    b bVar = (b) o.getLayoutParams();
                    int flexDirection = this.a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i6 = i9;
                        int measuredWidth = o.getMeasuredWidth();
                        long[] jArr = this.e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i12];
                        }
                        int measuredHeight = o.getMeasuredHeight();
                        long[] jArr2 = this.e;
                        if (jArr2 != null) {
                            measuredHeight = o(jArr2[i12]);
                        }
                        if (this.b[i12] || bVar.M() <= 0.0f) {
                            i5 = i10;
                        } else {
                            float M = ((float) measuredWidth) - (bVar.M() * f3);
                            i5 = i10;
                            if (i5 == cVar.h - 1) {
                                M += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(M);
                            if (round < bVar.Q()) {
                                i8 = bVar.Q();
                                this.b[i12] = true;
                                cVar.k -= bVar.M();
                                z2 = true;
                            } else {
                                float f5 = (M - ((float) round)) + f4;
                                double d2 = (double) f5;
                                if (d2 > 1.0d) {
                                    round++;
                                    f5 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round--;
                                    f5 += 1.0f;
                                }
                                f4 = f5;
                                i8 = round;
                            }
                            int p = p(i2, bVar, cVar.m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                            o.measure(makeMeasureSpec, p);
                            int measuredWidth2 = o.getMeasuredWidth();
                            int measuredHeight2 = o.getMeasuredHeight();
                            E(i12, makeMeasureSpec, p, o);
                            this.a.p(i12, o);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i11, measuredHeight + bVar.h0() + bVar.w1() + this.a.l(o));
                        cVar.e = measuredWidth + bVar.z1() + bVar.X1() + cVar.e;
                        i7 = max;
                    } else {
                        int measuredHeight3 = o.getMeasuredHeight();
                        long[] jArr3 = this.e;
                        if (jArr3 != null) {
                            measuredHeight3 = o(jArr3[i12]);
                        }
                        int measuredWidth3 = o.getMeasuredWidth();
                        long[] jArr4 = this.e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i12];
                        }
                        if (this.b[i12] || bVar.M() <= f2) {
                            i6 = i9;
                            i5 = i10;
                        } else {
                            float M2 = ((float) measuredHeight3) - (bVar.M() * f3);
                            if (i10 == cVar.h - 1) {
                                M2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(M2);
                            if (round2 < bVar.a2()) {
                                int a2 = bVar.a2();
                                this.b[i12] = true;
                                cVar.k -= bVar.M();
                                i5 = i10;
                                round2 = a2;
                                z2 = true;
                                i6 = i9;
                            } else {
                                float f6 = (M2 - ((float) round2)) + f4;
                                i6 = i9;
                                i5 = i10;
                                double d3 = (double) f6;
                                if (d3 > 1.0d) {
                                    round2++;
                                    f6 -= 1.0f;
                                } else if (d3 < -1.0d) {
                                    round2--;
                                    f6 += 1.0f;
                                }
                                f4 = f6;
                            }
                            int q = q(i, bVar, cVar.m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            o.measure(q, makeMeasureSpec2);
                            measuredWidth3 = o.getMeasuredWidth();
                            int measuredHeight4 = o.getMeasuredHeight();
                            E(i12, q, makeMeasureSpec2, o);
                            this.a.p(i12, o);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i11, measuredWidth3 + bVar.z1() + bVar.X1() + this.a.l(o));
                        cVar.e = measuredHeight3 + bVar.h0() + bVar.w1() + cVar.e;
                    }
                    cVar.g = Math.max(cVar.g, i7);
                    i11 = i7;
                }
                i10 = i5 + 1;
                i9 = i6;
                f2 = 0.0f;
            }
            if (z2 && i9 != cVar.e) {
                z(i, i2, cVar, i3, i4, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D(int i) {
        View o;
        if (i < this.a.getFlexItemCount()) {
            int flexDirection = this.a.getFlexDirection();
            if (this.a.getAlignItems() == 4) {
                int[] iArr = this.c;
                List<c> flexLinesInternal = this.a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                    c cVar = flexLinesInternal.get(i2);
                    int i3 = cVar.h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = cVar.o + i4;
                        if (!(i4 >= this.a.getFlexItemCount() || (o = this.a.o(i5)) == null || o.getVisibility() == 8)) {
                            b bVar = (b) o.getLayoutParams();
                            if (bVar.I() == -1 || bVar.I() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    C(o, cVar.g, i5);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    B(o, cVar.g, i5);
                                } else {
                                    throw new IllegalArgumentException(je.p0("Invalid flex direction: ", flexDirection));
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (c cVar2 : this.a.getFlexLinesInternal()) {
                Iterator<Integer> it = cVar2.n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next = it.next();
                        View o2 = this.a.o(next.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            C(o2, cVar2.g, next.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            B(o2, cVar2.g, next.intValue());
                        } else {
                            throw new IllegalArgumentException(je.p0("Invalid flex direction: ", flexDirection));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x022a, code lost:
        if (r2 < (r8 + r11)) goto L_0x022c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03c3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.flexbox.d.b r24, int r25, int r26, int r27, int r28, int r29, java.util.List<com.google.android.flexbox.c> r30) {
        /*
        // Method dump skipped, instructions count: 997
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.d.b(com.google.android.flexbox.d$b, int, int, int, int, int, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    public void d(List<c> list, int i) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* access modifiers changed from: package-private */
    public int[] g(SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        return A(flexItemCount, f(flexItemCount), sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    public int[] h(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        List<c> f = f(flexItemCount);
        c cVar = new c(null);
        if (view == null || !(layoutParams instanceof b)) {
            cVar.b = 1;
        } else {
            cVar.b = ((b) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount) {
            cVar.a = flexItemCount;
        } else if (i < this.a.getFlexItemCount()) {
            cVar.a = i;
            while (i < flexItemCount) {
                ((c) ((ArrayList) f).get(i)).a++;
                i++;
            }
        } else {
            cVar.a = flexItemCount;
        }
        ((ArrayList) f).add(cVar);
        return A(flexItemCount + 1, f, sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    public void i(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException(je.p0("Invalid flex direction: ", flexDirection));
        }
        List<c> flexLinesInternal = this.a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.a.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    c cVar = new c();
                    cVar.g = i7;
                    flexLinesInternal.add(0, cVar);
                } else if (alignContent == 2) {
                    this.a.setFlexLines(e(flexLinesInternal, i5, sumOfCrossSize));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i5) {
                            float size2 = ((float) (i5 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                            int size3 = flexLinesInternal.size();
                            float f = 0.0f;
                            while (i6 < size3) {
                                c cVar2 = flexLinesInternal.get(i6);
                                float f2 = ((float) cVar2.g) + size2;
                                if (i6 == flexLinesInternal.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int round = Math.round(f2);
                                float f3 = (f2 - ((float) round)) + f;
                                if (f3 > 1.0f) {
                                    round++;
                                    f3 -= 1.0f;
                                } else if (f3 < -1.0f) {
                                    round--;
                                    f3 += 1.0f;
                                }
                                f = f3;
                                cVar2.g = round;
                                i6++;
                            }
                        }
                    } else if (sumOfCrossSize >= i5) {
                        this.a.setFlexLines(e(flexLinesInternal, i5, sumOfCrossSize));
                    } else {
                        int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        c cVar3 = new c();
                        cVar3.g = size4;
                        for (c cVar4 : flexLinesInternal) {
                            arrayList.add(cVar3);
                            arrayList.add(cVar4);
                            arrayList.add(cVar3);
                        }
                        this.a.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i5) {
                    float size5 = ((float) (i5 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f4 = 0.0f;
                    while (i6 < size6) {
                        arrayList2.add(flexLinesInternal.get(i6));
                        if (i6 != flexLinesInternal.size() - 1) {
                            c cVar5 = new c();
                            if (i6 == flexLinesInternal.size() - 2) {
                                cVar5.g = Math.round(f4 + size5);
                                f4 = 0.0f;
                            } else {
                                cVar5.g = Math.round(size5);
                            }
                            int i8 = cVar5.g;
                            float f5 = (size5 - ((float) i8)) + f4;
                            if (f5 > 1.0f) {
                                cVar5.g = i8 + 1;
                                f5 -= 1.0f;
                            } else if (f5 < -1.0f) {
                                cVar5.g = i8 - 1;
                                f5 += 1.0f;
                            }
                            arrayList2.add(cVar5);
                            f4 = f5;
                        }
                        i6++;
                    }
                    this.a.setFlexLines(arrayList2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int flexItemCount = this.a.getFlexItemCount();
        boolean[] zArr = this.b;
        int i7 = 0;
        if (zArr == null) {
            if (flexItemCount < 10) {
                flexItemCount = 10;
            }
            this.b = new boolean[flexItemCount];
        } else if (zArr.length < flexItemCount) {
            int length = zArr.length * 2;
            if (length >= flexItemCount) {
                flexItemCount = length;
            }
            this.b = new boolean[flexItemCount];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 < this.a.getFlexItemCount()) {
            int flexDirection = this.a.getFlexDirection();
            int flexDirection2 = this.a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                i5 = View.MeasureSpec.getSize(i);
                int largestMainSize = this.a.getLargestMainSize();
                if (mode != 1073741824 && largestMainSize <= i5) {
                    i5 = largestMainSize;
                }
                i6 = this.a.getPaddingLeft();
                i4 = this.a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.a.getLargestMainSize();
                }
                i6 = this.a.getPaddingTop();
                i4 = this.a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException(je.p0("Invalid flex direction: ", flexDirection));
            }
            int i8 = i6 + i4;
            int[] iArr = this.c;
            if (iArr != null) {
                i7 = iArr[i3];
            }
            List<c> flexLinesInternal = this.a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i7 < size) {
                c cVar = flexLinesInternal.get(i7);
                int i9 = cVar.e;
                if (i9 < i5 && cVar.q) {
                    n(i, i2, cVar, i5, i8, false);
                } else if (i9 > i5 && cVar.r) {
                    z(i, i2, cVar, i5, i8, false);
                }
                i7++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.c = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.c = Arrays.copyOf(iArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void l(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.d = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.d = Arrays.copyOf(jArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.e = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.e = Arrays.copyOf(jArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    public int o(long j) {
        return (int) (j >> 32);
    }

    /* access modifiers changed from: package-private */
    public boolean w(SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View j = this.a.j(i);
            if (!(j == null || ((b) j.getLayoutParams()).getOrder() == sparseIntArray.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void x(View view, c cVar, int i, int i2, int i3, int i4) {
        b bVar = (b) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (bVar.I() != -1) {
            alignItems = bVar.I();
        }
        int i5 = cVar.g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + bVar.h0()) - bVar.w1()) / 2;
                    if (this.a.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (this.a.getFlexWrap() != 2) {
                    int max = Math.max(cVar.l - view.getBaseline(), bVar.h0());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (cVar.l - view.getMeasuredHeight()), bVar.w1());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.a.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - bVar.w1(), i3, i8 - bVar.w1());
                return;
            } else {
                view.layout(i, view.getMeasuredHeight() + (i2 - i5) + bVar.h0(), i3, view.getMeasuredHeight() + (i4 - i5) + bVar.h0());
                return;
            }
        }
        if (this.a.getFlexWrap() != 2) {
            view.layout(i, i2 + bVar.h0(), i3, i4 + bVar.h0());
        } else {
            view.layout(i, i2 - bVar.w1(), i3, i4 - bVar.w1());
        }
    }

    /* access modifiers changed from: package-private */
    public void y(View view, c cVar, boolean z, int i, int i2, int i3, int i4) {
        b bVar = (b) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (bVar.I() != -1) {
            alignItems = bVar.I();
        }
        int i5 = cVar.g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int k = ((e2.k(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - e2.j(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + k, i2, i3 + k, i4);
                        return;
                    } else {
                        view.layout(i - k, i2, i3 - k, i4);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - bVar.X1(), i2, ((i3 + i5) - view.getMeasuredWidth()) - bVar.X1(), i4);
                return;
            } else {
                view.layout(view.getMeasuredWidth() + (i - i5) + bVar.z1(), i2, view.getMeasuredWidth() + (i3 - i5) + bVar.z1(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + bVar.z1(), i2, i3 + bVar.z1(), i4);
        } else {
            view.layout(i - bVar.X1(), i2, i3 - bVar.X1(), i4);
        }
    }
}
