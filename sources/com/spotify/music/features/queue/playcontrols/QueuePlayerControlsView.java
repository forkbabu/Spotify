package com.spotify.music.features.queue.playcontrols;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import com.google.common.base.Optional;
import com.spotify.libs.connect.picker.view.ConnectView;
import com.spotify.mobile.android.util.g0;
import com.spotify.music.C0707R;

public class QueuePlayerControlsView extends FrameLayout implements h {
    public static final /* synthetic */ int p = 0;
    private ImageButton a;
    private ImageButton b;
    private ImageButton c;
    private ProgressBar f;
    private ConnectView n;
    private g0<ProgressBar> o;

    public QueuePlayerControlsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.features.queue.playcontrols.h
    public void a(long j, long j2, float f2) {
        this.o.g(j, j2, f2);
    }

    public void b() {
        this.o.e();
    }

    public void c(e eVar) {
        this.a.setOnClickListener(new d(eVar));
        this.b.setOnClickListener(new c(eVar));
        this.c.setOnClickListener(new b(eVar));
    }

    public ConnectView getConnectView() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ImageButton imageButton = (ImageButton) findViewById(C0707R.id.btn_prev);
        this.a = imageButton;
        imageButton.setImageDrawable(gqd.t(getContext()));
        this.b = (ImageButton) findViewById(C0707R.id.btn_play);
        ImageButton imageButton2 = (ImageButton) findViewById(C0707R.id.btn_next);
        this.c = imageButton2;
        imageButton2.setImageDrawable(gqd.j(getContext()));
        this.f = (ProgressBar) findViewById(C0707R.id.seek_bar);
        this.n = (ConnectView) findViewById(C0707R.id.connect_view_root);
        this.o = new g0<>(this.f, Optional.absent());
    }

    @Override // com.spotify.music.features.queue.playcontrols.h
    public void setPlayPauseButtonEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    @Override // com.spotify.music.features.queue.playcontrols.h
    public void setPlayPauseButtonShowAsPaused(boolean z) {
        Drawable drawable;
        int i;
        if (z) {
            drawable = gqd.p(getContext());
            i = C0707R.string.player_content_description_play;
        } else {
            drawable = gqd.m(getContext());
            i = C0707R.string.player_content_description_pause;
        }
        this.b.setImageDrawable(drawable);
        this.b.setContentDescription(getContext().getString(i));
    }

    @Override // com.spotify.music.features.queue.playcontrols.h
    public void setSeekbarLength(long j) {
        this.f.setMax((int) j);
        this.f.refreshDrawableState();
    }

    @Override // com.spotify.music.features.queue.playcontrols.h
    public void setSeekingEnabled(boolean z) {
        this.f.setEnabled(z);
    }

    @Override // com.spotify.music.features.queue.playcontrols.h
    public void setSkipToNextTrackIconEnabled(boolean z) {
        this.c.setEnabled(z);
        this.c.setVisibility(0);
    }

    @Override // com.spotify.music.features.queue.playcontrols.h
    public void setSkipToPreviousTrackEnabled(boolean z) {
        this.a.setEnabled(z);
        this.a.setVisibility(0);
    }

    public QueuePlayerControlsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C0707R.layout.play_queue_controls, (ViewGroup) this, true);
    }
}
