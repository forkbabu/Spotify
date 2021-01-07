package com.spotify.music.nowplaying.drivingmode.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.contextmenu.ContextMenuButton;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.j0;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.n0;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.g;
import com.spotify.music.nowplaying.drivingmode.view.ads.DrivingAdNowPlayingBar;
import com.spotify.music.nowplaying.drivingmode.view.backgroundgradients.DrivingOverlayNpvGradientBackgroundView;
import com.spotify.music.nowplaying.drivingmode.view.backgroundgradients.b;
import com.spotify.music.nowplaying.drivingmode.view.ban.DrivingBanButton;
import com.spotify.music.nowplaying.drivingmode.view.coachmark.DrivingCoachMarkView;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.ConnectionLabelView;
import com.spotify.music.nowplaying.drivingmode.view.contexttitle.ContextTitle;
import com.spotify.music.nowplaying.drivingmode.view.heart.DrivingHeartButton;
import com.spotify.music.nowplaying.drivingmode.view.next.DrivingNextButton;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotContainerView;
import com.spotify.music.nowplaying.drivingmode.view.playercontrols.DrivingPlayerControlsView;
import com.spotify.music.nowplaying.drivingmode.view.playpause.DrivingPlayPauseButton;
import com.spotify.music.nowplaying.drivingmode.view.previous.DrivingPreviousButton;
import com.spotify.music.nowplaying.drivingmode.view.seekbar.DrivingSeekbarView;
import com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButton;
import com.spotify.music.nowplaying.drivingmode.view.shuffle.DrivingShuffleButton;
import com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout.VerticalSplitLayout;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.d;
import com.spotify.music.nowplaying.drivingmode.view.waze.WazeAnchorBar;
import com.spotify.nowplaying.ui.components.controls.playpause.e;
import com.spotify.nowplaying.ui.components.controls.seekbackward.SeekBackwardButton;
import com.spotify.nowplaying.ui.components.controls.seekbackward.h;
import com.spotify.nowplaying.ui.components.controls.seekforward.SeekForwardButton;
import com.spotify.nowplaying.ui.components.progressbar.TrackProgressBar;
import com.spotify.player.model.ContextTrack;
import defpackage.ifd;

public class DrivingModeFragment extends LifecycleListenableFragment implements ovb, ifd.b, mfd, f, d, com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout.d, View.OnKeyListener, c.a {
    zub A0;
    b B0;
    bvb C0;
    dvb D0;
    vub E0;
    mtb F0;
    com.spotify.nowplaying.core.orientation.b G0;
    j0 H0;
    n0 I0;
    com.spotify.nowplaying.ui.components.progressbar.b J0;
    ivb K0;
    f L0;
    uub M0;
    g N0;
    wub O0;
    cvb P0;
    private ViewGroup Q0;
    private View R0;
    private DrivingOverlayNpvGradientBackgroundView S0;
    private VerticalSplitLayout T0;
    private nvb U0;
    private CloseButton V0;
    private ContextTitle W0;
    private ContextMenuButton X0;
    private TrackCarouselView Y0;
    private DrivingSeekbarView Z0;
    private DrivingPreviousButton a1;
    private DrivingPreviousButton b1;
    private DrivingPreviousButton c1;
    private SeekBackwardButton d1;
    private DrivingPlayPauseButton e1;
    private DrivingPlayPauseButton f1;
    private DrivingPlayPauseButton g1;
    com.spotify.music.nowplaying.common.view.close.b h0;
    private DrivingNextButton h1;
    xub i0;
    private DrivingNextButton i1;
    com.spotify.music.nowplaying.common.view.header.c j0;
    private DrivingNextButton j1;
    yub k0;
    private SeekForwardButton k1;
    h l0;
    private DrivingHeartButton l1;
    com.spotify.nowplaying.ui.components.controls.seekforward.g m0;
    private DrivingShuffleButton m1;
    e n0;
    private DrivingBanButton n1;
    com.spotify.nowplaying.ui.components.controls.next.f o0;
    private DrivingPlayerControlsView o1;
    com.spotify.nowplaying.ui.components.controls.previous.e p0;
    private qvb p1;
    e q0;
    private PivotContainerView q1;
    com.spotify.nowplaying.ui.components.controls.next.f r0;
    private DrivingAdNowPlayingBar r1;
    com.spotify.nowplaying.ui.components.controls.previous.e s0;
    private TrackProgressBar s1;
    e t0;
    private DrivingCoachMarkView t1;
    com.spotify.nowplaying.ui.components.controls.next.f u0;
    private ConnectionLabelView u1;
    com.spotify.nowplaying.ui.components.controls.previous.e v0;
    private WazeAnchorBar v1;
    com.spotify.music.nowplaying.common.view.heart.g w0;
    private FrameLayout w1;
    com.spotify.nowplaying.ui.components.shuffle.d x0;
    private FrameLayout x1;
    com.spotify.music.nowplaying.common.view.ban.e y0;
    avb z0;

