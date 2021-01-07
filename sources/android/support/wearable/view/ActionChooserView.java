package android.support.wearable.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.spotify.music.C0707R;
import java.util.ArrayList;

@Deprecated
public class ActionChooserView extends View {
    private static final Property<ActionChooserView, Float> N = new f(Float.class, "offset");
    private static final Property<ActionChooserView, Float> O = new g(Float.class, "selected_multiplier");
    public static final /* synthetic */ int P = 0;
    private final ObjectAnimator A;
    private final ObjectAnimator B;
    private final Runnable C;
    private float D;
    private float E;
    private float F;
    private Integer G;
    private float H;
    private float I;
    private float J;
    private boolean K;
    private int L;
    private final GestureDetector M;
    private final Paint a;
    private final float b;
    private final float c;
    private final float f;
    private final float n;
    private final float o;
    private final float p;
    private final int q;
    private final int r;
    private final long s;
    private final float t;
    private final int u;
    private final boolean v;
    private final boolean w;
    private final SparseArray<h> x;
    private final AnimatorSet y;
    private final ObjectAnimator z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionChooserView actionChooserView = ActionChooserView.this;
            int i = ActionChooserView.P;
            actionChooserView.getClass();
        }
    }

    class b implements Animator.AnimatorListener {
        private boolean a;

        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a && ActionChooserView.this.L == 0) {
                ActionChooserView.this.y.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a = false;
        }
    }

    class c implements Animator.AnimatorListener {
        private boolean a;

        c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a && ActionChooserView.this.L == 0) {
                ActionChooserView.this.y.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a = false;
        }
    }

    class d extends GestureDetector.SimpleOnGestureListener {
        d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (Math.abs(motionEvent2.getX() - motionEvent.getX()) < ((float) ActionChooserView.this.getMeasuredWidth()) * ActionChooserView.this.p) {
                return false;
            }
            ActionChooserView.g(ActionChooserView.this, f < 0.0f ? 2 : 1);
            ActionChooserView.h(ActionChooserView.this, true);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Animator.AnimatorListener {
        e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionChooserView actionChooserView = ActionChooserView.this;
            actionChooserView.removeCallbacks(actionChooserView.C);
            ActionChooserView actionChooserView2 = ActionChooserView.this;
            actionChooserView2.postDelayed(actionChooserView2.C, (long) ActionChooserView.this.u);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    class f extends Property<ActionChooserView, Float> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(ActionChooserView actionChooserView) {
            return Float.valueOf(actionChooserView.getOffset());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(ActionChooserView actionChooserView, Float f) {
            actionChooserView.setAnimationOffset(f.floatValue());
        }
    }

    class g extends Property<ActionChooserView, Float> {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(ActionChooserView actionChooserView) {
            return Float.valueOf(actionChooserView.getSelectedMultiplier());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(ActionChooserView actionChooserView, Float f) {
            actionChooserView.setSelectedMultiplier(f.floatValue());
        }
    }

    /* access modifiers changed from: private */
    public static class h {
    }

    public ActionChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void g(ActionChooserView actionChooserView, int i) {
        actionChooserView.G = Integer.valueOf(i);
        actionChooserView.K = false;
    }

    private float getMaxOffset() {
        return this.c + 0.5f;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getOffset() {
        return this.D;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getSelectedMultiplier() {
        return this.E;
    }

    static void h(ActionChooserView actionChooserView, boolean z2) {
        actionChooserView.l(z2, true);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0036: APUT  
      (r2v1 float[])
      (1 ??[boolean, int, float, short, byte, char])
      (wrap: float : 0x0034: ARITH  (r5v9 float) = (r5v8 float) * (wrap: float : 0x0033: CAST (r0v5 float) = (float) (r0v4 int)))
     */
    private void l(boolean z2, boolean z3) {
        if (z2) {
            this.L = 0;
            if (this.G != null) {
                this.y.cancel();
                this.A.cancel();
                this.z.cancel();
                ObjectAnimator objectAnimator = this.A;
                float[] fArr = new float[2];
                fArr[0] = getOffset();
                fArr[1] = getMaxOffset() * ((float) (this.G.intValue() == 2 ? -1 : 1));
                objectAnimator.setFloatValues(fArr);
                this.A.setDuration((long) Math.round((Math.abs(getMaxOffset()) - Math.abs(getOffset())) / Math.max(this.t, this.J)));
                this.A.start();
            } else if (this.D == 0.0f) {
                this.y.start();
            } else {
                float offset = getOffset();
                this.z.setFloatValues(offset, 0.0f);
                this.z.setDuration((long) Math.round(Math.abs(offset / this.t)));
                this.z.start();
            }
        } else if (z3) {
            this.L = 2;
            this.y.cancel();
            this.A.cancel();
            this.z.cancel();
        } else {
            this.L = 1;
        }
    }

    private ArrayList<Animator> m(int i) {
        ArrayList<Animator> arrayList = new ArrayList<>();
        int i2 = i == 1 ? 1 : -1;
        Property<ActionChooserView, Float> property = N;
        float f2 = (float) i2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property, 0.0f, this.b * f2);
        ofFloat.setDuration((long) this.q);
        ofFloat.setStartDelay((long) this.r);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, f2 * this.b, 0.0f);
        ofFloat.setDuration((long) this.q);
        ofFloat.setStartDelay((long) this.r);
        arrayList.add(ofFloat2);
        return arrayList;
    }

    private float n(int i, float f2, float f3, boolean z2, float f4) {
        float f5 = (float) i;
        float max = Math.max(0.0f, (f3 - f5) * ((f2 - this.b) / (getMaxOffset() - this.b))) + f5;
        if (!z2) {
            f4 = 1.0f;
        }
        return max * f4;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setAnimationOffset(float f2) {
        if (this.L != 2) {
            setOffset(f2);
        }
    }

    private void setOffset(float f2) {
        int i = f2 < 0.0f ? -1 : 1;
        if (this.L == 1 && Math.abs(f2) == 0.0f) {
            l(false, true);
            setOffsetAndNotify(0.0f);
            invalidate();
            return;
        }
        setOffsetAndNotify(Math.min(Math.abs(f2), getMaxOffset()) * ((float) i));
        if (Math.abs(this.D) >= getMaxOffset()) {
            Integer valueOf = Integer.valueOf(i < 0 ? 2 : 1);
            this.G = valueOf;
            if (this.x.indexOfKey(valueOf.intValue()) > -1) {
                this.K = false;
                l(false, true);
                if (this.v) {
                    this.B.setDuration(this.s);
                    this.B.addListener(new e());
                    this.B.start();
                } else {
                    removeCallbacks(this.C);
                    postDelayed(this.C, (long) this.u);
                }
            }
        }
        invalidate();
    }

    private void setOffsetAndNotify(float f2) {
        if (f2 != this.D) {
            this.D = f2;
            float max = Math.max(0.0f, (Math.abs(f2) - this.b) / (getMaxOffset() - this.b));
            if (this.F != max) {
                this.F = max;
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setSelectedMultiplier(float f2) {
        this.E = f2;
        invalidate();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.start();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.y.cancel();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int max = this.w ? Math.max(width, canvas.getHeight()) : canvas.getHeight();
        int round = Math.round(((float) width) * this.D);
        float f2 = (float) max;
        int round2 = Math.round(this.c * f2);
        float f3 = f2 * this.f;
        h hVar = this.x.get(1);
        int i = round - round2;
        int i2 = max / 2;
        float f4 = this.D;
        Integer num = this.G;
        float n2 = n(round2, f4, f3, num != null && num.intValue() == 1, this.E);
        if (hVar != null) {
            this.a.setColor(0);
            canvas.drawCircle((float) i, (float) i2, n2, this.a);
        }
        h hVar2 = this.x.get(2);
        int i3 = round + width + round2;
        float f5 = -this.D;
        Integer num2 = this.G;
        float n3 = n(round2, f5, f3, num2 != null && num2.intValue() == 2, this.E);
        if (hVar2 != null) {
            this.a.setColor(0);
            canvas.drawCircle((float) i3, (float) i2, n3, this.a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (this.x.get(1) != null) {
            throw null;
        } else if (this.x.get(2) != null) {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r0 != 3) goto L_0x008f;
     */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.K
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.view.GestureDetector r0 = r7.M
            boolean r0 = r0.onTouchEvent(r8)
            r2 = 1
            if (r0 == 0) goto L_0x0010
            return r2
        L_0x0010:
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x0080
            r3 = 2
            if (r0 == r2) goto L_0x0050
            if (r0 == r3) goto L_0x0021
            r4 = 3
            if (r0 == r4) goto L_0x0050
            goto L_0x008f
        L_0x0021:
            float r0 = r8.getX()
            float r1 = r7.H
            float r0 = r0 - r1
            int r1 = r7.getWidth()
            float r1 = (float) r1
            float r1 = r0 / r1
            float r3 = r7.I
            float r1 = r1 - r3
            long r3 = r8.getEventTime()
            long r5 = r8.getDownTime()
            long r3 = r3 - r5
            float r8 = (float) r3
            float r1 = r1 / r8
            float r8 = java.lang.Math.abs(r1)
            r7.J = r8
            float r8 = r7.I
            int r1 = r7.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            float r0 = r0 + r8
            r7.setOffset(r0)
            goto L_0x008f
        L_0x0050:
            float r0 = r8.getX()
            float r4 = r7.H
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r7.getMeasuredWidth()
            float r4 = (float) r4
            float r5 = r7.o
            float r4 = r4 * r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x007c
            float r8 = r8.getX()
            float r0 = r7.H
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r7.G = r8
            r7.K = r1
        L_0x007c:
            r7.l(r2, r2)
            goto L_0x008f
        L_0x0080:
            r7.l(r1, r2)
            float r8 = r8.getX()
            r7.H = r8
            float r8 = r7.getOffset()
            r7.I = r8
        L_0x008f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.ActionChooserView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        boolean isEnabled = isEnabled();
        super.setEnabled(z2);
        if (isEnabled != z2) {
            this.K = z2;
            l(z2, z2);
        }
    }

    public ActionChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = new a();
        this.E = 1.0f;
        this.K = true;
        this.L = 0;
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        TypedValue typedValue = new TypedValue();
        getResources().getValue(C0707R.dimen.action_chooser_bounce_in_percent, typedValue, true);
        this.b = typedValue.getFloat();
        getResources().getValue(C0707R.dimen.action_chooser_base_radius_percent, typedValue, true);
        this.c = typedValue.getFloat();
        getResources().getValue(C0707R.dimen.action_chooser_max_radius_percent, typedValue, true);
        float f2 = typedValue.getFloat();
        this.f = f2;
        getResources().getValue(C0707R.dimen.action_chooser_icon_height_percent, typedValue, true);
        this.n = typedValue.getFloat();
        getResources().getValue(C0707R.dimen.action_chooser_min_drag_select_percent, typedValue, true);
        this.o = typedValue.getFloat();
        getResources().getValue(C0707R.dimen.action_chooser_min_swipe_select_percent, typedValue, true);
        this.p = typedValue.getFloat();
        int integer = getResources().getInteger(C0707R.integer.action_chooser_anim_duration);
        this.q = integer;
        this.r = getResources().getInteger(C0707R.integer.action_chooser_bounce_delay);
        this.t = f2 / ((float) integer);
        this.u = getResources().getInteger(C0707R.integer.action_chooser_confirmation_duration);
        this.v = getResources().getBoolean(C0707R.bool.action_choose_expand_selected);
        this.w = getResources().getBoolean(C0707R.bool.action_choose_symmetrical_dimen);
        this.s = (long) getResources().getInteger(C0707R.integer.action_choose_expand_full_duration);
        this.x = new SparseArray<>();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m(1));
        arrayList.addAll(m(2));
        AnimatorSet animatorSet = new AnimatorSet();
        this.y = animatorSet;
        animatorSet.playSequentially(arrayList);
        animatorSet.addListener(new b());
        Property<ActionChooserView, Float> property = N;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property, 0.0f);
        this.z = ofFloat;
        ofFloat.addListener(new c());
        this.A = ObjectAnimator.ofFloat(this, property, 0.0f);
        this.B = ObjectAnimator.ofFloat(this, O, 1.0f, (float) Math.sqrt(2.0d));
        this.M = new GestureDetector(getContext(), new d());
    }
}
