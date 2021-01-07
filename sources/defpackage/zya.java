package defpackage;

/* renamed from: zya  reason: default package */
public abstract class zya {

    /* renamed from: zya$a */
    public static final class a extends zya {
        a() {
        }

        @Override // defpackage.zya
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010) {
            return (R_) ((dya) ti06).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ClearHistoryClicked{}";
        }
    }

    /* renamed from: zya$b */
    public static final class b extends zya {
        b() {
        }

        @Override // defpackage.zya
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010) {
            return (R_) ((iya) ti07).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "HistoryChanged{}";
        }
    }

    /* renamed from: zya$c */
    public static final class c extends zya {
        private final com.spotify.music.connection.g a;

        c(com.spotify.music.connection.g gVar) {
            gVar.getClass();
            this.a = gVar;
        }

        @Override // defpackage.zya
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010) {
            return (R_) ((bya) ti08).apply(this);
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

        public final com.spotify.music.connection.g l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NetworkStateChanged{connectionState=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: zya$d */
    public static final class d extends zya {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.zya
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010) {
            return (R_) ((fya) ti0).apply(this);
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

        public final String l() {
            return this.a;
        }

        public String toString() {
            return je.H0(je.V0("QueryChanged{query="), this.a, '}');
        }
    }

    /* renamed from: zya$e */
    public static final class e extends zya {
        private final String a;
        private final int b;

        e(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.zya
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010) {
            return (R_) ((jya) ti05).apply(this);
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

        public int hashCode() {
            return je.b(this.b, je.Y0(this.a, 0, 31));
        }

        public final int l() {
            return this.b;
        }

        public final String m() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("RemoveHistoryItemClicked{uri=");
            V0.append(this.a);
            V0.append(", position=");
            return je.A0(V0, this.b, '}');
        }
    }

    /* renamed from: zya$f */
    public static final class f extends zya {
        private final eza a;

        f(eza eza) {
            eza.getClass();
            this.a = eza;
        }

        @Override // defpackage.zya
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010) {
            return (R_) ((lya) ti04).apply(this);
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

        public final eza l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ResultItemClicked{item=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: zya$g */
    public static final class g extends zya {
        private final dza a;

        g(dza dza) {
            dza.getClass();
            this.a = dza;
        }

        @Override // defpackage.zya
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010) {
            return (R_) ((gya) ti02).apply(this);
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

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final dza l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ResultLoaded{searchResult=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: zya$h */
    public static final class h extends zya {
        private final yya a;

        h(yya yya) {
            yya.getClass();
            this.a = yya;
        }

        @Override // defpackage.zya
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010) {
            return (R_) ((oya) ti03).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final yya l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ResultLoadingFailed{error=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: zya$i */
    public static final class i extends zya {
        private final txa a;

        i(txa txa) {
            txa.getClass();
            this.a = txa;
        }

        @Override // defpackage.zya
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010) {
            return (R_) ((cya) ti010).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            return ((i) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final txa l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SearchConfigChanged{searchConfig=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: zya$j */
    public static final class j extends zya {
        private final fza a;

        j(fza fza) {
            fza.getClass();
            this.a = fza;
        }

        @Override // defpackage.zya
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010) {
            return (R_) ((kya) ti09).apply(this);
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

        public final fza l() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UserSessionChanged{userSession=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    zya() {
    }

    public static zya a() {
        return new a();
    }

    public static zya b() {
        return new b();
    }

    public static zya d(com.spotify.music.connection.g gVar) {
        return new c(gVar);
    }

    public static zya e(String str) {
        return new d(str);
    }

    public static zya f(String str, int i2) {
        return new e(str, i2);
    }

    public static zya g(eza eza) {
        return new f(eza);
    }

    public static zya h(dza dza) {
        return new g(dza);
    }

    public static zya i(yya yya) {
        return new h(yya);
    }

    public static zya j(txa txa) {
        return new i(txa);
    }

    public static zya k(fza fza) {
        return new j(fza);
    }

    public abstract <R_> R_ c(ti0<d, R_> ti0, ti0<g, R_> ti02, ti0<h, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<a, R_> ti06, ti0<b, R_> ti07, ti0<c, R_> ti08, ti0<j, R_> ti09, ti0<i, R_> ti010);
}
