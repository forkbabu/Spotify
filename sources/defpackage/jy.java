package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.h;
import com.google.android.material.internal.j;
import com.spotify.music.C0707R;
import defpackage.dy;

/* renamed from: jy  reason: default package */
public class jy extends yx implements h.b {
    private CharSequence H;
    private final Context I;
    private final Paint.FontMetrics J = new Paint.FontMetrics();
    private final h K;
    private final View.OnLayoutChangeListener L;
    private final Rect M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;

    /* renamed from: jy$a */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            jy.X(jy.this, view);
        }
    }

    private jy(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        h hVar = new h(this);
        this.K = hVar;
        this.L = new a();
        this.M = new Rect();
        this.I = context;
        hVar.d().density = context.getResources().getDisplayMetrics().density;
        hVar.d().setTextAlign(Paint.Align.CENTER);
    }

    static void X(jy jyVar, View view) {
        jyVar.getClass();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        jyVar.S = iArr[0];
        view.getWindowVisibleDisplayFrame(jyVar.M);
    }

    private float Y() {
        int i;
        if (((this.M.right - getBounds().right) - this.S) - this.Q < 0) {
            i = ((this.M.right - getBounds().right) - this.S) - this.Q;
        } else if (((this.M.left - getBounds().left) - this.S) + this.Q <= 0) {
            return 0.0f;
        } else {
            i = ((this.M.left - getBounds().left) - this.S) + this.Q;
        }
        return (float) i;
    }

    public static jy Z(Context context, AttributeSet attributeSet, int i, int i2) {
        jy jyVar = new jy(context, null, i, i2);
        TypedArray f = j.f(jyVar.I, null, pw.R, i, i2, new int[0]);
        jyVar.R = jyVar.I.getResources().getDimensionPixelSize(C0707R.dimen.mtrl_tooltip_arrowSize);
        dy w = jyVar.w();
        w.getClass();
        dy.b bVar = new dy.b(w);
        bVar.q(jyVar.a0());
        jyVar.setShapeAppearanceModel(bVar.m());
        CharSequence text = f.getText(5);
        if (!TextUtils.equals(jyVar.H, text)) {
            jyVar.H = text;
            jyVar.K.g(true);
            jyVar.invalidateSelf();
        }
        jyVar.K.f(jx.d(jyVar.I, f, 0), jyVar.I);
        int t = rw.t(jyVar.I, C0707R.attr.colorOnBackground, jy.class.getCanonicalName());
        jyVar.H(ColorStateList.valueOf(f.getColor(6, s2.e(s2.h(t, 153), s2.h(rw.t(jyVar.I, 16842801, jy.class.getCanonicalName()), 229)))));
        jyVar.S(ColorStateList.valueOf(rw.t(jyVar.I, C0707R.attr.colorSurface, jy.class.getCanonicalName())));
        jyVar.N = f.getDimensionPixelSize(1, 0);
        jyVar.O = f.getDimensionPixelSize(3, 0);
        jyVar.P = f.getDimensionPixelSize(4, 0);
        jyVar.Q = f.getDimensionPixelSize(2, 0);
        f.recycle();
        return jyVar;
    }

    private wx a0() {
        double width = (double) getBounds().width();
        double d = (double) this.R;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        Double.isNaN(width);
        float f = ((float) (width - (sqrt * d))) / 2.0f;
        return new ay(new xx((float) this.R), Math.min(Math.max(-Y(), -f), f));
    }

    @Override // com.google.android.material.internal.h.b
    public void a() {
        invalidateSelf();
    }

    public void b0(View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.L);
        }
    }

    public void c0(View view) {
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            this.S = iArr[0];
            view.getWindowVisibleDisplayFrame(this.M);
            view.addOnLayoutChangeListener(this.L);
        }
    }

    public void d0(CharSequence charSequence) {
        if (!TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.K.g(true);
            invalidateSelf();
        }
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float Y = Y();
        double d = (double) this.R;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        double d2 = sqrt * d;
        double d3 = (double) this.R;
        Double.isNaN(d3);
        canvas.translate(Y, (float) (-(d2 - d3)));
        super.draw(canvas);
        if (this.H != null) {
            Rect bounds = getBounds();
            this.K.d().getFontMetrics(this.J);
            Paint.FontMetrics fontMetrics = this.J;
            int centerY = (int) (((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (this.K.c() != null) {
                this.K.d().drawableState = getState();
                this.K.h(this.I);
            }
            CharSequence charSequence = this.H;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) centerY, this.K.d());
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.K.d().getTextSize(), (float) this.P);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f;
        float f2 = (float) (this.N * 2);
        CharSequence charSequence = this.H;
        if (charSequence == null) {
            f = 0.0f;
        } else {
            f = this.K.e(charSequence.toString());
        }
        return (int) Math.max(f2 + f, (float) this.O);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.yx, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        dy w = w();
        w.getClass();
        dy.b bVar = new dy.b(w);
        bVar.q(a0());
        setShapeAppearanceModel(bVar.m());
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
