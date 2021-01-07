package com.spotify.music.features.nowplayingbar.domain;

import kotlin.jvm.internal.f;

public abstract class h {

    public static final class a extends h {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends h {
        private final String a;
        private final j b;
        private final g c;
        private final i d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, j jVar, g gVar, i iVar) {
            super(null);
            kotlin.jvm.internal.h.e(str, "contextUri");
            kotlin.jvm.internal.h.e(jVar, "tracks");
            kotlin.jvm.internal.h.e(gVar, "playbackState");
            kotlin.jvm.internal.h.e(iVar, "restrictions");
            this.a = str;
            this.b = jVar;
            this.c = gVar;
            this.d = iVar;
        }

        public final String a() {
            return this.a;
        }

        public final g b() {
            return this.c;
        }

        public final i c() {
            return this.d;
        }

        public final j d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.h.a(this.a, bVar.a) && kotlin.jvm.internal.h.a(this.b, bVar.b) && kotlin.jvm.internal.h.a(this.c, bVar.c) && kotlin.jvm.internal.h.a(this.d, bVar.d);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            j jVar = this.b;
            int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
            g gVar = this.c;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            i iVar = this.d;
            if (iVar != null) {
                i = iVar.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("WithTracks(contextUri=");
            V0.append(this.a);
            V0.append(", tracks=");
            V0.append(this.b);
            V0.append(", playbackState=");
            V0.append(this.c);
            V0.append(", restrictions=");
            V0.append(this.d);
            V0.append(")");
            return V0.toString();
        }
    }

    private h() {
    }

    public h(f fVar) {
    }
}
