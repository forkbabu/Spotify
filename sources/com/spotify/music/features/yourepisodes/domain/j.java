package com.spotify.music.features.yourepisodes.domain;

import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import java.util.List;
import kotlin.jvm.internal.h;

public abstract class j {

    public static final class a extends j {
        private final boolean a;

        public a(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.a == ((a) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("ContextDownloadEnabledChanged(contextDownloadEnabled="), this.a, ")");
        }
    }

    public static final class b extends j {
        private final HeaderAction a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(HeaderAction headerAction) {
            super(null);
            h.e(headerAction, "action");
            this.a = headerAction;
        }

        public final HeaderAction a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            HeaderAction headerAction = this.a;
            if (headerAction != null) {
                return headerAction.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("HeaderActionTapped(action=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class c extends j {
        private final List<a> a;
        private final int b;
        private final jnf c;
        private final DownloadState d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<a> list, int i, jnf jnf, DownloadState downloadState) {
            super(null);
            h.e(list, "items");
            h.e(jnf, "availableRange");
            h.e(downloadState, "downloadState");
            this.a = list;
            this.b = i;
            this.c = jnf;
            this.d = downloadState;
        }

        public static c a(c cVar, List list, int i, jnf jnf, DownloadState downloadState, int i2) {
            DownloadState downloadState2 = null;
            List<a> list2 = (i2 & 1) != 0 ? cVar.a : null;
            if ((i2 & 2) != 0) {
                i = cVar.b;
            }
            if ((i2 & 4) != 0) {
                jnf = cVar.c;
            }
            if ((i2 & 8) != 0) {
                downloadState2 = cVar.d;
            }
            h.e(list2, "items");
            h.e(jnf, "availableRange");
            h.e(downloadState2, "downloadState");
            return new c(list2, i, jnf, downloadState2);
        }

        public final jnf b() {
            return this.c;
        }

        public final DownloadState c() {
            return this.d;
        }

        public final List<a> d() {
            return this.a;
        }

        public final int e() {
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
            return h.a(this.a, cVar.a) && this.b == cVar.b && h.a(this.c, cVar.c) && h.a(this.d, cVar.d);
        }

        public int hashCode() {
            List<a> list = this.a;
            int i = 0;
            int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.b) * 31;
            jnf jnf = this.c;
            int hashCode2 = (hashCode + (jnf != null ? jnf.hashCode() : 0)) * 31;
            DownloadState downloadState = this.d;
            if (downloadState != null) {
                i = downloadState.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ItemsUpdated(items=");
            V0.append(this.a);
            V0.append(", numberOfItems=");
            V0.append(this.b);
            V0.append(", availableRange=");
            V0.append(this.c);
            V0.append(", downloadState=");
            V0.append(this.d);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class d extends j {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return h.a(null, null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LoadError(error=null)";
        }
    }

    public static final class e extends j {
        private final c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(c cVar) {
            super(null);
            h.e(cVar, "newPlayerState");
            this.a = cVar;
        }

        public final c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayerStateModelChanged(newPlayerState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class f extends j {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return h.a(null, null) && h.a(null, null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "VisibleRangeChanged(visibleRange=null, availableRange=null)";
        }
    }

    private j() {
    }

    public j(kotlin.jvm.internal.f fVar) {
    }
}
