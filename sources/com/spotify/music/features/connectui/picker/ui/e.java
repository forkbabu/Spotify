package com.spotify.music.features.connectui.picker.ui;

import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.sociallistening.models.Participant;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public interface e {

    public interface a {
    }

    public static abstract class b {

        public static final class a extends b {
            private final List<Participant> a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(List<Participant> list) {
                super(null);
                h.e(list, "participants");
                this.a = list;
            }

            public final List<Participant> a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof a) && h.a(this.a, ((a) obj).a);
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
                return je.L0(je.V0("GroupSessionParticipant(participants="), this.a, ")");
            }
        }

        /* renamed from: com.spotify.music.features.connectui.picker.ui.e$b$b  reason: collision with other inner class name */
        public static final class C0226b extends b {
            private final boolean a;

            public C0226b() {
                this(false, 1);
            }

            public C0226b(boolean z) {
                super(null);
                this.a = z;
            }

            public final boolean a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C0226b) && this.a == ((C0226b) obj).a;
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
                return je.P0(je.V0("Normal(isVideo="), this.a, ")");
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0226b(boolean z, int i) {
                super(null);
                z = (i & 1) != 0 ? false : z;
                this.a = z;
            }
        }

        public b(f fVar) {
        }
    }

    void a();

    void b(a aVar);

    void c();

    void d(GaiaDevice gaiaDevice);

    void e();

    void f(GaiaDevice gaiaDevice);

    void g(GaiaDevice gaiaDevice);

    void h();

    void i(b bVar);

    void j(ListeningOnView listeningOnView);
}
