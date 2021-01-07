package com.spotify.music.nowplaying.drivingmode.view.ban;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.ban.e;
import com.spotify.music.nowplaying.common.view.ban.g;

public final class DrivingBanButton extends AppCompatImageButton implements g {
    private g.a a;

    public DrivingBanButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_ban));
        setOnClickListener(new a(this));
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

    public DrivingBanButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_ban));
        setOnClickListener(new a(this));
    }
}
