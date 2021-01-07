package defpackage;

import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;

/* renamed from: ve6  reason: default package */
public abstract class ve6 {

    /* renamed from: ve6$a */
    public static final class a extends ve6 {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NeedsTasteOnboarding{}";
        }
    }

    /* renamed from: ve6$b */
    public static final class b extends ve6 {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NoTracks{}";
        }
    }

    /* renamed from: ve6$c */
    public static final class c extends ve6 {
        c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NoTracksOptedOut{}";
        }
    }

    /* renamed from: ve6$d */
    public static final class d extends ve6 {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OptedOutNeedsTasteOnboarding{}";
        }
    }

    /* renamed from: ve6$e */
    public static final class e extends ve6 {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TrackList{}";
        }
    }

    /* renamed from: ve6$f */
    public static final class f extends ve6 {
        private final HomeMixPlanType a;

        f(HomeMixPlanType homeMixPlanType) {
            homeMixPlanType.getClass();
            this.a = homeMixPlanType;
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
            StringBuilder V0 = je.V0("TrackListOptedOut{planType=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: ve6$g */
    public static final class g extends ve6 {
        g() {
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TrackListOthersNoListeningHistory{}";
        }
    }

    /* renamed from: ve6$h */
    public static final class h extends ve6 {
        h() {
        }

        public boolean equals(Object obj) {
            return obj instanceof h;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TrackListOthersOptedOut{}";
        }
    }

    /* renamed from: ve6$i */
    public static final class i extends ve6 {
        i() {
        }

        public boolean equals(Object obj) {
            return obj instanceof i;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TrackListWelcome{}";
        }
    }

    ve6() {
    }
}
