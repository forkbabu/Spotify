package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class FontFitTextView extends AppCompatTextView {
    private float a;
    private int b;

    public FontFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j(attributeSet);
    }

    private void j(AttributeSet attributeSet) {
        this.a = getTextSize();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, a52.d, 0, 0);
            try {
                this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private void k(String str, int i) {
        int paddingLeft;
        if (i > 0 && !str.isEmpty() && (paddingLeft = (i - getPaddingLeft()) - getPaddingRight()) > 2) {
            Paint paint = new Paint();
            paint.set(getPaint());
            paint.setTextSize(this.a);
            float f = (float) paddingLeft;
            if (paint.measureText(str) <= f) {
                setTextSize(0, this.a);
                return;
            }
            float f2 = this.a;
            float f3 = 2.0f;
            while (f2 - f3 > 0.5f) {
                float f4 = (f2 + f3) / 2.0f;
                paint.setTextSize(f4);
                if (paint.measureText(str) >= f) {
                    f2 = f4;
                } else {
                    f3 = f4;
                }
            }
            int i2 = this.b;
            if (f3 < ((float) i2)) {
                f3 = (float) i2;
            }
            setTextSize(0, f3);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        k(getText().toString(), getMeasuredWidth());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            k(getText().toString(), i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        k(charSequence.toString(), getWidth());
    }

    public FontFitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j(attributeSet);
    }
}
