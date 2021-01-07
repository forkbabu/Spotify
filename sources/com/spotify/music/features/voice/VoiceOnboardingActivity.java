package com.spotify.music.features.voice;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import androidx.transition.Slide;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.voice.e;
import com.spotify.voice.experiments.onboarding.VoiceExperimentsOnboardingFragment;
import com.spotify.voice.onboarding.VoiceOnboardingFragment;
import io.reactivex.subjects.c;

public class VoiceOnboardingActivity extends ss2 {
    public static final /* synthetic */ int L = 0;
    cif G;
    boolean H;
    w52 I;
    e J;
    c<Boolean> K;

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C0707R.anim.fade_out_hard);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4660) {
            PermissionsRequestActivity.a aVar = (PermissionsRequestActivity.a) intent.getParcelableExtra("permission_result");
            this.K.onNext(Boolean.valueOf(aVar != null && aVar.b("android.permission.RECORD_AUDIO")));
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_voice);
        o v0 = v0();
        if (v0.U("VoiceOnboardingFragment") == null) {
            Intent intent = getIntent();
            w52 w52 = this.I;
            e eVar = this.J;
            boolean z = this.H;
            boolean c = this.G.c();
            if (intent == null || !intent.getBooleanExtra("com.spotify.voice.experience.KEY_EXTRA_IN_EXPERIMENT", false)) {
                jff m = jff.b().k(w52.f(this, "android.permission.RECORD_AUDIO")).l(eVar.d()).j(z).m(c);
                int i = VoiceOnboardingFragment.l0;
                Bundle bundle2 = new Bundle(1);
                bundle2.putParcelable("KEY_MODEL", m);
                fragment = new VoiceOnboardingFragment();
                fragment.r4(bundle2);
            } else {
                fragment = new VoiceExperimentsOnboardingFragment();
            }
            Slide slide = new Slide(80);
            slide.V(ta0.d);
            fragment.s4(slide);
            x i2 = v0.i();
            i2.w(true);
            i2.c(16908290, fragment, "VoiceOnboardingFragment");
            i2.i();
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.VOICE_ONBOARDING, ViewUris.g2.toString());
    }
}
