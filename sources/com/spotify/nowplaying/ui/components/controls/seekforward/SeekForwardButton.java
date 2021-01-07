package com.spotify.nowplaying.ui.components.controls.seekforward;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.seekforward.i;

public final class SeekForwardButton extends AppCompatImageButton implements i {
    private i.a a;

    public SeekForwardButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        i.a aVar = this.a;
        if (aVar != null) {
            ((g) aVar).c();
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekforward.i
    public void setListener(i.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekforward.i
    public void setSeekForwardEnabled(boolean z) {
        setEnabled(z);
    }

    public SeekForwardButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundDrawable(null);
        setImageDrawable(gqd.s(getContext()));
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_skip_forward_15));
        setOnClickListener(new c(this));
    }
}
