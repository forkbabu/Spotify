package com.spotify.music.nowplaying.musicvideotoggle.widget.previousbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.previous.g;

public final class MusicVideoTogglePreviousButton extends AppCompatImageButton implements g {
    private g.a a;

    public MusicVideoTogglePreviousButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        g.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.g
    public void setListener(g.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.g
    public void setPreviousEnabled(boolean z) {
        setEnabled(z);
    }

    public MusicVideoTogglePreviousButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundDrawable(null);
        setImageDrawable(gqd.t(getContext()));
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_prev));
        setOnClickListener(new a(this));
    }
}
