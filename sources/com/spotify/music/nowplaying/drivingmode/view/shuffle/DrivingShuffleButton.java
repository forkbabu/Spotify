package com.spotify.music.nowplaying.drivingmode.view.shuffle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.shuffle.d;
import com.spotify.nowplaying.ui.components.shuffle.f;

public final class DrivingShuffleButton extends AppCompatImageButton implements f {
    private f.a a;

    public DrivingShuffleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnClickListener(new a(this));
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
        setActivated(z);
        setContentDescription(getResources().getString(z ? C0707R.string.player_content_description_shuffle_on : C0707R.string.player_content_description_shuffle_off));
    }

    public DrivingShuffleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnClickListener(new a(this));
    }
}
