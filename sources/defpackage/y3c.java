package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.ContextTrack;
import defpackage.w3c;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: y3c  reason: default package */
public final class y3c implements fjf<w51> {
    private final wlf<Activity> a;
    private final wlf<c.a> b;
    private final wlf<v> c;
    private final wlf<Map<String, a71>> d;

    public y3c(wlf<Activity> wlf, wlf<c.a> wlf2, wlf<v> wlf3, wlf<Map<String, a71>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        c.a aVar = this.b.get();
        v vVar = this.c.get();
        Map<String, a71> map = this.d.get();
        w3c.a aVar2 = w3c.a;
        h.e(activity, "activity");
        h.e(aVar, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(vVar, "spotifyHubsConfig");
        h.e(map, "hubsCommandRegistry");
        w51 a2 = vVar.a(activity, aVar).a(map).b().a();
        h.d(a2, "spotifyHubsConfig\n      …\n                .build()");
        return a2;
    }
}
