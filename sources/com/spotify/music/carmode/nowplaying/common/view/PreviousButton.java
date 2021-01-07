package com.spotify.music.carmode.nowplaying.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.previous.g;

public final class PreviousButton extends AppCompatImageButton implements g {
    private g.a a;

    public PreviousButton(Context context, AttributeSet attributeSet) {
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

    public PreviousButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(mo2.i(getContext()));
        setScaleType(ImageView.ScaleType.CENTER);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_prev));
        setOnClickListener(new f(this));
    }
}
