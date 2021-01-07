package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: ak3  reason: default package */
public final class ak3 {
    private final View a;

    ak3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        View inflate = layoutInflater.inflate(C0707R.layout.filter_placeholder_view, viewGroup, false);
        this.a = inflate;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SEARCH, (float) nud.g(16.0f, context.getResources()));
        spotifyIconDrawable.r(a.b(context, R.color.white_70));
        ((ImageView) inflate.findViewById(C0707R.id.icon)).setImageDrawable(spotifyIconDrawable);
    }

    public View a() {
        return this.a;
    }
}
