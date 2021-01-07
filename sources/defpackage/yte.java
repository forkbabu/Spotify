package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

/* renamed from: yte  reason: default package */
public final class yte {
    private final LinearLayout a;
    public final Button b;
    public final RecyclerView c;

    private yte(LinearLayout linearLayout, Button button, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.a = linearLayout;
        this.b = button;
        this.c = recyclerView;
    }

    public static yte b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.voice_debug, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = 16908313;
        Button button = (Button) inflate.findViewById(16908313);
        if (button != null) {
            i = 16908298;
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(16908298);
            if (recyclerView != null) {
                i = 16908308;
                TextView textView = (TextView) inflate.findViewById(16908308);
                if (textView != null) {
                    i = 16908309;
                    TextView textView2 = (TextView) inflate.findViewById(16908309);
                    if (textView2 != null) {
                        return new yte((LinearLayout) inflate, button, recyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public LinearLayout a() {
        return this.a;
    }
}
