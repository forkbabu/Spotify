package com.spotify.music.features.voice;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.voice.experience.VoiceFragment;
import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ VoiceActivity a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ h(VoiceActivity voiceActivity, Intent intent) {
        this.a = voiceActivity;
        this.b = intent;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        VoiceActivity voiceActivity = this.a;
        Intent intent = this.b;
        u3 u3Var = (u3) obj;
        Fragment U = voiceActivity.v0().U("VoiceFragment");
        if (U instanceof VoiceFragment) {
            ((VoiceFragment) U).O4(intent.getStringExtra("com.spotify.voice.experience.KEY_EXTRA_ELEMENT_ID"));
        }
    }
}
