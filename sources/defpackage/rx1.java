package defpackage;

import com.spotify.mobile.android.storytelling.common.PauseState;
import kotlin.jvm.internal.h;

/* renamed from: rx1  reason: default package */
public abstract class rx1 {

    /* renamed from: rx1$a */
    public static final class a extends rx1 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: rx1$b */
    public static final class b extends rx1 {
        private final PauseState a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(PauseState pauseState) {
            super(null);
            h.e(pauseState, "pauseState");
            this.a = pauseState;
        }

        public final PauseState a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            PauseState pauseState = this.a;
            if (pauseState != null) {
                return pauseState.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PauseStateChanged(pauseState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: rx1$c */
    public static final class c extends rx1 {
        private final px1 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(px1 px1) {
            super(null);
            h.e(px1, "storiesLoadStatus");
            this.a = px1;
        }

        public final px1 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            px1 px1 = this.a;
            if (px1 != null) {
                return px1.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StoriesLoadStatusChanged(storiesLoadStatus=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: rx1$d */
    public static final class d extends rx1 {
        private final int a;

        public d(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && this.a == ((d) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("StoryPreLoadFailure(storyIndex="), this.a, ")");
        }
    }

    /* renamed from: rx1$e */
    public static final class e extends rx1 {
        private final int a;

        public e(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && this.a == ((e) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("StoryPreLoaded(storyIndex="), this.a, ")");
        }
    }

    /* renamed from: rx1$f */
    public static final class f extends rx1 {
        private final kx1 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(kx1 kx1) {
            super(null);
            h.e(kx1, "storyInfo");
            this.a = kx1;
        }

        public final kx1 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && h.a(this.a, ((f) obj).a);
            }
            return true;
        }

        public int hashCode() {
            kx1 kx1 = this.a;
            if (kx1 != null) {
                return kx1.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StoryStartReceived(storyInfo=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: rx1$g */
    public static final class g extends rx1 {
        private final ox1 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ox1 ox1) {
            super(null);
            h.e(ox1, "userRequest");
            this.a = ox1;
        }

        public final ox1 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && h.a(this.a, ((g) obj).a);
            }
            return true;
        }

        public int hashCode() {
            ox1 ox1 = this.a;
            if (ox1 != null) {
                return ox1.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UserRequestReceived(userRequest=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private rx1() {
    }

    public rx1(kotlin.jvm.internal.f fVar) {
    }
}
