package com.spotify.music.lyrics.fullscreen;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.c;
import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment;
import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.music.lyrics.core.experience.model.LyricsWrapper;
import com.spotify.music.lyrics.fullscreen.views.LyricsFullscreenHeaderView;
import com.spotify.music.lyrics.fullscreen.views.LyricsFullscreenView;
import com.spotify.music.lyrics.share.common.sharebutton.b;
import com.spotify.music.lyrics.vocalremoval.model.VocalVolume;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.j;
import io.reactivex.processors.PublishProcessor;

public class LyricsFullscreenFragment extends BaseLyricsFullscreenFragment implements mfd, m, mfb {
    cqe A0;
    com.spotify.music.lyrics.core.experience.contract.a B0;
    b C0;
    private com.spotify.music.lyrics.core.experience.contract.b D0;
    private LyricsFullscreenView E0;
    private LyricsFullscreenHeaderView F0;
    private com.spotify.music.lyrics.core.experience.model.a G0;
    private PublishProcessor<uqd> H0;
    private ContextTrack I0;
    t v0;
    e w0;
    com.spotify.nowplaying.ui.components.controls.playpause.e x0;
    o y0;
    qfb z0;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            LyricsFullscreenFragment.this.D0.c(LyricsFullscreenFragment.this.k4().getInt("player_position"));
            LyricsFullscreenFragment.this.E0.P(LyricsFullscreenFragment.this.D2());
        }
    }

    @Override // com.spotify.music.lyrics.fullscreen.m
    public ContextTrack G1() {
        return this.I0;
    }

    @Override // defpackage.mfb
    public void H0(VocalVolume vocalVolume) {
        Context l4 = l4();
        ContextMenuFragment.f5(r3.f(new lfb(F2(), this.z0, vocalVolume)), (c) l4, ViewUris.Y);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableDialogFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.E0.Y();
    }

    @Override // com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment, com.spotify.androidx.fragment.app.LifecycleListenableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.y0.b(this.F0);
        this.w0.e(this.E0.getSeekbarView());
        this.x0.d(this.E0.getPlayPauseButton());
        this.E0.getSeekbarView().a().subscribe((j<? super uqd>) this.H0);
        this.v0.f(this.H0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.y0.c();
        this.w0.f();
        this.x0.e();
        this.v0.g();
        this.z0.h();
        this.C0.d();
        super.P3();
    }

    @Override // com.spotify.music.lyrics.fullscreen.m
    public void X(PlayerState playerState) {
        this.I0 = playerState.track().get();
        this.D0.c(playerState.position(this.A0.d()).or((Optional<Long>) 0L).intValue());
        new Handler().postDelayed(new c(this), 350);
    }

    @Override // com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment
    public int a5() {
        return C0707R.style.DialogNoAnimation;
    }

    @Override // com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment
    public View b5() {
        return this.E0.getPlayPauseButton();
    }

    @Override // com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment
    public void c5() {
        this.E0.U(D2(), P4());
        this.z0.e();
    }

    @Override // com.spotify.music.lyrics.fullscreen.m
    public void close() {
        this.E0.U(D2(), P4());
        this.z0.e();
    }

    @Override // com.spotify.music.lyrics.fullscreen.m
    public void d0(Lyrics lyrics) {
        this.D0.g(lyrics, true);
        com.spotify.music.lyrics.core.experience.model.a aVar = this.G0;
        if (aVar != null) {
            this.E0.setColors(aVar);
            this.E0.a0(this.G0.a(), this.G0.c());
        }
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.LYRICS_FULLSCREEN;
    }

    @Override // com.spotify.music.lyrics.fullscreen.m
    public void r0(long j) {
        this.D0.c((int) j);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        View inflate = layoutInflater.inflate(C0707R.layout.lyrics_full_screen_view, viewGroup, false);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        LyricsFullscreenView lyricsFullscreenView = (LyricsFullscreenView) inflate.findViewById(C0707R.id.fullscreen_lyrics_container);
        this.E0 = lyricsFullscreenView;
        lyricsFullscreenView.setLayoutParams(layoutParams);
        this.F0 = (LyricsFullscreenHeaderView) inflate.findViewById(C0707R.id.header);
        com.spotify.music.lyrics.core.experience.contract.b bVar = (com.spotify.music.lyrics.core.experience.contract.b) inflate.findViewById(C0707R.id.lyrics_view);
        this.D0 = bVar;
        bVar.n(this.B0);
        this.B0.f(this.D0);
        this.D0.q();
        ((View) this.D0).setKeepScreenOn(true);
        this.H0 = PublishProcessor.r0();
        Parcelable parcelable = k4().getParcelable("lyrics_wrapper");
        parcelable.getClass();
        LyricsWrapper lyricsWrapper = (LyricsWrapper) parcelable;
        com.spotify.music.lyrics.core.experience.model.a colors = lyricsWrapper.getColors();
        this.G0 = colors;
        this.E0.setBackgroundColor(colors.b());
        this.v0.e(lyricsWrapper.getLyrics());
        this.C0.c(this.E0.getShareButtonViewBinder(), this.D0, lyricsWrapper);
        LyricsFullscreenHeaderView lyricsFullscreenHeaderView = this.F0;
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = j4().getWindow().getDecorView().getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null && displayCutout.getSafeInsetTop() > lyricsFullscreenHeaderView.getPaddingTop()) {
            lyricsFullscreenHeaderView.setPadding(lyricsFullscreenHeaderView.getPaddingLeft(), displayCutout.getSafeInsetTop(), lyricsFullscreenHeaderView.getPaddingRight(), lyricsFullscreenHeaderView.getPaddingBottom());
        }
        this.F0.setCloseClickListener(new d(this));
        this.z0.j(this.E0, this, k4().getBoolean("vocal_removal_possible"));
        inflate.addOnLayoutChangeListener(new a());
        return inflate;
    }
}
