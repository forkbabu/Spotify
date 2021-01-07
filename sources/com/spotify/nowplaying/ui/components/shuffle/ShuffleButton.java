package com.spotify.nowplaying.ui.components.shuffle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.shuffle.f;

public final class ShuffleButton extends AppCompatImageButton implements f {
    private f.a a;

    public ShuffleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        f.a aVar = this.a;
        if (aVar != null) {
            ((d) aVar).b();
        }
    }

    @Override // com.spotify.nowplaying.ui.components.shuffle.f
    public void setListener(f.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.nowplaying.ui.components.shuffle.f
    public void setShuffleEnabled(boolean z) {
        setEnabled(z);
    }

    @Override // com.spotify.nowplaying.ui.components.shuffle.f
    public void setShuffleState(boolean z) {
        setImageDrawable(z ? gqd.y(getContext()) : gqd.z(getContext()));
        setContentDescription(getResources().getString(z ? C0707R.string.player_content_description_shuffle_on : C0707R.string.player_content_description_shuffle_off));
    }

    public ShuffleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setShuffleState(false);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setOnClickListener(new a(this));
    }
}
