package com.spotify.music.features.queue.service;

import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.util.l0;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.command.SetQueueCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.queue.f;
import defpackage.zwd;
import io.reactivex.d0;
import io.reactivex.g;
import io.reactivex.j;
import io.reactivex.z;
import java.util.List;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public class s {
    private final f a;
    private final p b;
    private final u c;
    private final t d;
    private final q e;
    private final v f;

    /* access modifiers changed from: private */
    public final class b implements io.reactivex.functions.a {
        private final zwd a;

        b(zwd zwd, a aVar) {
            this.a = zwd;
        }

        @Override // io.reactivex.functions.a
        public void run() {
            zwd zwd = this.a;
            zwd.getClass();
            if (zwd instanceof zwd.a) {
                zwd zwd2 = this.a;
                zwd2.getClass();
                if (((zwd.a) zwd2).c().contains(DisallowReasons.MFT)) {
                    s.this.e.b();
                    return;
                }
            }
            u uVar = s.this.c;
            uVar.getClass();
            new Handler(Looper.getMainLooper()).post(new k(uVar));
        }
    }

    public s(f fVar, p pVar, u uVar, t tVar, q qVar, v vVar) {
        this.a = fVar;
        this.b = pVar;
        this.c = uVar;
        this.d = tVar;
        this.e = qVar;
        this.f = vVar;
    }

    private void e(z<zwd> zVar, io.reactivex.functions.a aVar) {
        g<c> b2 = this.f.b();
        b2.getClass();
        io.reactivex.internal.subscribers.c cVar = new io.reactivex.internal.subscribers.c();
        b2.subscribe((j<? super c>) cVar);
        Object a2 = cVar.a();
        if (a2 == null) {
            throw new NoSuchElementException();
        } else if (!z42.C((c) a2)) {
            this.e.b();
        } else {
            zVar.t(new g(this, aVar)).i();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(String str, String str2, String str3) {
        p pVar = this.b;
        pVar.getClass();
        z<zwd> s = io.reactivex.s.i0(l0.z(str)).J0(new c(pVar, str)).B0().s(new j(this, str2, str3));
        t tVar = this.d;
        tVar.getClass();
        e(s, new o(tVar));
    }

    /* access modifiers changed from: package-private */
    public void d(List<ContextTrack> list, String str, String str2, boolean z) {
        e(this.a.a().E().s(new f(this, list, str, str2)), new h(this, z));
    }

    public d0 f(String str, String str2, List list) {
        return this.a.a().E().s(new f(this, list, str, str2));
    }

    public /* synthetic */ void g(boolean z) {
        if (z) {
            this.d.a();
        }
    }

    public d0 h(List list, String str, String str2, PlayerQueue playerQueue) {
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i2 = 0;
        while (true) {
            if (i2 != playerQueue.nextTracks().size()) {
                if (!kxd.k(playerQueue.nextTracks().get(i2))) {
                    builder.addAll((Iterable) FluentIterable.from(list).toMap(i.a).values().asList());
                    builder.addAll((Iterable) playerQueue.nextTracks().subList(i2, playerQueue.nextTracks().size()));
                    break;
                }
                builder.mo53add((ImmutableList.Builder) playerQueue.nextTracks().get(i2));
                i2++;
            } else {
                break;
            }
        }
        return this.a.b(SetQueueCommand.builder(playerQueue.toBuilder().nextTracks(builder.build()).build()).loggingParams(LoggingParams.builder().pageInstanceId(str).interactionId(str2).build()).build());
    }
}
