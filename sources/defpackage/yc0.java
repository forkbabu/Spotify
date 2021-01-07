package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.graphics.drawable.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.f;
import com.squareup.picasso.t;

/* renamed from: yc0  reason: default package */
public final class yc0 {
    private static final f a = new pwd(new t(3276801));
    public static final /* synthetic */ int b = 0;

    public static Drawable a(Context context) {
        return b(context, SpotifyIcon.ARTIST_32);
    }

    public static Drawable b(Context context, SpotifyIcon spotifyIcon) {
        return c(context, spotifyIcon, Float.NaN, false, false);
    }

    public static Drawable c(Context context, SpotifyIcon spotifyIcon, float f, boolean z, boolean z2) {
        return e(context, spotifyIcon.g(), f, z, z2, (float) nud.g((float) spotifyIcon.d(), context.getResources()));
    }

    public static Drawable d(Context context, SpotifyIconV2 spotifyIconV2, float f) {
        return e(context, spotifyIconV2, Float.NaN, false, false, f);
    }

    public static Drawable e(Context context, SpotifyIconV2 spotifyIconV2, float f, boolean z, boolean z2, float f2) {
        int i;
        Drawable drawable;
        SpotifyIconDrawable spotifyIconDrawable;
        switch (spotifyIconV2.ordinal()) {
            case 2:
                i = C0707R.drawable.cat_placeholder_addfollow;
                break;
            case 6:
                i = C0707R.drawable.cat_placeholder_album;
                break;
            case 12:
                i = C0707R.drawable.cat_placeholder_artist;
                break;
            case 20:
                i = C0707R.drawable.cat_placeholder_browse;
                break;
            case 25:
            case 131:
                i = C0707R.drawable.cat_placeholder_playlist;
                break;
            case 56:
                i = C0707R.drawable.cat_placeholder_discover;
                break;
            case 68:
                i = C0707R.drawable.cat_placeholder_flag;
                break;
            case 114:
                i = C0707R.drawable.cat_placeholder_offline;
                break;
            case 136:
                i = C0707R.drawable.cat_placeholder_podcast;
                break;
            case 151:
                i = C0707R.drawable.cat_placeholder_running;
                break;
            case 152:
                i = C0707R.drawable.cat_placeholder_search;
                break;
            case 155:
            case 156:
                i = C0707R.drawable.cat_placeholder_share;
                break;
            case 181:
                i = C0707R.drawable.cat_placeholder_star;
                break;
            case 185:
                i = C0707R.drawable.cat_placeholder_genre;
                break;
            case 192:
                i = C0707R.drawable.cat_placeholder_track;
                break;
            case 198:
                i = C0707R.drawable.cat_placeholder_user;
                break;
            case 208:
                i = C0707R.drawable.cat_placeholder_warning;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            drawable = null;
        } else {
            f fVar = a;
            Bitmap bitmap = fVar.get(String.valueOf(i));
            if (bitmap == null) {
                Drawable d = a.d(context, i);
                if (d instanceof BitmapDrawable) {
                    fVar.b(String.valueOf(i), ((BitmapDrawable) d).getBitmap());
                }
                drawable = d;
            } else {
                drawable = new BitmapDrawable(context.getResources(), bitmap);
            }
        }
        if (drawable == null) {
            Logger.n("No placeholder was pre-rendered for icon %s! Using createSpotifyIconDrawable.", spotifyIconV2);
            SpotifyIconDrawable q = q(context, spotifyIconV2, f2);
            q.t(true);
            spotifyIconDrawable = q;
        } else {
            spotifyIconDrawable = drawable;
        }
        return u(context, spotifyIconDrawable, spotifyIconV2, f, z, z2);
    }

    public static Drawable f(Context context) {
        return b(context, SpotifyIcon.PLAYLIST_32);
    }

    public static Drawable g(Context context) {
        return b(context, SpotifyIcon.PODCASTS_32);
    }

    public static Drawable h(Context context) {
        return i(context, SpotifyIcon.ARTIST_32);
    }

    public static Drawable i(Context context, SpotifyIcon spotifyIcon) {
        return u(context, p(context, spotifyIcon), spotifyIcon.g(), Float.NaN, true, false);
    }

    public static Drawable j(Context context, SpotifyIcon spotifyIcon, boolean z) {
        return u(context, p(context, spotifyIcon), spotifyIcon.g(), Float.NaN, true, z);
    }

    public static Drawable k(Context context, SpotifyIcon spotifyIcon, boolean z, boolean z2) {
        return u(context, p(context, spotifyIcon), spotifyIcon.g(), Float.NaN, z, z2);
    }

    public static Drawable l(Context context, SpotifyIconV2 spotifyIconV2) {
        return u(context, q(context, spotifyIconV2, (float) nud.g(32.0f, context.getResources())), spotifyIconV2, Float.NaN, true, false);
    }

    public static Drawable m(Context context, SpotifyIconV2 spotifyIconV2, float f, boolean z, boolean z2, float f2) {
        return u(context, q(context, spotifyIconV2, f2), spotifyIconV2, f, z, z2);
    }

    public static Drawable n(Context context) {
        return i(context, SpotifyIcon.PLAYLIST_32);
    }

    public static Drawable o(Context context) {
        return i(context, SpotifyIcon.TRACK_32);
    }

    private static SpotifyIconDrawable p(Context context, SpotifyIcon spotifyIcon) {
        return q(context, spotifyIcon.g(), (float) nud.g((float) spotifyIcon.d(), context.getResources()));
    }

    private static SpotifyIconDrawable q(Context context, SpotifyIconV2 spotifyIconV2, float f) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, f);
        spotifyIconDrawable.r(nud.h(context, C0707R.attr.pasteColorPlaceholder));
        return spotifyIconDrawable;
    }

    public static Drawable r(Context context) {
        return b(context, SpotifyIcon.TRACK_32);
    }

    public static Drawable s(Context context) {
        return c(context, SpotifyIcon.USER_32, Float.NaN, false, false);
    }

    private static float t(float f, float f2) {
        return Float.isNaN(f) ? f2 : f;
    }

    private static Drawable u(Context context, Drawable drawable, SpotifyIconV2 spotifyIconV2, float f, boolean z, boolean z2) {
        int h = z ? 0 : nud.h(context, C0707R.attr.pasteColorPlaceholderBackground);
        switch (spotifyIconV2.ordinal()) {
            case 6:
            case 20:
            case 25:
            case 62:
            case 68:
            case 103:
            case 136:
            case 141:
            case 158:
            case 193:
                return new e(drawable, t(f, 0.75f), h);
            case 12:
            case 198:
                if (z2) {
                    return new e(drawable, t(f, 0.66f), h);
                }
                c cVar = new c(drawable, t(f, 0.6f));
                cVar.b(h);
                return cVar;
            case 76:
            case 203:
                return new e(drawable, t(f, 0.33f), h);
            case 131:
            case 132:
            case 151:
            case 181:
            case 192:
                return new e(drawable, t(f, 0.66f), h);
            default:
                return Float.isNaN(f) ? drawable : new e(drawable, f, h);
        }
    }
}
