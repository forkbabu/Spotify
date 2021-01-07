package com.spotify.music.features.queue.v2;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class d {

    public static final class a extends d {
        private final a a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a aVar) {
            super(null);
            h.e(aVar, "state");
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlaybackStateChanged(state=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b extends d {
        private final String a;
        private final List<ContextTrack> b;
        private final List<ContextTrack> c;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.spotify.player.model.ContextTrack> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.spotify.player.model.ContextTrack> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, List<? extends ContextTrack> list, List<? extends ContextTrack> list2) {
            super(null);
            h.e(str, "revision");
            h.e(list, "nextTracks");
            h.e(list2, "prevTracks");
            this.a = str;
            this.b = list;
            this.c = list2;
        }

        public final List<ContextTrack> a() {
            return this.b;
        }

        public final List<ContextTrack> b() {
            return this.c;
        }

        public final String c() {
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
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<ContextTrack> list = this.b;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            List<ContextTrack> list2 = this.c;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("QueueUpdated(revision=");
            V0.append(this.a);
            V0.append(", nextTracks=");
            V0.append(this.b);
            V0.append(", prevTracks=");
            return je.L0(V0, this.c, ")");
        }
    }

    public static final class c extends d {
        private final int a;
        private final int b;

        public c(int i, int i2) {
            super(null);
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public int hashCode() {
            return (this.a * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TrackMoved(from=");
            V0.append(this.a);
            V0.append(", to=");
            return je.B0(V0, this.b, ")");
        }
    }

    private d() {
    }

    public d(f fVar) {
    }
}
