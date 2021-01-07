package com.spotify.glue.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.spotify.music.C0707R;

public class GlueDialogLayout extends LinearLayout {
    private final int a;
    private final int b;
    private final int c;
    private final int f;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private ScrollView r;
    private Button s;
    private Button t;
    private boolean u;
    private final Paint v;

    public GlueDialogLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int a(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return measuredHeight;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.u || view != this.r) {
            return super.drawChild(canvas, view, j);
        }
        super.drawChild(canvas, view, j);
        canvas.save();
        canvas.translate((float) view.getLeft(), (float) (view.getBottom() - this.n));
        canvas.scale(1.0f, (float) this.n);
        canvas.drawRect(0.0f, 0.0f, (float) view.getMeasuredWidth(), 1.0f, this.v);
        canvas.restore();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.r = (ScrollView) findViewById(C0707R.id.content);
        this.s = (Button) findViewById(C0707R.id.button_positive);
        this.t = (Button) findViewById(C0707R.id.button_negative);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int min = Math.min(getResources().getDisplayMetrics().widthPixels - (this.c * 2), this.a);
        ScrollView scrollView = this.r;
        if (scrollView == null || scrollView.getChildAt(0) == null) {
            super.onMeasure(z42.A(min), i2);
            return;
        }
        int min2 = Math.min(getResources().getDisplayMetrics().heightPixels - (this.f * 2), this.b);
        View childAt = this.r.getChildAt(0);
        childAt.measure(z42.A((min - this.r.getPaddingLeft()) - this.r.getPaddingRight()), z42.B());
        int measuredHeight = childAt.getMeasuredHeight();
        Button button = this.s;
        int i3 = this.p;
        if (button.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).topMargin = i3;
        }
        measureChildWithMargins(this.s, i, 0, i2, 0);
        measureChildWithMargins(this.t, i, 0, i2, 0);
        int a2 = a(this.t);
        int a3 = a(this.s) + measuredHeight + a2;
        if (a3 <= min2) {
            this.u = false;
            this.r.getLayoutParams().height = measuredHeight;
        } else {
            this.u = true;
            Button button2 = this.s;
            int i4 = this.q;
            if (button2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) button2.getLayoutParams()).topMargin = i4;
            }
            int a4 = a(this.s);
            int i5 = a3 - min2;
            int i6 = this.p - this.q;
            this.r.getLayoutParams().height = (min2 - a4) - a2;
            if (i5 <= i6) {
                this.r.getLayoutParams().height -= i6;
            }
            ScrollView scrollView2 = this.r;
            scrollView2.setPadding(scrollView2.getPaddingLeft(), 0, this.r.getPaddingRight(), this.o);
        }
        super.onMeasure(z42.A(min), i2);
    }

    public GlueDialogLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.v = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.a, i, 0);
        try {
            this.a = obtainStyledAttributes.getDimensionPixelSize(6, nud.g(312.0f, getResources()));
            this.b = obtainStyledAttributes.getDimensionPixelSize(5, nud.g(520.0f, getResources()));
            this.c = obtainStyledAttributes.getDimensionPixelSize(4, nud.g(24.0f, getResources()));
            this.f = obtainStyledAttributes.getDimensionPixelSize(8, nud.g(24.0f, getResources()));
            this.n = obtainStyledAttributes.getDimensionPixelSize(3, nud.g(48.0f, getResources()));
            this.p = obtainStyledAttributes.getDimensionPixelSize(0, nud.g(48.0f, getResources()));
            this.q = obtainStyledAttributes.getDimensionPixelSize(1, nud.g(32.0f, getResources()));
            this.o = obtainStyledAttributes.getDimensionPixelSize(7, nud.g(40.0f, getResources()));
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, obtainStyledAttributes.getColor(2, -1), Shader.TileMode.CLAMP));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
