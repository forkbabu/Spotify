package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.ui.row.Rows;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: ck3  reason: default package */
public final class ck3 {
    private final y90 a;
    private final View b;
    private final Context c;

    ck3(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.c = context;
        y90 f = Rows.f(context, viewGroup);
        this.a = f;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHECK, context.getResources().getDimension(C0707R.dimen.add_to_playlist_accessory_icon_height));
        spotifyIconDrawable.r(nud.h(context, C0707R.attr.pasteColorAccessoryGreen));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(spotifyIconDrawable);
        this.b = imageView;
        f.setTitle(context.getString(C0707R.string.your_episodes_title));
        f.getImageView().setImageDrawable(oi0.g(context));
        c(0);
    }

    public View a() {
        return this.a.getView();
    }

    public void b(boolean z) {
        this.a.z0(z ? this.b : null);
    }

    public void c(int i) {
        String str;
        y90 y90 = this.a;
        if (i <= 0) {
            str = this.c.getString(C0707R.string.add_to_playlist_your_episodes_subtitle_empty);
        } else {
            str = this.c.getResources().getQuantityString(C0707R.plurals.add_to_playlist_your_episodes_subtitle, i, Integer.valueOf(i));
        }
        y90.setSubtitle(str);
    }
}
