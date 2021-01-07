package defpackage;

import com.spotify.mobile.android.offline.coordinator.cosmos.OfflineCosmosSender;
import com.spotify.mobile.android.offline.coordinator.cosmos.e;
import com.spotify.mobile.android.offline.coordinator.cosmos.f;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import com.spotify.podcast.endpoints.l;
import defpackage.wa1;
import io.reactivex.y;

/* renamed from: va1  reason: default package */
public final class va1 implements wa1 {
    private final BetamaxOfflineManager a;
    private final f b;
    private final l c;
    private final y d;
    private final l72 e;

    /* renamed from: va1$b */
    private static final class b implements wa1.a {
        b(a aVar) {
        }

        @Override // defpackage.wa1.a
        public wa1 a(BetamaxOfflineManager betamaxOfflineManager, f fVar, l lVar, l72 l72, y yVar) {
            betamaxOfflineManager.getClass();
            fVar.getClass();
            lVar.getClass();
            l72.getClass();
            yVar.getClass();
            return new va1(betamaxOfflineManager, fVar, lVar, l72, yVar, null);
        }
    }

    va1(BetamaxOfflineManager betamaxOfflineManager, f fVar, l lVar, l72 l72, y yVar, a aVar) {
        this.a = betamaxOfflineManager;
        this.b = fVar;
        this.c = lVar;
        this.d = yVar;
        this.e = l72;
    }

    public static wa1.a b() {
        return new b(null);
    }

    @Override // defpackage.wa1
    public ua1 a() {
        BetamaxOfflineManager betamaxOfflineManager = this.a;
        f fVar = this.b;
        return new ua1(betamaxOfflineManager, new e(fVar, this.c, this.d), new OfflineCosmosSender(fVar), this.e);
    }
}
