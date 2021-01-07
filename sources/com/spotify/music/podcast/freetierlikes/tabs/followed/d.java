package com.spotify.music.podcast.freetierlikes.tabs.followed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.q;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class d implements v {
    private final Context a;
    private final Picasso b;
    private final una c;
    private final float d;

    public d(Context context, Picasso picasso, una una) {
        this.a = context;
        this.b = picasso;
        this.c = una;
        this.d = context.getResources().getDimension(C0707R.dimen.show_icon_radius);
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.v
    public void a(Show show, View view, boolean z) {
        int i = e90.i;
        y90 y90 = (y90) l70.o(view, y90.class);
        y90.setTitle(show.h());
        y90.setSubtitle(this.c.a(show));
        y90.setActive(z);
        y90.getView().setTag(show);
        String c2 = q.c(show.c(), Covers.Size.NORMAL);
        Uri parse = MoreObjects.isNullOrEmpty(c2) ? Uri.EMPTY : Uri.parse(c2);
        Drawable l = yc0.l(this.a, SpotifyIconV2.PODCASTS);
        if (parse != Uri.EMPTY) {
            z l2 = this.b.l(parse);
            l2.t(l);
            l2.g(l);
            l2.o(rwd.f(y90.getImageView(), com.spotify.paste.graphics.drawable.d.a(this.d)));
            return;
        }
        y90.getImageView().setImageDrawable(l);
    }
}
