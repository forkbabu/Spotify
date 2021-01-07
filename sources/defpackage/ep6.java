package defpackage;

import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: ep6  reason: default package */
public interface ep6 extends qp6 {

    /* renamed from: ep6$a */
    public static abstract class a {

        /* renamed from: ep6$a$a  reason: collision with other inner class name */
        public static final class C0592a extends a {
        }

        /* renamed from: ep6$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: ep6$a$c */
        public static final class c extends a {
        }

        /* renamed from: ep6$a$d */
        public static final class d extends a {
            private final c a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(c cVar) {
                super(null);
                h.e(cVar, "factory");
                this.a = cVar;
            }

            public final c a() {
                return this.a;
            }
        }

        public a(f fVar) {
        }
    }

    /* renamed from: ep6$b */
    public interface b extends jp6 {
        com.spotify.music.features.playlistallsongs.c f();
    }

    /* renamed from: ep6$c */
    public interface c {
        List<AdditionalAdapter> a(b bVar);
    }

    a b(AdditionalAdapter.Position position);
}
