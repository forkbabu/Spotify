package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.c;
import com.spotify.music.C0707R;

/* renamed from: vc0  reason: default package */
public final class vc0 {

    /* access modifiers changed from: private */
    /* renamed from: vc0$b */
    public static class b {
        public boolean a;
        public boolean b;

        private b() {
        }

        b(a aVar) {
        }
    }

    private static void a(TextView textView) {
        int g = nud.g(8.0f, textView.getResources());
        Integer num = (Integer) textView.getTag(C0707R.id.baselines_original_line_height);
        int lineHeight = textView.getLineHeight();
        if (num == null) {
            e(textView, lineHeight);
        } else {
            lineHeight = num.intValue();
        }
        double ceil = Math.ceil((double) (((float) lineHeight) / ((float) g)));
        double d = (double) g;
        Double.isNaN(d);
        Double.isNaN(d);
        int i = (int) (ceil * d);
        boolean z = true;
        if (c.d(textView) <= 1 && (textView.getInputType() & -131073) == 0) {
            z = false;
        }
        if (z) {
            c.k(textView, i);
        }
    }

    public static void b(View view) {
        q4.I(view, new wc0());
    }

    public static void c(View view) {
        if (Build.VERSION.SDK_INT >= 28) {
            view.setAccessibilityHeading(true);
        }
        q4.I(view, new xc0());
    }

    public static void d(View view, int i) {
        view.setTag(C0707R.id.baselines_original_bottom_margin, Integer.valueOf(i));
    }

    public static void e(TextView textView, int i) {
        if (!textView.isInEditMode()) {
            textView.setTag(C0707R.id.baselines_original_line_height, Integer.valueOf(i));
            a(textView);
        }
    }

    public static void f(View view, int i) {
        view.setTag(C0707R.id.baselines_original_top_margin, Integer.valueOf(i));
    }

    public static void g(View view) {
        b bVar;
        if (!view.isInEditMode()) {
            int i = 0;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i < viewGroup.getChildCount()) {
                    g(viewGroup.getChildAt(i));
                    i++;
                }
            } else if ((view instanceof TextView) && (bVar = (b) view.getTag(C0707R.id.baselines_margin_view)) != null) {
                TextView textView = (TextView) view;
                a(textView);
                int i2 = bVar.a ? -((int) Math.ceil((double) Math.abs(textView.getPaint().getFontMetrics().ascent))) : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                Integer num = (Integer) textView.getTag(C0707R.id.baselines_original_top_margin);
                int i3 = ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin;
                if (num == null) {
                    textView.setTag(C0707R.id.baselines_original_top_margin, Integer.valueOf(i3));
                } else {
                    i3 = num.intValue();
                }
                marginLayoutParams.topMargin = i3 + i2;
                if (bVar.b) {
                    i = -((int) Math.ceil((double) Math.abs(textView.getPaint().getFontMetrics().descent)));
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                Integer num2 = (Integer) textView.getTag(C0707R.id.baselines_original_bottom_margin);
                int i4 = ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin;
                if (num2 == null) {
                    textView.setTag(C0707R.id.baselines_original_bottom_margin, Integer.valueOf(i4));
                } else {
                    i4 = num2.intValue();
                }
                marginLayoutParams2.bottomMargin = i4 + i;
            }
        }
    }

    public static void h(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (!textView.isInEditMode()) {
                b bVar = (b) textView.getTag(C0707R.id.baselines_margin_view);
                if (bVar == null) {
                    bVar = new b(null);
                    textView.setTag(C0707R.id.baselines_margin_view, bVar);
                }
                bVar.b = true;
            }
        }
    }

    public static void i(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (!textView.isInEditMode()) {
                b bVar = (b) textView.getTag(C0707R.id.baselines_margin_view);
                if (bVar == null) {
                    bVar = new b(null);
                    textView.setTag(C0707R.id.baselines_margin_view, bVar);
                }
                bVar.a = true;
            }
        }
    }
}
