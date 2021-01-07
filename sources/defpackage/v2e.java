package defpackage;

import android.app.Activity;
import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import com.spotify.share.sharedata.t;
import io.reactivex.d0;
import io.reactivex.g;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: v2e  reason: default package */
public final class v2e implements u2e {
    private final Optional<g<PlayerState>> a;
    private final c8e b;
    private final Optional<a8e> c;
    private final x6e d;
    private final w7e e;
    private final u8e f;

    public v2e(Optional<g<PlayerState>> optional, c8e c8e, Optional<a8e> optional2, x6e x6e, w7e w7e, u8e u8e) {
        this.a = optional;
        this.b = c8e;
        this.c = optional2;
        this.d = x6e;
        this.e = w7e;
        this.f = u8e;
    }

    @Override // defpackage.u2e
    public z<String> a(Activity activity, o8e o8e, t tVar, String str, String str2, String str3) {
        z<R> zVar;
        if (!this.e.a(str3)) {
            throw new IllegalArgumentException("Illegal integration id");
        } else if (this.f.a(str3, o8e)) {
            if (this.a.isPresent()) {
                zVar = this.a.get().E().A(q2e.a).I(1, TimeUnit.SECONDS).C(z.z(Optional.absent()));
            } else {
                zVar = z.z(Optional.absent());
            }
            return zVar.s(new p2e(this, tVar, str, str2, str3, activity, o8e));
        } else {
            throw new IllegalArgumentException("Destination not allowed for this integration id");
        }
    }

    public /* synthetic */ d0 b(t tVar, String str, String str2, String str3, Activity activity, o8e o8e, Optional optional) {
        z7e z7e;
        if (this.c.isPresent()) {
            z7e = this.c.get().a(tVar, (PlayerState) optional.orNull());
        } else {
            z7e = z7e.a;
        }
        return this.d.a(activity, o8e, tVar, z7e, this.b.a(str, str2, str3), 0);
    }
}
