package defpackage;

import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$SessionStatusUpdate;
import io.reactivex.functions.g;

/* renamed from: xh2  reason: default package */
public final /* synthetic */ class xh2 implements g {
    public final /* synthetic */ zh2 a;

    public /* synthetic */ xh2(zh2 zh2) {
        this.a = zh2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((VoiceAppProtocol$SessionStatusUpdate) obj);
    }
}
