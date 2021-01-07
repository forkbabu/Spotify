package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.playlist.models.Episode;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: m32  reason: default package */
public final class m32 implements z3<Episode> {
    private final hna b;
    private final c8a c;

    public m32(ina ina, d8a d8a) {
        this.b = ina.create();
        this.c = d8a.create();
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.z3
    public s<y3<Episode>> a(y3<Episode> y3Var) {
        String str;
        String j = y3Var.j();
        Map<String, String> d = y3Var.d();
        if (d == null) {
            str = null;
        } else {
            str = d.get(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY);
        }
        z e = this.c.e(y3Var.e(), str);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return this.b.e(y3Var.e(), j).I(10, timeUnit).A(new c32(j)).P().J0(new d32(str, e.I(10, timeUnit).A(new b32(str)).P())).j0(new e32(str, y3Var));
    }
}
