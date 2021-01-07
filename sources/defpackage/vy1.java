package defpackage;

import com.spotify.mobile.android.storytelling.common.PauseState;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: vy1  reason: default package */
public abstract class vy1 {

    /* renamed from: vy1$a */
    public static final class a extends vy1 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: vy1$b */
    public static final class b extends vy1 {
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

    /* renamed from: vy1$c */
    public static final class c extends vy1 {
        private final wy1 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(wy1 wy1) {
            super(null);
            h.e(wy1, "storyLoadStatus");
            this.a = wy1;
        }

        public final wy1 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            wy1 wy1 = this.a;
            if (wy1 != null) {
                return wy1.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StoryLoadStatusChanged(storyLoadStatus=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private vy1() {
    }

    public vy1(f fVar) {
    }
}
