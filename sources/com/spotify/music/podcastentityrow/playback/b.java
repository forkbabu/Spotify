package com.spotify.music.podcastentityrow.playback;

import com.spotify.music.podcastentityrow.g;
import java.util.List;
import kotlin.jvm.internal.h;

public interface b {

    public static final class a {
        private final g a;
        private final String b;
        private final boolean c;
        private final List<C0333b> d;
        private final String e;
        private final int f;

        public a(g gVar, String str, boolean z, List<C0333b> list, String str2, int i) {
            h.e(gVar, "listener");
            h.e(str, "uri");
            h.e(list, "trackData");
            h.e(str2, "sectionName");
            this.a = gVar;
            this.b = str;
            this.c = z;
            this.d = list;
            this.e = str2;
            this.f = i;
        }

        public final int a() {
            return this.f;
        }

        public final g b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public final List<C0333b> d() {
            return this.d;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && this.c == aVar.c && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && this.f == aVar.f;
        }

        public final boolean f() {
            return this.c;
        }

        public int hashCode() {
            g gVar = this.a;
            int i = 0;
            int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode2 + i2) * 31;
            List<C0333b> list = this.d;
            int hashCode3 = (i5 + (list != null ? list.hashCode() : 0)) * 31;
            String str2 = this.e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode3 + i) * 31) + this.f;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EpisodePlayButtonClickModel(listener=");
            V0.append(this.a);
            V0.append(", uri=");
            V0.append(this.b);
            V0.append(", isExplicit=");
            V0.append(this.c);
            V0.append(", trackData=");
            V0.append(this.d);
            V0.append(", sectionName=");
            V0.append(this.e);
            V0.append(", index=");
            return je.B0(V0, this.f, ")");
        }
    }

    /* renamed from: com.spotify.music.podcastentityrow.playback.b$b  reason: collision with other inner class name */
    public static final class C0333b {
        private final String a;
        private final String b;

        public C0333b(String str, String str2) {
            h.e(str, "uri");
            h.e(str2, "showName");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0333b)) {
                return false;
            }
            C0333b bVar = (C0333b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TrackData(uri=");
            V0.append(this.a);
            V0.append(", showName=");
            return je.I0(V0, this.b, ")");
        }
    }

    void a(a aVar);
}
