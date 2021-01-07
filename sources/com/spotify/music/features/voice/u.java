package com.spotify.music.features.voice;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.C0707R;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.libs.voice.b;
import com.spotify.music.libs.voice.e;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public class u implements b {
    private final e a;
    private final boolean b;

    u(e eVar, cif cif) {
        this.a = eVar;
        this.b = cif.c();
    }

    private static void c(Context context, int i, String str, String str2, List<String> list) {
        context.startActivity(VoiceActivity.U0(context, str, str2, null, list).setFlags(i), ActivityOptions.makeCustomAnimation(context, 17432576, C0707R.anim.fade_out_hard).toBundle());
    }

    private static void d(Context context, int i) {
        Bundle bundle = ActivityOptions.makeCustomAnimation(context, 17432576, C0707R.anim.fade_out_hard).toBundle();
        int i2 = VoiceOnboardingActivity.L;
        Intent intent = new Intent(context, VoiceOnboardingActivity.class);
        intent.putExtra("com.spotify.voice.experience.KEY_EXTRA_IN_EXPERIMENT", false);
        context.startActivity(intent.setFlags(i), bundle);
    }

    @Override // com.spotify.music.libs.voice.b
    public void a(Context context, VoiceSourceElement voiceSourceElement, ifd ifd, List<String> list) {
        int i = !(context instanceof Activity) ? 268435456 : 0;
        boolean c = this.a.c();
        boolean e = this.a.e();
        if (this.b) {
            if (!c || !e) {
                d(context, i);
            } else {
                c(context, i, voiceSourceElement.d(), ifd.getName(), list);
            }
        } else if (c || this.a.b()) {
            c(context, i, voiceSourceElement.d(), ifd.getName(), list);
        } else {
            d(context, i);
        }
    }

    @Override // com.spotify.music.libs.voice.b
    public void b(Context context, VoiceSourceElement voiceSourceElement, ifd ifd) {
        a(context, voiceSourceElement, ifd, Collections.emptyList());
    }
}
