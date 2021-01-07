package me.grantland.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

public class a {
    private final TextView a;
    private final TextPaint b;
    private float c;
    private int d;
    private float e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private ArrayList<d> j;
    private final TextWatcher k = new c(null);
    private final View.OnLayoutChangeListener l = new b(null);

    private class b implements View.OnLayoutChangeListener {
        b(C0638a aVar) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            a.this.c();
        }
    }

    private class c extends l62 {
        c(C0638a aVar) {
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a.this.c();
        }
    }

    public interface d {
        void i(float f, float f2);
    }

    private a(TextView textView) {
        int i2;
        float f2 = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.a = textView;
        this.b = new TextPaint();
        float textSize = textView.getTextSize();
        if (k(this.c, textSize)) {
            this.c = textSize;
        }
        if (textView.getTransformationMethod() instanceof SingleLineTransformationMethod) {
            i2 = 1;
        } else {
            i2 = textView.getMaxLines();
        }
        this.d = i2;
        this.e = f2 * 8.0f;
        this.f = this.c;
        this.g = 0.5f;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0093, code lost:
        if (r12.measureText(r4, 0, r2) <= ((float) r5)) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: me.grantland.widget.a.c():void");
    }

    public static a d(TextView textView) {
        return e(textView, null, 0);
    }

    public static a e(TextView textView, AttributeSet attributeSet, int i2) {
        a aVar = new a(textView);
        boolean z = true;
        if (attributeSet != null) {
            Context context = textView.getContext();
            float f2 = aVar.g;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a, i2, 0);
            boolean z2 = obtainStyledAttributes.getBoolean(2, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, (int) aVar.e);
            float f3 = obtainStyledAttributes.getFloat(1, f2);
            obtainStyledAttributes.recycle();
            aVar.o(0, (float) dimensionPixelSize);
            if (k(aVar.g, f3)) {
                aVar.g = f3;
                aVar.c();
            }
            z = z2;
        }
        aVar.l(z);
        return aVar;
    }

    private static float f(CharSequence charSequence, TextPaint textPaint, float f2, int i2, float f3, float f4, float f5, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int i3;
        float f6;
        float f7 = (f3 + f4) / 2.0f;
        textPaint.setTextSize(TypedValue.applyDimension(0, f7, displayMetrics));
        if (i2 != 1) {
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, (int) f2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            i3 = staticLayout2.getLineCount();
            staticLayout = staticLayout2;
        } else {
            staticLayout = null;
            i3 = 1;
        }
        if (i3 > i2 || j(staticLayout, charSequence)) {
            if (f4 - f3 < f5) {
                return f3;
            }
            return f(charSequence, textPaint, f2, i2, f3, f7, f5, displayMetrics);
        } else if (i3 < i2) {
            return f(charSequence, textPaint, f2, i2, f7, f4, f5, displayMetrics);
        } else {
            float f8 = 0.0f;
            if (i2 == 1) {
                f6 = textPaint.measureText(charSequence, 0, charSequence.length());
            } else {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (staticLayout.getLineWidth(i4) > f8) {
                        f8 = staticLayout.getLineWidth(i4);
                    }
                }
                f6 = f8;
            }
            if (f4 - f3 < f5) {
                return f3;
            }
            if (f6 > f2) {
                return f(charSequence, textPaint, f2, i2, f3, f7, f5, displayMetrics);
            }
            return f6 < f2 ? f(charSequence, textPaint, f2, i2, f7, f4, f5, displayMetrics) : f7;
        }
    }

    private static boolean j(StaticLayout staticLayout, CharSequence charSequence) {
        if (staticLayout == null || charSequence.length() == 0 || staticLayout.getLineCount() <= 1) {
            return false;
        }
        int lineCount = staticLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount - 1; i2++) {
            char charAt = charSequence.charAt(staticLayout.getLineEnd(i2) - 1);
            if (!(charAt == ' ' || charAt == '-' || charAt == '\n')) {
                return true;
            }
        }
        return false;
    }

    private static boolean k(float f2, float f3) {
        return Math.abs(f2 - f3) > 1.0E-5f;
    }

    public a b(d dVar) {
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(dVar);
        return this;
    }

    public float g() {
        return this.f;
    }

    public float h() {
        return this.e;
    }

    public float i() {
        return this.g;
    }

    public a l(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (z) {
                this.a.addTextChangedListener(this.k);
                this.a.addOnLayoutChangeListener(this.l);
                c();
            } else {
                this.a.removeTextChangedListener(this.k);
                this.a.removeOnLayoutChangeListener(this.l);
                this.a.setTextSize(0, this.c);
            }
        }
        return this;
    }

    public a m(int i2) {
        if (this.d != i2) {
            this.d = i2;
            c();
        }
        return this;
    }

    public a n(float f2) {
        Context context = this.a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(2, f2, system.getDisplayMetrics());
        if (k(applyDimension, this.f)) {
            this.f = applyDimension;
            c();
        }
        return this;
    }

    public a o(int i2, float f2) {
        Context context = this.a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f2, system.getDisplayMetrics());
        if (k(applyDimension, this.e)) {
            this.e = applyDimension;
            c();
        }
        return this;
    }

    public a p(float f2) {
        if (k(this.g, f2)) {
            this.g = f2;
            c();
        }
        return this;
    }

    public void q(int i2, float f2) {
        if (!this.i) {
            Context context = this.a.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            float applyDimension = TypedValue.applyDimension(i2, f2, system.getDisplayMetrics());
            if (k(this.c, applyDimension)) {
                this.c = applyDimension;
            }
        }
    }
}
