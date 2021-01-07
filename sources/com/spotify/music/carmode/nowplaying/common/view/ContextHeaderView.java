package com.spotify.music.carmode.nowplaying.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.common.view.header.e;
import com.spotify.paste.widgets.internal.StateListAnimatorTextView;

public class ContextHeaderView extends StateListAnimatorTextView implements e {
    private e.a a;

    public ContextHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void d(String str) {
    }

    public void j(View view) {
        e.a aVar = this.a;
        if (aVar != null) {
            ((c) aVar).b();
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void setListener(e.a aVar) {
        this.a = aVar;
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void y() {
        setVisibility(4);
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void z(String str) {
        setVisibility(0);
        setText(str);
    }

    public ContextHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnClickListener(new b(this));
        bvd a2 = dvd.a(this);
        a2.g(this);
        a2.a();
    }
}
