package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: zzb  reason: default package */
public final class zzb implements fjf<yzb> {
    private final wlf<g<PlayerState>> a;

    public zzb(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yzb(this.a);
    }
}
