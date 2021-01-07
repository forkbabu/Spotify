package com.spotify.music.playlist.ui;

import android.content.Context;
import androidx.core.content.a;
import com.google.common.base.Supplier;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final /* synthetic */ class q implements Supplier {
    public final /* synthetic */ Context a;
    public final /* synthetic */ int b;

    public /* synthetic */ q(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        Context context = this.a;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.VIDEO, (float) this.b);
        spotifyIconDrawable.r(a.b(context, R.color.gray_70));
        return spotifyIconDrawable;
    }
}
