package com.spotify.music.features.quicksilver.v2.mobius;

import com.spotify.inappmessaging.TriggerType;

public abstract class h {

    public static final class a extends h {
        private final boolean a;

        a(boolean z) {
            this.a = z;
        }

        @Override // com.spotify.music.features.quicksilver.v2.mobius.h
        public final <R_> R_ d(ti0<e, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04, ti0<d, R_> ti05) {
            return (R_) ((e) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof a) && ((a) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public final boolean g() {
            return this.a;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("AdsStateChanged{isPlayingAd="), this.a, '}');
        }
    }

    public static final class b extends h {
        private final boolean a;

        b(boolean z) {
            this.a = z;
        }

        @Override // com.spotify.music.features.quicksilver.v2.mobius.h
        public final <R_> R_ d(ti0<e, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04, ti0<d, R_> ti05) {
            return (R_) ((f) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof b) && ((b) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public final boolean g() {
            return this.a;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("BackgroundStateChanged{appInBackground="), this.a, '}');
        }
    }

    public static final class c extends h {
        private final boolean a;

        c(boolean z) {
            this.a = z;
        }

        @Override // com.spotify.music.features.quicksilver.v2.mobius.h
        public final <R_> R_ d(ti0<e, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04, ti0<d, R_> ti05) {
            return (R_) ((b) ti04).apply(this);
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

        public final boolean g() {
            return this.a;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("DistractionControlStateChanged{distractionControlEnabled="), this.a, '}');
        }
    }

    public static final class d extends h {
        private final i a;

        d(i iVar) {
            iVar.getClass();
            this.a = iVar;
        }

        @Override // com.spotify.music.features.quicksilver.v2.mobius.h
        public final <R_> R_ d(ti0<e, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04, ti0<d, R_> ti05) {
            return (R_) ((c) ti05).apply(this);
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

        public final i g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MessagePresentationStateChanged{presentationState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class e extends h {
        private final String a;
        private final TriggerType b;

        e(String str, TriggerType triggerType) {
            str.getClass();
            this.a = str;
            triggerType.getClass();
            this.b = triggerType;
        }

        @Override // com.spotify.music.features.quicksilver.v2.mobius.h
        public final <R_> R_ d(ti0<e, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04, ti0<d, R_> ti05) {
            return (R_) ((d) ti0).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (eVar.b != this.b || !eVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public final String g() {
            return this.a;
        }

        public final TriggerType h() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("TriggerEvent{pattern=");
            V0.append(this.a);
            V0.append(", type=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    h() {
    }

    public static h a(boolean z) {
        return new a(z);
    }

    public static h b(boolean z) {
        return new b(z);
    }

    public static h c(boolean z) {
        return new c(z);
    }

    public static h e(i iVar) {
        return new d(iVar);
    }

    public static h f(String str, TriggerType triggerType) {
        return new e(str, triggerType);
    }

    public abstract <R_> R_ d(ti0<e, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04, ti0<d, R_> ti05);
}
