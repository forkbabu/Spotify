package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: xg9  reason: default package */
public final class xg9 {
    public final TextView a;
    public final SpotifyIconView b;
    public final FrameLayout c;
    public final SpotifyIconView d;

    private xg9(View view, TextView textView, SpotifyIconView spotifyIconView, FrameLayout frameLayout, SpotifyIconView spotifyIconView2) {
        this.a = textView;
        this.b = spotifyIconView;
        this.c = frameLayout;
        this.d = spotifyIconView2;
    }

    public static xg9 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.inflate(C0707R.layout.header_your_library_x, viewGroup);
        int i = C0707R.id.header_text;
        TextView textView = (TextView) viewGroup.findViewById(C0707R.id.header_text);
        if (textView != null) {
            i = C0707R.id.icon_create;
            SpotifyIconView spotifyIconView = (SpotifyIconView) viewGroup.findViewById(C0707R.id.icon_create);
            if (spotifyIconView != null) {
                i = C0707R.id.icon_profile_container;
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(C0707R.id.icon_profile_container);
                if (frameLayout != null) {
                    i = C0707R.id.icon_search;
                    SpotifyIconView spotifyIconView2 = (SpotifyIconView) viewGroup.findViewById(C0707R.id.icon_search);
                    if (spotifyIconView2 != null) {
                        return new xg9(viewGroup, textView, spotifyIconView, frameLayout, spotifyIconView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }
}
