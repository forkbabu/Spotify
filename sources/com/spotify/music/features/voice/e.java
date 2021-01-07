package com.spotify.music.features.voice;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import androidx.transition.Slide;
import com.google.common.base.MoreObjects;
import com.spotify.voice.experience.VoiceFragment;
import com.spotify.voice.experiments.experience.VoiceExperimentsFragment;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ VoiceActivity a;

    public /* synthetic */ e(VoiceActivity voiceActivity) {
        this.a = voiceActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Fragment fragment;
        VoiceActivity voiceActivity = this.a;
        u3 u3Var = (u3) obj;
        voiceActivity.getClass();
        F f = u3Var.a;
        S s = u3Var.b;
        Intent intent = voiceActivity.getIntent();
        String stringExtra = intent.getStringExtra("com.spotify.voice.experience.KEY_EXTRA_ELEMENT_ID");
        String stringExtra2 = intent.getStringExtra("com.spotify.voice.experience.KEY_EXTRA_SOURCE_ID");
        String stringExtra3 = intent.getStringExtra("com.spotify.voice.experience.KEY_EXTRA_DEEPLINK");
        String stringExtra4 = intent.getStringExtra("com.spotify.voice.experience.KEY_EXTRA_DEEPLINK_PARAM");
        if (MoreObjects.isNullOrEmpty(stringExtra3)) {
            if (MoreObjects.isNullOrEmpty(f)) {
                f = "";
            }
            fragment = VoiceFragment.N4(f, stringExtra, stringExtra2, s, false, stringExtra4);
        } else {
            fragment = VoiceExperimentsFragment.L4(stringExtra, stringExtra2, null, stringExtra3);
        }
        Slide slide = new Slide(80);
        slide.V(ta0.d);
        fragment.s4(slide);
        Slide slide2 = new Slide(80);
        slide2.V(ta0.c);
        slide2.T(180);
        fragment.t4(slide2);
        x i = voiceActivity.v0().i();
        i.w(true);
        i.c(16908290, fragment, "VoiceFragment");
        i.i();
    }
}
