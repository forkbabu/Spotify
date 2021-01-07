package com.spotify.nowplaying.ui.components.controls.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.seekbar.g;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.processors.PublishProcessor;

public class PersistentSeekbarView extends FrameLayout implements g {
    private CancellableSeekBar a;
    private SuppressLayoutTextView b;
    private TextView c;
    private i f;
    private PublishProcessor<uqd> n;

    public PersistentSeekbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g<uqd> a() {
        return new FlowableOnBackpressureLatest(this.n);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setDuration(int i) {
        this.f.b(i);
        this.a.setMax(i);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setListener(g.a aVar) {
        if (aVar == null) {
            this.a.setOnSeekBarChangeListener((CancellableSeekBar.a) null);
            return;
        }
        CancellableSeekBar cancellableSeekBar = this.a;
        d b2 = d.b(aVar);
        PublishProcessor<uqd> publishProcessor = this.n;
        publishProcessor.getClass();
        b2.c(new a(publishProcessor));
        cancellableSeekBar.setOnSeekBarChangeListener((CancellableSeekBar.a) b2);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setPosition(int i) {
        this.a.setProgress(i);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setPositionText(int i) {
        this.f.c(i);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setSeekingEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setTimestampsVisible(boolean z) {
        int i = 0;
        this.b.setVisibility(z ? 0 : 8);
        TextView textView = this.c;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void u() {
        this.a.a();
    }

    public PersistentSeekbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.inflate(getContext(), C0707R.layout.player_v2_seekbar, this);
        findViewById(C0707R.id.timestamps).setVisibility(0);
        this.a = (CancellableSeekBar) findViewById(C0707R.id.seek_bar);
        this.b = (SuppressLayoutTextView) findViewById(C0707R.id.position);
        TextView textView = (TextView) findViewById(C0707R.id.duration);
        this.c = textView;
        this.f = new i(this.b, textView);
        this.n = PublishProcessor.r0();
    }
}
