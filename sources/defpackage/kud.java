package defpackage;

import io.reactivex.r;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: kud  reason: default package */
public abstract class kud<T, S> {

    /* renamed from: kud$a */
    public static final class a<T> extends kud {
        private final r<T> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(r<T> rVar) {
            super(null);
            h.e(rVar, "notification");
            this.a = rVar;
        }

        public final r<T> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
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

        public String toString() {
            StringBuilder V0 = je.V0("FromUpstream(notification=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: kud$b */
    public static final class b<S> extends kud {
        private final S a;

        public b(S s) {
            super(null);
            this.a = s;
        }

        public final S a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            S s = this.a;
            if (s != null) {
                return s.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.G0(je.V0("NewSubscriber(subscriber="), this.a, ")");
        }
    }

    private kud() {
    }

    public kud(f fVar) {
    }
}
