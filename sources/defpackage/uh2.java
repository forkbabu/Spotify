package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$VoiceData;
import defpackage.cf2;
import io.reactivex.s;

/* renamed from: uh2  reason: default package */
public final /* synthetic */ class uh2 implements cf2.c {
    public final /* synthetic */ vh2 a;

    public /* synthetic */ uh2(vh2 vh2) {
        this.a = vh2;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        return this.a.h((VoiceAppProtocol$VoiceData) jacksonModel);
    }
}
