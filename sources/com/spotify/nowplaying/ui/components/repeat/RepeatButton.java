package com.spotify.nowplaying.ui.components.repeat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.repeat.f;
import com.spotify.player.options.RepeatMode;

public class RepeatButton extends AppCompatImageButton implements f {
    private f.a a;

    public RepeatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
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
        setImageDrawable(g.a(getContext(), repeatMode));
    }

    public RepeatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(g.a(getContext(), RepeatMode.NONE));
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_repeat));
        setOnClickListener(new a(this));
    }
}
