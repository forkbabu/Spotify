package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments.f;
import defpackage.j1c;
import io.reactivex.g;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public interface a {

    /* renamed from: com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a$a  reason: collision with other inner class name */
    public static final class C0316a {
        private final com.spotify.music.nowplaying.podcast.mixedmedia.model.c a;
        private final List<f> b;
        private final j1c.b.a c;

        public C0316a(com.spotify.music.nowplaying.podcast.mixedmedia.model.c cVar, List<f> list, j1c.b.a aVar) {
            h.e(cVar, "trackListModel");
            h.e(list, "timeLineSegments");
            h.e(aVar, "totalDuration");
            this.a = cVar;
            this.b = list;
            this.c = aVar;
        }

        public final List<f> a() {
            return this.b;
        }

        public final j1c.b.a b() {
            return this.c;
        }

        public final com.spotify.music.nowplaying.podcast.mixedmedia.model.c c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0316a)) {
                return false;
            }
            C0316a aVar = (C0316a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c);
        }

        public int hashCode() {
            com.spotify.music.nowplaying.podcast.mixedmedia.model.c cVar = this.a;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            List<f> list = this.b;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            j1c.b.a aVar = this.c;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TimeLineContext(trackListModel=");
            V0.append(this.a);
            V0.append(", timeLineSegments=");
            V0.append(this.b);
            V0.append(", totalDuration=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b {
        private final boolean a;
        private final j1c.a.b.C0627b b;
        private final c c;

        public b(boolean z, j1c.a.b.C0627b bVar, c cVar) {
            h.e(bVar, "physicalPosition");
            h.e(cVar, "segmentContext");
            this.a = z;
            this.b = bVar;
            this.c = cVar;
        }

        public final j1c.a.b.C0627b a() {
            return this.b;
        }

        public final c b() {
            return this.c;
        }

        public final boolean c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && h.a(this.b, bVar.b) && h.a(this.c, bVar.c);
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            j1c.a.b.C0627b bVar = this.b;
            int i5 = 0;
            int hashCode = (i4 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            c cVar = this.c;
            if (cVar != null) {
                i5 = cVar.hashCode();
            }
            return hashCode + i5;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TimeLinePositionContext(isUserInteraction=");
            V0.append(this.a);
            V0.append(", physicalPosition=");
            V0.append(this.b);
            V0.append(", segmentContext=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class c {
        private final f a;
        private final j1c.b.C0628b b;
        private final j1c.b.c c;

        public c(f fVar, j1c.b.C0628b bVar, j1c.b.c cVar) {
            h.e(fVar, "timeLineSegment");
            h.e(bVar, "playbackPosition");
            h.e(cVar, "playbackRelativePosition");
            this.a = fVar;
            this.b = bVar;
            this.c = cVar;
        }

        public final j1c.b.C0628b a() {
            return this.b;
        }

        public final j1c.b.c b() {
            return this.c;
        }

        public final f c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && h.a(this.c, cVar.c);
        }

        public int hashCode() {
            f fVar = this.a;
            int i = 0;
            int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
            j1c.b.C0628b bVar = this.b;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            j1c.b.c cVar = this.c;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TimeLineSegmentContext(timeLineSegment=");
            V0.append(this.a);
            V0.append(", playbackPosition=");
            V0.append(this.b);
            V0.append(", playbackRelativePosition=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    g<C0316a> b();

    g<b> c(boolean z);

    g<Pair<C0316a, b>> f(boolean z);
}
