package defpackage;

import com.spotify.mobile.android.offline.coordinator.cosmos.OfflineCosmosSender;
import com.spotify.mobile.android.offline.coordinator.cosmos.e;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import com.spotify.mobile.android.video.offline.d0;
import com.spotify.mobile.android.video.offline.f0;
import com.spotify.mobile.android.video.offline.g0;
import com.spotify.mobile.android.video.offline.q;
import com.spotify.mobile.android.video.offline.r;
import com.spotify.mobile.android.video.offline.s;
import com.spotify.playlist.models.Episode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: ua1  reason: default package */
public class ua1 implements e.a, s {
    private final BetamaxOfflineManager a;
    private final e b;
    private final OfflineCosmosSender c;
    private final l72 d;
    private int e;

    /* renamed from: ua1$a */
    class a implements r {
        a() {
        }

        @Override // com.spotify.mobile.android.video.offline.r
        public void a(d0 d0Var, long j, Throwable th, long j2) {
            String str = d0Var.c().get("episode_uri");
            if (str != null) {
                ua1.this.c.c(str, ua1.this.a.c(d0Var.b()), j, false, th);
            }
        }

        @Override // com.spotify.mobile.android.video.offline.r
        public void b(d0 d0Var, long j, long j2) {
            String str = d0Var.c().get("episode_uri");
            if (str != null) {
                ua1.this.c.c(str, ua1.this.a.c(d0Var.b()), j, true, null);
            }
        }

        @Override // com.spotify.mobile.android.video.offline.r
        public /* synthetic */ void c(d0 d0Var, long j) {
            q.c(this, d0Var, j);
        }

        @Override // com.spotify.mobile.android.video.offline.r
        public /* synthetic */ void d(d0 d0Var, long j, long j2) {
            q.a(this, d0Var, j, j2);
        }

        @Override // com.spotify.mobile.android.video.offline.r
        public /* synthetic */ void e(d0 d0Var, long j, long j2) {
            q.d(this, d0Var, j, j2);
        }

        @Override // com.spotify.mobile.android.video.offline.r
        public void f(d0 d0Var, long j, long j2) {
            String str = d0Var.c().get("episode_uri");
            if (str != null) {
                ua1.this.c.c(str, ua1.this.a.c(d0Var.b()), j, false, null);
            }
        }
    }

    public ua1(BetamaxOfflineManager betamaxOfflineManager, e eVar, OfflineCosmosSender offlineCosmosSender, l72 l72) {
        this.a = betamaxOfflineManager;
        this.b = eVar;
        this.c = offlineCosmosSender;
        this.d = l72;
    }

    private static boolean e(Episode.MediaType mediaType) {
        return mediaType == Episode.MediaType.VODCAST || mediaType == Episode.MediaType.VIDEO;
    }

    @Override // com.spotify.mobile.android.video.offline.s
    public r a(d0 d0Var, f0 f0Var) {
        return new a();
    }

    public void d(int i) {
        this.e = i;
        this.a.h();
        this.a.a(this);
        this.b.e(this);
    }

    public void f(Collection<Episode> collection) {
        for (Episode episode : collection) {
            if (e(episode.l())) {
                this.a.i(this.d.a(episode.k()));
            }
        }
        this.c.d();
    }

    public void g(Collection<Episode> collection) {
        for (Episode episode : collection) {
            if (e(episode.l())) {
                String a2 = this.d.a(episode.k());
                HashMap hashMap = new HashMap(episode.m());
                hashMap.put("episode_uri", episode.getUri());
                g0.a a3 = g0.a();
                a3.d(a2);
                a3.e(hashMap);
                g0 b2 = a3.b();
                f0.a a4 = f0.a();
                a4.d(this.e);
                this.a.k(b2, a4.b());
            }
        }
    }

    public void h(Collection<Episode> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Episode episode : collection) {
            OfflineCosmosSender.StateResponse.State state = OfflineCosmosSender.StateResponse.State.INVALID;
            long j = 0;
            if (e(episode.l())) {
                String a2 = this.d.a(episode.k());
                OfflineCosmosSender.StateResponse.State state2 = this.a.g(a2) == BetamaxOfflineManager.BetamaxDownloadState.STATE_COMPLETED ? OfflineCosmosSender.StateResponse.State.DOWNLOADED : OfflineCosmosSender.StateResponse.State.NOT_DOWNLOADED;
                long c2 = this.a.c(a2);
                if (c2 <= 0) {
                    j = (((long) episode.j()) * ((long) this.e)) / 8;
                    state = state2;
                } else {
                    state = state2;
                    j = c2;
                }
            }
            arrayList.add(new OfflineCosmosSender.StateResponse(episode.getUri(), state, j));
        }
        this.c.f(arrayList);
    }

    public void i(Collection<Episode> collection) {
        for (Episode episode : collection) {
            if (e(episode.l())) {
                this.a.b(this.d.a(episode.k()));
            }
        }
        this.c.g();
    }

    public void j() {
        this.b.a();
        this.c.b();
        this.a.j(this);
        this.a.d();
    }
}
