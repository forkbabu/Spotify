package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;
import androidx.core.widget.NestedScrollView;
import com.adjust.sdk.Constants;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
public class s {
    private static final float[][] v = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] w = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private float g = 0.5f;
    private float h = 0.5f;
    private float i = 0.0f;
    private float j = 1.0f;
    private boolean k = false;
    private float[] l = new float[2];
    private float m;
    private float n;
    private final MotionLayout o;
    private float p = 4.0f;
    private float q = 1.2f;
    private boolean r = true;
    private float s = 1.0f;
    private int t = 0;
    private float u = 10.0f;

    /* access modifiers changed from: package-private */
    public class a implements View.OnTouchListener {
        a(s sVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements NestedScrollView.b {
        b(s sVar) {
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void f(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    s(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.o = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.t);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 9) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
            } else if (index == 10) {
                int i3 = obtainStyledAttributes.getInt(index, this.a);
                this.a = i3;
                float[][] fArr = v;
                this.h = fArr[i3][0];
                this.g = fArr[i3][1];
            } else if (index == 0) {
                int i4 = obtainStyledAttributes.getInt(index, this.b);
                this.b = i4;
                float[][] fArr2 = w;
                this.i = fArr2[i4][0];
                this.j = fArr2[i4][1];
            } else if (index == 5) {
                this.p = obtainStyledAttributes.getFloat(index, this.p);
            } else if (index == 4) {
                this.q = obtainStyledAttributes.getFloat(index, this.q);
            } else if (index == 6) {
                this.r = obtainStyledAttributes.getBoolean(index, this.r);
            } else if (index == 1) {
                this.s = obtainStyledAttributes.getFloat(index, this.s);
            } else if (index == 2) {
                this.u = obtainStyledAttributes.getFloat(index, this.u);
            } else if (index == 11) {
                this.e = obtainStyledAttributes.getResourceId(index, this.e);
            } else if (index == 8) {
                this.c = obtainStyledAttributes.getInt(index, this.c);
            } else if (index == 7) {
                this.t = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 3) {
                this.f = obtainStyledAttributes.getResourceId(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    public float a(float f2, float f3) {
        return (f3 * this.j) + (f2 * this.i);
    }

    public int b() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public RectF c(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i2 = this.f;
        if (i2 == -1 || (findViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.q;
    }

    public float e() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public float g(float f2, float f3) {
        this.o.getAnchorDpDt(this.d, this.o.getProgress(), this.h, this.g, this.l);
        float f4 = this.i;
        if (f4 != 0.0f) {
            float[] fArr = this.l;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f2 * f4) / fArr[0];
        }
        float[] fArr2 = this.l;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f3 * this.j) / fArr2[1];
    }

    /* access modifiers changed from: package-private */
    public RectF h(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i2 = this.e;
        if (i2 == -1 || (findViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public void j(MotionEvent motionEvent, MotionLayout.e eVar) {
        float f2;
        int i2;
        float f3;
        MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
        MotionLayout.f fVar = (MotionLayout.f) eVar;
        VelocityTracker velocityTracker = fVar.a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.m = motionEvent.getRawX();
            this.n = motionEvent.getRawY();
            this.k = false;
        } else if (action == 1) {
            this.k = false;
            VelocityTracker velocityTracker2 = fVar.a;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(Constants.ONE_SECOND);
            }
            VelocityTracker velocityTracker3 = fVar.a;
            float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
            VelocityTracker velocityTracker4 = fVar.a;
            float yVelocity = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
            float progress = this.o.getProgress();
            int i3 = this.d;
            if (i3 != -1) {
                this.o.getAnchorDpDt(i3, progress, this.h, this.g, this.l);
            } else {
                float min = (float) Math.min(this.o.getWidth(), this.o.getHeight());
                float[] fArr = this.l;
                fArr[1] = this.j * min;
                fArr[0] = min * this.i;
            }
            float f4 = this.i;
            float[] fArr2 = this.l;
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            if (f4 != 0.0f) {
                f2 = xVelocity / fArr2[0];
            } else {
                f2 = yVelocity / fArr2[1];
            }
            float f7 = !Float.isNaN(f2) ? (f2 / 3.0f) + progress : progress;
            if (f7 != 0.0f && f7 != 1.0f && (i2 = this.c) != 3) {
                this.o.touchAnimateTo(i2, ((double) f7) < 0.5d ? 0.0f : 1.0f, f2);
                if (0.0f >= progress || 1.0f <= progress) {
                    this.o.setState(transitionState);
                }
            } else if (0.0f >= f7 || 1.0f <= f7) {
                this.o.setState(transitionState);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.n;
            float rawX = motionEvent.getRawX() - this.m;
            if (Math.abs((this.j * rawY) + (this.i * rawX)) > this.u || this.k) {
                float progress2 = this.o.getProgress();
                if (!this.k) {
                    this.k = true;
                    this.o.setProgress(progress2);
                }
                int i4 = this.d;
                if (i4 != -1) {
                    this.o.getAnchorDpDt(i4, progress2, this.h, this.g, this.l);
                } else {
                    float min2 = (float) Math.min(this.o.getWidth(), this.o.getHeight());
                    float[] fArr3 = this.l;
                    fArr3[1] = this.j * min2;
                    fArr3[0] = min2 * this.i;
                }
                float f8 = this.i;
                float[] fArr4 = this.l;
                if (((double) Math.abs(((this.j * fArr4[1]) + (f8 * fArr4[0])) * this.s)) < 0.01d) {
                    float[] fArr5 = this.l;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.i != 0.0f) {
                    f3 = rawX / this.l[0];
                } else {
                    f3 = rawY / this.l[1];
                }
                float max = Math.max(Math.min(progress2 + f3, 1.0f), 0.0f);
                if (max != this.o.getProgress()) {
                    this.o.setProgress(max);
                    VelocityTracker velocityTracker5 = fVar.a;
                    if (velocityTracker5 != null) {
                        velocityTracker5.computeCurrentVelocity(Constants.ONE_SECOND);
                    }
                    VelocityTracker velocityTracker6 = fVar.a;
                    float xVelocity2 = velocityTracker6 != null ? velocityTracker6.getXVelocity() : 0.0f;
                    VelocityTracker velocityTracker7 = fVar.a;
                    this.o.mLastVelocity = this.i != 0.0f ? xVelocity2 / this.l[0] : (velocityTracker7 != null ? velocityTracker7.getYVelocity() : 0.0f) / this.l[1];
                } else {
                    this.o.mLastVelocity = 0.0f;
                }
                this.m = motionEvent.getRawX();
                this.n = motionEvent.getRawY();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(float f2, float f3) {
        float f4;
        float progress = this.o.getProgress();
        if (!this.k) {
            this.k = true;
            this.o.setProgress(progress);
        }
        this.o.getAnchorDpDt(this.d, progress, this.h, this.g, this.l);
        float f5 = this.i;
        float[] fArr = this.l;
        if (((double) Math.abs((this.j * fArr[1]) + (f5 * fArr[0]))) < 0.01d) {
            float[] fArr2 = this.l;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f6 = this.i;
        if (f6 != 0.0f) {
            f4 = (f2 * f6) / this.l[0];
        } else {
            f4 = (f3 * this.j) / this.l[1];
        }
        float max = Math.max(Math.min(progress + f4, 1.0f), 0.0f);
        if (max != this.o.getProgress()) {
            this.o.setProgress(max);
        }
    }

    /* access modifiers changed from: package-private */
    public void l(float f2, float f3) {
        float f4;
        boolean z = false;
        this.k = false;
        float progress = this.o.getProgress();
        this.o.getAnchorDpDt(this.d, progress, this.h, this.g, this.l);
        float f5 = this.i;
        float[] fArr = this.l;
        float f6 = fArr[0];
        float f7 = this.j;
        float f8 = fArr[1];
        float f9 = 0.0f;
        if (f5 != 0.0f) {
            f4 = (f2 * f5) / fArr[0];
        } else {
            f4 = (f3 * f7) / fArr[1];
        }
        if (!Float.isNaN(f4)) {
            progress += f4 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z2 = progress != 1.0f;
            int i2 = this.c;
            if (i2 != 3) {
                z = true;
            }
            if (z && z2) {
                MotionLayout motionLayout = this.o;
                if (((double) progress) >= 0.5d) {
                    f9 = 1.0f;
                }
                motionLayout.touchAnimateTo(i2, f9, f4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(float f2, float f3) {
        this.m = f2;
        this.n = f3;
    }

    public void n(boolean z) {
        float[][] fArr = v;
        float[][] fArr2 = w;
        if (z) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        int i2 = this.a;
        this.h = fArr[i2][0];
        this.g = fArr[i2][1];
        int i3 = this.b;
        this.i = fArr2[i3][0];
        this.j = fArr2[i3][1];
    }

    /* access modifiers changed from: package-private */
    public void o(float f2, float f3) {
        this.m = f2;
        this.n = f3;
        this.k = false;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        View view;
        int i2 = this.d;
        if (i2 != -1) {
            view = this.o.findViewById(i2);
            if (view == null) {
                StringBuilder V0 = je.V0("cannot find TouchAnchorId @id/");
                V0.append(g0.b(this.o.getContext(), this.d));
                Log.e("TouchResponse", V0.toString());
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a(this));
            nestedScrollView.setOnScrollChangeListener(new b(this));
        }
    }

    public String toString() {
        return this.i + " , " + this.j;
    }
}
