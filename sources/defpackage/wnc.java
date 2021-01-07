package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.k;
import kotlin.jvm.internal.h;

/* renamed from: wnc  reason: default package */
public final class wnc {

    /* renamed from: wnc$a */
    static final class a<Upstream, Downstream> implements k<PlayerState, Optional<String>> {
        public static final a a = new a();

        /* renamed from: wnc$a$a  reason: collision with other inner class name */
        static final class C0692a<T, R> implements l<Optional<ContextTrack>, Optional<String>> {
            public static final C0692a a = new C0692a();

            C0692a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
                if ((r0.length() > 0) == true) goto L_0x0035;
             */
            @Override // io.reactivex.functions.l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.common.base.Optional<java.lang.String> apply(com.google.common.base.Optional<com.spotify.player.model.ContextTrack> r4) {
                /*
                    r3 = this;
                    com.google.common.base.Optional r4 = (com.google.common.base.Optional) r4
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.h.e(r4, r0)
                    java.lang.Object r4 = r4.orNull()
                    com.spotify.player.model.ContextTrack r4 = (com.spotify.player.model.ContextTrack) r4
                    if (r4 == 0) goto L_0x0034
                    com.google.common.collect.ImmutableMap r0 = r4.metadata()
                    java.lang.String r1 = "parent_episode.uri"
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.String r0 = (java.lang.String) r0
                    if (r0 == 0) goto L_0x002a
                    int r1 = r0.length()
                    r2 = 1
                    if (r1 <= 0) goto L_0x0026
                    r1 = 1
                    goto L_0x0027
                L_0x0026:
                    r1 = 0
                L_0x0027:
                    if (r1 != r2) goto L_0x002a
                    goto L_0x0035
                L_0x002a:
                    java.lang.String r0 = r4.uri()
                    java.lang.String r4 = "uri()"
                    kotlin.jvm.internal.h.d(r0, r4)
                    goto L_0x0035
                L_0x0034:
                    r0 = 0
                L_0x0035:
                    com.google.common.base.Optional r4 = com.google.common.base.Optional.fromNullable(r0)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wnc.a.C0692a.apply(java.lang.Object):java.lang.Object");
            }
        }

        a() {
        }

        @Override // io.reactivex.k
        public final tpf<Optional<String>> a(g<PlayerState> gVar) {
            h.e(gVar, "playerState");
            return gVar.l(PlayerStateTransformers.b()).O(C0692a.a).s();
        }
    }

    public static final k<PlayerState, Optional<String>> a() {
        return a.a;
    }
}
