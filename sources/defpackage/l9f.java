package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.voice.api.model.AsrResponse;

/* renamed from: l9f  reason: default package */
public abstract class l9f {

    /* renamed from: l9f$a */
    public static final class a extends l9f {
        private final AsrResponse a;

        a(AsrResponse asrResponse) {
            asrResponse.getClass();
            this.a = asrResponse;
        }

        public final AsrResponse d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AsrState{response=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: l9f$b */
    public static final class b extends l9f {
        private final Throwable a;

        b(Throwable th) {
            th.getClass();
            this.a = th;
        }

        public final Throwable d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.K0(je.V0("Error{error="), this.a, '}');
        }
    }

    /* renamed from: l9f$c */
    public static final class c extends l9f {
        private final JsonNode a;

        c(JsonNode jsonNode) {
            jsonNode.getClass();
            this.a = jsonNode;
        }

        public final JsonNode d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NluState{response=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    l9f() {
    }

    public static l9f a(AsrResponse asrResponse) {
        return new a(asrResponse);
    }

    public static l9f b(Throwable th) {
        return new b(th);
    }

    public static l9f c(JsonNode jsonNode) {
        return new c(jsonNode);
    }
}
