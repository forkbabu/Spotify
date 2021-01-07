package com.spotify.music.features.ads.video;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.rxjava2.q;
import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class o {
    private final NavigableMap<Integer, ArrayList<String>> a = new TreeMap();
    private final String b;
    private final s<AdSlotEvent> c;
    private final dv3 d;
    private final Map<String, String> e;
    private final cqe f;
    private final wlf<y> g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;
    private boolean l;
    private long m;
    private final q n = new q();
    private final s o;

    public o(String str, Map<String, String> map, s<AdSlotEvent> sVar, dv3 dv3, s sVar2, cqe cqe, wlf<y> wlf) {
        this.b = str;
        this.c = sVar;
        this.d = dv3;
        this.e = map;
        this.f = cqe;
        this.g = wlf;
        this.o = sVar2;
    }

    public static void a(o oVar, Throwable th) {
        Logger.g("[VideoAdEvent] Error getting ad with id of %s for video progress tracker. %s", oVar.b, th.getClass().getSimpleName());
    }

    private void j(int i2, String str) {
        Logger.b("[VideoAdEvent] schedule %s event at position: %d", str, Integer.valueOf(i2));
        if (!this.a.containsKey(Integer.valueOf(i2))) {
            this.a.put(Integer.valueOf(i2), new ArrayList());
        }
        ((ArrayList) this.a.get(Integer.valueOf(i2))).add(str);
    }

    public /* synthetic */ boolean b(Ad ad) {
        return !ad.id().equals(this.b);
    }

    public /* synthetic */ void c(Ad ad) {
        j(10, "viewed");
    }

    /* JADX WARN: Incorrect args count in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;J)V */
    public void d(long j2) {
        Logger.b("[VideoAdEvent] onCompletion Reached: %s at position %d", this.b, Long.valueOf(j2));
        if (!this.j) {
            if (!this.l) {
                this.d.c("ended", this.b, this.k, j2, this.e);
                this.l = true;
            }
            if (!this.i) {
                this.d.c("viewed", this.b, this.k, j2, this.e);
            }
        }
    }

    public void e(long j2) {
        Logger.b("[VideoAdEvent] onDurationDetermined Reached: %s \t %s", this.b, Long.valueOf(j2));
        this.l = false;
        double d2 = (double) j2;
        Double.isNaN(d2);
        Double.isNaN(d2);
        j((int) (0.25d * d2), "first_quartile");
        Double.isNaN(d2);
        Double.isNaN(d2);
        j((int) (0.5d * d2), "midpoint");
        Double.isNaN(d2);
        Double.isNaN(d2);
        j((int) (d2 * 0.75d), "third_quartile");
        this.m = this.f.d();
        this.k = String.valueOf(j2 / 1000);
    }

    public void f(Map<String, String> map, long j2) {
        Logger.b("[VideoAdEvent] onError has occurred", new Object[0]);
        this.j = true;
        HashMap hashMap = new HashMap(map);
        hashMap.putAll(this.e);
        if (!this.l) {
            this.l = true;
            this.d.c("errored", this.b, this.k, j2, hashMap);
        }
        Logger.b("[VideoAdEvent] onError video_event: %s, quality: %s at position %d", "errored", hashMap, Long.valueOf(j2));
    }

    public void g(boolean z, long j2) {
        if (!this.j) {
            if (z) {
                Logger.b("[VideoAdEvent] onPlaying: video play/resume event : %s", this.b);
                if (!this.h) {
                    this.d.c("started", this.b, this.k, j2, this.e);
                    return;
                }
                return;
            }
            Logger.b("[VideoAdEvent] onPlaying: video pause event : %s", this.b);
            this.h = true;
        }
    }

    public void h(long j2) {
        if (!this.a.isEmpty()) {
            int intValue = this.a.firstKey().intValue();
            if (((long) intValue) <= j2) {
                Iterator<String> it = this.a.pollFirstEntry().getValue().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if ("viewed".equals(next)) {
                        if (!this.i) {
                            this.i = true;
                        }
                    }
                    Logger.b("[VideoAdEvent] post event %s at position: %d, timeEventInMs: %d", next, Long.valueOf(j2), Integer.valueOf(intValue));
                    this.d.c(next, this.b, this.k, j2, this.e);
                }
                h(j2);
            }
        }
    }

    public void i(VideoPlayerResponse videoPlayerResponse) {
        if ("advance".equals(videoPlayerResponse.type()) && !this.l && "fwdbtn".equals(videoPlayerResponse.advancedReason())) {
            this.l = true;
            long d2 = this.f.d() - this.m;
            Logger.b("[VideoAdEvent] video time event - current time is %d and start time is %d skip at position %d", Long.valueOf(this.f.d()), Long.valueOf(this.m), Long.valueOf(d2));
            dv3 dv3 = this.d;
            String str = this.b;
            String str2 = this.k;
            long j2 = 0;
            if (d2 > 0) {
                j2 = d2;
            }
            dv3.c("skipped", str, str2, j2, this.e);
        }
    }

    public void k() {
        Logger.b("[VideoAdEvent] VideoAdProgressTracker created", new Object[0]);
        b subscribe = this.c.j0(a.a).D0(new e(this)).N0(1).Q(new f(this)).subscribe(new d(this), new g(this));
        b subscribe2 = this.o.a().o0(this.g.get()).subscribe(new h(this));
        this.n.a(subscribe);
        this.n.a(subscribe2);
    }

    public void l() {
        this.n.c();
    }
}
