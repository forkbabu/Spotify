package com.spotify.music.features.connectui.picker.frictionlessjoin.ui;

import com.spotify.music.sociallistening.models.Participant;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public interface b {

    public static abstract class a {

        /* renamed from: com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b$a$a  reason: collision with other inner class name */
        public static final class C0221a extends a {
            private final List<Participant> a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0221a(List<Participant> list) {
                super(null);
                h.e(list, "participants");
                this.a = list;
            }

            public final List<Participant> a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C0221a) && h.a(this.a, ((C0221a) obj).a);
                }
                return true;
            }

            public int hashCode() {
                List<Participant> list = this.a;
                if (list != null) {
                    return list.hashCode();
                }
                return 0;
            }

            public String toString() {
                return je.L0(je.V0("Host(participants="), this.a, ")");
            }
        }

        /* renamed from: com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b$a$b  reason: collision with other inner class name */
        public static final class C0222b extends a {
            private final List<Participant> a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0222b(List<Participant> list) {
                super(null);
                h.e(list, "participants");
                this.a = list;
            }

            public final List<Participant> a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C0222b) && h.a(this.a, ((C0222b) obj).a);
                }
                return true;
            }

            public int hashCode() {
                List<Participant> list = this.a;
                if (list != null) {
                    return list.hashCode();
                }
                return 0;
            }

            public String toString() {
                return je.L0(je.V0("Participant(participants="), this.a, ")");
            }
        }

        public a(f fVar) {
        }
    }

    /* renamed from: com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b$b  reason: collision with other inner class name */
    public interface AbstractC0223b {
    }

    public interface c {
    }

    void a();

    void b();

    void c(c cVar);

    void d(boolean z);

    void e(a aVar);

    void f(AbstractC0223b bVar);

    void g(a aVar);
}
