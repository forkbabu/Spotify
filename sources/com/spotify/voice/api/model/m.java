package com.spotify.voice.api.model;

import com.fasterxml.jackson.databind.JsonNode;
import io.reactivex.g;

public abstract class m {

    public static final class a extends m {
        private final AsrResponse a;

        a(AsrResponse asrResponse) {
            asrResponse.getClass();
            this.a = asrResponse;
        }

        @Override // com.spotify.voice.api.model.m
        public final <R_> R_ e(ti0<c, R_> ti0, ti0<d, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05) {
            return ti04.apply(this);
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

        public final AsrResponse g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AsrFinalResponse{response=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class b extends m {
        private final AsrResponse a;

        b(AsrResponse asrResponse) {
            asrResponse.getClass();
            this.a = asrResponse;
        }

        @Override // com.spotify.voice.api.model.m
        public final <R_> R_ e(ti0<c, R_> ti0, ti0<d, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05) {
            return ti03.apply(this);
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

        public final AsrResponse g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AsrIntermediateResponse{response=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class c extends m {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.voice.api.model.m
        public final <R_> R_ e(ti0<c, R_> ti0, ti0<d, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05) {
            return ti0.apply(this);
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

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Initializing{sessionId="), this.a, '}');
        }
    }

    public static final class d extends m {
        private final g<Float> a;

        d(g<Float> gVar) {
            gVar.getClass();
            this.a = gVar;
        }

        @Override // com.spotify.voice.api.model.m
        public final <R_> R_ e(ti0<c, R_> ti0, ti0<d, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05) {
            return ti02.apply(this);
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

        public final g<Float> g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Listening{audioPeaks=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class e extends m {
        private final JsonNode a;

        e(JsonNode jsonNode) {
            jsonNode.getClass();
            this.a = jsonNode;
        }

        @Override // com.spotify.voice.api.model.m
        public final <R_> R_ e(ti0<c, R_> ti0, ti0<d, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05) {
            return ti05.apply(this);
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

        public final JsonNode g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NluResponse{response=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    m() {
    }

    public static m a(AsrResponse asrResponse) {
        return new a(asrResponse);
    }

    public static m b(AsrResponse asrResponse) {
        return new b(asrResponse);
    }

    public static m c(String str) {
        return new c(str);
    }

    public static m d(g<Float> gVar) {
        return new d(gVar);
    }

    public static m f(JsonNode jsonNode) {
        return new e(jsonNode);
    }

    public abstract <R_> R_ e(ti0<c, R_> ti0, ti0<d, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05);
}
