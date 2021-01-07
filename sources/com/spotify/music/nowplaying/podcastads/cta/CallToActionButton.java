package com.spotify.music.nowplaying.podcastads.cta;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcastads.cta.e;
import com.spotify.paste.widgets.internal.StateListAnimatorButton;

public class CallToActionButton extends StateListAnimatorButton implements e {
    private e.a a;

    public CallToActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void b(View view) {
        e.a aVar = this.a;
        if (aVar != null) {
            ((c) aVar).b();
        }
    }

    @Override // com.spotify.music.nowplaying.podcastads.cta.e
    public void setListener(e.a aVar) {
        this.a = aVar;
    }

    public CallToActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnClickListener(new a(this));
        setContentDescription(getResources().getString(C0707R.string.player_content_description_cta));
    }
}
