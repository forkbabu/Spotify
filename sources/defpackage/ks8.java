package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: ks8  reason: default package */
public final class ks8 {
    private final LinearLayout a;
    public final TextView b;

    private ks8(LinearLayout linearLayout, TextView textView) {
        this.a = linearLayout;
        this.b = textView;
    }

    public static ks8 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.section_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        TextView textView = (TextView) inflate.findViewById(16908308);
        if (textView != null) {
            return new ks8((LinearLayout) inflate, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(16908308)));
    }

    public LinearLayout a() {
        return this.a;
    }
}
