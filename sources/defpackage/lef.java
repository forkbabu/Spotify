package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.voice.api.model.AsrResponse;

/* renamed from: lef  reason: default package */
public abstract class lef {

    /* renamed from: lef$a */
    public static final class a extends lef {
        private final JsonNode a;

        a(JsonNode jsonNode) {
            jsonNode.getClass();
            this.a = jsonNode;
        }

        @Override // defpackage.lef
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<f, R_> ti02, ti0<e, R_> ti03, ti0<d, R_> ti04, ti0<a, R_> ti05, ti0<c, R_> ti06, ti0<g, R_> ti07, ti0<h, R_> ti08) {
            jef jef = (jef) ti05;
            return (R_) mef.e(jef.a, jef.b, this);
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

        public final JsonNode j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Fulfillment{response=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: lef$b */
    public static final class b extends lef {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.lef
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<f, R_> ti02, ti0<e, R_> ti03, ti0<d, R_> ti04, ti0<a, R_> ti05, ti0<c, R_> ti06, ti0<g, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((gef) ti0).apply(this);
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

        public final String j() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("Initialized{utteranceId="), this.a, '}');
        }
    }

    /* renamed from: lef$c */
    public static final class c extends lef {
        c() {
        }

        @Override // defpackage.lef
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<f, R_> ti02, ti0<e, R_> ti03, ti0<d, R_> ti04, ti0<a, R_> ti05, ti0<c, R_> ti06, ti0<g, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((fef) ti06).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OnDismiss{}";
        }
    }

    /* renamed from: lef$d */
    public static final class d extends lef {
        private final AsrResponse a;

        d(AsrResponse asrResponse) {
            asrResponse.getClass();
            this.a = asrResponse;
        }

        @Override // defpackage.lef
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<f, R_> ti02, ti0<e, R_> ti03, ti0<d, R_> ti04, ti0<a, R_> ti05, ti0<c, R_> ti06, ti0<g, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((hef) ti04).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final AsrResponse j() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Response{asrResponse=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: lef$e */
    public static final class e extends lef {
        private final Throwable a;

        e(Throwable th) {
            th.getClass();
            this.a = th;
        }

        @Override // defpackage.lef
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<f, R_> ti02, ti0<e, R_> ti03, ti0<d, R_> ti04, ti0<a, R_> ti05, ti0<c, R_> ti06, ti0<g, R_> ti07, ti0<h, R_> ti08) {
            return (R_) mef.d(((def) ti03).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final Throwable j() {
            return this.a;
        }

        public String toString() {
            return je.K0(je.V0("SessionError{error="), this.a, '}');
        }
    }

    /* renamed from: lef$f */
    public static final class f extends lef {
        f() {
        }

        @Override // defpackage.lef
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<f, R_> ti02, ti0<e, R_> ti03, ti0<d, R_> ti04, ti0<a, R_> ti05, ti0<c, R_> ti06, ti0<g, R_> ti07, ti0<h, R_> ti08) {
            return (R_) ((cef) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SessionStarted{}";
        }
    }

    /* renamed from: lef$g */
    public static final class g extends lef {
        g() {
        }

        @Override // defpackage.lef
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<f, R_> ti02, ti0<e, R_> ti03, ti0<d, R_> ti04, ti0<a, R_> ti05, ti0<c, R_> ti06, ti0<g, R_> ti07, ti0<h, R_> ti08) {
            return (R_) mef.f(((ief) ti07).a, this);
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TtsPlaybackCompleted{}";
        }
    }

    /* renamed from: lef$h */
    public static final class h extends lef {
        private final Throwable a;

        h(Throwable th) {
            th.getClass();
            this.a = th;
        }

        @Override // defpackage.lef
        public final <R_> R_ c(ti0<b, R_> ti0, ti0<f, R_> ti02, ti0<e, R_> ti03, ti0<d, R_> ti04, ti0<a, R_> ti05, ti0<c, R_> ti06, ti0<g, R_> ti07, ti0<h, R_> ti08) {
            return (R_) mef.g(((eef) ti08).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.K0(je.V0("TtsPlaybackFailed{throwable="), this.a, '}');
        }
    }

    lef() {
    }

    public static lef a(JsonNode jsonNode) {
        return new a(jsonNode);
    }

    public static lef b(String str) {
        return new b(str);
    }

    public static lef d() {
        return new c();
    }

    public static lef e(AsrResponse asrResponse) {
        return new d(asrResponse);
    }

    public static lef f(Throwable th) {
        return new e(th);
    }

    public static lef g() {
        return new f();
    }

    public static lef h() {
        return new g();
    }

    public static lef i(Throwable th) {
        return new h(th);
    }

    public abstract <R_> R_ c(ti0<b, R_> ti0, ti0<f, R_> ti02, ti0<e, R_> ti03, ti0<d, R_> ti04, ti0<a, R_> ti05, ti0<c, R_> ti06, ti0<g, R_> ti07, ti0<h, R_> ti08);
}
