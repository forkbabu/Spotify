package defpackage;

import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.t;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

/* renamed from: zt6  reason: default package */
public interface zt6 extends com.spotify.android.glue.components.toolbar.d, t {

    /* renamed from: zt6$a */
    public interface a {
        zt6 a(ToolbarConfiguration toolbarConfiguration, ImmutableList<gu6> immutableList, ImmutableList<eu6> immutableList2);

        zt6 b(ToolbarConfiguration toolbarConfiguration);
    }

    /* renamed from: zt6$b */
    public interface b {

        /* renamed from: zt6$b$a */
        public interface a {
            b create();
        }

        zt6 a(ToolbarConfiguration toolbarConfiguration, c cVar, d<eu6> dVar, d<gu6> dVar2);
    }

    /* renamed from: zt6$c */
    public interface c {

        /* renamed from: zt6$c$a */
        public static final class a {
            public static final a d;
            private final Optional<String> a;
            private final Optional<String> b;
            private final Optional<String> c;

            static {
                Optional absent = Optional.absent();
                h.d(absent, "Optional.absent()");
                Optional absent2 = Optional.absent();
                h.d(absent2, "Optional.absent()");
                Optional absent3 = Optional.absent();
                h.d(absent3, "Optional.absent()");
                d = new a(absent, absent2, absent3);
            }

            public a(Optional<String> optional, Optional<String> optional2, Optional<String> optional3) {
                h.e(optional, "title");
                h.e(optional2, ContextTrack.Metadata.KEY_SUBTITLE);
                h.e(optional3, "imageUri");
                this.a = optional;
                this.b = optional2;
                this.c = optional3;
            }

            public final Optional<String> a() {
                return this.c;
            }

            public final Optional<String> b() {
                return this.b;
            }

            public final Optional<String> c() {
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
                Optional<String> optional = this.a;
                int i = 0;
                int hashCode = (optional != null ? optional.hashCode() : 0) * 31;
                Optional<String> optional2 = this.b;
                int hashCode2 = (hashCode + (optional2 != null ? optional2.hashCode() : 0)) * 31;
                Optional<String> optional3 = this.c;
                if (optional3 != null) {
                    i = optional3.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Header(title=");
                V0.append(this.a);
                V0.append(", subtitle=");
                V0.append(this.b);
                V0.append(", imageUri=");
                return je.F0(V0, this.c, ")");
            }
        }

        a a(h76 h76);
    }

    /* renamed from: zt6$d */
    public interface d<T> {
        ImmutableList<T> a(ImmutableList<T> immutableList);
    }

    void j0(ViewGroup viewGroup);

    void r(ar6 ar6);

    void x(a0 a0Var, c cVar);
}
