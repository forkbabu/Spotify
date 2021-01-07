package com.spotify.connect.snacks;

import com.google.common.base.Optional;
import com.spotify.libs.connect.j;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.v;
import io.reactivex.y;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class ConnectSnacksModule {

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements l<Optional<ContextTrack>, Boolean> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(Optional<ContextTrack> optional) {
            Optional<ContextTrack> optional2 = optional;
            h.e(optional2, AppProtocol.TrackData.TYPE_TRACK);
            return Boolean.valueOf(optional2.isPresent());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements l<Boolean, v<? extends List<? extends a>>> {
        final /* synthetic */ j a;
        final /* synthetic */ y b;

        b(j jVar, y yVar) {
            this.a = jVar;
            this.b = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends List<? extends a>> apply(Boolean bool) {
            if (bool.booleanValue()) {
                return this.a.m("connect-snacks").q(new AvailableDevicesTransformer()).z(3000, TimeUnit.MILLISECONDS, this.b);
            }
            return e0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.spotify.connect.snacks.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.reactivex.s<java.util.List<com.spotify.connect.snacks.a>> a(io.reactivex.g<com.spotify.player.model.PlayerState> r3, com.spotify.libs.connect.j r4, io.reactivex.y r5, com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r6) {
        /*
            r2 = this;
            java.lang.String r0 = "playerStateFlowable"
            kotlin.jvm.internal.h.e(r3, r0)
            java.lang.String r0 = "connectCore"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.String r0 = "scheduler"
            kotlin.jvm.internal.h.e(r5, r0)
            java.lang.String r0 = "preferences"
            kotlin.jvm.internal.h.e(r6, r0)
            com.spotify.connect.snacks.ConnectSnacksModule$provideNewDevicesObservable$1 r0 = com.spotify.connect.snacks.ConnectSnacksModule$provideNewDevicesObservable$1.a
            if (r0 == 0) goto L_0x001e
            com.spotify.connect.snacks.e r1 = new com.spotify.connect.snacks.e
            r1.<init>(r0)
            r0 = r1
        L_0x001e:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.g r3 = r3.O(r0)
            com.spotify.connect.snacks.ConnectSnacksModule$a r0 = com.spotify.connect.snacks.ConnectSnacksModule.a.a
            io.reactivex.g r3 = r3.O(r0)
            io.reactivex.g r3 = r3.s()
            io.reactivex.internal.operators.observable.v r0 = new io.reactivex.internal.operators.observable.v
            r0.<init>(r3)
            com.spotify.connect.snacks.ConnectSnacksModule$b r3 = new com.spotify.connect.snacks.ConnectSnacksModule$b
            r3.<init>(r4, r5)
            io.reactivex.s r3 = r0.J0(r3)
            com.spotify.connect.snacks.NewDevicesTransformer r4 = new com.spotify.connect.snacks.NewDevicesTransformer
            r4.<init>(r6)
            io.reactivex.s r3 = r3.q(r4)
            java.lang.String r4 = "playerStateFlowable\n    …Transformer(preferences))"
            kotlin.jvm.internal.h.d(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.connect.snacks.ConnectSnacksModule.a(io.reactivex.g, com.spotify.libs.connect.j, io.reactivex.y, com.spotify.mobile.android.util.prefs.SpSharedPreferences):io.reactivex.s");
    }
}