    class a extends o.e {
        a() {
        }

        @Override // androidx.fragment.app.o.e
        public void a(o oVar, Fragment fragment) {
            if (fragment instanceof DrivingModeVoiceFragment) {
                DrivingModeFragment.this.I0.u();
                DrivingModeFragment drivingModeFragment = DrivingModeFragment.this;
                DrivingModeFragment.K4(drivingModeFragment, drivingModeFragment);
            }
            oVar.R0(this);
        }
    }

    static void K4(DrivingModeFragment drivingModeFragment, View.OnKeyListener onKeyListener) {
        drivingModeFragment.T0.setOnKeyListener(onKeyListener);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        this.F0.e();
        this.G0.c();
        this.B0.c();
        this.H0.getClass();
        this.h0.c();
        this.j0.d();
        this.i0.getClass();
        this.L0.e();
        this.C0.e();
        this.p0.e();
        this.s0.e();
        this.v0.e();
        this.l0.e();
        this.n0.e();
        this.q0.e();
        this.t0.e();
        this.o0.d();
        this.r0.d();
        this.u0.d();
        this.m0.e();
        this.w0.d();
        this.x0.d();
        this.y0.d();
        this.A0.c();
        this.z0.c();
        this.I0.q();
        this.O0.d();
        this.J0.c();
        this.P0.d();
        this.M0.c();
        this.E0.d();
        this.D0.e();
        super.H3();
    }

