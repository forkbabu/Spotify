package defpackage;

import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$CancelSession;
import io.reactivex.functions.a;

/* renamed from: th2  reason: default package */
public final /* synthetic */ class th2 implements a {
    public final /* synthetic */ vh2 a;
    public final /* synthetic */ VoiceAppProtocol$CancelSession b;

    public /* synthetic */ th2(vh2 vh2, VoiceAppProtocol$CancelSession voiceAppProtocol$CancelSession) {
        this.a = vh2;
        this.b = voiceAppProtocol$CancelSession;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.e(this.b);
    }
}
