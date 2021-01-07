package com.spotify.nowplaying.ui.components.controls.seekbar;

import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class i {
    private final SuppressLayoutTextView a;
    private final TextView b;
    private float c;
    private u3<Integer, String> d = new u3<>(0, "0:00");

    public i(SuppressLayoutTextView suppressLayoutTextView, TextView textView) {
        suppressLayoutTextView.getClass();
        this.a = suppressLayoutTextView;
        textView.getClass();
        this.b = textView;
    }

    /* access modifiers changed from: package-private */
    public String a(int i) {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds((long) Math.max(0, i));
        F f = this.d.a;
        f.getClass();
        if (f.intValue() != seconds) {
            this.d = new u3<>(Integer.valueOf(seconds), String.format(Locale.getDefault(), "%d:%02d", Integer.valueOf((int) TimeUnit.SECONDS.toMinutes((long) seconds)), Integer.valueOf(seconds % 60)));
        }
        S s = this.d.b;
        s.getClass();
        return s;
    }

    public void b(int i) {
        this.b.setText(a(i));
    }

    public void c(int i) {
        int max = Math.max(1, (int) (Math.log10((double) ((int) TimeUnit.MILLISECONDS.toMinutes((long) i))) + 1.0d));
        String a2 = a(i);
        if (!a2.equals(this.a.getText())) {
            int k = nud.k(this.a.getPaint(), max);
            TextPaint paint = this.a.getPaint();
            if (this.c == 0.0f) {
                float[] fArr = new float[1];
                paint.getTextWidths(":", fArr);
                this.c = fArr[0];
            }
            int k2 = k + ((int) (this.c + 0.5f)) + nud.k(this.a.getPaint(), 2);
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (layoutParams.width != k2) {
                layoutParams.width = k2;
                this.a.setLayoutParams(layoutParams);
            }
            this.a.setTextSuppressingRelayout(a2);
        }
    }
}
