package com.spotify.music.ads.voice.domain;

public abstract class s {

    public static final class a extends s {
        a() {
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti014.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "AdSaved{}";
        }
    }

    public static final class b extends s {
        b() {
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti08.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "AdSlotsCleared{}";
        }
    }

    public static final class c extends s {
        c() {
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti09.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "CtaClicked{}";
        }
    }

    public static final class d extends s {
        private final EarconType a;

        d(EarconType earconType) {
            earconType.getClass();
            this.a = earconType;
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti013.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof d) && ((d) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final EarconType p() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EarconPlayed{earconType=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class e extends s {
        e() {
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti02.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "MicActivationRequested{}";
        }
    }

    public static final class f extends s {
        f() {
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti011.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PlaybackBuffering{}";
        }
    }

    public static final class g extends s {
        g() {
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti010.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PlaybackPaused{}";
        }
    }

    public static final class h extends s {
        private final long a;

        h(long j) {
            this.a = j;
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti012.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof h) && ((h) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.r0(this.a, 0);
        }

        public final long p() {
            return this.a;
        }

        public String toString() {
            return je.D0(je.V0("PlaybackResumed{position="), this.a, '}');
        }
    }

    public static final class i extends s {
        private final IntentType a;

        i(IntentType intentType) {
            intentType.getClass();
            this.a = intentType;
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti06.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof i) && ((i) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final IntentType p() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SpeechIntentRecognized{intentType=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class j extends s {
        private final q a;

        j(q qVar) {
            qVar.getClass();
            this.a = qVar;
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti07.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return ((j) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final q p() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SpeechRecognitionError{errorType=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class k extends s {
        private final long a;

        k(long j) {
            this.a = j;
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti04.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof k) && ((k) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.r0(this.a, 0);
        }

        public final long p() {
            return this.a;
        }

        public String toString() {
            return je.D0(je.V0("SpeechResponseReceived{position="), this.a, '}');
        }
    }

    public static final class l extends s {
        private final String a;

        l(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti03.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            return ((l) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String p() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("SpeechSessionStarted{sessionId="), this.a, '}');
        }
    }

    public static final class m extends s {
        private final long a;

        m(long j) {
            this.a = j;
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti05.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof m) && ((m) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.r0(this.a, 0);
        }

        public final long p() {
            return this.a;
        }

        public String toString() {
            return je.D0(je.V0("SpeechTranscriptReceived{position="), this.a, '}');
        }
    }

    public static final class n extends s {
        private final int a;

        n(int i) {
            this.a = i;
        }

        @Override // com.spotify.music.ads.voice.domain.s
        public final <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014) {
            return ti0.apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof n) && ((n) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.a, 0);
        }

        public final int p() {
            return this.a;
        }

        public String toString() {
            return je.A0(je.V0("TimerElapsed{timerId="), this.a, '}');
        }
    }

    s() {
    }

    public static s a() {
        return new a();
    }

    public static s b() {
        return new b();
    }

    public static s c() {
        return new c();
    }

    public static s d(EarconType earconType) {
        return new d(earconType);
    }

    public static s f() {
        return new e();
    }

    public static s g() {
        return new f();
    }

    public static s h() {
        return new g();
    }

    public static s i(long j2) {
        return new h(j2);
    }

    public static s j(IntentType intentType) {
        return new i(intentType);
    }

    public static s k(q qVar) {
        return new j(qVar);
    }

    public static s l(long j2) {
        return new k(j2);
    }

    public static s m(String str) {
        return new l(str);
    }

    public static s n(long j2) {
        return new m(j2);
    }

    public static s o(int i2) {
        return new n(i2);
    }

    public abstract <R_> R_ e(ti0<n, R_> ti0, ti0<e, R_> ti02, ti0<l, R_> ti03, ti0<k, R_> ti04, ti0<m, R_> ti05, ti0<i, R_> ti06, ti0<j, R_> ti07, ti0<b, R_> ti08, ti0<c, R_> ti09, ti0<g, R_> ti010, ti0<f, R_> ti011, ti0<h, R_> ti012, ti0<d, R_> ti013, ti0<a, R_> ti014);
}
