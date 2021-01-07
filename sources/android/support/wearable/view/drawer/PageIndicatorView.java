package android.support.wearable.view.drawer;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.wearable.view.i;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.C0707R;

@Deprecated
public class PageIndicatorView extends View implements ViewPager.i {
    private final Paint A;
    private final Paint B;
    private final Paint C;
    private final Paint D;
    private boolean E;
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
    private androidx.viewpager.widget.a w;
    private int x;
    private int y;
    private int z;

    /* access modifiers changed from: package-private */
    public class a extends i {
        a() {
        }

        @Override // android.support.wearable.view.i
        public void a(Animator animator) {
            PageIndicatorView.this.E = false;
            PageIndicatorView.this.animate().alpha(0.0f).setListener(null).setStartDelay((long) PageIndicatorView.this.p).setDuration((long) PageIndicatorView.this.q).start();
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void e() {
        this.E = true;
        animate().cancel();
        animate().alpha(1.0f).setStartDelay(0).setDuration((long) this.r).start();
    }

    private void h() {
        this.E = true;
        animate().cancel();
        animate().alpha(1.0f).setStartDelay(0).setDuration((long) this.r).setListener(new a()).start();
    }

    private void i(long j) {
        this.E = false;
        animate().cancel();
        animate().alpha(0.0f).setStartDelay(j).setDuration((long) this.q).start();
    }

    private void j(Paint paint, Paint paint2, float f2, float f3, int i, int i2) {
        float f4 = f2 + f3;
        paint2.setShader(new RadialGradient(0.0f, 0.0f, f4, new int[]{i2, i2, 0}, new float[]{0.0f, f2 / f4, 1.0f}, Shader.TileMode.CLAMP));
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    private void k() {
        j(this.A, this.B, this.b, this.u, this.f, this.v);
        j(this.C, this.D, this.c, this.u, this.n, this.v);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void a(int i) {
        if (this.z != i) {
            this.z = i;
            if (this.o && i == 0) {
                if (this.E) {
                    i((long) this.p);
                } else {
                    h();
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void f(int i, float f2, int i2) {
        if (this.o && this.z == 1) {
            if (f2 != 0.0f) {
                if (!this.E) {
                    e();
                }
            } else if (this.E) {
                i(0);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void g(int i) {
        if (i != this.y) {
            this.y = i;
            invalidate();
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
        if (this.x > 1) {
            float f2 = ((float) this.a) / 2.0f;
            canvas.save();
            canvas.translate(f2 + ((float) getPaddingLeft()), ((float) getHeight()) / 2.0f);
            for (int i = 0; i < this.x; i++) {
                if (i == this.y) {
                    canvas.drawCircle(this.s, this.t, this.c + this.u, this.D);
                    canvas.drawCircle(0.0f, 0.0f, this.c, this.C);
                } else {
                    canvas.drawCircle(this.s, this.t, this.b + this.u, this.B);
                    canvas.drawCircle(0.0f, 0.0f, this.b, this.A);
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
            i3 = getPaddingRight() + getPaddingLeft() + (this.x * this.a);
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
            e();
        }
    }

    public void setDotRadius(int i) {
        float f2 = (float) i;
        if (this.b != f2) {
            this.b = f2;
            k();
            invalidate();
        }
    }

    public void setDotRadiusSelected(int i) {
        float f2 = (float) i;
        if (this.c != f2) {
            this.c = f2;
            k();
            invalidate();
        }
    }

    public void setDotShadowColor(int i) {
        this.v = i;
        k();
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
            k();
            invalidate();
        }
    }

    public void setDotSpacing(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    public void setPager(ViewPager viewPager) {
        viewPager.c(this);
        setPagerAdapter(viewPager.getAdapter());
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        this.w = adapter;
        if (adapter != null && adapter.d() > 0) {
            this.y = 0;
            invalidate();
        }
    }

    public void setPagerAdapter(androidx.viewpager.widget.a aVar) {
        this.w = aVar;
        if (aVar != null) {
            int d = aVar.d();
            if (d != this.x) {
                this.x = d;
                requestLayout();
            }
            if (this.o) {
                h();
            }
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.k, i, C0707R.style.PageIndicatorViewStyle);
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
        this.A = paint;
        paint.setColor(this.f);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.C = paint2;
        paint2.setColor(this.n);
        paint2.setStyle(Paint.Style.FILL);
        this.B = new Paint(1);
        this.D = new Paint(1);
        this.z = 0;
        if (isInEditMode()) {
            this.x = 5;
            this.y = 2;
            this.o = false;
        }
        if (this.o) {
            this.E = false;
            animate().alpha(0.0f).setStartDelay(2000).setDuration((long) this.q).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
        }
        k();
    }
}
