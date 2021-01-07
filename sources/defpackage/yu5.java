package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import defpackage.ev5;
import io.reactivex.g;

/* renamed from: yu5  reason: default package */
class yu5 {
    private final g<PlayerState> a;
    private final fv5 b;

    public yu5(g<PlayerState> gVar, fv5 fv5) {
        this.a = gVar;
        this.b = fv5;
    }

    public static ev5 b(yu5 yu5, Optional optional) {
        yu5.getClass();
        if (optional.isPresent()) {
            return new ev5.b(yu5.b.a((PlayerState) optional.get()));
        }
        return new ev5.a();
    }

    public g<ev5> a() {
        return this.a.O(ru5.a).t(su5.a).O(new qu5(this)).s();
    }
}
