package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.base.Supplier;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: hqa  reason: default package */
public final /* synthetic */ class hqa implements Supplier {
    public final /* synthetic */ Context a;

    public /* synthetic */ hqa(Context context) {
        this.a = context;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        Context context = this.a;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.badge_size);
        int color = resources.getColor(R.color.white);
        int color2 = resources.getColor(R.color.blue_light);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHECK, ((float) dimensionPixelSize) * 0.6f);
        spotifyIconDrawable.r(color);
        c cVar = new c(spotifyIconDrawable, 0.6f);
        cVar.b(color2);
        return cVar;
    }
}
