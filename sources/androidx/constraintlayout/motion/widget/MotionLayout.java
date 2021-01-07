package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.j;
import androidx.constraintlayout.solver.widgets.k;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MotionLayout extends ConstraintLayout implements j4 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    static final int MAX_KEY_FRAMES = 50;
    static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    boolean firstDown = true;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime = 0;
    private int mBeginState = -1;
    private RectF mBoundsCheck = new RectF();
    int mCurrentState = -1;
    int mDebugPath = 0;
    private b mDecelerateLogic = new b();
    private a mDesignTool;
    c mDevModeDraw;
    private int mEndState = -1;
    int mEndWrapHeight;
    int mEndWrapWidth;
    HashMap<View, m> mFrameArrayList = new HashMap<>();
    private int mFrames = 0;
    int mHeightMeasureMode;
    private boolean mInLayout = false;
    boolean mInTransition = false;
    boolean mIndirectTransition = false;
    private boolean mInteractionEnabled = true;
    Interpolator mInterpolator;
    boolean mIsAnimating = false;
    private boolean mKeepAnimating = false;
    private d mKeyCache = new d();
    private long mLastDrawTime = -1;
    private float mLastFps = 0.0f;
    private int mLastHeightMeasureSpec = 0;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    float mLastVelocity = 0.0f;
    private int mLastWidthMeasureSpec = 0;
    private float mListenerPosition = 0.0f;
    private int mListenerState = 0;
    protected boolean mMeasureDuringTransition = false;
    d mModel = new d();
    private boolean mNeedsFireTransitionCompleted = false;
    int mOldHeight;
    int mOldWidth;
    private ArrayList<MotionHelper> mOnHideHelpers = null;
    private ArrayList<MotionHelper> mOnShowHelpers = null;
    float mPostInterpolationPosition;
    private View mRegionView = null;
    p mScene;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    private g mStateCache;
    private b2 mStopLogic = new b2();
    private boolean mTemporalInterpolator = false;
    ArrayList<Integer> mTransitionCompleted = new ArrayList<>();
    private float mTransitionDuration = 1.0f;
    float mTransitionGoalPosition = 0.0f;
    private boolean mTransitionInstantly;
    float mTransitionLastPosition = 0.0f;
    private long mTransitionLastTime;
    private h mTransitionListener;
    private ArrayList<h> mTransitionListeners = null;
    float mTransitionPosition = 0.0f;
    TransitionState mTransitionState = TransitionState.UNDEFINED;
    boolean mUndergoingMotion = false;
    int mWidthMeasureMode;

    /* access modifiers changed from: package-private */
    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    class a implements Runnable {
        final /* synthetic */ View a;

        a(MotionLayout motionLayout, View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setNestedScrollingEnabled(true);
        }
    }

    class b extends n {
        float a = 0.0f;
        float b = 0.0f;
        float c;

        b() {
        }

        @Override // androidx.constraintlayout.motion.widget.n
        public float a() {
            return MotionLayout.this.mLastVelocity;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = this.a;
            if (f2 > 0.0f) {
                float f3 = this.c;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                MotionLayout.this.mLastVelocity = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.b;
            }
            float f4 = this.c;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            MotionLayout.this.mLastVelocity = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.b;
        }
    }

    private class c {
        float[] a;
        int[] b;
        float[] c;
        Path d;
        Paint e;
        Paint f;
        Paint g;
        Paint h;
        Paint i;
        private float[] j;
        DashPathEffect k;
        int l;
        Rect m = new Rect();
        int n = 1;

        public c() {
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            this.e.setColor(-21965);
            this.e.setStrokeWidth(2.0f);
            this.e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.g = paint3;
            paint3.setAntiAlias(true);
            this.g.setColor(-13391360);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.h = paint4;
            paint4.setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint5 = new Paint();
            this.i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.k = dashPathEffect;
            this.g.setPathEffect(dashPathEffect);
            this.c = new float[100];
            this.b = new int[50];
        }

        private void c(Canvas canvas) {
            float[] fArr = this.a;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[fArr.length - 2];
            float f5 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f2, f4), Math.max(f3, f5), Math.max(f2, f4), Math.max(f3, f5), this.g);
            canvas.drawLine(Math.min(f2, f4), Math.min(f3, f5), Math.min(f2, f4), Math.max(f3, f5), this.g);
        }

        private void d(Canvas canvas, float f2, float f3) {
            float[] fArr = this.a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float min = Math.min(f4, f6);
            float max = Math.max(f5, f7);
            float min2 = f2 - Math.min(f4, f6);
            float max2 = Math.max(f5, f7) - f3;
            StringBuilder V0 = je.V0("");
            double abs = (double) ((min2 * 100.0f) / Math.abs(f6 - f4));
            Double.isNaN(abs);
            V0.append(((float) ((int) (abs + 0.5d))) / 100.0f);
            String sb = V0.toString();
            h(sb, this.h);
            canvas.drawText(sb, ((min2 / 2.0f) - ((float) (this.m.width() / 2))) + min, f3 - 20.0f, this.h);
            canvas.drawLine(f2, f3, Math.min(f4, f6), f3, this.g);
            StringBuilder V02 = je.V0("");
            double abs2 = (double) ((max2 * 100.0f) / Math.abs(f7 - f5));
            Double.isNaN(abs2);
            V02.append(((float) ((int) (abs2 + 0.5d))) / 100.0f);
            String sb2 = V02.toString();
            h(sb2, this.h);
            canvas.drawText(sb2, f2 + 5.0f, max - ((max2 / 2.0f) - ((float) (this.m.height() / 2))), this.h);
            canvas.drawLine(f2, f3, f2, Math.max(f5, f7), this.g);
        }

        private void e(Canvas canvas) {
            float[] fArr = this.a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.g);
        }

        private void f(Canvas canvas, float f2, float f3) {
            float[] fArr = this.a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f4 - f6), (double) (f5 - f7));
            float f8 = f6 - f4;
            float f9 = f7 - f5;
            float f10 = (((f3 - f5) * f9) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f11 = f4 + (f8 * f10);
            float f12 = f5 + (f10 * f9);
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f11, f12);
            float hypot2 = (float) Math.hypot((double) (f11 - f2), (double) (f12 - f3));
            StringBuilder V0 = je.V0("");
            V0.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String sb = V0.toString();
            h(sb, this.h);
            canvas.drawTextOnPath(sb, path, (hypot2 / 2.0f) - ((float) (this.m.width() / 2)), -20.0f, this.h);
            canvas.drawLine(f2, f3, f11, f12, this.g);
        }

        private void g(Canvas canvas, float f2, float f3, int i2, int i3) {
            StringBuilder V0 = je.V0("");
            double width = (double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i2)));
            Double.isNaN(width);
            V0.append(((float) ((int) (width + 0.5d))) / 100.0f);
            String sb = V0.toString();
            h(sb, this.h);
            canvas.drawText(sb, ((f2 / 2.0f) - ((float) (this.m.width() / 2))) + 0.0f, f3 - 20.0f, this.h);
            canvas.drawLine(f2, f3, Math.min(0.0f, 1.0f), f3, this.g);
            StringBuilder V02 = je.V0("");
            double height = (double) (((f3 - ((float) (i3 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i3)));
            Double.isNaN(height);
            V02.append(((float) ((int) (height + 0.5d))) / 100.0f);
            String sb2 = V02.toString();
            h(sb2, this.h);
            canvas.drawText(sb2, f2 + 5.0f, 0.0f - ((f3 / 2.0f) - ((float) (this.m.height() / 2))), this.h);
            canvas.drawLine(f2, f3, f2, Math.max(0.0f, 1.0f), this.g);
        }

        public void a(Canvas canvas, HashMap<View, m> hashMap, int i2, int i3) {
            if (!(hashMap == null || hashMap.size() == 0)) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i3 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.mEndState) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.h);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.e);
                }
                for (m mVar : hashMap.values()) {
                    int h2 = mVar.h();
                    if (i3 > 0 && h2 == 0) {
                        h2 = 1;
                    }
                    if (h2 != 0) {
                        this.l = mVar.c(this.c, this.b);
                        if (h2 >= 1) {
                            int i4 = i2 / 16;
                            float[] fArr = this.a;
                            if (fArr == null || fArr.length != i4 * 2) {
                                this.a = new float[(i4 * 2)];
                                this.d = new Path();
                            }
                            int i5 = this.n;
                            canvas.translate((float) i5, (float) i5);
                            this.e.setColor(1996488704);
                            this.i.setColor(1996488704);
                            this.f.setColor(1996488704);
                            this.g.setColor(1996488704);
                            mVar.d(this.a, i4);
                            b(canvas, h2, this.l, mVar);
                            this.e.setColor(-21965);
                            this.f.setColor(-2067046);
                            this.i.setColor(-2067046);
                            this.g.setColor(-13391360);
                            int i6 = this.n;
                            canvas.translate((float) (-i6), (float) (-i6));
                            b(canvas, h2, this.l, mVar);
                            if (h2 == 5) {
                                this.d.reset();
                                for (int i7 = 0; i7 <= 50; i7++) {
                                    mVar.e(((float) i7) / ((float) 50), this.j, 0);
                                    Path path = this.d;
                                    float[] fArr2 = this.j;
                                    path.moveTo(fArr2[0], fArr2[1]);
                                    Path path2 = this.d;
                                    float[] fArr3 = this.j;
                                    path2.lineTo(fArr3[2], fArr3[3]);
                                    Path path3 = this.d;
                                    float[] fArr4 = this.j;
                                    path3.lineTo(fArr4[4], fArr4[5]);
                                    Path path4 = this.d;
                                    float[] fArr5 = this.j;
                                    path4.lineTo(fArr5[6], fArr5[7]);
                                    this.d.close();
                                }
                                this.e.setColor(1140850688);
                                canvas.translate(2.0f, 2.0f);
                                canvas.drawPath(this.d, this.e);
                                canvas.translate(-2.0f, -2.0f);
                                this.e.setColor(-65536);
                                canvas.drawPath(this.d, this.e);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void b(Canvas canvas, int i2, int i3, m mVar) {
            int i4;
            int i5;
            int i6;
            float f2;
            float f3;
            if (i2 == 4) {
                boolean z = false;
                boolean z2 = false;
                for (int i7 = 0; i7 < this.l; i7++) {
                    int[] iArr = this.b;
                    if (iArr[i7] == 1) {
                        z = true;
                    }
                    if (iArr[i7] == 2) {
                        z2 = true;
                    }
                }
                if (z) {
                    e(canvas);
                }
                if (z2) {
                    c(canvas);
                }
            }
            if (i2 == 2) {
                e(canvas);
            }
            if (i2 == 3) {
                c(canvas);
            }
            canvas.drawLines(this.a, this.e);
            View view = mVar.a;
            if (view != null) {
                i5 = view.getWidth();
                i4 = mVar.a.getHeight();
            } else {
                i5 = 0;
                i4 = 0;
            }
            int i8 = 1;
            while (i8 < i3 - 1) {
                if (i2 == 4 && this.b[i8 - 1] == 0) {
                    i6 = i8;
                } else {
                    float[] fArr = this.c;
                    int i9 = i8 * 2;
                    float f4 = fArr[i9];
                    float f5 = fArr[i9 + 1];
                    this.d.reset();
                    this.d.moveTo(f4, f5 + 10.0f);
                    this.d.lineTo(f4 + 10.0f, f5);
                    this.d.lineTo(f4, f5 - 10.0f);
                    this.d.lineTo(f4 - 10.0f, f5);
                    this.d.close();
                    int i10 = i8 - 1;
                    mVar.k(i10);
                    if (i2 == 4) {
                        int[] iArr2 = this.b;
                        if (iArr2[i10] == 1) {
                            f(canvas, f4 - 0.0f, f5 - 0.0f);
                        } else if (iArr2[i10] == 2) {
                            d(canvas, f4 - 0.0f, f5 - 0.0f);
                        } else if (iArr2[i10] == 3) {
                            f2 = f5;
                            f3 = f4;
                            i6 = i8;
                            g(canvas, f4 - 0.0f, f5 - 0.0f, i5, i4);
                            canvas.drawPath(this.d, this.i);
                        }
                        f2 = f5;
                        f3 = f4;
                        i6 = i8;
                        canvas.drawPath(this.d, this.i);
                    } else {
                        f2 = f5;
                        f3 = f4;
                        i6 = i8;
                    }
                    if (i2 == 2) {
                        f(canvas, f3 - 0.0f, f2 - 0.0f);
                    }
                    if (i2 == 3) {
                        d(canvas, f3 - 0.0f, f2 - 0.0f);
                    }
                    if (i2 == 6) {
                        g(canvas, f3 - 0.0f, f2 - 0.0f, i5, i4);
                    }
                    canvas.drawPath(this.d, this.i);
                }
                i8 = i6 + 1;
            }
            float[] fArr2 = this.a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f);
                float[] fArr3 = this.a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f);
            }
        }

        /* access modifiers changed from: package-private */
        public void h(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.m);
        }
    }

    /* access modifiers changed from: package-private */
    public class d {
        androidx.constraintlayout.solver.widgets.d a = new androidx.constraintlayout.solver.widgets.d();
        androidx.constraintlayout.solver.widgets.d b = new androidx.constraintlayout.solver.widgets.d();
        androidx.constraintlayout.widget.b c = null;
        androidx.constraintlayout.widget.b d = null;
        int e;
        int f;

        d() {
        }

        private void f(androidx.constraintlayout.solver.widgets.d dVar, androidx.constraintlayout.widget.b bVar) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            Iterator<ConstraintWidget> it = dVar.H0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.s()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.H0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.s();
                bVar.f(view.getId(), layoutParams);
                next2.G0(bVar.x(view.getId()));
                next2.o0(bVar.s(view.getId()));
                if (view instanceof ConstraintHelper) {
                    bVar.d((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).p();
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (bVar.w(view.getId()) == 1) {
                    next2.F0(view.getVisibility());
                } else {
                    next2.F0(bVar.v(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.H0.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof j) {
                    androidx.constraintlayout.solver.widgets.g gVar = (androidx.constraintlayout.solver.widgets.g) next3;
                    ((ConstraintHelper) next3.s()).n(gVar, sparseArray);
                    ((j) gVar).N0();
                }
            }
        }

        public void a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.mFrameArrayList.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                MotionLayout.this.mFrameArrayList.put(childAt, new m(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                m mVar = MotionLayout.this.mFrameArrayList.get(childAt2);
                if (mVar != null) {
                    if (this.c != null) {
                        ConstraintWidget c2 = c(this.a, childAt2);
                        if (c2 != null) {
                            mVar.r(c2, this.c);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            Log.e(MotionLayout.TAG, g0.a() + "no widget for  " + g0.c(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.d != null) {
                        ConstraintWidget c3 = c(this.b, childAt2);
                        if (c3 != null) {
                            mVar.o(c3, this.d);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            Log.e(MotionLayout.TAG, g0.a() + "no widget for  " + g0.c(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(androidx.constraintlayout.solver.widgets.d dVar, androidx.constraintlayout.solver.widgets.d dVar2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> arrayList = dVar.H0;
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(dVar, dVar2);
            dVar2.H0.clear();
            dVar2.l(dVar, hashMap);
            Iterator<ConstraintWidget> it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof androidx.constraintlayout.solver.widgets.a) {
                    constraintWidget = new androidx.constraintlayout.solver.widgets.a();
                } else if (next instanceof androidx.constraintlayout.solver.widgets.f) {
                    constraintWidget = new androidx.constraintlayout.solver.widgets.f();
                } else if (next instanceof androidx.constraintlayout.solver.widgets.e) {
                    constraintWidget = new androidx.constraintlayout.solver.widgets.e();
                } else if (next instanceof androidx.constraintlayout.solver.widgets.g) {
                    constraintWidget = new androidx.constraintlayout.solver.widgets.h();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                dVar2.H0.add(constraintWidget);
                ConstraintWidget constraintWidget2 = constraintWidget.R;
                if (constraintWidget2 != null) {
                    ((k) constraintWidget2).H0.remove(constraintWidget);
                    constraintWidget.a0();
                }
                constraintWidget.R = dVar2;
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).l(next2, hashMap);
            }
        }

        /* access modifiers changed from: package-private */
        public ConstraintWidget c(androidx.constraintlayout.solver.widgets.d dVar, View view) {
            if (dVar.s() == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayList = dVar.H0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                if (constraintWidget.s() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.constraintlayout.widget.b bVar, androidx.constraintlayout.widget.b bVar2) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            this.c = bVar;
            this.d = bVar2;
            this.a = new androidx.constraintlayout.solver.widgets.d();
            this.b = new androidx.constraintlayout.solver.widgets.d();
            this.a.b1(((ConstraintLayout) MotionLayout.this).mLayoutWidget.S0());
            this.b.b1(((ConstraintLayout) MotionLayout.this).mLayoutWidget.S0());
            this.a.H0.clear();
            this.b.H0.clear();
            b(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.a);
            b(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.b);
            if (((double) MotionLayout.this.mTransitionLastPosition) > 0.5d) {
                if (bVar != null) {
                    f(this.a, bVar);
                }
                f(this.b, bVar2);
            } else {
                f(this.b, bVar2);
                if (bVar != null) {
                    f(this.a, bVar);
                }
            }
            this.a.d1(MotionLayout.this.isRtl());
            this.a.e1();
            this.b.d1(MotionLayout.this.isRtl());
            this.b.e1();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.a.Q[0] = dimensionBehaviour;
                    this.b.Q[0] = dimensionBehaviour;
                }
                if (layoutParams.height == -2) {
                    this.a.Q[1] = dimensionBehaviour;
                    this.b.Q[1] = dimensionBehaviour;
                }
            }
        }

        public void e() {
            int i;
            int i2 = MotionLayout.this.mLastWidthMeasureSpec;
            int i3 = MotionLayout.this.mLastHeightMeasureSpec;
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.mWidthMeasureMode = mode;
            motionLayout.mHeightMeasureMode = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.mCurrentState == motionLayout2.getStartState()) {
                MotionLayout.this.resolveSystem(this.b, optimizationLevel, i2, i3);
                if (this.c != null) {
                    MotionLayout.this.resolveSystem(this.a, optimizationLevel, i2, i3);
                }
            } else {
                if (this.c != null) {
                    MotionLayout.this.resolveSystem(this.a, optimizationLevel, i2, i3);
                }
                MotionLayout.this.resolveSystem(this.b, optimizationLevel, i2, i3);
            }
            boolean z = false;
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.mWidthMeasureMode = mode;
                motionLayout3.mHeightMeasureMode = mode2;
                if (motionLayout3.mCurrentState == motionLayout3.getStartState()) {
                    MotionLayout.this.resolveSystem(this.b, optimizationLevel, i2, i3);
                    if (this.c != null) {
                        MotionLayout.this.resolveSystem(this.a, optimizationLevel, i2, i3);
                    }
                } else {
                    if (this.c != null) {
                        MotionLayout.this.resolveSystem(this.a, optimizationLevel, i2, i3);
                    }
                    MotionLayout.this.resolveSystem(this.b, optimizationLevel, i2, i3);
                }
                MotionLayout.this.mStartWrapWidth = this.a.N();
                MotionLayout.this.mStartWrapHeight = this.a.w();
                MotionLayout.this.mEndWrapWidth = this.b.N();
                MotionLayout.this.mEndWrapHeight = this.b.w();
                MotionLayout motionLayout4 = MotionLayout.this;
                motionLayout4.mMeasureDuringTransition = (motionLayout4.mStartWrapWidth == motionLayout4.mEndWrapWidth && motionLayout4.mStartWrapHeight == motionLayout4.mEndWrapHeight) ? false : true;
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            int i4 = motionLayout5.mStartWrapWidth;
            int i5 = motionLayout5.mStartWrapHeight;
            int i6 = motionLayout5.mWidthMeasureMode;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout5.mPostInterpolationPosition * ((float) (motionLayout5.mEndWrapWidth - i4))) + ((float) i4));
            }
            int i7 = motionLayout5.mHeightMeasureMode;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i = (int) ((motionLayout5.mPostInterpolationPosition * ((float) (motionLayout5.mEndWrapHeight - i5))) + ((float) i5));
            } else {
                i = i5;
            }
            boolean z2 = this.a.X0() || this.b.X0();
            if (this.a.V0() || this.b.V0()) {
                z = true;
            }
            MotionLayout.this.resolveMeasuredDimension(i2, i3, i4, i, z2, z);
            MotionLayout.this.setupMotionViews();
        }
    }

    /* access modifiers changed from: protected */
    public interface e {
    }

    /* access modifiers changed from: private */
    public static class f implements e {
        private static f b = new f();
        VelocityTracker a;

        private f() {
        }

        public static f a() {
            f fVar = b;
            fVar.a = VelocityTracker.obtain();
            return fVar;
        }
    }

    /* access modifiers changed from: package-private */
    public class g {
        float a = Float.NaN;
        float b = Float.NaN;
        int c = -1;
        int d = -1;

        g() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i = this.c;
            if (!(i == -1 && this.d == -1)) {
                if (i == -1) {
                    MotionLayout.this.transitionToState(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.b)) {
                MotionLayout.this.setProgress(this.a, this.b);
                this.a = Float.NaN;
                this.b = Float.NaN;
                this.c = -1;
                this.d = -1;
            } else if (!Float.isNaN(this.a)) {
                MotionLayout.this.setProgress(this.a);
            }
        }
    }

    public interface h {
        void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f);

        void onTransitionCompleted(MotionLayout motionLayout, int i);

        void onTransitionStarted(MotionLayout motionLayout, int i, int i2);

        void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f);
    }

    public MotionLayout(Context context) {
        super(context);
        init(null);
    }

    private void checkStructure() {
        p pVar = this.mScene;
        if (pVar == null) {
            Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int r = pVar.r();
        p pVar2 = this.mScene;
        checkStructure(r, pVar2.h(pVar2.r()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<p.b> it = this.mScene.j().iterator();
        while (it.hasNext()) {
            p.b next = it.next();
            p.b bVar = this.mScene.c;
            checkStructure(next);
            int y = next.y();
            int w = next.w();
            String b2 = g0.b(getContext(), y);
            String b3 = g0.b(getContext(), w);
            if (sparseIntArray.get(y) == w) {
                Log.e(TAG, "CHECK: two transitions with the same start and end " + b2 + "->" + b3);
            }
            if (sparseIntArray2.get(w) == y) {
                Log.e(TAG, "CHECK: you can't have reverse transitions" + b2 + "->" + b3);
            }
            sparseIntArray.put(y, w);
            sparseIntArray2.put(w, y);
            if (this.mScene.h(y) == null) {
                Log.e(TAG, " no such constraintSetStart " + b2);
            }
            if (this.mScene.h(w) == null) {
                Log.e(TAG, " no such constraintSetEnd " + b2);
            }
        }
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            m mVar = this.mFrameArrayList.get(childAt);
            if (mVar != null) {
                mVar.q(childAt);
            }
        }
    }

    private void debugPos() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            g0.a();
            g0.c(this);
            g0.b(getContext(), this.mCurrentState);
            g0.c(childAt);
            childAt.getLeft();
            childAt.getTop();
        }
    }

    private void evaluateLayout() {
        boolean z;
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.mInterpolator;
        float f2 = this.mTransitionLastPosition + (!(interpolator instanceof b2) ? ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            f2 = this.mTransitionGoalPosition;
        }
        if ((signum <= 0.0f || f2 < this.mTransitionGoalPosition) && (signum > 0.0f || f2 > this.mTransitionGoalPosition)) {
            z = false;
        } else {
            f2 = this.mTransitionGoalPosition;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.mTemporalInterpolator) {
                f2 = interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f);
            } else {
                f2 = interpolator.getInterpolation(f2);
            }
        }
        if ((signum > 0.0f && f2 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f2 <= this.mTransitionGoalPosition)) {
            f2 = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            m mVar = this.mFrameArrayList.get(childAt);
            if (mVar != null) {
                mVar.m(childAt, f2, nanoTime2, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    private void fireTransitionChange() {
        ArrayList<h> arrayList;
        if ((this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) && this.mListenerPosition != this.mTransitionPosition) {
            if (this.mListenerState != -1) {
                h hVar = this.mTransitionListener;
                if (hVar != null) {
                    hVar.onTransitionStarted(this, this.mBeginState, this.mEndState);
                }
                ArrayList<h> arrayList2 = this.mTransitionListeners;
                if (arrayList2 != null) {
                    Iterator<h> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
                    }
                }
                this.mIsAnimating = true;
            }
            this.mListenerState = -1;
            float f2 = this.mTransitionPosition;
            this.mListenerPosition = f2;
            h hVar2 = this.mTransitionListener;
            if (hVar2 != null) {
                hVar2.onTransitionChange(this, this.mBeginState, this.mEndState, f2);
            }
            ArrayList<h> arrayList3 = this.mTransitionListeners;
            if (arrayList3 != null) {
                Iterator<h> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
                }
            }
            this.mIsAnimating = true;
        }
    }

    private void fireTransitionStarted(MotionLayout motionLayout, int i, int i2) {
        h hVar = this.mTransitionListener;
        if (hVar != null) {
            hVar.onTransitionStarted(this, i, i2);
        }
        ArrayList<h> arrayList = this.mTransitionListeners;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(motionLayout, i, i2);
            }
        }
    }

    private boolean handlesTouchEvent(float f2, float f3, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (handlesTouchEvent(((float) view.getLeft()) + f2, ((float) view.getTop()) + f3, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.mBoundsCheck.set(((float) view.getLeft()) + f2, ((float) view.getTop()) + f3, f2 + ((float) view.getRight()), f3 + ((float) view.getBottom()));
        if (motionEvent.getAction() == 0) {
            if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    private void init(AttributeSet attributeSet) {
        p pVar;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.e.p);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = 2;
                if (index == 2) {
                    this.mScene = new p(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.mDebugPath == 0) {
                        if (!obtainStyledAttributes.getBoolean(index, false)) {
                            i2 = 0;
                        }
                        this.mDebugPath = i2;
                    }
                } else if (index == 3) {
                    this.mDebugPath = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState == -1 && (pVar = this.mScene) != null) {
            this.mCurrentState = pVar.r();
            this.mBeginState = this.mScene.r();
            this.mEndState = this.mScene.l();
        }
    }

    private void processTransitionCompleted() {
        ArrayList<h> arrayList;
        if (this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) {
            this.mIsAnimating = false;
            Iterator<Integer> it = this.mTransitionCompleted.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                h hVar = this.mTransitionListener;
                if (hVar != null) {
                    hVar.onTransitionCompleted(this, next.intValue());
                }
                ArrayList<h> arrayList2 = this.mTransitionListeners;
                if (arrayList2 != null) {
                    Iterator<h> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onTransitionCompleted(this, next.intValue());
                    }
                }
            }
            this.mTransitionCompleted.clear();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setupMotionViews() {
        int childCount = getChildCount();
        this.mModel.a();
        boolean z = true;
        this.mInTransition = true;
        int width = getWidth();
        int height = getHeight();
        p.b bVar = this.mScene.c;
        int k = bVar != null ? p.b.k(bVar) : -1;
        int i = 0;
        if (k != -1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                m mVar = this.mFrameArrayList.get(getChildAt(i2));
                if (mVar != null) {
                    mVar.p(k);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            m mVar2 = this.mFrameArrayList.get(getChildAt(i3));
            if (mVar2 != null) {
                this.mScene.o(mVar2);
                mVar2.s(width, height, getNanoTime());
            }
        }
        p.b bVar2 = this.mScene.c;
        float l = bVar2 != null ? p.b.l(bVar2) : 0.0f;
        if (l != 0.0f) {
            boolean z2 = ((double) l) < 0.0d;
            float abs = Math.abs(l);
            float f2 = Float.MAX_VALUE;
            float f3 = -3.4028235E38f;
            int i4 = 0;
            float f4 = Float.MAX_VALUE;
            float f5 = -3.4028235E38f;
            while (true) {
                if (i4 >= childCount) {
                    z = false;
                    break;
                }
                m mVar3 = this.mFrameArrayList.get(getChildAt(i4));
                if (!Float.isNaN(mVar3.j)) {
                    break;
                }
                float i5 = mVar3.i();
                float j = mVar3.j();
                float f6 = z2 ? j - i5 : j + i5;
                f4 = Math.min(f4, f6);
                f5 = Math.max(f5, f6);
                i4++;
            }
            if (z) {
                for (int i6 = 0; i6 < childCount; i6++) {
                    m mVar4 = this.mFrameArrayList.get(getChildAt(i6));
                    if (!Float.isNaN(mVar4.j)) {
                        f2 = Math.min(f2, mVar4.j);
                        f3 = Math.max(f3, mVar4.j);
                    }
                }
                while (i < childCount) {
                    m mVar5 = this.mFrameArrayList.get(getChildAt(i));
                    if (!Float.isNaN(mVar5.j)) {
                        mVar5.l = 1.0f / (1.0f - abs);
                        if (z2) {
                            mVar5.k = abs - (((f3 - mVar5.j) / (f3 - f2)) * abs);
                        } else {
                            mVar5.k = abs - (((mVar5.j - f2) * abs) / (f3 - f2));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                m mVar6 = this.mFrameArrayList.get(getChildAt(i));
                float i7 = mVar6.i();
                float j2 = mVar6.j();
                float f7 = z2 ? j2 - i7 : j2 + i7;
                mVar6.l = 1.0f / (1.0f - abs);
                mVar6.k = abs - (((f7 - f4) * abs) / (f5 - f4));
                i++;
            }
        }
    }

    private static boolean willJump(float f2, float f3, float f4) {
        if (f2 > 0.0f) {
            float f5 = f2 / f4;
            return ((f2 * f5) - (((f4 * f5) * f5) / 2.0f)) + f3 > 1.0f;
        }
        float f6 = (-f2) / f4;
        return ((((f4 * f6) * f6) / 2.0f) + (f2 * f6)) + f3 < 0.0f;
    }

    public void addTransitionListener(h hVar) {
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new ArrayList<>();
        }
        this.mTransitionListeners.add(hVar);
    }

    /* access modifiers changed from: package-private */
    public void animateTo(float f2) {
        p pVar = this.mScene;
        if (pVar != null) {
            float f3 = this.mTransitionLastPosition;
            float f4 = this.mTransitionPosition;
            if (f3 != f4 && this.mTransitionInstantly) {
                this.mTransitionLastPosition = f4;
            }
            float f5 = this.mTransitionLastPosition;
            if (f5 != f2) {
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = f2;
                this.mTransitionDuration = ((float) pVar.k()) / 1000.0f;
                setProgress(this.mTransitionGoalPosition);
                this.mInterpolator = this.mScene.n();
                this.mTransitionInstantly = false;
                this.mAnimationStartTime = getNanoTime();
                this.mInTransition = true;
                this.mTransitionPosition = f5;
                this.mTransitionLastPosition = f5;
                invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void disableAutoTransition(boolean z) {
        p pVar = this.mScene;
        if (pVar != null) {
            pVar.g(z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        String str;
        evaluate(false);
        super.dispatchDraw(canvas);
        if (this.mScene != null) {
            if ((this.mDebugPath & 1) == 1 && !isInEditMode()) {
                this.mFrames++;
                long nanoTime = getNanoTime();
                long j = this.mLastDrawTime;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.mLastFps = ((float) ((int) ((((float) this.mFrames) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.mFrames = 0;
                        this.mLastDrawTime = nanoTime;
                    }
                } else {
                    this.mLastDrawTime = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                StringBuilder V0 = je.V0(this.mLastFps + " fps " + g0.d(this, this.mBeginState) + " -> ");
                V0.append(g0.d(this, this.mEndState));
                V0.append(" (progress: ");
                V0.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
                V0.append(" ) state=");
                int i = this.mCurrentState;
                if (i == -1) {
                    str = "undefined";
                } else {
                    str = g0.d(this, i);
                }
                V0.append(str);
                String sb = V0.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.mDebugPath > 1) {
                if (this.mDevModeDraw == null) {
                    this.mDevModeDraw = new c();
                }
                this.mDevModeDraw.a(canvas, this.mFrameArrayList, this.mScene.k(), this.mDebugPath);
            }
        }
    }

    public void enableTransition(int i, boolean z) {
        p.b transition = getTransition(i);
        if (z) {
            transition.D(true);
            return;
        }
        p pVar = this.mScene;
        if (transition == pVar.c) {
            Iterator it = ((ArrayList) pVar.t(this.mCurrentState)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p.b bVar = (p.b) it.next();
                if (bVar.A()) {
                    this.mScene.c = bVar;
                    break;
                }
            }
        }
        transition.D(false);
    }

    /* access modifiers changed from: package-private */
    public void evaluate(boolean z) {
        float f2;
        boolean z2;
        int i;
        int i2;
        float f3;
        TransitionState transitionState = TransitionState.FINISHED;
        if (this.mTransitionLastTime == -1) {
            this.mTransitionLastTime = getNanoTime();
        }
        float f4 = this.mTransitionLastPosition;
        if (f4 > 0.0f && f4 < 1.0f) {
            this.mCurrentState = -1;
        }
        boolean z3 = true;
        boolean z4 = false;
        if (this.mKeepAnimating || (this.mInTransition && (z || this.mTransitionGoalPosition != f4))) {
            float signum = Math.signum(this.mTransitionGoalPosition - f4);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.mInterpolator;
            if (!(interpolator instanceof n)) {
                f2 = ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration;
                this.mLastVelocity = f2;
            } else {
                f2 = 0.0f;
            }
            float f5 = this.mTransitionLastPosition + f2;
            if (this.mTransitionInstantly) {
                f5 = this.mTransitionGoalPosition;
            }
            if ((signum <= 0.0f || f5 < this.mTransitionGoalPosition) && (signum > 0.0f || f5 > this.mTransitionGoalPosition)) {
                z2 = false;
            } else {
                f5 = this.mTransitionGoalPosition;
                this.mInTransition = false;
                z2 = true;
            }
            this.mTransitionLastPosition = f5;
            this.mTransitionPosition = f5;
            this.mTransitionLastTime = nanoTime;
            if (interpolator != null && !z2) {
                if (this.mTemporalInterpolator) {
                    f3 = interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f);
                    this.mTransitionLastPosition = f3;
                    this.mTransitionLastTime = nanoTime;
                    Interpolator interpolator2 = this.mInterpolator;
                    if (interpolator2 instanceof n) {
                        float a2 = ((n) interpolator2).a();
                        this.mLastVelocity = a2;
                        if (Math.abs(a2) * this.mTransitionDuration <= EPSILON) {
                            this.mInTransition = false;
                        }
                        if (a2 > 0.0f && f3 >= 1.0f) {
                            this.mTransitionLastPosition = 1.0f;
                            this.mInTransition = false;
                            f3 = 1.0f;
                        }
                        if (a2 < 0.0f && f3 <= 0.0f) {
                            this.mTransitionLastPosition = 0.0f;
                            this.mInTransition = false;
                            f5 = 0.0f;
                        }
                    }
                } else {
                    f3 = interpolator.getInterpolation(f5);
                    Interpolator interpolator3 = this.mInterpolator;
                    if (interpolator3 instanceof n) {
                        this.mLastVelocity = ((n) interpolator3).a();
                    } else {
                        this.mLastVelocity = ((interpolator3.getInterpolation(f5 + f2) - f3) * signum) / f2;
                    }
                }
                f5 = f3;
            }
            if (Math.abs(this.mLastVelocity) > EPSILON) {
                setState(TransitionState.MOVING);
            }
            if ((signum > 0.0f && f5 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f5 <= this.mTransitionGoalPosition)) {
                f5 = this.mTransitionGoalPosition;
                this.mInTransition = false;
            }
            if (f5 >= 1.0f || f5 <= 0.0f) {
                this.mInTransition = false;
                setState(transitionState);
            }
            int childCount = getChildCount();
            this.mKeepAnimating = false;
            long nanoTime2 = getNanoTime();
            this.mPostInterpolationPosition = f5;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                m mVar = this.mFrameArrayList.get(childAt);
                if (mVar != null) {
                    this.mKeepAnimating = mVar.m(childAt, f5, nanoTime2, this.mKeyCache) | this.mKeepAnimating;
                }
            }
            boolean z5 = (signum > 0.0f && f5 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f5 <= this.mTransitionGoalPosition);
            if (!this.mKeepAnimating && !this.mInTransition && z5) {
                setState(transitionState);
            }
            if (this.mMeasureDuringTransition) {
                requestLayout();
            }
            this.mKeepAnimating = (!z5) | this.mKeepAnimating;
            if (f5 > 0.0f || (i2 = this.mBeginState) == -1 || this.mCurrentState == i2) {
                z4 = false;
            } else {
                this.mCurrentState = i2;
                this.mScene.h(i2).b(this);
                setState(transitionState);
                z4 = true;
            }
            if (((double) f5) >= 1.0d && this.mCurrentState != (i = this.mEndState)) {
                this.mCurrentState = i;
                this.mScene.h(i).b(this);
                setState(transitionState);
                z4 = true;
            }
            if (this.mKeepAnimating || this.mInTransition) {
                invalidate();
            } else if ((signum > 0.0f && f5 == 1.0f) || (signum < 0.0f && f5 == 0.0f)) {
                setState(transitionState);
            }
            if ((!this.mKeepAnimating && this.mInTransition && signum > 0.0f && f5 == 1.0f) || (signum < 0.0f && f5 == 0.0f)) {
                onNewStateAttachHandlers();
            }
        }
        float f6 = this.mTransitionLastPosition;
        if (f6 >= 1.0f) {
            int i4 = this.mCurrentState;
            int i5 = this.mEndState;
            if (i4 == i5) {
                z3 = z4;
            }
            this.mCurrentState = i5;
        } else {
            if (f6 <= 0.0f) {
                int i6 = this.mCurrentState;
                int i7 = this.mBeginState;
                if (i6 == i7) {
                    z3 = z4;
                }
                this.mCurrentState = i7;
            }
            this.mNeedsFireTransitionCompleted |= z4;
            if (z4 && !this.mInLayout) {
                requestLayout();
            }
            this.mTransitionPosition = this.mTransitionLastPosition;
        }
        z4 = z3;
        this.mNeedsFireTransitionCompleted |= z4;
        requestLayout();
        this.mTransitionPosition = this.mTransitionLastPosition;
    }

    /* access modifiers changed from: protected */
    public void fireTransitionCompleted() {
        int i;
        ArrayList<h> arrayList;
        if ((this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (!this.mTransitionCompleted.isEmpty()) {
                ArrayList<Integer> arrayList2 = this.mTransitionCompleted;
                i = arrayList2.get(arrayList2.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.mCurrentState;
            if (!(i == i2 || i2 == -1)) {
                this.mTransitionCompleted.add(Integer.valueOf(i2));
            }
        }
        processTransitionCompleted();
    }

    public void fireTrigger(int i, boolean z, float f2) {
        h hVar = this.mTransitionListener;
        if (hVar != null) {
            hVar.onTransitionTrigger(this, i, z, f2);
        }
        ArrayList<h> arrayList = this.mTransitionListeners;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i, z, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void getAnchorDpDt(int i, float f2, float f3, float f4, float[] fArr) {
        HashMap<View, m> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i);
        m mVar = hashMap.get(viewById);
        if (mVar != null) {
            mVar.g(f2, f3, f4, fArr);
            float y = viewById.getY();
            int i2 = ((f2 - this.lastPos) > 0.0f ? 1 : ((f2 - this.lastPos) == 0.0f ? 0 : -1));
            this.lastPos = f2;
            this.lastY = y;
        } else if (viewById == null) {
            String str = "" + i;
        } else {
            viewById.getContext().getResources().getResourceName(i);
        }
    }

    public androidx.constraintlayout.widget.b getConstraintSet(int i) {
        p pVar = this.mScene;
        if (pVar == null) {
            return null;
        }
        return pVar.h(i);
    }

    public int[] getConstraintSetIds() {
        p pVar = this.mScene;
        if (pVar == null) {
            return null;
        }
        return pVar.i();
    }

    /* access modifiers changed from: package-private */
    public String getConstraintSetNames(int i) {
        p pVar = this.mScene;
        if (pVar == null) {
            return null;
        }
        return pVar.v(i);
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public void getDebugMode(boolean z) {
        this.mDebugPath = z ? 2 : 1;
        invalidate();
    }

    public ArrayList<p.b> getDefinedTransitions() {
        p pVar = this.mScene;
        if (pVar == null) {
            return null;
        }
        return pVar.j();
    }

    public a getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new a(this);
        }
        return this.mDesignTool;
    }

    public int getEndState() {
        return this.mEndState;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public p.b getTransition(int i) {
        return this.mScene.s(i);
    }

    public Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new g();
        }
        g gVar = this.mStateCache;
        gVar.d = MotionLayout.this.mEndState;
        gVar.c = MotionLayout.this.mBeginState;
        gVar.b = MotionLayout.this.getVelocity();
        gVar.a = MotionLayout.this.getProgress();
        g gVar2 = this.mStateCache;
        gVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", gVar2.a);
        bundle.putFloat("motion.velocity", gVar2.b);
        bundle.putInt("motion.StartState", gVar2.c);
        bundle.putInt("motion.EndState", gVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        p pVar = this.mScene;
        if (pVar != null) {
            this.mTransitionDuration = ((float) pVar.k()) / 1000.0f;
        }
        return (long) (this.mTransitionDuration * 1000.0f);
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(View view, float f2, float f3, float[] fArr, int i) {
        float f4;
        float f5 = this.mLastVelocity;
        float f6 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f6);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f5 = (((interpolation - interpolation2) / EPSILON) * signum) / this.mTransitionDuration;
            f4 = interpolation2;
        } else {
            f4 = f6;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof n) {
            f5 = ((n) interpolator).a();
        }
        m mVar = this.mFrameArrayList.get(view);
        if ((i & 1) == 0) {
            mVar.l(f4, view.getWidth(), view.getHeight(), f2, f3, fArr);
        } else {
            mVar.g(f4, f2, f3, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f5;
            fArr[1] = fArr[1] * f5;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mScene = new p(getContext(), this, i);
                if (Build.VERSION.SDK_INT < 19 || isAttachedToWindow()) {
                    this.mScene.A(this);
                    this.mModel.d(this.mScene.h(this.mBeginState), this.mScene.h(this.mEndState));
                    rebuildScene();
                    this.mScene.D(isRtl());
                }
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        } else {
            this.mScene = null;
        }
    }

    /* access modifiers changed from: package-private */
    public int lookUpConstraintId(String str) {
        p pVar = this.mScene;
        if (pVar == null) {
            return 0;
        }
        return pVar.u(str);
    }

    /* access modifiers changed from: protected */
    public e obtainVelocityTracker() {
        return f.a();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        p.b bVar;
        int i;
        super.onAttachedToWindow();
        p pVar = this.mScene;
        if (!(pVar == null || (i = this.mCurrentState) == -1)) {
            androidx.constraintlayout.widget.b h2 = pVar.h(i);
            this.mScene.A(this);
            if (h2 != null) {
                h2.c(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        g gVar = this.mStateCache;
        if (gVar != null) {
            gVar.a();
            return;
        }
        p pVar2 = this.mScene;
        if (pVar2 != null && (bVar = pVar2.c) != null && bVar.v() == 4) {
            transitionToEnd();
            setState(TransitionState.SETUP);
            setState(TransitionState.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        p.b bVar;
        s z;
        int i;
        RectF h2;
        p pVar = this.mScene;
        if (pVar != null && this.mInteractionEnabled && (bVar = pVar.c) != null && bVar.A() && (z = bVar.z()) != null && ((motionEvent.getAction() != 0 || (h2 = z.h(this, new RectF())) == null || h2.contains(motionEvent.getX(), motionEvent.getY())) && (i = z.i()) != -1)) {
            View view = this.mRegionView;
            if (view == null || view.getId() != i) {
                this.mRegionView = findViewById(i);
            }
            View view2 = this.mRegionView;
            if (view2 != null) {
                this.mBoundsCheck.set((float) view2.getLeft(), (float) this.mRegionView.getTop(), (float) this.mRegionView.getRight(), (float) this.mRegionView.getBottom());
                if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && !handlesTouchEvent(0.0f, 0.0f, this.mRegionView, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.mLastLayoutWidth == i5 && this.mLastLayoutHeight == i6)) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i5;
            this.mLastLayoutHeight = i6;
            this.mOldWidth = i5;
            this.mOldHeight = i6;
            this.mInLayout = false;
        } finally {
            this.mInLayout = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (((r3 == r0.e && r4 == r0.f) ? false : true) != false) goto L_0x004a;
     */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // defpackage.i4
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        p.b bVar;
        s z;
        int i4;
        p pVar = this.mScene;
        if (pVar != null && (bVar = pVar.c) != null && bVar.A()) {
            p.b bVar2 = this.mScene.c;
            if (bVar2 == null || !bVar2.A() || (z = bVar2.z()) == null || (i4 = z.i()) == -1 || view.getId() == i4) {
                p pVar2 = this.mScene;
                if (pVar2 != null) {
                    p.b bVar3 = pVar2.c;
                    if ((bVar3 == null || p.b.m(bVar3) == null) ? false : p.b.m(pVar2.c).f()) {
                        float f2 = this.mTransitionPosition;
                        if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(-1)) {
                            return;
                        }
                    }
                }
                if (!(bVar2.z() == null || (this.mScene.c.z().b() & 1) == 0)) {
                    p pVar3 = this.mScene;
                    float f3 = (float) i;
                    float f4 = (float) i2;
                    p.b bVar4 = pVar3.c;
                    float g2 = (bVar4 == null || p.b.m(bVar4) == null) ? 0.0f : p.b.m(pVar3.c).g(f3, f4);
                    float f5 = this.mTransitionLastPosition;
                    if ((f5 <= 0.0f && g2 < 0.0f) || (f5 >= 1.0f && g2 > 0.0f)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            view.setNestedScrollingEnabled(false);
                            view.post(new a(this, view));
                            return;
                        }
                        return;
                    }
                }
                float f6 = this.mTransitionPosition;
                long nanoTime = getNanoTime();
                float f7 = (float) i;
                this.mScrollTargetDX = f7;
                float f8 = (float) i2;
                this.mScrollTargetDY = f8;
                double d2 = (double) (nanoTime - this.mScrollTargetTime);
                Double.isNaN(d2);
                this.mScrollTargetDT = (float) (d2 * 1.0E-9d);
                this.mScrollTargetTime = nanoTime;
                p pVar4 = this.mScene;
                p.b bVar5 = pVar4.c;
                if (!(bVar5 == null || p.b.m(bVar5) == null)) {
                    p.b.m(pVar4.c).k(f7, f8);
                }
                if (f6 != this.mTransitionPosition) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                evaluate(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.mUndergoingMotion = true;
                }
            }
        }
    }

    @Override // defpackage.i4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // defpackage.j4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.mUndergoingMotion && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.mUndergoingMotion = false;
    }

    @Override // defpackage.i4
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    /* access modifiers changed from: package-private */
    public void onNewStateAttachHandlers() {
        p pVar;
        p.b bVar;
        p pVar2 = this.mScene;
        if (pVar2 != null) {
            if (pVar2.f(this, this.mCurrentState)) {
                requestLayout();
                return;
            }
            int i = this.mCurrentState;
            if (i != -1) {
                this.mScene.e(this, i);
            }
            if (this.mScene.G() && (bVar = (pVar = this.mScene).c) != null && p.b.m(bVar) != null) {
                p.b.m(pVar.c).p();
            }
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        p pVar = this.mScene;
        if (pVar != null) {
            pVar.D(isRtl());
        }
    }

    @Override // defpackage.i4
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        p.b bVar;
        p pVar = this.mScene;
        return (pVar == null || (bVar = pVar.c) == null || bVar.z() == null || (this.mScene.c.z().b() & 2) != 0) ? false : true;
    }

    @Override // defpackage.i4
    public void onStopNestedScroll(View view, int i) {
        p pVar = this.mScene;
        if (pVar != null) {
            float f2 = this.mScrollTargetDX;
            float f3 = this.mScrollTargetDT;
            float f4 = f2 / f3;
            float f5 = this.mScrollTargetDY / f3;
            p.b bVar = pVar.c;
            if (bVar != null && p.b.m(bVar) != null) {
                p.b.m(pVar.c).l(f4, f5);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        p pVar = this.mScene;
        if (pVar == null || !this.mInteractionEnabled || !pVar.G()) {
            return super.onTouchEvent(motionEvent);
        }
        p.b bVar = this.mScene.c;
        if (bVar != null && !bVar.A()) {
            return super.onTouchEvent(motionEvent);
        }
        this.mScene.y(motionEvent, getCurrentState(), this);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new ArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.r()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.q()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.e();
        invalidate();
    }

    public boolean removeTransitionListener(h hVar) {
        ArrayList<h> arrayList = this.mTransitionListeners;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(hVar);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewParent, android.view.View
    public void requestLayout() {
        p pVar;
        p.b bVar;
        if (this.mMeasureDuringTransition || this.mCurrentState != -1 || (pVar = this.mScene) == null || (bVar = pVar.c) == null || bVar.x() != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i) {
        this.mDebugPath = i;
        invalidate();
    }

    public void setInteractionEnabled(boolean z) {
        this.mInteractionEnabled = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator n = this.mScene.n();
            if (n != null) {
                setProgress(n.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnHideHelpers.get(i).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnShowHelpers.get(i).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new g();
            }
            g gVar = this.mStateCache;
            gVar.a = f2;
            gVar.b = f3;
            return;
        }
        setProgress(f2);
        setState(TransitionState.MOVING);
        this.mLastVelocity = f3;
        animateTo(1.0f);
    }

    public void setScene(p pVar) {
        this.mScene = pVar;
        pVar.D(isRtl());
        rebuildScene();
    }

    /* access modifiers changed from: package-private */
    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState != transitionState2 || this.mCurrentState != -1) {
            TransitionState transitionState3 = this.mTransitionState;
            this.mTransitionState = transitionState;
            TransitionState transitionState4 = TransitionState.MOVING;
            if (transitionState3 == transitionState4 && transitionState == transitionState4) {
                fireTransitionChange();
            }
            int ordinal = transitionState3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (transitionState == transitionState4) {
                    fireTransitionChange();
                }
                if (transitionState == transitionState2) {
                    fireTransitionCompleted();
                }
            } else if (ordinal == 2 && transitionState == transitionState2) {
                fireTransitionCompleted();
            }
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new g();
            }
            g gVar = this.mStateCache;
            gVar.c = i;
            gVar.d = i2;
            return;
        }
        p pVar = this.mScene;
        if (pVar != null) {
            this.mBeginState = i;
            this.mEndState = i2;
            pVar.E(i, i2);
            this.mModel.d(this.mScene.h(i), this.mScene.h(i2));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransitionDuration(int i) {
        p pVar = this.mScene;
        if (pVar == null) {
            Log.e(TAG, "MotionScene not defined");
        } else {
            pVar.C(i);
        }
    }

    public void setTransitionListener(h hVar) {
        this.mTransitionListener = hVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new g();
        }
        g gVar = this.mStateCache;
        gVar.getClass();
        gVar.a = bundle.getFloat("motion.progress");
        gVar.b = bundle.getFloat("motion.velocity");
        gVar.c = bundle.getInt("motion.StartState");
        gVar.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.mStateCache.a();
        }
    }

    @Override // android.view.View, java.lang.Object
    public String toString() {
        Context context = getContext();
        return g0.b(context, this.mBeginState) + "->" + g0.b(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    public void touchAnimateTo(int i, float f2, float f3) {
        if (this.mScene != null && this.mTransitionLastPosition != f2) {
            this.mTemporalInterpolator = true;
            this.mAnimationStartTime = getNanoTime();
            float k = ((float) this.mScene.k()) / 1000.0f;
            this.mTransitionDuration = k;
            this.mTransitionGoalPosition = f2;
            this.mInTransition = true;
            if (i == 0 || i == 1 || i == 2) {
                if (i == 1) {
                    f2 = 0.0f;
                } else if (i == 2) {
                    f2 = 1.0f;
                }
                this.mStopLogic.b(this.mTransitionLastPosition, f2, f3, k, this.mScene.p(), this.mScene.q());
                int i2 = this.mCurrentState;
                this.mTransitionGoalPosition = f2;
                this.mCurrentState = i2;
                this.mInterpolator = this.mStopLogic;
            } else if (i == 4) {
                b bVar = this.mDecelerateLogic;
                float f4 = this.mTransitionLastPosition;
                float p = this.mScene.p();
                bVar.a = f3;
                bVar.b = f4;
                bVar.c = p;
                this.mInterpolator = this.mDecelerateLogic;
            } else if (i == 5) {
                if (willJump(f3, this.mTransitionLastPosition, this.mScene.p())) {
                    b bVar2 = this.mDecelerateLogic;
                    float f5 = this.mTransitionLastPosition;
                    float p2 = this.mScene.p();
                    bVar2.a = f3;
                    bVar2.b = f5;
                    bVar2.c = p2;
                    this.mInterpolator = this.mDecelerateLogic;
                } else {
                    this.mStopLogic.b(this.mTransitionLastPosition, f2, f3, this.mTransitionDuration, this.mScene.p(), this.mScene.q());
                    this.mLastVelocity = 0.0f;
                    int i3 = this.mCurrentState;
                    this.mTransitionGoalPosition = f2;
                    this.mCurrentState = i3;
                    this.mInterpolator = this.mStopLogic;
                }
            }
            this.mTransitionInstantly = false;
            this.mAnimationStartTime = getNanoTime();
            invalidate();
        }
    }

    public void transitionToEnd() {
        animateTo(1.0f);
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToState(int i) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new g();
            }
            this.mStateCache.d = i;
            return;
        }
        transitionToState(i, -1, -1);
    }

    public void updateState(int i, androidx.constraintlayout.widget.b bVar) {
        p pVar = this.mScene;
        if (pVar != null) {
            pVar.B(i, bVar);
        }
        updateState();
        if (this.mCurrentState == i) {
            bVar.c(this);
        }
    }

    public void updateState() {
        this.mModel.d(this.mScene.h(this.mBeginState), this.mScene.h(this.mEndState));
        rebuildScene();
    }

    public void transitionToState(int i, int i2, int i3) {
        androidx.constraintlayout.widget.f fVar;
        int a2;
        p pVar = this.mScene;
        if (!(pVar == null || (fVar = pVar.b) == null || (a2 = fVar.a(this.mCurrentState, i, (float) i2, (float) i3)) == -1)) {
            i = a2;
        }
        int i4 = this.mCurrentState;
        if (i4 != i) {
            if (this.mBeginState == i) {
                animateTo(0.0f);
            } else if (this.mEndState == i) {
                animateTo(1.0f);
            } else {
                this.mEndState = i;
                if (i4 != -1) {
                    setTransition(i4, i);
                    animateTo(1.0f);
                    this.mTransitionLastPosition = 0.0f;
                    transitionToEnd();
                    return;
                }
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = 1.0f;
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mTransitionLastTime = getNanoTime();
                this.mAnimationStartTime = getNanoTime();
                this.mTransitionInstantly = false;
                this.mInterpolator = null;
                this.mTransitionDuration = ((float) this.mScene.k()) / 1000.0f;
                this.mBeginState = -1;
                this.mScene.E(-1, this.mEndState);
                this.mScene.r();
                int childCount = getChildCount();
                this.mFrameArrayList.clear();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    this.mFrameArrayList.put(childAt, new m(childAt));
                }
                this.mInTransition = true;
                this.mModel.d(null, this.mScene.h(i));
                rebuildScene();
                this.mModel.a();
                computeCurrentPositions();
                int width = getWidth();
                int height = getHeight();
                for (int i6 = 0; i6 < childCount; i6++) {
                    m mVar = this.mFrameArrayList.get(getChildAt(i6));
                    this.mScene.o(mVar);
                    mVar.s(width, height, getNanoTime());
                }
                p.b bVar = this.mScene.c;
                float l = bVar != null ? p.b.l(bVar) : 0.0f;
                if (l != 0.0f) {
                    float f2 = Float.MAX_VALUE;
                    float f3 = -3.4028235E38f;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        m mVar2 = this.mFrameArrayList.get(getChildAt(i7));
                        float j = mVar2.j() + mVar2.i();
                        f2 = Math.min(f2, j);
                        f3 = Math.max(f3, j);
                    }
                    for (int i8 = 0; i8 < childCount; i8++) {
                        m mVar3 = this.mFrameArrayList.get(getChildAt(i8));
                        float i9 = mVar3.i();
                        float j2 = mVar3.j();
                        mVar3.l = 1.0f / (1.0f - l);
                        mVar3.k = l - ((((i9 + j2) - f2) * l) / (f3 - f2));
                    }
                }
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mInTransition = true;
                invalidate();
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i;
        this.mBeginState = -1;
        this.mEndState = -1;
        androidx.constraintlayout.widget.a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.b(i, (float) i2, (float) i3);
            return;
        }
        p pVar = this.mScene;
        if (pVar != null) {
            pVar.h(i).c(this);
        }
    }

    public void setProgress(float f2) {
        TransitionState transitionState = TransitionState.FINISHED;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new g();
            }
            this.mStateCache.a = f2;
            return;
        }
        if (f2 <= 0.0f) {
            this.mCurrentState = this.mBeginState;
            if (this.mTransitionLastPosition == 0.0f) {
                setState(transitionState);
            }
        } else if (f2 >= 1.0f) {
            this.mCurrentState = this.mEndState;
            if (this.mTransitionLastPosition == 1.0f) {
                setState(transitionState);
            }
        } else {
            this.mCurrentState = -1;
            setState(TransitionState.MOVING);
        }
        if (this.mScene != null) {
            this.mTransitionInstantly = true;
            this.mTransitionGoalPosition = f2;
            this.mTransitionPosition = f2;
            this.mTransitionLastTime = -1;
            this.mAnimationStartTime = -1;
            this.mInterpolator = null;
            this.mInTransition = true;
            invalidate();
        }
    }

    public void setTransition(int i) {
        if (this.mScene != null) {
            p.b transition = getTransition(i);
            this.mBeginState = transition.y();
            this.mEndState = transition.w();
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new g();
                }
                g gVar = this.mStateCache;
                gVar.c = this.mBeginState;
                gVar.d = this.mEndState;
                return;
            }
            float f2 = Float.NaN;
            int i2 = this.mCurrentState;
            float f3 = 0.0f;
            if (i2 == this.mBeginState) {
                f2 = 0.0f;
            } else if (i2 == this.mEndState) {
                f2 = 1.0f;
            }
            this.mScene.F(transition);
            this.mModel.d(this.mScene.h(this.mBeginState), this.mScene.h(this.mEndState));
            rebuildScene();
            if (!Float.isNaN(f2)) {
                f3 = f2;
            }
            this.mTransitionLastPosition = f3;
            if (Float.isNaN(f2)) {
                g0.a();
                transitionToStart();
                return;
            }
            setProgress(f2);
        }
    }

    private void checkStructure(int i, androidx.constraintlayout.widget.b bVar) {
        g0.b(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                childAt.getClass().getName();
            }
            if (bVar.r(id) == null) {
                g0.c(childAt);
            }
        }
        int[] t = bVar.t();
        for (int i3 = 0; i3 < t.length; i3++) {
            int i4 = t[i3];
            g0.b(getContext(), i4);
            findViewById(t[i3]);
            bVar.s(i4);
            bVar.x(i4);
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(p.b bVar) {
        this.mScene.F(bVar);
        setState(TransitionState.SETUP);
        if (this.mCurrentState == this.mScene.l()) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionGoalPosition = 0.0f;
        }
        this.mTransitionLastTime = bVar.B(1) ? -1 : getNanoTime();
        int r = this.mScene.r();
        int l = this.mScene.l();
        if (r != this.mBeginState || l != this.mEndState) {
            this.mBeginState = r;
            this.mEndState = l;
            this.mScene.E(r, l);
            this.mModel.d(this.mScene.h(this.mBeginState), this.mScene.h(this.mEndState));
            d dVar = this.mModel;
            int i = this.mBeginState;
            int i2 = this.mEndState;
            dVar.e = i;
            dVar.f = i2;
            dVar.e();
            rebuildScene();
        }
    }

    private void checkStructure(p.b bVar) {
        bVar.u(getContext());
        if (bVar.y() == bVar.w()) {
            Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
