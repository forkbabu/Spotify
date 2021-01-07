package com.spotify.nowplaying.ui.components.controls.playpause.poc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.encore.Element;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.c;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class PlayPauseButton extends AppCompatImageButton implements Element {
    private final c a;
    private final c b;
    private final String c;
    private final String f;
    private boolean n;

    static final class a implements View.OnClickListener {
        final /* synthetic */ PlayPauseButton a;
        final /* synthetic */ nmf b;

        a(PlayPauseButton playPauseButton, nmf nmf) {
            this.a = playPauseButton;
            this.b = nmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.b.invoke(Boolean.valueOf(this.a.n));
        }
    }

    public PlayPauseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Boolean, f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new a(this, nmf));
    }

    @Override // com.spotify.encore.Item
    public /* bridge */ /* synthetic */ void render(Object obj) {
        render(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        c g = gqd.g(context, 32, 0, 0.45f);
        this.a = g;
        c f2 = gqd.f(context, 32, 0, 0.45f);
        this.b = f2;
        String string = getResources().getString(C0707R.string.player_content_description_play);
        h.d(string, "resources.getString(R.st…content_description_play)");
        this.c = string;
        String string2 = getResources().getString(C0707R.string.player_content_description_pause);
        h.d(string2, "resources.getString(R.st…ontent_description_pause)");
        this.f = string2;
        g.c(androidx.core.content.a.c(context, C0707R.color.btn_now_playing_white));
        f2.c(androidx.core.content.a.c(context, C0707R.color.btn_now_playing_white));
        setBackground(null);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        render(false);
    }

    public void render(boolean z) {
        this.n = z;
        setImageDrawable(z ? this.b : this.a);
        setContentDescription(this.n ? this.f : this.c);
    }
}
