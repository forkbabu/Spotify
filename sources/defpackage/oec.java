package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.player.sub.l;
import com.spotify.rxjava2.r;
import com.spotify.rxjava2.y;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: oec  reason: default package */
public class oec implements RxPlayerState {
    private final Map<u3<Integer, Integer>, a> a = new ConcurrentHashMap();
    private final Map<u3<Integer, Integer>, LegacyPlayerState> b = new ConcurrentHashMap();
    private final l c;

    /* access modifiers changed from: private */
    /* renamed from: oec$a */
    public static class a {
        private final s<LegacyPlayerState> a;
        private final r<LegacyPlayerState> b;

        public a(s<LegacyPlayerState> sVar, r<LegacyPlayerState> rVar) {
            this.a = sVar;
            this.b = rVar;
        }
    }

    public oec(l lVar) {
        this.c = lVar;
    }

    public /* synthetic */ void a(u3 u3Var, LegacyPlayerState legacyPlayerState) {
        this.b.put(u3Var, legacyPlayerState);
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState
    public LegacyPlayerState getMostRecentPlayerState() {
        return this.b.get(new u3(2, 2));
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState
    public s<LegacyPlayerState> getPlayerState() {
        return getPlayerState(2, 2);
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState
    public List<y> unsubscribeAndReturnLeaks() {
        LinkedList linkedList = new LinkedList();
        for (a aVar : this.a.values()) {
            linkedList.addAll(aVar.b.a());
        }
        return linkedList;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState
    public s<LegacyPlayerState> getPlayerState(int i, int i2) {
        u3<Integer, Integer> u3Var = new u3<>(Integer.valueOf(i), Integer.valueOf(i2));
        a aVar = this.a.get(u3Var);
        if (aVar == null) {
            r rVar = new r(RxPlayerState.class.getSimpleName(), new v(this.c.a(i, i2).O(iec.a)).N(new lec(this, new u3(Integer.valueOf(i), Integer.valueOf(i2)))));
            aVar = new a(s.y(rVar), rVar);
            this.a.put(u3Var, aVar);
        }
        return aVar.a;
    }
}
