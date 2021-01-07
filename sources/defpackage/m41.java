package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.remoteconfig.AndroidFeatureDrivingJumpstartProperties;
import defpackage.d7a;
import io.reactivex.s;

/* renamed from: m41  reason: default package */
public class m41 {
    private final wlf<AndroidFeatureDrivingJumpstartProperties> a;
    private final s<d7a> b;

    public m41(wlf<AndroidFeatureDrivingJumpstartProperties> wlf, s<d7a> sVar) {
        this.a = wlf;
        this.b = sVar;
    }

    public boolean a() {
        return this.a.get().a() == AndroidFeatureDrivingJumpstartProperties.DrivingCarViewNpvHoldback.ENABLED;
    }

    public boolean b() {
        if ((this.b.d() instanceof d7a.a) && a()) {
            return true;
        }
        DebugFlag debugFlag = DebugFlag.DRIVING_FRAGMENT;
        return false;
    }
}
