package defpackage;

import com.google.common.base.Predicate;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerQueueUtil;
import com.spotify.player.model.Restrictions;
import java.util.ArrayList;

/* renamed from: qx7  reason: default package */
public class qx7 implements rx7 {
    private final PlayerQueue a;
    private final Restrictions b;
    private final int c;
    private final String d;

    /* renamed from: qx7$a */
    private static class a implements Predicate<PlayerTrack> {
        private final int a;
        private int b = 0;

        a(int i) {
            this.a = i;
        }

        /* renamed from: a */
        public boolean apply(PlayerTrack playerTrack) {
            if (playerTrack == null || PlayerQueueUtil.isQueued(playerTrack)) {
                return false;
            }
            if (PlayerQueueUtil.isDelimiter(playerTrack)) {
                this.b++;
            }
            if (this.b >= this.a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: qx7$b */
    private static class b implements Predicate<PlayerTrack> {
        private final int a;
        private int b = 0;

        b(int i) {
            this.a = i;
        }

        /* renamed from: a */
        public boolean apply(PlayerTrack playerTrack) {
            if (playerTrack == null || PlayerQueueUtil.isQueued(playerTrack)) {
                return false;
            }
            if (PlayerQueueUtil.isDelimiter(playerTrack)) {
                this.b++;
            }
            if (this.b < this.a) {
                return true;
            }
            return false;
        }
    }

    public qx7(PlayerQueue playerQueue, String str, Restrictions restrictions, boolean z) {
        playerQueue.getClass();
        this.a = playerQueue;
        str.getClass();
        this.d = str;
        restrictions.getClass();
        this.b = restrictions;
        this.c = z ? 2 : 1;
    }

    @Override // defpackage.rx7
    public sx7[] a() {
        ArrayList arrayList = new ArrayList();
        boolean z = this.b.disallowRemovingFromNextTracksReasons().isEmpty() && this.b.disallowSetQueueReasons().isEmpty();
        boolean isEmpty = this.b.disallowInsertingIntoNextTracksReasons().isEmpty();
        boolean isEmpty2 = this.b.disallowReorderingInNextTracksReasons().isEmpty();
        PlayerTrack[] nextTracks = this.a.nextTracks();
        for (PlayerTrack playerTrack : nextTracks) {
            if (PlayerQueueUtil.isQueued(playerTrack)) {
                arrayList.add(sx7.a(playerTrack, z, isEmpty, isEmpty2, false));
            }
        }
        return (sx7[]) arrayList.toArray(new sx7[0]);
    }

    @Override // defpackage.rx7
    public int b() {
        return this.a.nextTracks().length + (this.a.track() != null ? 1 : 0);
    }

    @Override // defpackage.rx7
    public PlayerTrack c() {
        return this.a.track();
    }

    @Override // defpackage.rx7
    public PlayerTrack[] d() {
        a aVar = new a(this.c);
        ArrayList arrayList = new ArrayList();
        PlayerTrack[] nextTracks = this.a.nextTracks();
        for (PlayerTrack playerTrack : nextTracks) {
            if (aVar.apply(playerTrack)) {
                arrayList.add(playerTrack);
            }
        }
        return (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]);
    }

    @Override // defpackage.rx7
    public sx7[] e() {
        b bVar = new b(this.c);
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        boolean z2 = this.b.disallowRemovingFromNextTracksReasons().isEmpty() && this.b.disallowRemovingFromContextTracksReasons().isEmpty() && this.b.disallowSetQueueReasons().isEmpty();
        boolean isEmpty = this.b.disallowInsertingIntoNextTracksReasons().isEmpty();
        if (!this.b.disallowReorderingInNextTracksReasons().isEmpty() || !this.b.disallowReorderingInContextTracksReasons().isEmpty()) {
            z = false;
        }
        PlayerTrack[] nextTracks = this.a.nextTracks();
        for (PlayerTrack playerTrack : nextTracks) {
            if (bVar.apply(playerTrack)) {
                arrayList.add(sx7.a(playerTrack, z2, isEmpty, z, !z));
            }
        }
        return (sx7[]) arrayList.toArray(new sx7[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx7)) {
            return false;
        }
        qx7 qx7 = (qx7) obj;
        if (this.c != qx7.c || !this.a.equals(qx7.a) || !this.b.equals(qx7.b)) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return str.equals(qx7.d);
        }
        if (qx7.d == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rx7
    public String f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
