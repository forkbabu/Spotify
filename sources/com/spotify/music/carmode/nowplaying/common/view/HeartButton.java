package com.spotify.music.carmode.nowplaying.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.heart.i;

public final class HeartButton extends AppCompatImageButton implements i {
    private i.a a;

    public HeartButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i
    public void b(boolean z) {
    }

    public void g(View view) {
        i.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i
    public void setHeartState(boolean z) {
        setActivated(z);
        setContentDescription(getResources().getString(z ? C0707R.string.player_content_description_unlike : C0707R.string.player_content_description_like));
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i
    public void setListener(i.a aVar) {
        this.a = aVar;
    }

    public HeartButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(mo2.c(getContext()));
        setScaleType(ImageView.ScaleType.CENTER);
        setHeartState(false);
        setOnClickListener(new c(this));
        post(new d(this));
    }
}
