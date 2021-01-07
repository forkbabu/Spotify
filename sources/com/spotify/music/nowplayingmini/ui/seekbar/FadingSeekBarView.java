package com.spotify.music.nowplayingmini.ui.seekbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.u;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.seekbar.g;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class FadingSeekBarView extends ConstraintLayout implements g {
    private u3<Integer, String> a;
    private CancellableSeekBar b;
    private TextView c;
    private TextView f;
    private g.a n;
    private Transition o;
    private Transition p;

    public FadingSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private String D(int i) {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds((long) Math.max(0, i));
        F f2 = this.a.a;
        f2.getClass();
        if (f2.intValue() != seconds) {
            this.a = new u3<>(Integer.valueOf(seconds), String.format(Locale.getDefault(), "%d:%02d", Integer.valueOf((int) TimeUnit.SECONDS.toMinutes((long) seconds)), Integer.valueOf(seconds % 60)));
        }
        return this.a.b;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        setTimestampsVisible(false);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setDuration(int i) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(D(i));
        }
        this.b.setMax(i);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setListener(g.a aVar) {
        this.n = aVar;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setPosition(int i) {
        this.b.setProgress(i);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setPositionText(int i) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(D(i));
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setSeekingEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void setTimestampsVisible(boolean z) {
        TextView textView = this.f;
        TextView textView2 = this.c;
        if (textView != null && textView2 != null) {
            int i = z ? 0 : 4;
            u.b(this);
            u.a(this, z ? this.o : this.p);
            textView2.setVisibility(i);
            textView.setVisibility(i);
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g
    public void u() {
        this.b.a();
    }

    public FadingSeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new u3<>(0, "0:00");
        ViewGroup.inflate(getContext(), C0707R.layout.nowplayingmini_seek_bar, this);
        this.b = (CancellableSeekBar) findViewById(C0707R.id.seek_bar);
        this.c = (TextView) findViewById(C0707R.id.position);
        this.f = (TextView) findViewById(C0707R.id.duration);
        this.b.setOnSeekBarChangeListener((CancellableSeekBar.a) new f(this));
        AutoTransition autoTransition = new AutoTransition();
        this.o = autoTransition;
        autoTransition.T(150);
        this.o.V(ta0.e);
        AutoTransition autoTransition2 = new AutoTransition();
        this.p = autoTransition2;
        autoTransition2.T(1500);
        this.p.V(ta0.a);
    }
}
