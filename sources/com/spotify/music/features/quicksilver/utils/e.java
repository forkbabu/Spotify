package com.spotify.music.features.quicksilver.utils;

import com.spotify.music.container.app.foregroundstate.d;
import com.spotify.music.features.quicksilver.v2.mobius.h;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

public class e implements w<PlayerState, h> {
    private final d a;

    /* access modifiers changed from: private */
    public static final class b {
        private final String a;
        private final ContextTrack b;
        private final String c;
        private final boolean d;

        b(PlayerState playerState, a aVar) {
            ContextTrack contextTrack = null;
            this.a = playerState.playbackId().isPresent() ? playerState.playbackId().get() : null;
            this.b = playerState.track().isPresent() ? playerState.track().get() : contextTrack;
            this.c = playerState.playOrigin().deviceIdentifier();
            this.d = playerState.isPaused();
        }

        public String a() {
            return this.c;
        }

        public String b() {
            return this.a;
        }

        public ContextTrack c() {
            return this.b;
        }

        public boolean d() {
            return this.d;
        }
    }

    public e(d dVar) {
        this.a = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r0 == false) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Iterable a(defpackage.u3 r6) {
        /*
            r5 = this;
            F r0 = r6.a
            com.spotify.music.features.quicksilver.utils.e$b r0 = (com.spotify.music.features.quicksilver.utils.e.b) r0
            S r6 = r6.b
            com.spotify.music.features.quicksilver.utils.e$b r6 = (com.spotify.music.features.quicksilver.utils.e.b) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            r1.<init>(r2)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0015
            if (r6 != 0) goto L_0x0015
            goto L_0x003d
        L_0x0015:
            if (r0 != 0) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            com.spotify.player.model.ContextTrack r0 = r0.c()
            com.spotify.player.model.ContextTrack r4 = r6.c()
            if (r0 != 0) goto L_0x0026
            if (r4 != 0) goto L_0x0026
            r0 = 1
            goto L_0x0039
        L_0x0026:
            if (r0 == 0) goto L_0x0038
            if (r4 != 0) goto L_0x002b
            goto L_0x0038
        L_0x002b:
            java.lang.String r0 = r0.uri()
            java.lang.String r4 = r4.uri()
            boolean r0 = r0.equals(r4)
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 != 0) goto L_0x003d
        L_0x003b:
            r0 = 0
            goto L_0x003e
        L_0x003d:
            r0 = 1
        L_0x003e:
            if (r0 == 0) goto L_0x0041
            goto L_0x0096
        L_0x0041:
            com.spotify.music.container.app.foregroundstate.d r0 = r5.a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0096
            if (r6 == 0) goto L_0x0083
            java.lang.String r0 = r6.b()
            if (r0 == 0) goto L_0x0083
            com.spotify.player.model.ContextTrack r0 = r6.c()
            if (r0 == 0) goto L_0x0083
            com.spotify.player.model.ContextTrack r0 = r6.c()
            boolean r0 = defpackage.kxd.f(r0)
            if (r0 != 0) goto L_0x0083
            com.spotify.player.model.ContextTrack r0 = r6.c()
            boolean r0 = defpackage.kxd.h(r0)
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = r6.a()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = r6.a()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0083
        L_0x007b:
            boolean r0 = r6.d()
            if (r0 == 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r2 = 0
        L_0x0083:
            if (r2 != 0) goto L_0x0096
            com.spotify.player.model.ContextTrack r6 = r6.c()
            java.lang.String r6 = r6.uri()
            com.spotify.inappmessaging.TriggerType r0 = com.spotify.inappmessaging.TriggerType.PLAYBACK_STARTED
            com.spotify.music.features.quicksilver.v2.mobius.h r6 = com.spotify.music.features.quicksilver.v2.mobius.h.f(r6, r0)
            r1.add(r6)
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.utils.e.a(u3):java.lang.Iterable");
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<h> apply(s<PlayerState> sVar) {
        return sVar.y0(new u3(null, null), b.a).Z(new c(this));
    }
}
