package defpackage;

import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: k1c  reason: default package */
public final class k1c {
    private float a;
    private Pair<Integer, String> b = new Pair<>(0, "0:00");
    private final SuppressLayoutTextView c;
    private final TextView d;

    /* renamed from: k1c$a */
    public static final class a {
    }

    public k1c(SuppressLayoutTextView suppressLayoutTextView, TextView textView, f fVar) {
        this.c = suppressLayoutTextView;
        this.d = textView;
    }

    public final String a(int i) {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds((long) Math.max(0, i));
        if (this.b.c().intValue() != seconds) {
            int minutes = (int) TimeUnit.SECONDS.toMinutes((long) seconds);
            int i2 = seconds % 60;
            Integer valueOf = Integer.valueOf(seconds);
            String format = String.format(new Locale(SpotifyLocale.c()), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes), Integer.valueOf(i2)}, 2));
            h.d(format, "java.lang.String.format(locale, format, *args)");
            this.b = new Pair<>(valueOf, format);
        }
        return this.b.d();
    }

    public final void b(int i) {
        this.d.setText(a(i));
    }

    public final void c(int i) {
        double log10 = Math.log10((double) ((int) TimeUnit.MILLISECONDS.toMinutes((long) i)));
        double d2 = (double) 1;
        Double.isNaN(d2);
        int max = Math.max(1, (int) (log10 + d2));
        String a2 = a(i);
        if (!h.a(a2, this.c.getText())) {
            int k = nud.k(this.c.getPaint(), max);
            TextPaint paint = this.c.getPaint();
            h.d(paint, "positionView.paint");
            if (this.a == 0.0f) {
                float[] fArr = new float[1];
                paint.getTextWidths(":", fArr);
                this.a = fArr[0];
            }
            int k2 = k + ((int) (this.a + 0.5f)) + nud.k(this.c.getPaint(), 2);
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            h.d(layoutParams, "positionView.layoutParams");
            if (layoutParams.width != k2) {
                layoutParams.width = k2;
                this.c.setLayoutParams(layoutParams);
            }
            this.c.setTextSuppressingRelayout(a2);
        }
    }
}
