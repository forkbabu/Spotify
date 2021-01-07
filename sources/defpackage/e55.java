package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: e55  reason: default package */
public final class e55 {
    private final LinearLayout a;
    public final SpotifyIconView b;
    public final TextView c;

    private e55(LinearLayout linearLayout, SpotifyIconView spotifyIconView, TextView textView) {
        this.a = linearLayout;
        this.b = spotifyIconView;
        this.c = textView;
    }

    public static e55 b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(C0707R.layout.sort_criteria_item, (ViewGroup) null, false);
        int i = C0707R.id.check_icon_view;
        SpotifyIconView spotifyIconView = (SpotifyIconView) inflate.findViewById(C0707R.id.check_icon_view);
        if (spotifyIconView != null) {
            i = C0707R.id.sort_criteria_text;
            TextView textView = (TextView) inflate.findViewById(C0707R.id.sort_criteria_text);
            if (textView != null) {
                return new e55((LinearLayout) inflate, spotifyIconView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public LinearLayout a() {
        return this.a;
    }
}
