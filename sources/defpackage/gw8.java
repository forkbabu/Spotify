package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.voice.experience.VoiceFragment;

/* renamed from: gw8  reason: default package */
public final class gw8 implements s {
    private VoiceFragment a;
    private final VoiceSourceElement b;
    private final ifd c;
    private final PlayerState f;

    public gw8(VoiceSourceElement voiceSourceElement, ifd ifd, PlayerState playerState, String str) {
        this.b = voiceSourceElement;
        this.c = ifd;
        this.f = playerState;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "Voice";
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public Fragment e() {
        if (this.a == null) {
            this.a = VoiceFragment.N4(this.f.track().or((Optional<ContextTrack>) ContextTrack.create("")).uri(), this.b.d(), this.c.getName(), "Active", true, null);
        }
        return this.a;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "voice_fragment";
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.VOICE_LISTENING, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.B1;
    }
}
