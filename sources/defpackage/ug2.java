package defpackage;

import com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueue;
import io.reactivex.functions.g;

/* renamed from: ug2  reason: default package */
public final /* synthetic */ class ug2 implements g {
    public final /* synthetic */ xg2 a;

    public /* synthetic */ ug2(xg2 xg2) {
        this.a = xg2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k((QueueAppProtocol$PlayerQueue) obj);
    }
}
