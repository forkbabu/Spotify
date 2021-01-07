package com.spotify.music.carmode.nowplaying.def.view.repeat;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.repeat.f;
import com.spotify.player.options.RepeatMode;

public final class CarModeRepeatButton extends AppCompatImageButton implements d {
    private f.a a;

    public CarModeRepeatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static Drawable g(Context context, RepeatMode repeatMode) {
        int ordinal = repeatMode.ordinal();
        if (ordinal == 0) {
            return mo2.k(context);
        }
        if (ordinal == 1) {
            return mo2.j(context);
        }
        if (ordinal == 2) {
            return mo2.l(context);
        }
        throw new IllegalArgumentException("Unsupported RepeatMode " + repeatMode);
    }

    public void h(View view) {
        f.a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.spotify.nowplaying.ui.components.repeat.f
    public void setListener(f.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.nowplaying.ui.components.repeat.f
    public void setRepeatEnabled(boolean z) {
        setEnabled(z);
    }

    @Override // com.spotify.nowplaying.ui.components.repeat.f
    public void setRepeatMode(RepeatMode repeatMode) {
        setImageDrawable(g(getContext(), repeatMode));
    }

    public CarModeRepeatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(g(getContext(), RepeatMode.NONE));
        setScaleType(ImageView.ScaleType.CENTER);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_repeat));
        setOnClickListener(new a(this));
    }
}
