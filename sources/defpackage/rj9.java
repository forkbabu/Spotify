package defpackage;

import com.spotify.http.u;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: rj9  reason: default package */
public class rj9 {
    private final u a;

    public rj9(u uVar) {
        this.a = uVar;
    }

    public z<v<tj9>> a() {
        DebugFlag debugFlag = DebugFlag.PREMIUM_DESTINATION_DEV;
        return ((wj9) this.a.c(wj9.class)).a("premium-destination-hubs");
    }
}
