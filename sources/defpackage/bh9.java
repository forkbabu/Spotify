package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: bh9  reason: default package */
public final class bh9 {
    private final ConstraintLayout a;
    public final TextView b;

    private bh9(ConstraintLayout constraintLayout, SpotifyIconView spotifyIconView, TextView textView) {
        this.a = constraintLayout;
        this.b = textView;
    }

    public static bh9 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.sort_option_item_your_library_x, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0707R.id.sort_option_check_mark;
        SpotifyIconView spotifyIconView = (SpotifyIconView) inflate.findViewById(C0707R.id.sort_option_check_mark);
        if (spotifyIconView != null) {
            i = C0707R.id.sort_option_title_text;
            TextView textView = (TextView) inflate.findViewById(C0707R.id.sort_option_title_text);
            if (textView != null) {
                return new bh9((ConstraintLayout) inflate, spotifyIconView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public ConstraintLayout a() {
        return this.a;
    }
}
