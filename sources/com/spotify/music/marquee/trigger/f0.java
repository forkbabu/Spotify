package com.spotify.music.marquee.trigger;

import com.spotify.music.features.ads.model.AdSlotEvent;

public abstract class f0 {

    public static final class a extends f0 {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "CancelLoadMetadataRequest{}";
        }
    }

    public static final class b extends f0 {
        private final AdSlotEvent a;

        b(AdSlotEvent adSlotEvent) {
            adSlotEvent.getClass();
            this.a = adSlotEvent;
        }

        public final AdSlotEvent a() {
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
            StringBuilder V0 = je.V0("LoadAdMetadata{adSlotEvent=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class c extends f0 {
        private final String a;

        c(String str) {
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
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("LogMarqueeAdRequestError{error="), this.a, '}');
        }
    }

    public static final class d extends f0 {
        private final String a;

        d(String str) {
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
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("LogMarqueeNotDisplayed{adId="), this.a, '}');
        }
    }

    public static final class e extends f0 {
        private final hjb a;

        e(hjb hjb) {
            hjb.getClass();
            this.a = hjb;
        }

        public final hjb a() {
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
            StringBuilder V0 = je.V0("RenderMarquee{marquee=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class f extends f0 {
        private final String a;

        f(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("RequestMarqueeAd{uri="), this.a, '}');
        }
    }

    f0() {
    }
}
