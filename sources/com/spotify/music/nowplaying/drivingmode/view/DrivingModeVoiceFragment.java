package com.spotify.music.nowplaying.drivingmode.view;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.i;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.j;
import com.spotify.music.nowplaying.drivingmode.view.micbutton.DrivingMicButton;
import com.spotify.music.nowplaying.drivingmode.view.progressxbutton.DrivingProgressXButton;
import com.spotify.music.nowplaying.drivingmode.view.progressxbutton.g;
import com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet.DrivingVoiceBottomSheetView;
import com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet.b;
import com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation.VoiceInputAnimationView;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.DrivingVoiceView;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.c;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.f;
import com.squareup.picasso.Picasso;
import defpackage.ifd;
import defpackage.wvb;
import io.reactivex.disposables.a;

public class DrivingModeVoiceFragment extends LifecycleListenableFragment implements ifd.b, mfd, c, f, wvb.a, View.OnKeyListener {
    j h0;
    i i0;
    b j0;
    g k0;
    Picasso l0;
    cte m0;
    private View n0;
    private DrivingProgressXButton o0;
    private final a p0 = new a();

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        if (a3() != null) {
            a3().setOnKeyListener(null);
        }
        super.H3();
        this.p0.f();
        j4().v0().v0();
    }

    public void K4() {
        j4().v0().v0();
    }

    public void L4(DrivingVoiceState drivingVoiceState) {
        a aVar = this.p0;
        cte cte = this.m0;
        int ordinal = drivingVoiceState.ordinal();
        aVar.b(cte.b(ordinal != 0 ? ordinal != 1 ? C0707R.raw.driving_voice_error : C0707R.raw.driving_voice_success : C0707R.raw.driving_voice_listening).subscribe(new e(this)));
        this.k0.f(drivingVoiceState);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        if (a3() != null) {
            a3().setOnKeyListener(this);
        }
        this.h0.m();
    }

    public void M4(float f) {
        View view = this.n0;
        if (view != null) {
            view.setAlpha(f);
        }
        DrivingProgressXButton drivingProgressXButton = this.o0;
        if (drivingProgressXButton != null) {
            drivingProgressXButton.setAlpha(f);
        }
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.NOWPLAYING;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 1) {
            return false;
        }
        this.j0.d();
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
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_driving_voice, viewGroup, false);
        DrivingVoiceView drivingVoiceView = (DrivingVoiceView) inflate.findViewById(C0707R.id.driving_voice_view);
        drivingVoiceView.setListener(this);
        drivingVoiceView.setPicasso(this.l0);
        DrivingVoiceBottomSheetView drivingVoiceBottomSheetView = (DrivingVoiceBottomSheetView) inflate.findViewById(C0707R.id.driving_voice_bottom_sheet_view);
        this.n0 = inflate.findViewById(C0707R.id.driving_voice_view_background);
        this.o0 = (DrivingProgressXButton) inflate.findViewById(C0707R.id.driving_progress_x_button);
        drivingVoiceBottomSheetView.setListener(this.j0);
        this.j0.f(drivingVoiceBottomSheetView, this, this);
        this.k0.d(this.o0, drivingVoiceBottomSheetView);
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        this.h0.k(drivingVoiceView, (DrivingMicButton) inflate.findViewById(C0707R.id.driving_voice_mic_button), this, (VoiceInputAnimationView) inflate.findViewById(C0707R.id.driving_voice_input_animation_view));
        i iVar = this.i0;
        iVar.getClass();
        drivingVoiceView.setListener(iVar);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.k0.e();
        this.h0.l();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.T;
    }
}
