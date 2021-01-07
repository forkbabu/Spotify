package com.spotify.music.nowplaying.common.view.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.header.e;

public class TitleHeader extends LinearLayout implements e {
    private final TextView a;
    private final TextView b;
    private e.a c;

    public TitleHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(View view) {
        e.a aVar = this.c;
        if (aVar != null) {
            ((c) aVar).b();
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void d(String str) {
        this.a.setText(str);
    }

    public String getHeaderText() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        if (this.b.getVisibility() == 0) {
            sb.append('\n');
            sb.append(this.b.getText());
        }
        return sb.toString();
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void setListener(e.a aVar) {
        this.c = aVar;
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void y() {
        this.b.setVisibility(8);
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void z(String str) {
        this.b.setVisibility(0);
        this.b.setText(str);
    }

    public TitleHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.inflate(context, C0707R.layout.context_title_header, this);
        setOrientation(1);
        setGravity(17);
        this.a = (TextView) findViewById(C0707R.id.context_header_title_textview);
        this.b = (TextView) findViewById(C0707R.id.context_header_subtitle_textview);
        setOnClickListener(new b(this));
    }
}
