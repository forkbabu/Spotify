package com.spotify.music.nowplaying.drivingmode.view.seekbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.view.seekbar.e;
import com.spotify.nowplaying.ui.components.controls.seekbar.i;
import com.spotify.nowplaying.ui.components.overlay.OverlayHidingFrameLayout;

public class DrivingSeekbarView extends OverlayHidingFrameLayout implements e {
    public static final /* synthetic */ int H = 0;
    private i A;
    private final i B;
    private e.a C;
    private final TextView D;
    private View E;
    private View F;
    private AnimatorSet G;
    private final View w;
    private final SeekBar x;
    private SuppressLayoutTextView y;
    private int z;

    public DrivingSeekbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void B(DrivingSeekbarView drivingSeekbarView) {
        AnimatorSet animatorSet = drivingSeekbarView.G;
        if (animatorSet != null && animatorSet.isStarted()) {
            drivingSeekbarView.G.cancel();
        }
        SuppressLayoutTextView suppressLayoutTextView = drivingSeekbarView.y;
        if (drivingSeekbarView.getResources().getConfiguration().orientation == 1 && drivingSeekbarView.D.length() >= 5) {
            int i = drivingSeekbarView.z;
            if (drivingSeekbarView.D.length() == 5) {
                i -= 10;
            } else if (drivingSeekbarView.D.length() > 5) {
                i -= 20;
            }
            suppressLayoutTextView.setTextSize(2, (float) i);
        }
        drivingSeekbarView.E.setAlpha(0.9f);
        drivingSeekbarView.E.bringToFront();
        drivingSeekbarView.y.setAlpha(1.0f);
        drivingSeekbarView.y.bringToFront();
        drivingSeekbarView.F.findViewById(C0707R.id.seekbar_view).bringToFront();
        drivingSeekbarView.w.setAlpha(0.0f);
    }

    static void C(DrivingSeekbarView drivingSeekbarView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(drivingSeekbarView.E, View.ALPHA, 0.9f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(drivingSeekbarView.y, View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(drivingSeekbarView.w, View.ALPHA, 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        drivingSeekbarView.G = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setDuration(500L);
        animatorSet.addListener(new d(drivingSeekbarView));
        animatorSet.start();
    }

    public e.a getListener() {
        return this.C;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.seekbar.e
    public void setDuration(int i) {
        this.B.b(i);
        this.A.b(i);
        this.x.setMax(i);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.seekbar.e
    public void setListener(e.a aVar) {
        this.C = aVar;
    }

    public void setParentView(View view) {
        this.F = view;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.seekbar.e
    public void setPosition(int i) {
        this.x.setProgress(i);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.seekbar.e
    public void setPositionText(int i) {
        this.B.c(i);
        this.A.c(i);
    }

    public void setSeekbarOverlay(View view) {
        this.E = view;
    }

    public void setSeekbarOverlayTimestampsView(SuppressLayoutTextView suppressLayoutTextView) {
        this.y = suppressLayoutTextView;
        this.A = new i(suppressLayoutTextView, this.D);
        this.z = (int) (suppressLayoutTextView.getTextSize() / getResources().getDisplayMetrics().scaledDensity);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.seekbar.e
    public void setSeekingEnabled(boolean z2) {
        if (!z2) {
            this.x.setOnTouchListener(a.a);
            this.x.getThumb().mutate().setAlpha(0);
            return;
        }
        this.x.setOnTouchListener(null);
        this.x.getThumb().mutate().setAlpha(BitmapRenderer.ALPHA_VISIBLE);
    }

    public DrivingSeekbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.inflate(getContext(), C0707R.layout.driving_seekbar_time_components, this);
        SeekBar seekBar = (SeekBar) findViewById(C0707R.id.seek_bar);
        this.x = seekBar;
        seekBar.setOnSeekBarChangeListener(new c(this));
        this.w = findViewById(C0707R.id.timestamps);
        TextView textView = (TextView) findViewById(C0707R.id.duration);
        this.D = textView;
        this.B = new i((SuppressLayoutTextView) findViewById(C0707R.id.position), textView);
        setFadeDuration(300);
        setTimeoutDuration(CrashReportManager.TIME_WINDOW);
        if (getResources().getConfiguration().orientation == 1) {
            double d = (double) Resources.getSystem().getDisplayMetrics().widthPixels;
            Double.isNaN(d);
            Double.isNaN(d);
            int i2 = (int) (d * 0.08d);
            seekBar.setPadding(i2, 0, i2, 0);
            getViewTreeObserver().addOnPreDrawListener(new b(this, i2));
        }
    }
}
