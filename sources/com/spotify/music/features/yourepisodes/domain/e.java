package com.spotify.music.features.yourepisodes.domain;

import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class e {

    public static final class a extends e {
        private static final a e;
        public static final a f = null;
        private final List<a> a;
        private final int b;
        private final jnf c;
        private final DownloadState d;

        static {
            EmptyList emptyList = EmptyList.a;
            jnf jnf = jnf.n;
            e = new a(emptyList, 0, jnf.f, DownloadState.None.INSTANCE);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<a> list, int i, jnf jnf, DownloadState downloadState) {
            super(null);
            h.e(list, "items");
            h.e(jnf, "availableRange");
            h.e(downloadState, "downloadState");
            this.a = list;
            this.b = i;
            this.c = jnf;
            this.d = downloadState;
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && h.a(this.c, aVar.c) && h.a(this.d, aVar.d);
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
            StringBuilder V0 = je.V0("Content(items=");
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

    public static final class b extends e {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends e {
        private final Throwable a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(null);
            h.e(th, AppProtocol.LogMessage.SEVERITY_ERROR);
            this.a = th;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error(error=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public e(f fVar) {
    }
}
