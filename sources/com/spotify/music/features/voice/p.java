package com.spotify.music.features.voice;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.C0707R;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.libs.voice.a;
import com.spotify.music.libs.voice.b;
import com.spotify.music.libs.voice.e;
import java.util.Collections;

/* access modifiers changed from: package-private */
public class p implements a {
    private final e a;
    private final w52 b;
    private final b c;

    p(e eVar, w52 w52, b bVar) {
        this.a = eVar;
        this.b = w52;
        this.c = bVar;
    }

    @Override // com.spotify.music.libs.voice.a
    public void a(Activity activity, VoiceSourceElement voiceSourceElement, ifd ifd, String str) {
        if (this.a.c() || this.a.b()) {
            activity.startActivity(VoiceActivity.U0(activity, voiceSourceElement.d(), ifd.getName(), str, Collections.emptyList()).setFlags(268435456), ActivityOptions.makeCustomAnimation(activity, 17432576, C0707R.anim.fade_out_hard).toBundle());
            return;
        }
        w52 w52 = this.b;
        b bVar = this.c;
        Bundle bundle = ActivityOptions.makeCustomAnimation(activity, 17432576, C0707R.anim.fade_out_hard).toBundle();
        if (w52.e(activity, "android.permission.RECORD_AUDIO")) {
            bVar.b(activity, voiceSourceElement, ifd);
            return;
        }
        int i = VoiceOnboardingActivity.L;
        Intent intent = new Intent(activity, VoiceOnboardingActivity.class);
        intent.putExtra("com.spotify.voice.experience.KEY_EXTRA_IN_EXPERIMENT", true);
        activity.startActivity(intent.setFlags(268435456), bundle);
    }
}
