package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class MediaRouteVolumeSlider extends AppCompatSeekBar {
    private final float b;
    private boolean c;
    private Drawable f;
    private int n;
    private int o;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.seekBarStyle);
    }

    public void a(int i, int i2) {
        if (this.n != i) {
            if (Color.alpha(i) != 255) {
                StringBuilder V0 = je.V0("Volume slider progress and thumb color cannot be translucent: #");
                V0.append(Integer.toHexString(i));
                Log.e("MediaRouteVolumeSlider", V0.toString());
            }
            this.n = i;
        }
        if (this.o != i2) {
            if (Color.alpha(i2) != 255) {
                StringBuilder V02 = je.V0("Volume slider background color cannot be translucent: #");
                V02.append(Integer.toHexString(i2));
                Log.e("MediaRouteVolumeSlider", V02.toString());
            }
            this.o = i2;
        }
    }

    public void b(boolean z) {
        Drawable drawable;
        if (this.c != z) {
            this.c = z;
            if (z) {
                drawable = null;
            } else {
                drawable = this.f;
            }
            super.setThumb(drawable);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? BitmapRenderer.ALPHA_VISIBLE : (int) (this.b * 255.0f);
        this.f.setColorFilter(this.n, PorterDuff.Mode.SRC_IN);
        this.f.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.o, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.n, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f = drawable;
        if (this.c) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = m.h(context);
    }
}
