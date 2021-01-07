package com.spotify.music.nowplaying.podcast.mixedmedia.ui.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.common.view.header.e;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class MarqueeTitleHeader extends LinearLayout implements e {
    private final TextView a;
    private final TextView b;
    private e.a c;

    static final class a implements View.OnClickListener {
        final /* synthetic */ MarqueeTitleHeader a;

        a(MarqueeTitleHeader marqueeTitleHeader) {
            this.a = marqueeTitleHeader;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e.a aVar = this.a.c;
            if (aVar != null) {
                ((c) aVar).b();
            }
        }
    }

    public MarqueeTitleHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void d(String str) {
        h.e(str, "title");
        this.a.setText(str);
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
        h.e(str, ContextTrack.Metadata.KEY_SUBTITLE);
        this.b.setVisibility(0);
        this.b.setText(str);
    }

    public MarqueeTitleHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, C0707R.layout.mixed_media_episode_mode_header, this);
        setOrientation(1);
        setGravity(17);
        View findViewById = findViewById(C0707R.id.mixed_media_context_header_title_textview);
        ((TextView) findViewById).setSelected(true);
        h.d(findViewById, "findViewById<TextView>(R…cted = true\n            }");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(C0707R.id.mixed_media_context_header_subtitle_textview);
        ((TextView) findViewById2).setSelected(true);
        h.d(findViewById2, "findViewById<TextView>(R…cted = true\n            }");
        this.b = (TextView) findViewById2;
        setOnClickListener(new a(this));
    }
}
