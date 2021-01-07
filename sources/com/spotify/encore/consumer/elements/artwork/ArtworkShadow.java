package com.spotify.encore.consumer.elements.artwork;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import com.spotify.encore.consumer.elements.R;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class ArtworkShadow extends View {
    private ArtworkView artwork;
    private final Paint paint;
    private float shadowRadius;

    public ArtworkShadow(Context context) {
        this(context, null, 0, 6, null);
    }

    public ArtworkShadow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArtworkShadow(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void attachArtwork(ArtworkView artworkView, float f) {
        h.e(artworkView, "newArtwork");
        this.artwork = artworkView;
        this.shadowRadius = f;
        this.paint.setShadowLayer(f, 0.0f, 0.0f, a.b(getContext(), R.color.artwork_shadow));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.artwork != null && canvas != null) {
            float f = this.shadowRadius;
            canvas.drawRect(f, f, ((float) getWidth()) - this.shadowRadius, ((float) getHeight()) - this.shadowRadius, this.paint);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArtworkShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.paint = new Paint(1);
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, null);
        }
    }
}
