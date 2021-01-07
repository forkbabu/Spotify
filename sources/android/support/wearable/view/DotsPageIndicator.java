package android.support.wearable.view;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.wearable.view.GridViewPager;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.music.C0707R;

@Deprecated
public class DotsPageIndicator extends View implements GridViewPager.e, GridViewPager.d {
    private final Paint A;
    private final Paint B;
    private final Paint C;
    private boolean D;
    private GridViewPager E;
    private GridViewPager.e F;
    private GridViewPager.d G;
    private int a;
    private float b;
    private float c;
    private int f;
    private int n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private float s;
    private float t;
    private float u;
    private int v;
    private int w;
    private int x;
    private int y;
    private final Paint z;

    /* access modifiers changed from: package-private */
    public class a extends i {
        a() {
        }

        @Override // android.support.wearable.view.i
        public void a(Animator animator) {
            DotsPageIndicator.this.D = false;
            DotsPageIndicator.this.animate().alpha(0.0f).setListener(null).setStartDelay((long) DotsPageIndicator.this.p).setDuration((long) DotsPageIndicator.this.q).start();
        }
    }

    public DotsPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void f() {
        this.D = true;
        animate().cancel();
        animate().alpha(1.0f).setStartDelay(0).setDuration((long) this.r).start();
    }

    private void g() {
        this.D = true;
        animate().cancel();
        animate().alpha(1.0f).setStartDelay(0).setDuration((long) this.r).setListener(new a()).start();
    }

    private void h(long j) {
        this.D = false;
        animate().cancel();
        animate().alpha(0.0f).setStartDelay(j).setDuration((long) this.q).start();
    }

