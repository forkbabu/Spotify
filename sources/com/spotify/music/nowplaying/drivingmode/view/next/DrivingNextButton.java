package com.spotify.music.nowplaying.drivingmode.view.next;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.next.i;

public class DrivingNextButton extends AppCompatImageButton implements i {
    private i.a a;

    public DrivingNextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_next));
        setOnClickListener(new a(this));
    }

    public void g(View view) {
        i.a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.i
    public void setListener(i.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.i
    public void setNextEnabled(boolean z) {
        setEnabled(z);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.i
    public void setNextVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public DrivingNextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_next));
        setOnClickListener(new a(this));
    }
}
