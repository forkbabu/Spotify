package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.d;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.HorizontalFadingEdgeLayout;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.TimeLine;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.ReadinessSubject;
import com.spotify.rxjava2.q;
import defpackage.k1c;
import kotlin.jvm.internal.h;

public final class SegmentedSeekBar extends LinearLayout implements d {
    private final SuppressLayoutTextView a;
    private final TextView b;
    private final TimeLine c;
    private ReadinessSubject<ViewState> f;
    private final q n;
    private d.a o;
    private k1c p;

    /* access modifiers changed from: private */
    public enum ViewState {
        IS_STARTED,
        HAS_LISTENER
    }

    public SegmentedSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void a(SegmentedSeekBar segmentedSeekBar) {
        d.a aVar = segmentedSeekBar.o;
        if (aVar != null) {
            aVar.onStart();
        } else {
            h.k("listener");
            throw null;
        }
    }

    public void b(d.a aVar, k1c.a aVar2) {
        h.e(aVar, "listener");
        h.e(aVar2, "seekBarTimeStampHelperFactory");
        this.o = aVar;
        SuppressLayoutTextView suppressLayoutTextView = this.a;
        TextView textView = this.b;
        h.e(suppressLayoutTextView, "positionView");
        h.e(textView, "durationView");
        this.p = new k1c(suppressLayoutTextView, textView, null);
        ReadinessSubject<ViewState> readinessSubject = this.f;
        if (readinessSubject != null) {
            readinessSubject.a(ViewState.HAS_LISTENER, true);
        } else {
            h.k("readinessSubject");
            throw null;
        }
    }

    public final TimeLine getTimeLine() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ReadinessSubject<ViewState> readinessSubject = new ReadinessSubject<>(ViewState.values(), new SegmentedSeekBar$onAttachedToWindow$1(this));
        this.n.a(readinessSubject);
        this.f = readinessSubject;
        if (readinessSubject != null) {
            readinessSubject.a(ViewState.IS_STARTED, true);
        } else {
            h.k("readinessSubject");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ReadinessSubject<ViewState> readinessSubject = this.f;
        if (readinessSubject != null) {
            readinessSubject.a(ViewState.IS_STARTED, false);
            this.n.c();
            d.a aVar = this.o;
            if (aVar != null) {
                aVar.onStop();
            } else {
                h.k("listener");
                throw null;
            }
        } else {
            h.k("readinessSubject");
            throw null;
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.d
    public void setDurationString(int i) {
        k1c k1c = this.p;
        if (k1c != null) {
            k1c.b(i);
        } else {
            h.k("seekBarTimeStampHelper");
            throw null;
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.d
    public void setPositionString(int i) {
        k1c k1c = this.p;
        if (k1c != null) {
            k1c.c(i);
        } else {
            h.k("seekBarTimeStampHelper");
            throw null;
        }
    }

    public final void setTimestampsVisible(boolean z) {
        int i = 0;
        this.a.setVisibility(z ? 0 : 8);
        TextView textView = this.b;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        TimeLine timeLine = new TimeLine(context, attributeSet, i);
        this.c = timeLine;
        this.n = new q();
        setOrientation(1);
        HorizontalFadingEdgeLayout horizontalFadingEdgeLayout = new HorizontalFadingEdgeLayout(context, attributeSet, i);
        horizontalFadingEdgeLayout.addView(timeLine);
        addView(horizontalFadingEdgeLayout);
        LinearLayout.inflate(context, C0707R.layout.podcast_mixed_media_mode_npv_timestamps, this);
        View findViewById = findViewById(C0707R.id.timestamps);
        h.d(findViewById, "findViewById<View>(R.id.timestamps)");
        findViewById.setVisibility(0);
        View findViewById2 = findViewById(C0707R.id.position);
        h.d(findViewById2, "findViewById(R.id.position)");
        this.a = (SuppressLayoutTextView) findViewById2;
        View findViewById3 = findViewById(C0707R.id.duration);
        h.d(findViewById3, "findViewById(R.id.duration)");
        this.b = (TextView) findViewById3;
        setTimestampsVisible(true);
    }
}
