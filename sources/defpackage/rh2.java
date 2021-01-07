package defpackage;

import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$StartSession;
import io.reactivex.functions.a;

/* renamed from: rh2  reason: default package */
public final /* synthetic */ class rh2 implements a {
    public final /* synthetic */ vh2 a;
    public final /* synthetic */ VoiceAppProtocol$StartSession b;

    public /* synthetic */ rh2(vh2 vh2, VoiceAppProtocol$StartSession voiceAppProtocol$StartSession) {
        this.a = vh2;
        this.b = voiceAppProtocol$StartSession;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.g(this.b);
    }
}
