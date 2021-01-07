package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;

/* renamed from: ax7  reason: default package */
public final class ax7 implements fjf<g<PlayerQueue>> {
    private final wlf<QueueManager> a;

    public ax7(wlf<QueueManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().getQueue().Y0(BackpressureStrategy.LATEST);
    }
}
