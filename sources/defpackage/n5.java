package defpackage;

import android.graphics.Rect;
import defpackage.m5;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: n5  reason: default package */
public class n5 {

    /* renamed from: n5$a */
    public interface a<T> {
    }

    /* renamed from: n5$b */
    public interface b<T, V> {
    }

    /* access modifiers changed from: private */
    /* renamed from: n5$c */
    public static class c<T> implements Comparator<T> {
        private final Rect a = new Rect();
        private final Rect b = new Rect();
        private final boolean c;
        private final a<T> f;

        c(boolean z, a<T> aVar) {
            this.c = z;
            this.f = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.a;
            Rect rect2 = this.b;
            ((m5.a) this.f).getClass();
            t.i(rect);
            ((m5.a) this.f).getClass();
            t2.i(rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (this.c) {
                    return 1;
                }
                return -1;
            } else if (i3 <= i4) {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (this.c) {
                        return 1;
                    }
                    return -1;
                } else if (i7 <= i8) {
                    return 0;
                } else {
                    if (this.c) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.c) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = b(r9, r10, r11)
            boolean r1 = b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x007d
            if (r0 != 0) goto L_0x000f
            goto L_0x007d
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0045
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0045
        L_0x0043:
            r7 = 1
            goto L_0x0046
        L_0x0045:
            r7 = 0
        L_0x0046:
            if (r7 != 0) goto L_0x0049
            return r6
        L_0x0049:
            if (r9 == r5) goto L_0x007c
            if (r9 != r4) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            int r11 = e(r9, r10, r11)
            if (r9 == r5) goto L_0x006f
            if (r9 == r3) goto L_0x006a
            if (r9 == r4) goto L_0x0065
            if (r9 != r1) goto L_0x005f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L_0x0073
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0065:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0073
        L_0x006a:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0073
        L_0x006f:
            int r9 = r10.left
            int r10 = r12.left
        L_0x0073:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x007b
            r2 = 1
        L_0x007b:
            return r2
        L_0x007c:
            return r6
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    private static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: d5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        if (r13 < ((r14 * r14) + ((r12 * 13) * r12))) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L, T> T c(L r16, defpackage.n5.b<L, T> r17, defpackage.n5.a<T> r18, T r19, android.graphics.Rect r20, int r21) {
        /*
            r0 = r20
            r1 = r21
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r0)
            r3 = 1
            r4 = 0
            r5 = 17
            if (r1 == r5) goto L_0x0040
            r5 = 33
            if (r1 == r5) goto L_0x0037
            r5 = 66
            if (r1 == r5) goto L_0x002d
            r5 = 130(0x82, float:1.82E-43)
            if (r1 != r5) goto L_0x0025
            int r5 = r20.height()
            int r5 = r5 + r3
            int r5 = -r5
            r2.offset(r4, r5)
            goto L_0x0048
        L_0x0025:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r0.<init>(r1)
            throw r0
        L_0x002d:
            int r5 = r20.width()
            int r5 = r5 + r3
            int r5 = -r5
            r2.offset(r5, r4)
            goto L_0x0048
        L_0x0037:
            int r5 = r20.height()
            int r5 = r5 + r3
            r2.offset(r4, r5)
            goto L_0x0048
        L_0x0040:
            int r5 = r20.width()
            int r5 = r5 + r3
            r2.offset(r5, r4)
        L_0x0048:
            r5 = 0
            r6 = r17
            m5$b r6 = (defpackage.m5.b) r6
            r6.getClass()
            r6 = r16
            u1 r6 = (defpackage.u1) r6
            int r7 = r6.q()
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r9 = 0
        L_0x005e:
            if (r9 >= r7) goto L_0x00bd
            java.lang.Object r10 = r6.r(r9)
            d5 r10 = (defpackage.d5) r10
            r11 = r19
            if (r10 != r11) goto L_0x006b
            goto L_0x00ba
        L_0x006b:
            r12 = r18
            m5$a r12 = (defpackage.m5.a) r12
            r12.getClass()
            r10.i(r8)
            boolean r12 = d(r0, r8, r1)
            if (r12 != 0) goto L_0x007c
            goto L_0x00b3
        L_0x007c:
            boolean r12 = d(r0, r2, r1)
            if (r12 != 0) goto L_0x0083
            goto L_0x00b1
        L_0x0083:
            boolean r12 = a(r1, r0, r8, r2)
            if (r12 == 0) goto L_0x008a
            goto L_0x00b1
        L_0x008a:
            boolean r12 = a(r1, r0, r2, r8)
            if (r12 == 0) goto L_0x0091
            goto L_0x00b3
        L_0x0091:
            int r12 = e(r1, r0, r8)
            int r13 = f(r1, r0, r8)
            int r14 = r12 * 13
            int r14 = r14 * r12
            int r13 = r13 * r13
            int r13 = r13 + r14
            int r12 = e(r1, r0, r2)
            int r14 = f(r1, r0, r2)
            int r15 = r12 * 13
            int r15 = r15 * r12
            int r14 = r14 * r14
            int r14 = r14 + r15
            if (r13 >= r14) goto L_0x00b3
        L_0x00b1:
            r12 = 1
            goto L_0x00b4
        L_0x00b3:
            r12 = 0
        L_0x00b4:
            if (r12 == 0) goto L_0x00ba
            r2.set(r8)
            r5 = r10
        L_0x00ba:
            int r9 = r9 + 1
            goto L_0x005e
        L_0x00bd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5.c(java.lang.Object, n5$b, n5$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    private static boolean d(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static int e(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i3 = rect.left;
            i2 = rect2.right;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect2.bottom;
        } else if (i == 66) {
            i3 = rect2.left;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect2.top;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i2);
    }

    private static int f(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
