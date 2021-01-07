package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.graphics.drawable.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class p0 {
    private final Context a;
    private final int b;
    private final float c;
    private final Drawable[] d = new Drawable[MusicItem.Type.G.length];

    public p0(Context context) {
        this.a = context;
        int g = nud.g(64.0f, context.getResources());
        int g2 = nud.g(24.0f, context.getResources());
        this.b = g2;
        this.c = ((float) g2) / ((float) g);
    }

    private Drawable a(SpotifyIconV2 spotifyIconV2) {
        return new LayerDrawable(new Drawable[]{new ColorDrawable(a.b(this.a, R.color.gray_15)), new e(new SpotifyIconDrawable(this.a, spotifyIconV2, (float) this.b), this.c, 0)});
    }

    private Drawable b(SpotifyIconV2 spotifyIconV2) {
        c cVar = new c(new SpotifyIconDrawable(this.a, spotifyIconV2, (float) this.b), this.c);
        cVar.b(a.b(this.a, R.color.gray_15));
        return cVar;
    }

    public Drawable c(MusicItem musicItem) {
        MusicItem.Type z = musicItem.type();
        Drawable drawable = this.d[z.ordinal()];
        if (drawable == null) {
            int ordinal = z.ordinal();
            if (ordinal != 16) {
                switch (ordinal) {
                    case 0:
                        drawable = b(SpotifyIconV2.PLUS_2PX);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                        drawable = b(SpotifyIconV2.BAN_ACTIVE);
                        break;
                    case 5:
                        drawable = a(SpotifyIconV2.BAN_ACTIVE);
                        break;
                    case 6:
                        drawable = a(SpotifyIconV2.PLUS_2PX);
                        break;
                    default:
                        switch (ordinal) {
                            case 11:
                                drawable = a(SpotifyIconV2.PLAYLIST_FOLDER);
                                break;
                            case 12:
                                drawable = oi0.c(this.a);
                                break;
                            case 13:
                                drawable = a(SpotifyIconV2.HEART_ACTIVE);
                                break;
                            default:
                                switch (ordinal) {
                                    case 20:
                                    case 21:
                                        drawable = yc0.o(this.a);
                                        break;
                                    case 22:
                                        drawable = oi0.g(this.a);
                                        break;
                                    default:
                                        drawable = null;
                                        break;
                                }
                        }
                }
                this.d[z.ordinal()] = drawable;
            }
            drawable = yc0.n(this.a);
            this.d[z.ordinal()] = drawable;
        }
        return drawable;
    }
}