    private void i(Paint paint, Paint paint2, float f2, float f3, int i, int i2) {
        float f4 = f2 + f3;
        paint2.setShader(new RadialGradient(0.0f, 0.0f, f4, new int[]{i2, i2, 0}, new float[]{0.0f, f2 / f4, 1.0f}, Shader.TileMode.CLAMP));
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    private void j() {
        i(this.z, this.A, this.b, this.u, this.f, this.v);
        i(this.B, this.C, this.c, this.u, this.n, this.v);
    }

    @Override // android.support.wearable.view.GridViewPager.e
    public void a(int i) {
        if (this.y != i) {
            this.y = i;
            if (this.o && i == 0) {
                if (this.D) {
                    h((long) this.p);
                } else {
                    g();
                }
            }
        }
        GridViewPager.e eVar = this.F;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.support.wearable.view.GridViewPager.e
    public void b(int i, int i2, float f2, float f3, int i3, int i4) {
        if (this.o && this.y == 1) {
            if (f3 != 0.0f) {
                if (!this.D) {
                    f();
                }
            } else if (this.D) {
                h(0);
            }
        }
        GridViewPager.e eVar = this.F;
        if (eVar != null) {
            eVar.b(i, i2, f2, f3, i3, i4);
        }
    }

    public int getDotColor() {
        return this.f;
    }

    public int getDotColorSelected() {
        return this.n;
    }

    public int getDotFadeInDuration() {
        return this.r;
    }

    public int getDotFadeOutDelay() {
        return this.p;
    }

    public int getDotFadeOutDuration() {
        return this.q;
    }

    public boolean getDotFadeWhenIdle() {
        return this.o;
    }

    public float getDotRadius() {
        return this.b;
    }

    public float getDotRadiusSelected() {
        return this.c;
    }

    public int getDotShadowColor() {
        return this.v;
    }

    public float getDotShadowDx() {
        return this.s;
    }

    public float getDotShadowDy() {
        return this.t;
    }

    public float getDotShadowRadius() {
        return this.u;
    }

    public float getDotSpacing() {
        return (float) this.a;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.w > 1) {
            float f2 = ((float) this.a) / 2.0f;
            canvas.save();
            canvas.translate(f2 + ((float) getPaddingLeft()), ((float) getHeight()) / 2.0f);
            for (int i = 0; i < this.w; i++) {
                if (i == this.x) {
                    canvas.drawCircle(this.s, this.t, this.c + this.u, this.C);
                    canvas.drawCircle(0.0f, 0.0f, this.c, this.B);
                } else {
                    canvas.drawCircle(this.s, this.t, this.b + this.u, this.A);
                    canvas.drawCircle(0.0f, 0.0f, this.b, this.z);
                }
                canvas.translate((float) this.a, 0.0f);
            }
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = getPaddingRight() + getPaddingLeft() + (this.w * this.a);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        } else {
            float f2 = this.b;
            float f3 = this.u;
            i4 = getPaddingBottom() + getPaddingTop() + ((int) (((float) ((int) Math.ceil((double) (Math.max(f2 + f3, this.c + f3) * 2.0f)))) + this.t));
        }
        setMeasuredDimension(View.resolveSizeAndState(i3, i, 0), View.resolveSizeAndState(i4, i2, 0));
    }

    public void setDotColor(int i) {
        if (this.f != i) {
            this.f = i;
            invalidate();
        }
    }

    public void setDotColorSelected(int i) {
        if (this.n != i) {
            this.n = i;
            invalidate();
        }
    }

    public void setDotFadeOutDelay(int i) {
        this.p = i;
    }

    public void setDotFadeWhenIdle(boolean z2) {
        this.o = z2;
        if (!z2) {
            f();
        }
    }

    public void setDotRadius(int i) {
        float f2 = (float) i;
        if (this.b != f2) {
            this.b = f2;
            j();
            invalidate();
        }
    }

    public void setDotRadiusSelected(int i) {
        float f2 = (float) i;
        if (this.c != f2) {
            this.c = f2;
            j();
            invalidate();
        }
    }

    public void setDotShadowColor(int i) {
        this.v = i;
        j();
        invalidate();
    }

    public void setDotShadowDx(float f2) {
        this.s = f2;
        invalidate();
    }

    public void setDotShadowDy(float f2) {
        this.t = f2;
        invalidate();
    }

    public void setDotShadowRadius(float f2) {
        if (this.u != f2) {
            this.u = f2;
            j();
            invalidate();
        }
    }

    public void setDotSpacing(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    public void setOnAdapterChangeListener(GridViewPager.d dVar) {
        this.G = dVar;
    }

    public void setOnPageChangeListener(GridViewPager.e eVar) {
        this.F = eVar;
    }

    public void setPager(GridViewPager gridViewPager) {
        GridViewPager gridViewPager2 = this.E;
        if (gridViewPager2 != gridViewPager) {
            if (gridViewPager2 != null) {
                gridViewPager2.setOnPageChangeListener(null);
                this.E.setOnAdapterChangeListener(null);
                this.E = null;
            }
            this.E = gridViewPager;
            if (gridViewPager != null) {
                gridViewPager.setOnPageChangeListener(this);
                this.E.setOnAdapterChangeListener(this);
                this.E.getAdapter();
            }
        }
    }

    public DotsPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.j, 0, C0707R.style.DotsPageIndicatorStyle);
        this.a = obtainStyledAttributes.getDimensionPixelOffset(12, 0);
        this.b = obtainStyledAttributes.getDimension(6, 0.0f);
        this.c = obtainStyledAttributes.getDimension(7, 0.0f);
        this.f = obtainStyledAttributes.getColor(0, 0);
        this.n = obtainStyledAttributes.getColor(1, 0);
        this.p = obtainStyledAttributes.getInt(3, 0);
        this.q = obtainStyledAttributes.getInt(4, 0);
        this.r = obtainStyledAttributes.getInt(2, 0);
        this.o = obtainStyledAttributes.getBoolean(5, false);
        this.s = obtainStyledAttributes.getDimension(9, 0.0f);
        this.t = obtainStyledAttributes.getDimension(10, 0.0f);
        this.u = obtainStyledAttributes.getDimension(11, 0.0f);
        this.v = obtainStyledAttributes.getColor(8, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.z = paint;
        paint.setColor(this.f);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.B = paint2;
        paint2.setColor(this.n);
        paint2.setStyle(Paint.Style.FILL);
        this.A = new Paint(1);
        this.C = new Paint(1);
        this.y = 0;
        if (isInEditMode()) {
            this.w = 5;
            this.x = 2;
            this.o = false;
        }
        if (this.o) {
            this.D = false;
            animate().alpha(0.0f).setStartDelay(2000).setDuration((long) this.q).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
        }
        j();
    }
}
