package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import defpackage.k0;
import defpackage.m0;

/* renamed from: j0  reason: default package */
public class j0 extends m0 implements androidx.core.graphics.drawable.b {
    private int A;
    private int B;
    private boolean C;
    private c y;
    private g z;

    /* access modifiers changed from: private */
    /* renamed from: j0$b */
    public static class b extends g {
        private final Animatable a;

        b(Animatable animatable) {
            super(null);
            this.a = animatable;
        }

        @Override // defpackage.j0.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.j0.g
        public void d() {
            this.a.stop();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0$c */
    public static class c extends m0.a {
        q1<Long> K;
        u1<Integer> L;

        c(c cVar, j0 j0Var, Resources resources) {
            super(cVar, j0Var, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new q1<>(10);
            this.L = new u1<>(10);
        }

        private static long m(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.m0.a, defpackage.k0.c
        public void i() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        /* access modifiers changed from: package-private */
        public int l(int i, int i2, Drawable drawable, boolean z) {
            int a = a(drawable);
            long m = m(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.K.b(m, Long.valueOf(j2 | j));
            if (z) {
                this.K.b(m(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        public int n(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.g(i, 0).intValue();
        }

        @Override // defpackage.m0.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new j0(this, null);
        }

        /* access modifiers changed from: package-private */
        public int o(int i, int i2) {
            return (int) this.K.j(m(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean p(int i, int i2) {
            return (this.K.j(m(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean q(int i, int i2) {
            return (this.K.j(m(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // defpackage.m0.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new j0(this, resources);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0$d */
    public static class d extends g {
        private final c8 a;

        d(c8 c8Var) {
            super(null);
            this.a = c8Var;
        }

        @Override // defpackage.j0.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.j0.g
        public void d() {
            this.a.stop();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0$e */
    public static class e extends g {
        private final ObjectAnimator a;
        private final boolean b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // defpackage.j0.g
        public boolean a() {
            return this.b;
        }

        @Override // defpackage.j0.g
        public void b() {
            this.a.reverse();
        }

        @Override // defpackage.j0.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.j0.g
        public void d() {
            this.a.cancel();
        }
    }

    /* renamed from: j0$f */
    private static class f implements TimeInterpolator {
        private int[] a;
        private int b;
        private int c;

        f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.c;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.c)) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.c) : 0.0f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0$g */
    public static abstract class g {
        g(a aVar) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public j0() {
        this(null, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x0074 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:97:0x0074 */
    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: android.util.AttributeSet */
    /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: android.content.res.TypedArray */
    /* JADX DEBUG: Multi-variable search result rejected for r8v11, resolved type: android.content.res.TypedArray */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d7, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(defpackage.je.R0(r19, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.j0 i(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
        // Method dump skipped, instructions count: 536
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j0.i(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):j0");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.m0, defpackage.k0
    public k0.c b() {
        return new c(this.y, this, null);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.m0, defpackage.k0
    public void f(k0.c cVar) {
        super.f(cVar);
        if (cVar instanceof c) {
            this.y = (c) cVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.m0
    public m0.a h() {
        return new c(this.y, this, null);
    }

    @Override // defpackage.m0, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.k0, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.z;
        if (gVar != null) {
            gVar.d();
            this.z = null;
            e(this.A);
            this.A = -1;
            this.B = -1;
        }
    }

    @Override // defpackage.m0, defpackage.k0, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.C) {
            super.mutate();
            if (this == this) {
                this.y.i();
                this.C = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (e(r1) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.m0, defpackage.k0, android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r11) {
        /*
            r10 = this;
            j0$c r0 = r10.y
            int r1 = r0.k(r11)
            if (r1 < 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            int[] r1 = android.util.StateSet.WILD_CARD
            int r1 = r0.k(r1)
        L_0x000f:
            int r0 = r10.c()
            r2 = 1
            r3 = 0
            if (r1 == r0) goto L_0x00a4
            j0$g r0 = r10.z
            if (r0 == 0) goto L_0x003c
            int r4 = r10.A
            if (r1 != r4) goto L_0x0022
        L_0x001f:
            r0 = 1
            goto L_0x009b
        L_0x0022:
            int r4 = r10.B
            if (r1 != r4) goto L_0x0036
            boolean r4 = r0.a()
            if (r4 == 0) goto L_0x0036
            r0.b()
            int r0 = r10.B
            r10.A = r0
            r10.B = r1
            goto L_0x001f
        L_0x0036:
            int r4 = r10.A
            r0.d()
            goto L_0x0040
        L_0x003c:
            int r4 = r10.c()
        L_0x0040:
            r0 = 0
            r10.z = r0
            r0 = -1
            r10.B = r0
            r10.A = r0
            j0$c r0 = r10.y
            int r5 = r0.n(r4)
            int r6 = r0.n(r1)
            if (r6 == 0) goto L_0x009a
            if (r5 != 0) goto L_0x0057
            goto L_0x009a
        L_0x0057:
            int r7 = r0.o(r5, r6)
            if (r7 >= 0) goto L_0x005e
            goto L_0x009a
        L_0x005e:
            boolean r8 = r0.q(r5, r6)
            r10.e(r7)
            android.graphics.drawable.Drawable r7 = super.getCurrent()
            boolean r9 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r9 == 0) goto L_0x0079
            boolean r0 = r0.p(r5, r6)
            j0$e r5 = new j0$e
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.<init>(r7, r0, r8)
            goto L_0x0090
        L_0x0079:
            boolean r0 = r7 instanceof defpackage.c8
            if (r0 == 0) goto L_0x0085
            j0$d r5 = new j0$d
            c8 r7 = (defpackage.c8) r7
            r5.<init>(r7)
            goto L_0x0090
        L_0x0085:
            boolean r0 = r7 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L_0x009a
            j0$b r5 = new j0$b
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            r5.<init>(r7)
        L_0x0090:
            r5.c()
            r10.z = r5
            r10.B = r4
            r10.A = r1
            goto L_0x001f
        L_0x009a:
            r0 = 0
        L_0x009b:
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r10.e(r1)
            if (r0 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r2 = 0
        L_0x00a5:
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            if (r0 == 0) goto L_0x00b0
            boolean r11 = r0.setState(r11)
            r2 = r2 | r11
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j0.onStateChange(int[]):boolean");
    }

    @Override // defpackage.k0, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        g gVar = this.z;
        if (gVar != null && (visible || z3)) {
            if (z2) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    j0(c cVar, Resources resources) {
        super(null);
        this.A = -1;
        this.B = -1;
        c cVar2 = new c(cVar, this, resources);
        super.f(cVar2);
        this.y = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }
}
