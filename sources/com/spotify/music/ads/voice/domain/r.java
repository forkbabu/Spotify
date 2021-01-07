package com.spotify.music.ads.voice.domain;

public abstract class r {

    public static final class a extends r {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
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
            return je.H0(je.V0("ClearAdSlots{uri="), this.a, '}');
        }
    }

    public static final class b extends r {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ListenForAudioSignal{}";
        }
    }

    public static final class c extends r {
        private final long a;

        c(long j) {
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.r0(this.a, 0);
        }

        public String toString() {
            return je.D0(je.V0("ListenForMicrophoneDelay{delay="), this.a, '}');
        }
    }

    public static final class d extends r {
        private final u a;

        d(u uVar) {
            uVar.getClass();
            this.a = uVar;
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

        public String toString() {
            StringBuilder V0 = je.V0("NotifyForegroundReminder{voiceAdMetadata=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class e extends r {
        private final String a;

        e(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
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

        public String toString() {
            return je.H0(je.V0("PlayContextUri{uri="), this.a, '}');
        }
    }

    public static final class f extends r {
        private final EarconType a;

        f(EarconType earconType) {
            earconType.getClass();
            this.a = earconType;
        }

        public final EarconType a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof f) && ((f) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayEarcon{earconType=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class g extends r {
        private final String a;
        private final u b;
        private final String c;

        g(String str, u uVar, String str2) {
            str.getClass();
            this.a = str;
            uVar.getClass();
            this.b = uVar;
            str2.getClass();
            this.c = str2;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final u c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (!gVar.a.equals(this.a) || !gVar.b.equals(this.b) || !gVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.a, 0, 31);
            return this.c.hashCode() + ((this.b.hashCode() + Y0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PostSpeechError{sessionId=");
            V0.append(this.a);
            V0.append(", voiceAdMetadata=");
            V0.append(this.b);
            V0.append(", message=");
            return je.H0(V0, this.c, '}');
        }
    }

    public static final class h extends r {
        private final String a;
        private final u b;
        private final long c;

        h(String str, u uVar, long j) {
            str.getClass();
            this.a = str;
            uVar.getClass();
            this.b = uVar;
            this.c = j;
        }

        public final long a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final u c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (hVar.c != this.c || !hVar.a.equals(this.a) || !hVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.a, 0, 31);
            return je.r0(this.c, (this.b.hashCode() + Y0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PostSpeechReceived{sessionId=");
            V0.append(this.a);
            V0.append(", voiceAdMetadata=");
            V0.append(this.b);
            V0.append(", position=");
            return je.D0(V0, this.c, '}');
        }
    }

    public static final class i extends r {
        private final String a;
        private final u b;
        private final String c;

        i(String str, u uVar, String str2) {
            str.getClass();
            this.a = str;
            uVar.getClass();
            this.b = uVar;
            str2.getClass();
            this.c = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final u c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!iVar.a.equals(this.a) || !iVar.b.equals(this.b) || !iVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.a, 0, 31);
            return this.c.hashCode() + ((this.b.hashCode() + Y0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PostVoiceAdLog{eventType=");
            V0.append(this.a);
            V0.append(", voiceAdMetadata=");
            V0.append(this.b);
            V0.append(", sessionId=");
            return je.H0(V0, this.c, '}');
        }
    }

    public static final class j extends r {
        private final String a;
        private final u b;
        private final long c;
        private final String d;

        j(String str, u uVar, long j, String str2) {
            str.getClass();
            this.a = str;
            uVar.getClass();
            this.b = uVar;
            this.c = j;
            str2.getClass();
            this.d = str2;
        }

        public final String a() {
            return this.a;
        }

        public final long b() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public final u d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (jVar.c != this.c || !jVar.a.equals(this.a) || !jVar.b.equals(this.b) || !jVar.d.equals(this.d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.a, 0, 31);
            int hashCode = Long.valueOf(this.c).hashCode();
            return this.d.hashCode() + ((hashCode + ((this.b.hashCode() + Y0) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PostVoiceAdLogWithPosition{eventType=");
            V0.append(this.a);
            V0.append(", voiceAdMetadata=");
            V0.append(this.b);
            V0.append(", position=");
            V0.append(this.c);
            V0.append(", sessionId=");
            return je.H0(V0, this.d, '}');
        }
    }

    public static final class k extends r {
        private final u a;

        k(u uVar) {
            uVar.getClass();
            this.a = uVar;
        }

        public final u a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            return ((k) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SaveAd{voiceAdMetadata=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class l extends r {
        l() {
        }

        public boolean equals(Object obj) {
            return obj instanceof l;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SkipToNextTrack{}";
        }
    }

    public static final class m extends r {
        private final SpeechRecognitionCommandType a;
        private final long b;
        private final String c;

        m(SpeechRecognitionCommandType speechRecognitionCommandType, long j, String str) {
            speechRecognitionCommandType.getClass();
            this.a = speechRecognitionCommandType;
            this.b = j;
            str.getClass();
            this.c = str;
        }

        public final SpeechRecognitionCommandType a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (mVar.a == this.a && mVar.b == this.b && mVar.c.equals(this.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Long.valueOf(this.b).hashCode();
            return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("SpeechRecognitionCommand{command=");
            V0.append(this.a);
            V0.append(", microphoneListeningPeriod=");
            V0.append(this.b);
            V0.append(", intents=");
            return je.H0(V0, this.c, '}');
        }
    }

    public static final class n extends r {
        private final long a;
        private final int b;

        n(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public final long a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (nVar.a == this.a && nVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.b(this.b, (Long.valueOf(this.a).hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("StartDelayTimer{delay=");
            V0.append(this.a);
            V0.append(", timerId=");
            return je.A0(V0, this.b, '}');
        }
    }

    r() {
    }
}
