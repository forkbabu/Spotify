package com.spotify.mobile.android.util.ui;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;

public class s {
    private final TextView a;
    private final float b;

    /* access modifiers changed from: package-private */
    public class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            s.this.a.removeOnLayoutChangeListener(this);
            s.this.b();
        }
    }

    public s(TextView textView) {
        float textSize = textView.getTextSize();
        this.a = textView;
        this.b = textSize;
    }

    public void b() {
        Layout layout = this.a.getLayout();
        if (layout == null) {
            this.a.addOnLayoutChangeListener(new a());
        } else if (!d(layout)) {
            TextPaint paint = layout.getPaint();
            float f = this.b;
            float f2 = 1.0f;
            do {
                float f3 = (f2 + f) / 2.0f;
                paint.setTextSize(f3);
                if (d(layout)) {
                    f2 = f3;
                } else {
                    f = f3;
                }
            } while (f - f2 > 1.0f);
            this.a.setTextSize(0, f2);
        }
    }

    public void c() {
        this.a.addOnLayoutChangeListener(new a());
    }

    /* access modifiers changed from: package-private */
    public boolean d(Layout layout) {
        return ((float) layout.getWidth()) > layout.getPaint().measureText(String.valueOf(layout.getText()));
    }
}
