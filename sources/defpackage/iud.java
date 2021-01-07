package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: iud  reason: default package */
public abstract class iud<T> {

    /* renamed from: iud$a */
    public static final class a<T> extends iud<T> {
        private final T a;

        public a(T t) {
            super(null);
            this.a = t;
        }

        public final T a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            T t = this.a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.G0(je.V0("OnCompleted(lastValue="), this.a, ")");
        }
    }

    /* renamed from: iud$b */
    public static final class b<T> extends iud<T> {
        private final T a;
        private final Throwable b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(T t, Throwable th) {
            super(null);
            h.e(th, AppProtocol.LogMessage.SEVERITY_ERROR);
            this.a = t;
            this.b = th;
        }

        public final Throwable a() {
            return this.b;
        }

        public final T b() {
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
            T t = this.a;
            int i = 0;
            int hashCode = (t != null ? t.hashCode() : 0) * 31;
            Throwable th = this.b;
            if (th != null) {
                i = th.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("OnError(lastValue=");
            V0.append((Object) this.a);
            V0.append(", error=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: iud$c */
    public static final class c<T> extends iud<T> {
        private final T a;

        public c(T t) {
            super(null);
            this.a = t;
        }

        public final T a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            T t = this.a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.G0(je.V0("OnNext(value="), this.a, ")");
        }
    }

    public iud(f fVar) {
    }
}
