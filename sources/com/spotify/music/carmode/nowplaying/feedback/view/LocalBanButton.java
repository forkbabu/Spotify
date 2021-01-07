package com.spotify.music.carmode.nowplaying.feedback.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.ban.e;
import com.spotify.music.nowplaying.common.view.ban.g;

public final class LocalBanButton extends AppCompatImageButton implements g {
    private g.a a;

    public LocalBanButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void g(View view) {
        g.a aVar = this.a;
        if (aVar != null) {
            ((e) aVar).b();
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.ban.g
    public void setBanState(boolean z) {
        setActivated(z);
        setContentDescription(getResources().getString(z ? C0707R.string.player_content_description_unban : C0707R.string.player_content_description_ban));
    }

    @Override // com.spotify.music.nowplaying.common.view.ban.g
    public void setListener(g.a aVar) {
        this.a = aVar;
    }

    public LocalBanButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(mo2.d(getContext()));
        setScaleType(ImageView.ScaleType.CENTER);
        setBanState(false);
        setOnClickListener(new a(this));
    }
}
