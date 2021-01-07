package com.spotify.music.nowplaying.podcast.speedcontrol;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.a;
import androidx.core.widget.c;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.speedcontrol.g;

public final class SpeedControlButton extends AppCompatButton implements g {
    private g.a a;

    public SpeedControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void b(View view) {
        g.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g
    public void setActive(boolean z) {
        setActivated(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g
    public void setListener(g.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g
    public void setSpeed(String str) {
        setText(str);
    }

    public SpeedControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(null);
        c.n(this, R.style.TextAppearance_Encore_Ballad);
        setTextColor(a.c(getContext(), C0707R.color.bg_nowplaying_speed));
        setContentDescription(getResources().getString(C0707R.string.player_content_description_speed_control));
        setFilterTouchesWhenObscured(false);
        setGravity(17);
        if (Build.VERSION.SDK_INT >= 17) {
            setTextDirection(5);
        }
        setOnClickListener(new a(this));
    }
}
