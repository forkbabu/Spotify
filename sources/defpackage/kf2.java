package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.superbird.device.model.DeviceRegistrationAppProtocol$Request;
import defpackage.cf2;
import io.reactivex.s;

/* renamed from: kf2  reason: default package */
public final /* synthetic */ class kf2 implements cf2.c {
    public final /* synthetic */ lf2 a;

    public /* synthetic */ kf2(lf2 lf2) {
        this.a = lf2;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        return this.a.b((DeviceRegistrationAppProtocol$Request) jacksonModel);
    }
}
