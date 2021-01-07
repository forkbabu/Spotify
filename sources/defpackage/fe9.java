package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.assistedcuration.model.RecsTrack;

/* renamed from: fe9  reason: default package */
public abstract class fe9 {

    /* renamed from: fe9$a */
    public static final class a extends fe9 {
        private final ImmutableList<RecsTrack> a;
        private final String b;

        a(ImmutableList<RecsTrack> immutableList, String str) {
            immutableList.getClass();
            this.a = immutableList;
            str.getClass();
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final ImmutableList<RecsTrack> b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a.equals(this.a) || !aVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("DecorateRecs{recsTracks=");
            V0.append(this.a);
            V0.append(", contextUri=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: fe9$b */
    public static final class b extends fe9 {
        private final int a;
        private final ImmutableList<String> b;
        private final ImmutableList<String> c;

        b(int i, ImmutableList<String> immutableList, ImmutableList<String> immutableList2) {
            this.a = i;
            immutableList.getClass();
            this.b = immutableList;
            immutableList2.getClass();
            this.c = immutableList2;
        }

        public final int a() {
            return this.a;
        }

        public final ImmutableList<String> b() {
            return this.c;
        }

        public final ImmutableList<String> c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.a != this.a || !bVar.b.equals(this.b) || !bVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int K = je.K(this.a, 0, 31);
            return this.c.hashCode() + ((this.b.hashCode() + K) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("RequestRecs{count=");
            V0.append(this.a);
            V0.append(", trackUris=");
            V0.append(this.b);
            V0.append(", skipUris=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    fe9() {
    }
}
