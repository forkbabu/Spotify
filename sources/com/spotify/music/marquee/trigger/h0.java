package com.spotify.music.marquee.trigger;

import com.spotify.music.features.ads.model.AdSlotEvent;

public abstract class h0 {

    public static final class a extends h0 {
        a() {
        }

        @Override // com.spotify.music.marquee.trigger.h0
        public final <R_> R_ b(ti0<g, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06, ti0<a, R_> ti07) {
            return (R_) ((t) ti07).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "AppBackgrounded{}";
        }
    }

    public static final class b extends h0 {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.marquee.trigger.h0
        public final <R_> R_ b(ti0<g, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06, ti0<a, R_> ti07) {
            return (R_) ((w) ti03).apply(this);
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

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("MarqueeAdRequestError{error="), this.a, '}');
        }
    }

    public static final class c extends h0 {
        private final AdSlotEvent a;

        c(AdSlotEvent adSlotEvent) {
            adSlotEvent.getClass();
            this.a = adSlotEvent;
        }

        @Override // com.spotify.music.marquee.trigger.h0
        public final <R_> R_ b(ti0<g, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06, ti0<a, R_> ti07) {
            return (R_) g0.c(((v) ti02).a, this);
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

        public final AdSlotEvent g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MarqueeAdRequestSucceeded{marqueeAdSlotEvent=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class d extends h0 {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.marquee.trigger.h0
        public final <R_> R_ b(ti0<g, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06, ti0<a, R_> ti07) {
            return (R_) ((s) ti06).apply(this);
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

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("MetadataLoadedFailed{error="), this.a, '}');
        }
    }

    public static final class e extends h0 {
        private final hjb a;

        e(hjb hjb) {
            hjb.getClass();
            this.a = hjb;
        }

        @Override // com.spotify.music.marquee.trigger.h0
        public final <R_> R_ b(ti0<g, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06, ti0<a, R_> ti07) {
            return (R_) g0.d(((u) ti05).a, this);
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

        public final hjb g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MetadataLoadedSucceeded{marquee=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class f extends h0 {
        private final boolean a;

        f(boolean z) {
            this.a = z;
        }

        @Override // com.spotify.music.marquee.trigger.h0
        public final <R_> R_ b(ti0<g, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06, ti0<a, R_> ti07) {
            return (R_) ((r) ti04).apply(this);
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

        public final boolean g() {
            return this.a;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("QuicksilverFormatDisplayed{isDisplayed="), this.a, '}');
        }
    }

    public static final class g extends h0 {
        private final String a;

        g(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.marquee.trigger.h0
        public final <R_> R_ b(ti0<g, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06, ti0<a, R_> ti07) {
            return (R_) g0.b(((q) ti0).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("UriChanged{viewUri="), this.a, '}');
        }
    }

    h0() {
    }

    public static h0 a() {
        return new a();
    }

    public static h0 c(String str) {
        return new d(str);
    }

    public static h0 d(hjb hjb) {
        return new e(hjb);
    }

    public static h0 e(boolean z) {
        return new f(z);
    }

    public static h0 f(String str) {
        return new g(str);
    }

    public abstract <R_> R_ b(ti0<g, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06, ti0<a, R_> ti07);
}
