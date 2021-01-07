package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import defpackage.j1c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

public final class g implements f {
    private final Context a;

    public g(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.f
    public Optional<a.b> a(List<f> list, j1c.a.b.C0627b bVar) {
        T t;
        boolean z;
        h.e(list, "timeLineSegments");
        h.e(bVar, "physicalPosition");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            int b = t2.c().b();
            int b2 = t2.e().a().b();
            if (bVar.b() < b || bVar.b() >= b + b2) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        T t3 = t;
        if (t3 == null) {
            return Optional.absent();
        }
        double b3 = (double) new j1c.a.b.C0627b(this.a, bVar.b() - t3.c().b()).b();
        double b4 = (double) t3.e().a().b();
        Double.isNaN(b3);
        Double.isNaN(b4);
        Double.isNaN(b3);
        Double.isNaN(b4);
        double d = b3 / b4;
        double a2 = (double) iyb.a(t3.b()).a();
        Double.isNaN(a2);
        Double.isNaN(a2);
        j1c.b.c cVar = new j1c.b.c(anf.a(d * a2));
        return Optional.of(new a.b(true, bVar, new a.c(t3, new j1c.b.C0628b(cVar.a() + t3.d().a(), false, 2), cVar)));
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.f
    public Optional<a.b> b(List<f> list, j1c.b.C0628b bVar) {
        T t;
        boolean z;
        h.e(list, "timeLineSegments");
        h.e(bVar, "playbackPosition");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            int a2 = t2.d().a();
            int a3 = iyb.a(t2.b()).a();
            if (bVar.a() < a2 || bVar.a() >= a2 + a3) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        T t3 = t;
        if (t3 == null) {
            return Optional.absent();
        }
        j1c.b.c cVar = new j1c.b.c(bVar.a() - t3.d().a());
        double a4 = (double) cVar.a();
        double a5 = (double) iyb.a(t3.b()).a();
        Double.isNaN(a4);
        Double.isNaN(a5);
        Double.isNaN(a4);
        Double.isNaN(a5);
        double d = a4 / a5;
        double b = (double) t3.e().a().b();
        Double.isNaN(b);
        Double.isNaN(b);
        return Optional.of(new a.b(false, new j1c.a.b.C0627b(this.a, anf.a(d * b) + t3.c().b()), new a.c(t3, bVar, cVar)));
    }
}
