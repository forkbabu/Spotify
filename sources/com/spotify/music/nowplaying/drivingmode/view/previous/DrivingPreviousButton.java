package com.spotify.music.nowplaying.drivingmode.view.previous;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.previous.g;

public final class DrivingPreviousButton extends AppCompatImageButton implements g {
    private g.a a;

    public DrivingPreviousButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_prev));
        setOnClickListener(new a(this));
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

    public DrivingPreviousButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_prev));
        setOnClickListener(new a(this));
    }
}
