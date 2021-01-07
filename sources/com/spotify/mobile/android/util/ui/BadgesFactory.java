package com.spotify.mobile.android.util.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.BadgedDrawable;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class BadgesFactory {

    public enum Badge {
        VERIFIED {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.mobile.android.util.ui.BadgesFactory.Badge
            public Drawable d(Context context, Drawable drawable, BadgeSize badgeSize) {
                SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.CHECK;
                BadgedDrawable.BadgePosition badgePosition = BadgedDrawable.BadgePosition.BOTTOM_RIGHT;
                int b = androidx.core.content.a.b(context, R.color.white);
                int b2 = androidx.core.content.a.b(context, R.color.blue_light);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(badgeSize.sizeRes);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(badgeSize.marginRes);
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, ((float) dimensionPixelSize) * 0.6f);
                spotifyIconDrawable.r(b);
                c cVar = new c(spotifyIconDrawable, 0.6f);
                cVar.b(b2);
                int i = BadgedDrawable.j;
                BadgedDrawable.a aVar = new BadgedDrawable.a();
                aVar.a = badgePosition;
                aVar.d = dimensionPixelSize2;
                aVar.e = dimensionPixelSize2;
                aVar.f = true;
                return new BadgedDrawable(drawable, cVar, aVar);
            }
        };

        Badge(a aVar) {
        }

        /* access modifiers changed from: package-private */
        public abstract Drawable d(Context context, Drawable drawable, BadgeSize badgeSize);
    }

    public enum BadgeSize {
        SMALL(C0707R.dimen.badge_small_size, C0707R.dimen.badge_small_margin),
        MEDIUM(C0707R.dimen.badge_medium_size, C0707R.dimen.badge_medium_margin),
        LARGE(C0707R.dimen.badge_large_size, C0707R.dimen.badge_large_margin);
        
        public final int marginRes;
        public final int sizeRes;

        private BadgeSize(int i, int i2) {
            this.marginRes = i2;
            this.sizeRes = i;
        }
    }
}