    public void L4(float f, boolean z) {
        if (z) {
            this.w1.setAlpha(f);
            this.R0.setAlpha(f);
            float f2 = 1.0f - f;
            this.x1.setAlpha(f2);
            this.q1.setAlpha(f2);
            this.t1.setAlpha(f);
        } else {
            float f3 = 1.0f - f;
            this.w1.setAlpha(f3);
            this.R0.setAlpha(f3);
            this.x1.setAlpha(f);
            this.q1.setAlpha(f);
            if (this.x1.getVisibility() == 8) {
                this.x1.setVisibility(0);
            }
        }
        if (f == 1.0f) {
            this.x1.setClickable(!z);
            this.w1.setClickable(z);
            this.I0.n(!z);
            if (!z) {
                this.H0.a();
            }
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.F0.d();
        this.G0.b();
        this.B0.d(this.S0);
        this.H0.b(this.t1);
        this.h0.b(this.V0);
        this.j0.c(this.W0);
        this.i0.b(this.X0, this);
        this.L0.d(this.Y0);
        this.C0.d(this.Z0);
        this.p0.d(this.a1);
        this.s0.d(this.b1);
        this.v0.d(this.c1);
        this.l0.d(this.d1);
        this.n0.d(this.e1);
        this.q0.d(this.f1);
        this.t0.d(this.g1);
        this.o0.c(this.h1);
        this.r0.c(this.i1);
        this.u0.c(this.j1);
        this.m0.d(this.k1);
        this.w0.c(this.l1);
        this.x0.c(this.m1);
        this.y0.c(this.n1);
        this.A0.b(this.o1);
        this.z0.b(this.p1);
        n0 n0Var = this.I0;
        PivotContainerView pivotContainerView = this.q1;
        n0Var.p(pivotContainerView, this.r1, pivotContainerView);
        this.O0.c(this.r1);
        this.J0.b(this.s1);
        this.P0.c(this.T0, this);
        this.T0.setTopListener(new a(this));
        this.T0.setBottomListener(new b(this));
        this.T0.setFocusableInTouchMode(true);
        this.T0.requestFocus();
        this.x1.setOnClickListener(new d(this));
        this.w1.setOnClickListener(new c(this));
        this.T0.setOnKeyListener(this);
        this.M0.b(this);
        this.E0.c(this.u1);
        this.D0.d(this.v1);
    }

    public void M4() {
        nvb nvb = new nvb(M2().inflate(C0707R.layout.driving_context_menu, this.Q0, false));
        this.U0 = nvb;
        nvb.setOutsideTouchable(true);
        this.U0.setFocusable(true);
        this.k0.d(this.U0);
        this.U0.showAtLocation(a3(), 17, 0, 0);
    }

    public void N4() {
        com.spotify.android.flags.c c = com.spotify.android.flags.d.c(this);
        DrivingModeVoiceFragment drivingModeVoiceFragment = new DrivingModeVoiceFragment();
        com.spotify.android.flags.d.a(drivingModeVoiceFragment, c);
        x i = j4().v0().i();
        i.g(null);
        i.b(C0707R.id.fragment_driving_mode, drivingModeVoiceFragment);
        i.i();
        this.T0.setOnKeyListener(null);
        j4().v0().A0(new a(), false);
    }

    public void O4(boolean z) {
        if (z) {
            j4().getWindow().addFlags(128);
        } else {
            j4().getWindow().clearFlags(128);
        }
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.NOWPLAYING;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.h0;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        VerticalSplitLayout verticalSplitLayout;
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 1 || (verticalSplitLayout = this.T0) == null || !verticalSplitLayout.r()) {
            return false;
        }
        this.P0.f(true);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.w3(layoutInflater, viewGroup, bundle);
        this.Q0 = viewGroup;
        Context context = viewGroup.getContext();
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_driving_mode, viewGroup, false);
        this.R0 = inflate.findViewById(C0707R.id.driving_npv);
        this.S0 = (DrivingOverlayNpvGradientBackgroundView) inflate.findViewById(C0707R.id.npv_gradient_view);
        this.t1 = (DrivingCoachMarkView) inflate.findViewById(C0707R.id.driving_coach_mark);
        ContextMenuButton contextMenuButton = (ContextMenuButton) this.R0.findViewById(C0707R.id.context_menu_button);
        this.X0 = contextMenuButton;
        contextMenuButton.setImageDrawable(fvb.n(context));
        this.X0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ContextMenuButton contextMenuButton2 = this.X0;
        Drawable b = fvb.b(context);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        contextMenuButton2.setBackground(b);
        this.W0 = (ContextTitle) this.R0.findViewById(C0707R.id.context_title);
        CloseButton closeButton = (CloseButton) this.R0.findViewById(C0707R.id.close_button);
        this.V0 = closeButton;
        closeButton.setImageDrawable(fvb.f(context));
        this.V0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.V0.setBackground(fvb.b(context));
        TrackCarouselView trackCarouselView = (TrackCarouselView) this.R0.findViewById(C0707R.id.driving_track_carousel);
        this.Y0 = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.K0);
        DrivingSeekbarView drivingSeekbarView = (DrivingSeekbarView) inflate.findViewById(C0707R.id.seekbar_view);
        this.Z0 = drivingSeekbarView;
        drivingSeekbarView.setSeekbarOverlay(inflate.findViewById(C0707R.id.seekbar_overlay_view));
        this.Z0.setSeekbarOverlayTimestampsView((SuppressLayoutTextView) inflate.findViewById(C0707R.id.seekbar_overlay_timestamp));
        this.Z0.setParentView(inflate);
        DrivingPreviousButton drivingPreviousButton = (DrivingPreviousButton) this.R0.findViewById(C0707R.id.driving_music_previous_button);
        this.a1 = drivingPreviousButton;
        drivingPreviousButton.setImageDrawable(fvb.l(context));
        this.a1.setBackground(fvb.b(context));
        DrivingPlayPauseButton drivingPlayPauseButton = (DrivingPlayPauseButton) this.R0.findViewById(C0707R.id.driving_music_playpause_button);
        this.e1 = drivingPlayPauseButton;
        drivingPlayPauseButton.setImageDrawable(fvb.k(context));
        DrivingNextButton drivingNextButton = (DrivingNextButton) this.R0.findViewById(C0707R.id.driving_music_next_button);
        this.h1 = drivingNextButton;
        drivingNextButton.setImageDrawable(fvb.i(context));
        this.h1.setBackground(fvb.b(context));
        DrivingHeartButton drivingHeartButton = (DrivingHeartButton) this.R0.findViewById(C0707R.id.heart_button);
        this.l1 = drivingHeartButton;
        drivingHeartButton.setBackground(fvb.b(context));
        DrivingShuffleButton drivingShuffleButton = (DrivingShuffleButton) this.R0.findViewById(C0707R.id.shuffle_button);
        this.m1 = drivingShuffleButton;
        drivingShuffleButton.setImageDrawable(fvb.o(context));
        this.m1.setBackground(fvb.b(context));
        DrivingBanButton drivingBanButton = (DrivingBanButton) this.R0.findViewById(C0707R.id.ban_button);
        this.n1 = drivingBanButton;
        drivingBanButton.setImageDrawable(fvb.e(context));
        this.n1.setBackground(fvb.b(context));
        SeekBackwardButton seekBackwardButton = (SeekBackwardButton) this.R0.findViewById(C0707R.id.driving_podcast_seek_backward_button);
        this.d1 = seekBackwardButton;
        seekBackwardButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.d1.setImageDrawable(fvb.p(viewGroup.getContext()));
        this.d1.setBackground(fvb.b(viewGroup.getContext()));
        DrivingPlayPauseButton drivingPlayPauseButton2 = (DrivingPlayPauseButton) this.R0.findViewById(C0707R.id.driving_podcast_playpause_button);
        this.f1 = drivingPlayPauseButton2;
        drivingPlayPauseButton2.setImageDrawable(fvb.k(context));
        SeekForwardButton seekForwardButton = (SeekForwardButton) this.R0.findViewById(C0707R.id.driving_podcast_seek_forward_button);
        this.k1 = seekForwardButton;
        seekForwardButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.k1.setImageDrawable(fvb.q(viewGroup.getContext()));
        this.k1.setBackground(fvb.b(viewGroup.getContext()));
        DrivingPreviousButton drivingPreviousButton2 = (DrivingPreviousButton) this.R0.findViewById(C0707R.id.driving_podcast_previous_button);
        this.b1 = drivingPreviousButton2;
        drivingPreviousButton2.setImageDrawable(fvb.m(context));
        this.b1.setBackground(fvb.b(context));
        DrivingNextButton drivingNextButton2 = (DrivingNextButton) this.R0.findViewById(C0707R.id.driving_podcast_next_button);
        this.i1 = drivingNextButton2;
        drivingNextButton2.setImageDrawable(fvb.j(context));
        this.i1.setBackground(fvb.b(context));
        DrivingPreviousButton drivingPreviousButton3 = (DrivingPreviousButton) this.R0.findViewById(C0707R.id.driving_ads_previous_button);
        this.c1 = drivingPreviousButton3;
        drivingPreviousButton3.setImageDrawable(fvb.l(context));
        this.c1.setBackground(fvb.b(context));
        DrivingPlayPauseButton drivingPlayPauseButton3 = (DrivingPlayPauseButton) this.R0.findViewById(C0707R.id.driving_ads_playpause_button);
        this.g1 = drivingPlayPauseButton3;
        drivingPlayPauseButton3.setImageDrawable(fvb.k(context));
        DrivingNextButton drivingNextButton3 = (DrivingNextButton) this.R0.findViewById(C0707R.id.driving_ads_next_button);
        this.j1 = drivingNextButton3;
        drivingNextButton3.setImageDrawable(fvb.i(context));
        this.j1.setBackground(fvb.b(context));
        this.o1 = (DrivingPlayerControlsView) this.R0.findViewById(C0707R.id.driving_player_controls);
        this.p1 = new qvb(this.m1, this.n1);
        View findViewById = inflate.findViewById(C0707R.id.driving_pivot_view);
        this.q1 = (PivotContainerView) findViewById.findViewById(C0707R.id.pivot_container);
        DrivingAdNowPlayingBar drivingAdNowPlayingBar = (DrivingAdNowPlayingBar) findViewById.findViewById(C0707R.id.driving_mode_ad_npb);
        this.r1 = drivingAdNowPlayingBar;
        this.s1 = (TrackProgressBar) drivingAdNowPlayingBar.findViewById(C0707R.id.driving_ads_progress_bar);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0707R.id.open_pivot_touch_area);
        this.w1 = frameLayout;
        this.S0.setOpenPivotTouchArea(frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(C0707R.id.close_pivot_touch_area);
        this.x1 = frameLayout2;
        this.S0.setClosePivotTouchArea(frameLayout2);
        this.x1.setAlpha(0.0f);
        this.x1.setClickable(false);
        this.x1.setVisibility(8);
        this.T0 = (VerticalSplitLayout) inflate.findViewById(C0707R.id.split_view);
        this.u1 = (ConnectionLabelView) this.R0.findViewById(C0707R.id.connect_label_view);
        WazeAnchorBar wazeAnchorBar = (WazeAnchorBar) inflate.findViewById(C0707R.id.waze_anchor_bar);
        this.v1 = wazeAnchorBar;
        wazeAnchorBar.setAnchorContentAnimation(AnchorBar.AnchorContentAnimation.TOP_TO_BOTTOM);
        DrivingShowVoiceViewButton drivingShowVoiceViewButton = (DrivingShowVoiceViewButton) inflate.findViewById(C0707R.id.driving_show_voice_view_music_button);
        DrivingShowVoiceViewButton drivingShowVoiceViewButton2 = (DrivingShowVoiceViewButton) inflate.findViewById(C0707R.id.driving_show_voice_view_podcast_button);
        if (drivingShowVoiceViewButton != null) {
            drivingShowVoiceViewButton.setBackground(fvb.b(context));
        }
        if (drivingShowVoiceViewButton2 != null) {
            drivingShowVoiceViewButton2.setBackground(fvb.b(context));
        }
        DrivingShowVoiceViewButton drivingShowVoiceViewButton3 = (DrivingShowVoiceViewButton) inflate.findViewById(C0707R.id.driving_show_voice_view_pivot_button);
        if (drivingShowVoiceViewButton3 != null) {
            drivingShowVoiceViewButton3.setBackground(fvb.b(context));
        }
        this.N0.c(this, drivingShowVoiceViewButton, drivingShowVoiceViewButton2, drivingShowVoiceViewButton3);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.N0.d();
        nvb nvb = this.U0;
        if (nvb != null) {
            nvb.cancel();
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.R;
    }
}
