package defpackage;

import com.spotify.collection.endpoints.common.player.PlayPayload;
import com.spotify.mobile.android.util.l0;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.a;
import io.reactivex.s;
import java.util.Map;

/* renamed from: w9a  reason: default package */
public class w9a {
    private final String a;
    private final xg0 b;
    private Boolean c;
    private Boolean d;

    public w9a(String str, xg0 xg0) {
        this.a = l0.z(str).i();
        this.b = xg0;
    }

    public a a(boolean z) {
        yg0 yg0 = new yg0(null, null, null, 0, null, null, null, 127);
        if (z) {
            return this.b.f(this.a, yg0);
        }
        return this.b.c(this.a, yg0);
    }

    public s<li0> b() {
        return this.b.g(this.a, yg0.b(Boolean.TRUE, null, this.d));
    }

    public s<li0> c() {
        return this.b.e(this.a, yg0.b(null, this.c, this.d));
    }

    public a d(PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, Map<String, String> map, LoggingParams loggingParams) {
        return this.b.d(this.a, yg0.b(Boolean.TRUE, this.c, this.d), new PlayPayload(preparePlayOptions, playOrigin, map, loggingParams));
    }

    public void e(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public void f(boolean z) {
        this.d = Boolean.valueOf(z);
    }
}
