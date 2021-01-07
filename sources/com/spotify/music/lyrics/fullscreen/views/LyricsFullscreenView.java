package com.spotify.music.lyrics.fullscreen.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.share.common.sharebutton.ShareButton;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class LyricsFullscreenView extends ConstraintLayout implements ofb {
    private View a;
    private View b;
    private LyricsFullscreenHeaderView c;
    private PlayPauseButton f;
    private ImageButton n;
    private ImageButton o;
    private PersistentSeekbarView p;
    private View q;
    private ShareButton r;
    protected com.spotify.music.lyrics.core.experience.contract.b s;
    private com.spotify.music.lyrics.core.experience.model.a t;
    private AnimatorSet u;
    protected nfb v;

    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewGroup.LayoutParams layoutParams = LyricsFullscreenView.this.a.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            LyricsFullscreenView.this.a.setLayoutParams(layoutParams);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    class b implements Animator.AnimatorListener {
        final /* synthetic */ Dialog a;

        b(Dialog dialog) {
            this.a = dialog;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.dismiss();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LyricsFullscreenView.this.f.setAlpha(0.0f);
            LyricsFullscreenView.this.p.setAlpha(0.0f);
            LyricsFullscreenView.this.n.setAlpha(0.0f);
            LyricsFullscreenView.this.o.setAlpha(0.0f);
            if (LyricsFullscreenView.this.r != null) {
                LyricsFullscreenView.this.r.setAlpha(0.0f);
            }
        }
    }

    public LyricsFullscreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void V() {
        this.n.setBackgroundResource(C0707R.drawable.enable_vocal_removal);
        this.o.setVisibility(8);
        this.o.setEnabled(false);
        this.s.a(this.t.a(), this.t.c());
        setBackgroundColor(this.t.b());
    }

    private void W() {
        if (this.b == null) {
            View inflate = ((ViewStub) findViewById(C0707R.id.track_problem_reported_banner_view_stub)).inflate();
            this.b = inflate;
            inflate.setBackgroundColor(this.t.b());
            this.b.findViewById(C0707R.id.close_button).setOnClickListener(new b(this));
        }
    }

    @Override // defpackage.ofb
    public void A() {
        W();
        this.b.setVisibility(0);
    }

    public void P(Bundle bundle) {
        AnimatorSet animatorSet = this.u;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.u.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        bundle.getClass();
        tdb.a(animatorSet2, bundle, this.a, (View) this.s, this.c, this.p, this.f, this.n, this.o, this.r, nud.g(56.0f, getResources()));
        animatorSet2.addListener(new a());
        animatorSet2.start();
        this.u = animatorSet2;
    }

    public void U(Bundle bundle, Dialog dialog) {
        AnimatorSet animatorSet = this.u;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.u.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        bundle.getClass();
        tdb.b(animatorSet2, bundle, this.a, (View) this.s, this.c, this.b);
        animatorSet2.addListener(new b(dialog));
        animatorSet2.start();
        this.u = animatorSet2;
    }

    public void Y() {
        AnimatorSet animatorSet = this.u;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    public void a0(int i, int i2) {
        this.s.a(i, i2);
    }

    @Override // defpackage.ofb
    public void f() {
        this.q.setVisibility(8);
        this.n.setVisibility(0);
    }

    public View getLoadingIndicator() {
        return this.q;
    }

    public PlayPauseButton getPlayPauseButton() {
        return this.f;
    }

    public PersistentSeekbarView getSeekbarView() {
        return this.p;
    }

    public com.spotify.music.lyrics.share.common.sharebutton.a getShareButtonViewBinder() {
        return this.r;
    }

    public View getTrackProblemReportedBanner() {
        return this.b;
    }

    public ImageButton getVocalRemovalButton() {
        return this.n;
    }

    public ImageButton getVocalRemovalMenuButton() {
        return this.o;
    }

    @Override // defpackage.ofb
    public boolean l() {
        return this.n.getVisibility() == 0;
    }

    @Override // defpackage.ofb
    public void m() {
        W();
        this.b.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (LyricsFullscreenHeaderView) findViewById(C0707R.id.header);
        this.s = (com.spotify.music.lyrics.core.experience.contract.b) findViewById(C0707R.id.lyrics_view);
        this.p = (PersistentSeekbarView) findViewById(C0707R.id.seek_bar_view);
        this.f = (PlayPauseButton) findViewById(C0707R.id.play_pause_button);
        this.a = findViewById(C0707R.id.background);
        this.n = (ImageButton) findViewById(C0707R.id.vocal_removal_button);
        this.o = (ImageButton) findViewById(C0707R.id.vocal_removal_menu_button);
        this.q = findViewById(C0707R.id.loading_indicator);
        this.o.setBackground(new SpotifyIconDrawable(getContext(), SpotifyIconV2.MORE_ANDROID, getResources().getDimension(C0707R.dimen.vocal_removal_menu_button_size)));
        this.o.setOnClickListener(new c(this));
        this.s.q();
        ((View) this.s).setKeepScreenOn(true);
        this.r = (ShareButton) findViewById(C0707R.id.share_button);
    }

    @Override // defpackage.ofb
    public void p() {
        this.n.setVisibility(8);
        this.n.setEnabled(false);
        this.o.setVisibility(8);
        this.o.setEnabled(false);
    }

    @Override // defpackage.ofb
    public void q() {
        this.n.setVisibility(0);
        this.n.setEnabled(true);
        V();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ((GradientDrawable) this.a.getBackground()).setColor(i);
        this.c.setBackgroundColor(i);
        this.f.setColor(i);
    }

    public void setColors(com.spotify.music.lyrics.core.experience.model.a aVar) {
        this.t = aVar;
    }

    @Override // defpackage.ofb
    public void setLyricsVocalRemovalPresenter(nfb nfb) {
        this.v = nfb;
        this.n.setOnClickListener(new a(this));
    }

    @Override // defpackage.ofb
    public void v(boolean z) {
        if (z) {
            this.n.setBackgroundResource(C0707R.drawable.disable_vocal_removal);
            this.o.setVisibility(0);
            this.o.setEnabled(true);
            this.s.a(this.t.a(), this.t.b());
            setBackgroundColor(this.t.c());
            return;
        }
        V();
    }

    @Override // defpackage.ofb
    public void w() {
        this.n.setVisibility(8);
        this.q.setVisibility(0);
    }

    public LyricsFullscreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
