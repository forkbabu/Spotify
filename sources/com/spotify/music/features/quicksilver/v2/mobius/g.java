package com.spotify.music.features.quicksilver.v2.mobius;

import com.spotify.inappmessaging.TriggerType;

public abstract class g {

    public static final class a extends g {
        private final String a;
        private final TriggerType b;

        a(String str, TriggerType triggerType) {
            str.getClass();
            this.a = str;
            triggerType.getClass();
            this.b = triggerType;
        }

        public final String a() {
            return this.a;
        }

        public final TriggerType b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.b != this.b || !aVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("RequestMessage{pattern=");
            V0.append(this.a);
            V0.append(", type=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    g() {
    }
}
