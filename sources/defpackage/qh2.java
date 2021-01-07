package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.superbird.voice.model.VoiceAppProtocol$CancelSession;
import defpackage.cf2;
import io.reactivex.s;

/* renamed from: qh2  reason: default package */
public final /* synthetic */ class qh2 implements cf2.c {
    public final /* synthetic */ vh2 a;

    public /* synthetic */ qh2(vh2 vh2) {
        this.a = vh2;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        return this.a.d((VoiceAppProtocol$CancelSession) jacksonModel);
    }
}
