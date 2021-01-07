package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.viewbinder.s;
import com.spotify.music.features.playlistentity.viewbinder.t;
import com.spotify.music.features.playlistentity.viewbinder.u;
import com.spotify.music.features.playlistentity.viewbinder.v;
import com.spotify.music.features.playlistentity.viewbinder.w;
import com.spotify.pageloader.l0;
import defpackage.zo6;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: as6  reason: default package */
public abstract class as6 {

    /* renamed from: as6$a */
    public static final class a extends as6 {
        private final String a;
        private final LicenseLayout b;
        private final zo6.b c;
        private final String d;
        private final String e;
        private final boolean f;
        private final Map<String, String> g;
        private final String h;
        private final List<String> i;
        private final String j;

        a(String str, LicenseLayout licenseLayout, zo6.b bVar, String str2, String str3, boolean z, Map<String, String> map, String str4, List<String> list, String str5) {
            str.getClass();
            this.a = str;
            licenseLayout.getClass();
            this.b = licenseLayout;
            bVar.getClass();
            this.c = bVar;
            str2.getClass();
            this.d = str2;
            str3.getClass();
            this.e = str3;
            this.f = z;
            map.getClass();
            this.g = map;
            str4.getClass();
            this.h = str4;
            list.getClass();
            this.i = list;
            str5.getClass();
            this.j = str5;
        }

        @Override // defpackage.as6
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<d, R_> ti03, ti0<b, R_> ti04, ti0<e, R_> ti05) {
            v vVar = (v) ti0;
            return (R_) vVar.a.k(vVar.b, this);
        }

        public final String b() {
            return this.j;
        }

        public final List<String> c() {
            return this.i;
        }

        public final zo6.b d() {
            return this.c;
        }

        public final LicenseLayout e() {
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
            if (aVar.b != this.b || aVar.f != this.f || !aVar.a.equals(this.a) || !aVar.c.equals(this.c) || !aVar.d.equals(this.d) || !aVar.e.equals(this.e) || !aVar.g.equals(this.g) || !aVar.h.equals(this.h) || !aVar.i.equals(this.i) || !aVar.j.equals(this.j)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.h;
        }

        public final String g() {
            return this.a;
        }

        public final boolean h() {
            return this.f;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.a, 0, 31);
            int hashCode = this.c.hashCode();
            int Y02 = je.Y0(this.e, je.Y0(this.d, (hashCode + ((this.b.hashCode() + Y0) * 31)) * 31, 31), 31);
            int hashCode2 = this.g.hashCode();
            int Y03 = je.Y0(this.h, (hashCode2 + ((Boolean.valueOf(this.f).hashCode() + Y02) * 31)) * 31, 31);
            return this.j.hashCode() + ((this.i.hashCode() + Y03) * 31);
        }

        public final Map<String, String> i() {
            return this.g;
        }

        public final String j() {
            return this.d;
        }

        public final String k() {
            return this.e;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ContinueLoading{playlistUri=");
            V0.append(this.a);
            V0.append(", licenseLayout=");
            V0.append(this.b);
            V0.append(", conditions=");
            V0.append(this.c);
            V0.append(", rawFormatListType=");
            V0.append(this.d);
            V0.append(", requestId=");
            V0.append(this.e);
            V0.append(", preferLinearPlayback=");
            V0.append(this.f);
            V0.append(", productStateMap=");
            V0.append(this.g);
            V0.append(", playlistName=");
            V0.append(this.h);
            V0.append(", allModesSimpleClassNames=");
            V0.append(this.i);
            V0.append(", activeModeSimpleClassName=");
            return je.H0(V0, this.j, '}');
        }
    }

    /* renamed from: as6$b */
    public static final class b extends as6 {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.as6
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<d, R_> ti03, ti0<b, R_> ti04, ti0<e, R_> ti05) {
            return (R_) z.z(l0.a(((u) ti04).a));
        }

        public final String b() {
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
            return je.H0(je.V0("Forbidden{playlistUri="), this.a, '}');
        }
    }

    /* renamed from: as6$c */
    public static final class c extends as6 {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.as6
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<d, R_> ti03, ti0<b, R_> ti04, ti0<e, R_> ti05) {
            return (R_) z.z(l0.a(((w) ti02).a));
        }

        public final String b() {
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
            return je.H0(je.V0("LookupFailed{inputUri="), this.a, '}');
        }
    }

    /* renamed from: as6$d */
    public static final class d extends as6 {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.as6
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<d, R_> ti03, ti0<b, R_> ti04, ti0<e, R_> ti05) {
            return (R_) z.z(l0.a(((t) ti03).a));
        }

        public final String b() {
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
            return je.H0(je.V0("NotFound{playlistUri="), this.a, '}');
        }
    }

    /* renamed from: as6$e */
    public static final class e extends as6 {
        private final String a;
        private final com.spotify.music.features.playlistallsongs.c b;

        e(String str, com.spotify.music.features.playlistallsongs.c cVar) {
            str.getClass();
            this.a = str;
            cVar.getClass();
            this.b = cVar;
        }

        @Override // defpackage.as6
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<d, R_> ti03, ti0<b, R_> ti04, ti0<e, R_> ti05) {
            return (R_) ((s) ti05).a.l(this);
        }

        public final com.spotify.music.features.playlistallsongs.c b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!eVar.a.equals(this.a) || !eVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("OpenAllSongs{uri=");
            V0.append(this.a);
            V0.append(", configuration=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    as6() {
    }

    public abstract <R_> R_ a(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<d, R_> ti03, ti0<b, R_> ti04, ti0<e, R_> ti05);
}
