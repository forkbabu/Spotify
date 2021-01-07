package defpackage;

import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$SessionStatusUpdate;
import defpackage.l9f;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.k;

/* renamed from: yh2  reason: default package */
public final /* synthetic */ class yh2 implements l {
    public static final /* synthetic */ yh2 a = new yh2();

    private /* synthetic */ yh2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        VoiceAppProtocol$SessionStatusUpdate voiceAppProtocol$SessionStatusUpdate;
        k9f k9f = (k9f) obj;
        int i = zh2.h;
        l9f c = k9f.c();
        c.getClass();
        if (c instanceof l9f.c) {
            voiceAppProtocol$SessionStatusUpdate = VoiceAppProtocol$SessionStatusUpdate.createNlu(k9f.b(), k9f.d(), ((l9f.c) c).d());
        } else if (c instanceof l9f.a) {
            voiceAppProtocol$SessionStatusUpdate = VoiceAppProtocol$SessionStatusUpdate.createAsr(k9f.b(), k9f.d(), ((l9f.a) c).d());
        } else {
            voiceAppProtocol$SessionStatusUpdate = c instanceof l9f.b ? VoiceAppProtocol$SessionStatusUpdate.createError(k9f.b(), k9f.d(), ((l9f.b) c).d()) : null;
        }
        if (voiceAppProtocol$SessionStatusUpdate != null) {
            return g.N(voiceAppProtocol$SessionStatusUpdate);
        }
        int i2 = g.b;
        return k.c;
    }
}
