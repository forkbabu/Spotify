package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;

/* renamed from: zg9  reason: default package */
public final class zg9 {
    private final ConstraintLayout a;
    public final TextView b;

    private zg9(ConstraintLayout constraintLayout, TextView textView) {
        this.a = constraintLayout;
        this.b = textView;
    }

    public static zg9 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.row_section_header_your_library_x, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        TextView textView = (TextView) inflate.findViewById(C0707R.id.title);
        if (textView != null) {
            return new zg9((ConstraintLayout) inflate, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(C0707R.id.title)));
    }

    public ConstraintLayout a() {
        return this.a;
    }
}
