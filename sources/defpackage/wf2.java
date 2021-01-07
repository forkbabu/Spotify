package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesRequest;
import defpackage.cf2;
import io.reactivex.s;

/* renamed from: wf2  reason: default package */
public final /* synthetic */ class wf2 implements cf2.c {
    public final /* synthetic */ hg2 a;

    public /* synthetic */ wf2(hg2 hg2) {
        this.a = hg2;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        return this.a.d((OtaAppProtocol$CheckForUpdatesRequest) jacksonModel);
    }
}
