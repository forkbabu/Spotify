package com.spotify.music.features.queue;

import com.google.android.gms.cast.framework.f;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerQueueUtil;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.x;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.y;
import java.util.Collection;

public class w {
    private final g<PlayerState> a;
    private final g<PlayerQueue> b;
    private final v c;
    private final y d;
    private final QueueManager e;
    private rx7 f;
    private PlayerQueue g;
    private PlayerState h = PlayerState.EMPTY;
    private final q i = new q();

    public w(g<PlayerQueue> gVar, g<PlayerState> gVar2, v vVar, QueueManager queueManager, rx7 rx7, y yVar) {
        this.a = gVar2;
        this.b = gVar;
        vVar.getClass();
        this.c = vVar;
        rx7.getClass();
        this.f = rx7;
        queueManager.getClass();
        this.e = queueManager;
        yVar.getClass();
        this.d = yVar;
    }

    public static void g(w wVar, u3 u3Var) {
        wVar.getClass();
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        boolean repeatingContext = s2.options().repeatingContext();
        wVar.g = f3;
        wVar.h = s2;
        qx7 qx7 = new qx7(f3, (String) x.n(s2.contextMetadata().get("context_description"), ""), s2.restrictions(), repeatingContext);
        wVar.f = qx7;
        if (!wVar.c.l(qx7)) {
            wVar.c.p(wVar.f);
        }
    }

    public void a(Collection<PlayerTrack> collection) {
        PlayerQueue playerQueue = this.g;
        if (playerQueue == null) {
            Assertion.g("Queue is null");
            return;
        }
        this.i.a(this.e.setQueue(new PlayerQueueUtil().addNextTracks(playerQueue, collection)).subscribe());
    }

    public boolean b(int i2) {
        boolean isEmpty = this.h.restrictions().disallowInsertingIntoContextTracksReasons().isEmpty();
        boolean d2 = this.c.d(i2);
        if (this.c.j(i2) == 2 || isEmpty) {
            return d2;
        }
        return false;
    }

    public rx7 c() {
        return this.f;
    }

    public int d(String str) {
        for (int i2 = 0; i2 < this.g.nextTracks().length; i2++) {
            if (this.g.nextTracks()[i2].uid().equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    public boolean e(PlayerTrack playerTrack) {
        return playerTrack.equals(this.f.c());
    }

    public boolean f(int i2) {
        return 2 == this.c.j(i2);
    }

    public void h() {
        this.i.a(g.i(this.b, this.a, s.a).Q(this.d).subscribe(new h(this)));
    }

    public void i() {
        this.i.c();
    }

    public void j(Collection<PlayerTrack> collection) {
        PlayerQueue playerQueue = this.g;
        if (playerQueue == null) {
            Assertion.g("Queue is null");
            return;
        }
        this.i.a(this.e.setQueue(new PlayerQueueUtil().removeNextTracks(playerQueue, collection)).subscribe());
    }

    public void k() {
        if (this.g == null) {
            Assertion.g("Queue is null");
            return;
        }
        this.c.n();
        v vVar = this.c;
        rx7 rx7 = this.f;
        PlayerQueue playerQueue = this.g;
        this.i.a(this.e.setQueue(new PlayerQueue(playerQueue.revision(), playerQueue.track(), (PlayerTrack[]) f.a(vVar.k(), rx7.d()), playerQueue.prevTracks())).subscribe());
    }
}
