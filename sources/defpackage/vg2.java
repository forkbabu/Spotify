package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.music.appprotocol.superbird.queue.model.QueueAppProtocol$PlayerQueue;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import defpackage.xg2;
import io.reactivex.functions.c;
import java.util.ArrayList;

/* renamed from: vg2  reason: default package */
public final /* synthetic */ class vg2 implements c {
    public static final /* synthetic */ vg2 a = new vg2();

    private /* synthetic */ vg2() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        PlayerQueue playerQueue = (PlayerQueue) obj;
        int i = xg2.j;
        int i2 = ((PlayerState) obj2).options().repeatingContext() ? 2 : 1;
        xg2.a aVar = new xg2.a(i2);
        ArrayList arrayList = new ArrayList();
        ImmutableList<ContextTrack> prevTracks = playerQueue.prevTracks();
        int size = prevTracks.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ContextTrack contextTrack = prevTracks.get(size);
            if (aVar.apply(contextTrack)) {
                arrayList.add(0, contextTrack);
            }
        }
        Optional<ContextTrack> track = playerQueue.track();
        xg2.a aVar2 = new xg2.a(i2);
        ArrayList arrayList2 = new ArrayList();
        UnmodifiableListIterator<ContextTrack> listIterator = playerQueue.nextTracks().listIterator();
        while (listIterator.hasNext()) {
            ContextTrack next = listIterator.next();
            if (kxd.k(next)) {
                arrayList2.add(next);
            }
        }
        UnmodifiableListIterator<ContextTrack> listIterator2 = playerQueue.nextTracks().listIterator();
        while (listIterator2.hasNext()) {
            ContextTrack next2 = listIterator2.next();
            if (aVar2.apply(next2)) {
                arrayList2.add(next2);
            }
        }
        return QueueAppProtocol$PlayerQueue.create(arrayList, track, arrayList2);
    }
}
