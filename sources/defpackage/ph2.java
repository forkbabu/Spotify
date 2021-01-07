package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$StartSession;
import defpackage.cf2;
import io.reactivex.s;

/* renamed from: ph2  reason: default package */
public final /* synthetic */ class ph2 implements cf2.c {
    public final /* synthetic */ vh2 a;

    public /* synthetic */ ph2(vh2 vh2) {
        this.a = vh2;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        return this.a.i((VoiceAppProtocol$StartSession) jacksonModel);
    }
}
