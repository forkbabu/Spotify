package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

/* renamed from: sg9  reason: default package */
public final class sg9 {
    private final ConstraintLayout a;
    public final TextView b;
    public final RecyclerView c;

    private sg9(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = textView2;
        this.c = recyclerView;
    }

    public static sg9 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.bottom_sheet_your_library_x, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0707R.id.sort_by_heading;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.sort_by_heading);
        if (textView != null) {
            i = C0707R.id.sort_cancel_text;
            TextView textView2 = (TextView) inflate.findViewById(C0707R.id.sort_cancel_text);
            if (textView2 != null) {
                i = C0707R.id.sort_handle;
                ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.sort_handle);
                if (imageView != null) {
                    i = C0707R.id.sort_option_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.sort_option_recycler_view);
                    if (recyclerView != null) {
                        return new sg9((ConstraintLayout) inflate, textView, textView2, imageView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public ConstraintLayout a() {
        return this.a;
    }
}
