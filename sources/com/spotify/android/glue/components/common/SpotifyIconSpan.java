package com.spotify.android.glue.components.common;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ImageSpan;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class SpotifyIconSpan extends ImageSpan {
    private final Alignment a;
    private final boolean b = true;

    public enum Alignment {
        BOTTOM(0) {
            /* access modifiers changed from: protected */
            @Override // com.spotify.android.glue.components.common.SpotifyIconSpan.Alignment
            public void g(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                SpotifyIconSpan.a(spotifyIconSpan, canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            }
        },
        BASELINE(1) {
            /* access modifiers changed from: protected */
            @Override // com.spotify.android.glue.components.common.SpotifyIconSpan.Alignment
            public void g(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                SpotifyIconSpan.a(spotifyIconSpan, canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            }
        },
        CAPITAL_LETTER_MIDDLE(0) {
            /* access modifiers changed from: protected */
            @Override // com.spotify.android.glue.components.common.SpotifyIconSpan.Alignment
            public void g(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                SpotifyIconSpan.b(spotifyIconSpan, 'E', canvas, charSequence, i, i2, f, i3, i4, paint);
            }
        },
        SMALL_LETTER_MIDDLE(0) {
            /* access modifiers changed from: protected */
            @Override // com.spotify.android.glue.components.common.SpotifyIconSpan.Alignment
            public void g(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                SpotifyIconSpan.b(spotifyIconSpan, 'e', canvas, charSequence, i, i2, f, i3, i4, paint);
            }
        };
        
        private final int mDefaultAlignment;

        Alignment(int i, a aVar) {
            this.mDefaultAlignment = i;
        }

        /* access modifiers changed from: protected */
        public abstract void g(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint);
    }

    public SpotifyIconSpan(SpotifyIconDrawable spotifyIconDrawable, Alignment alignment) {
        super(spotifyIconDrawable, alignment.mDefaultAlignment);
        this.a = alignment;
    }

    static void a(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (spotifyIconSpan.b) {
            ((SpotifyIconDrawable) spotifyIconSpan.getDrawable()).r(paint.getColor());
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    static void b(SpotifyIconSpan spotifyIconSpan, char c, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, Paint paint) {
        SpotifyIconDrawable spotifyIconDrawable = (SpotifyIconDrawable) spotifyIconSpan.getDrawable();
        if (spotifyIconSpan.b) {
            spotifyIconDrawable.r(paint.getColor());
        }
        Rect rect = new Rect();
        paint.getTextBounds(new char[]{c}, 0, 1, rect);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, (spotifyIconDrawable.getIntrinsicHeight() / 2) + (i4 - (rect.height() / 2)), paint);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        this.a.g(this, canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }
}
