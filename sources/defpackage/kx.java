package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: kx  reason: default package */
public class kx {
    public final float a;
    public final ColorStateList b;
    public final int c;
    public final int d;
    public final String e;
    public final ColorStateList f;
    public final float g;
    public final float h;
    public final float i;
    private final int j;
    private boolean k = false;
    private Typeface l;

    /* access modifiers changed from: package-private */
    /* renamed from: kx$a */
    public class a extends p2 {
        final /* synthetic */ mx a;

        a(mx mxVar) {
            this.a = mxVar;
        }

        @Override // defpackage.p2
        public void c(int i) {
            kx.this.k = true;
            this.a.a(i);
        }

        @Override // defpackage.p2
        public void d(Typeface typeface) {
            kx kxVar = kx.this;
            kxVar.l = Typeface.create(typeface, kxVar.c);
            kx.this.k = true;
            this.a.b(kx.this.l, false);
        }
    }

    public kx(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, pw.N);
        this.a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.b = jx.a(context, obtainStyledAttributes, 3);
        jx.a(context, obtainStyledAttributes, 4);
        jx.a(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i3 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.j = obtainStyledAttributes.getResourceId(i3, 0);
        this.e = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.f = jx.a(context, obtainStyledAttributes, 6);
        this.g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void d() {
        String str;
        if (this.l == null && (str = this.e) != null) {
            this.l = Typeface.create(str, this.c);
        }
        if (this.l == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.l = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.l = Typeface.SERIF;
            } else if (i2 != 3) {
                this.l = Typeface.DEFAULT;
            } else {
                this.l = Typeface.MONOSPACE;
            }
            this.l = Typeface.create(this.l, this.c);
        }
    }

    public Typeface e() {
        d();
        return this.l;
    }

    public void f(Context context, mx mxVar) {
        d();
        int i2 = this.j;
        if (i2 == 0) {
            this.k = true;
        }
        if (this.k) {
            mxVar.b(this.l, true);
            return;
        }
        try {
            i2.g(context, i2, new a(mxVar), null);
        } catch (Resources.NotFoundException unused) {
            this.k = true;
            mxVar.a(1);
        } catch (Exception unused2) {
            this.k = true;
            mxVar.a(-3);
        }
    }

    public void g(Context context, TextPaint textPaint, mx mxVar) {
        d();
        i(textPaint, this.l);
        f(context, new lx(this, textPaint, mxVar));
        ColorStateList colorStateList = this.b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.i;
        float f3 = this.g;
        float f4 = this.h;
        ColorStateList colorStateList2 = this.f;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void h(Context context, TextPaint textPaint, mx mxVar) {
        d();
        i(textPaint, this.l);
        f(context, new lx(this, textPaint, mxVar));
    }

    public void i(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.c;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.a);
    }
}
