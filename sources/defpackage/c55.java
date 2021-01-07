package defpackage;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.spotify.music.C0707R;

/* renamed from: c55  reason: default package */
public final class c55 {
    public final LinearLayout a;

    private c55(HorizontalScrollView horizontalScrollView, LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    public static c55 a(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0707R.id.filter_bar_chip_group);
        if (linearLayout != null) {
            return new c55((HorizontalScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C0707R.id.filter_bar_chip_group)));
    }
}
