package defpackage;

import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$VoiceData;
import io.reactivex.functions.a;

/* renamed from: sh2  reason: default package */
public final /* synthetic */ class sh2 implements a {
    public final /* synthetic */ vh2 a;
    public final /* synthetic */ VoiceAppProtocol$VoiceData b;

    public /* synthetic */ sh2(vh2 vh2, VoiceAppProtocol$VoiceData voiceAppProtocol$VoiceData) {
        this.a = vh2;
        this.b = voiceAppProtocol$VoiceData;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.f(this.b);
    }
}
