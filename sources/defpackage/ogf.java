package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;

/* renamed from: ogf  reason: default package */
public final class ogf {
    private final LinearLayout a;
    public final ViewPager2 b;
    public final TextView c;

    private ogf(LinearLayout linearLayout, ViewPager2 viewPager2, TextView textView) {
        this.a = linearLayout;
        this.b = viewPager2;
        this.c = textView;
    }

    public static ogf b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.voice_results, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = 16908298;
        ViewPager2 viewPager2 = (ViewPager2) inflate.findViewById(16908298);
        if (viewPager2 != null) {
            i = 16908308;
            TextView textView = (TextView) inflate.findViewById(16908308);
            if (textView != null) {
                return new ogf((LinearLayout) inflate, viewPager2, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public LinearLayout a() {
        return this.a;
    }
}
