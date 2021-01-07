package com.spotify.music.carmode.nowplaying.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.next.i;

public class NextButton extends AppCompatImageButton implements i {
    private i.a a;

    public NextButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
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
        throw new UnsupportedOperationException();
    }

    public NextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(mo2.e(getContext()));
        setScaleType(ImageView.ScaleType.CENTER);
        setContentDescription(getResources().getString(C0707R.string.player_content_description_next));
        setOnClickListener(new e(this));
    }
}
