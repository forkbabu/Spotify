package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.h2;
import com.spotify.mobile.android.service.media.i2;
import com.spotify.mobile.android.service.media.u1;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.voiceassistant.player.models.SearchResponse;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;
import java.util.Arrays;
import java.util.List;

/* renamed from: wx8  reason: default package */
public class wx8 {
    private final g<PlayerState> a;
    private final i2 b;

    /* access modifiers changed from: private */
    /* renamed from: wx8$b */
    public static final class b implements u1 {
        b(a aVar) {
        }

        @Override // com.spotify.mobile.android.service.media.u1
        public void onActionForbidden(List<String> list) {
            Logger.d("Action forbidden, reasons: %s", Arrays.toString(list.toArray()));
        }

        @Override // com.spotify.mobile.android.service.media.u1
        public void onActionSuccess() {
        }
    }

    wx8(g<PlayerState> gVar, i2 i2Var) {
        this.a = gVar;
        this.b = i2Var;
    }

    public io.reactivex.a a() {
        return this.a.h0(1).O(ww8.a).H(new xw8(this));
    }

    public io.reactivex.a b() {
        i2 i2Var = this.b;
        i2Var.getClass();
        return io.reactivex.a.u(new kx8(i2Var));
    }

    public /* synthetic */ e c(Boolean bool) {
        if (bool.booleanValue()) {
            return io.reactivex.internal.operators.completable.b.a;
        }
        i2 i2Var = this.b;
        i2Var.getClass();
        return io.reactivex.a.u(new jx8(i2Var));
    }

    public io.reactivex.a d(SearchResponse searchResponse, Optional<String> optional) {
        if (!(searchResponse.context().isPresent() && searchResponse.playOrigin().isPresent() && searchResponse.playOptions().isPresent() && searchResponse.viewUri().isPresent())) {
            return io.reactivex.a.t(new IllegalArgumentException("Search response was not valid"));
        }
        Logger.b("Play prepared uri: %s", searchResponse.viewUri());
        h2.a b2 = h2.b(searchResponse.context().get());
        b2.g(searchResponse.playOptions().get());
        b2.f(searchResponse.playOrigin().get().toBuilder().viewUri(searchResponse.viewUri().get()).build());
        b2.a(new b(null));
        if (optional.isPresent()) {
            b2.d(LoggingParams.builder().interactionId(optional.get()).build());
        }
        z<zwd> p = this.b.p(b2.b());
        p.getClass();
        return new i(p);
    }
}
