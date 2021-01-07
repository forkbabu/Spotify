package com.spotify.android.glue.components.cards.effects;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.spotify.music.C0707R;

public enum GlueRippleCoverArtShape {
    SQUARE(C0707R.drawable.glue_radio_square_ripple_overlay) {
        /* access modifiers changed from: package-private */
        @Override // com.spotify.android.glue.components.cards.effects.GlueRippleCoverArtShape
        public void d(Canvas canvas, float f, Paint paint) {
            float f2 = -f;
            canvas.drawRect(f2, f2, f, f, paint);
        }
    },
    CIRCLE(C0707R.drawable.glue_radio_circle_ripple_overlay) {
        /* access modifiers changed from: package-private */
        @Override // com.spotify.android.glue.components.cards.effects.GlueRippleCoverArtShape
        public void d(Canvas canvas, float f, Paint paint) {
            canvas.drawCircle(0.0f, 0.0f, f, paint);
        }
    };
    
    final int mDrawableResId;

    GlueRippleCoverArtShape(int i, AnonymousClass1 r4) {
        this.mDrawableResId = i;
    }

    /* access modifiers changed from: package-private */
    public abstract void d(Canvas canvas, float f, Paint paint);
}
