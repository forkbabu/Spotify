package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

public class PagerTabStrip extends PagerTitleStrip {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private final Paint F;
    private final Rect G = new Rect();
    private int H = BitmapRenderer.ALPHA_VISIBLE;
    private boolean I = false;
    private boolean J = false;
    private int K;
    private boolean L;
    private float M;
    private float N;
    private int O;
    private int z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.F = paint;
        int i = this.w;
        this.z = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.A = (int) ((3.0f * f) + 0.5f);
        this.B = (int) ((6.0f * f) + 0.5f);
        this.C = (int) (64.0f * f);
        this.E = (int) ((16.0f * f) + 0.5f);
        this.K = (int) ((1.0f * f) + 0.5f);
        this.D = (int) ((f * 32.0f) + 0.5f);
        this.O = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(new a());
        this.f.setFocusable(true);
        this.f.setOnClickListener(new b());
        if (getBackground() == null) {
            this.I = true;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void c(int i, float f, boolean z2) {
        Rect rect = this.G;
        int height = getHeight();
        int left = this.c.getLeft() - this.E;
        int right = this.c.getRight() + this.E;
        int i2 = height - this.A;
        rect.set(left, i2, right, height);
        super.c(i, f, z2);
        this.H = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.c.getLeft() - this.E, i2, this.c.getRight() + this.E, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.I;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.D);
    }

    public int getTabIndicatorColor() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.c.getLeft() - this.E;
        int right = this.c.getRight() + this.E;
        this.F.setColor((this.H << 24) | (this.z & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.A), (float) right, f, this.F);
        if (this.I) {
            this.F.setColor(-16777216 | (this.z & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.K), (float) (getWidth() - getPaddingRight()), f, this.F);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.L) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.M = x;
            this.N = y;
            this.L = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.M) > ((float) this.O) || Math.abs(y - this.N) > ((float) this.O))) {
                this.L = true;
            }
        } else if (x < ((float) (this.c.getLeft() - this.E))) {
            ViewPager viewPager = this.a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > ((float) (this.c.getRight() + this.E))) {
            ViewPager viewPager2 = this.a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.J) {
            this.I = (i & -16777216) == 0;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.J) {
            this.I = drawable == null;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.J) {
            this.I = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z2) {
        this.I = z2;
        this.J = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.B;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.z = i;
        this.F.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(androidx.core.content.a.b(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.C;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }
}
