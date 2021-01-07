package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.TrackListItemType;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.h;

/* renamed from: g1c  reason: default package */
public final class g1c {
    private final t8a a;
    private final Context b;
    private final int c;
    private final Integer d;
    private final boolean e;
    private final View f;

    /* renamed from: g1c$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ g1c a;
        final /* synthetic */ z0c b;
        final /* synthetic */ boolean c;
        final /* synthetic */ String f;
        final /* synthetic */ String n;

        a(g1c g1c, z0c z0c, boolean z, String str, String str2) {
            this.a = g1c;
            this.b = z0c;
            this.c = z;
            this.f = str;
            this.n = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.b.a();
            if (this.c) {
                this.a.a.b(this.f);
            } else {
                this.a.a.e(this.f, this.n);
            }
        }
    }

    public g1c(t8a t8a, Context context, int i, Integer num, boolean z, View view) {
        h.e(t8a, "likedContent");
        h.e(context, "context");
        h.e(view, "likeView");
        this.a = t8a;
        this.b = context;
        this.c = i;
        this.d = num;
        this.e = z;
        this.f = view;
    }

    private final Drawable b(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(this.c));
        spotifyIconDrawable.r(androidx.core.content.a.b(context, i));
        return this.d == null ? spotifyIconDrawable : new InsetDrawable((Drawable) spotifyIconDrawable, context.getResources().getDimensionPixelSize(this.d.intValue()));
    }

    public final void c(com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a aVar, TrackListItemType trackListItemType, String str, String str2, z0c z0c) {
        Drawable drawable;
        h.e(aVar, "enhancedModel");
        h.e(trackListItemType, "itemType");
        h.e(str, "trackUri");
        h.e(str2, "episodeUri");
        h.e(z0c, "heartButtonLogger");
        if (trackListItemType == TrackListItemType.MUSIC) {
            boolean d2 = aVar.d(str);
            this.f.setVisibility(0);
            this.f.setOnClickListener(new a(this, z0c, d2, str, str2));
            View view = this.f;
            Context context = this.b;
            if (d2) {
                drawable = b(context, SpotifyIconV2.HEART_ACTIVE, R.color.green);
            } else {
                drawable = b(context, SpotifyIconV2.HEART, R.color.white_70);
            }
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            view.setBackground(drawable);
            int i3 = d2 ? C0707R.string.player_content_description_unlike : C0707R.string.player_content_description_like;
            View view2 = this.f;
            view2.setContentDescription(view2.getContext().getString(i3));
            return;
        }
        this.f.setVisibility(this.e ? 8 : 4);
        View view3 = this.f;
        int i4 = q4.g;
        int i5 = Build.VERSION.SDK_INT;
        view3.setBackground(null);
        this.f.setOnClickListener(null);
    }
}
