package com.spotify.music.features.queue.v2;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class b {

    public static final class a extends b {
        private final String a;
        private final List<ContextTrack> b;
        private final List<ContextTrack> c;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.spotify.player.model.ContextTrack> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.spotify.player.model.ContextTrack> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, List<? extends ContextTrack> list, List<? extends ContextTrack> list2) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c);
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
            StringBuilder V0 = je.V0("SetQueue(revision=");
            V0.append(this.a);
            V0.append(", nextTracks=");
            V0.append(this.b);
            V0.append(", prevTracks=");
            return je.L0(V0, this.c, ")");
        }
    }

    public b(f fVar) {
    }
}
