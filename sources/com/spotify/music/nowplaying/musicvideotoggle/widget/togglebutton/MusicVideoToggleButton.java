package com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton.g;

public class MusicVideoToggleButton extends AppCompatButton implements g {
    private g.a a;

    public MusicVideoToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842824);
    }

    private void c() {
        setBackgroundDrawable(a.d(getContext(), C0707R.drawable.toggle_button_unselected));
        setTextColor(a.b(getContext(), R.color.white_90));
    }

    @Override // com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton.g
    public void a(Boolean bool) {
        if (bool.booleanValue()) {
            setBackgroundDrawable(a.d(getContext(), C0707R.drawable.toggle_button_selected));
            setTextColor(a.b(getContext(), R.color.black_90));
            return;
        }
        c();
    }

    public void b(View view) {
        g.a aVar = this.a;
        if (aVar != null) {
            ((e) aVar).c();
        }
    }

    @Override // com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton.g
    public void setClickListener(g.a aVar) {
        this.a = aVar;
    }

    public MusicVideoToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
        setTextSize(2, 12.0f);
        setOnClickListener(new a(this));
    }
}
