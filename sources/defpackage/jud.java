package defpackage;

import io.reactivex.r;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: jud  reason: default package */
public abstract class jud<T, S> {

    /* renamed from: jud$a */
    public static final class a extends jud {
        private final hud a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(hud hud) {
            super(null);
            h.e(hud, "state");
            this.a = hud;
        }

        public final hud a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            hud hud = this.a;
            if (hud != null) {
                return hud.hashCode();
            }
            return 0;
        }

        @Override // defpackage.jud
        public String toString() {
            StringBuilder V0 = je.V0("EmitState(state=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: jud$b */
    public static final class b<T> extends jud {
        private final hud a;
        private final r<T> b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(hud hud, r<T> rVar) {
            super(null);
            h.e(hud, "state");
            h.e(rVar, "notification");
            this.a = hud;
            this.b = rVar;
        }

        public final r<T> a() {
            return this.b;
        }

        public final hud b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
        }

        public int hashCode() {
            hud hud = this.a;
            int i = 0;
            int hashCode = (hud != null ? hud.hashCode() : 0) * 31;
            r<T> rVar = this.b;
            if (rVar != null) {
                i = rVar.hashCode();
            }
            return hashCode + i;
        }

        @Override // defpackage.jud
        public String toString() {
            StringBuilder V0 = je.V0("EmitStateAndToAllSubscribers(state=");
            V0.append(this.a);
            V0.append(", notification=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: jud$c */
    public static final class c<T, S> extends jud<T, S> {
        private final r<T> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(r<T> rVar) {
            super(null);
            h.e(rVar, "notification");
            this.a = rVar;
        }

        public final r<T> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            r<T> rVar = this.a;
            if (rVar != null) {
                return rVar.hashCode();
            }
            return 0;
        }

        @Override // defpackage.jud
        public String toString() {
            StringBuilder V0 = je.V0("EmitToAllSubscribers(notification=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: jud$d */
    public static final class d<T, S> extends jud<T, S> {
        private final S a;
        private final List<r<T>> b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(S s, r<T>... rVarArr) {
            super(null);
            h.e(rVarArr, "notifications");
            List<r<T>> R = kotlin.collections.d.R(rVarArr);
            h.e(R, "notifications");
            this.a = s;
            this.b = R;
        }

        public final List<r<T>> a() {
            return this.b;
        }

        public final S b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return h.a(this.a, dVar.a) && h.a(this.b, dVar.b);
        }

        public int hashCode() {
            S s = this.a;
            int i = 0;
            int hashCode = (s != null ? s.hashCode() : 0) * 31;
            List<r<T>> list = this.b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        @Override // defpackage.jud
        public String toString() {
            StringBuilder V0 = je.V0("EmitToSubscriber(subscriber=");
            V0.append((Object) this.a);
            V0.append(", notifications=");
            return je.L0(V0, this.b, ")");
        }
    }

    /* renamed from: jud$e */
    public static final class e extends jud {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    private jud() {
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public jud(f fVar) {
    }
}
