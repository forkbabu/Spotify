package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import com.spotify.music.follow.j;
import com.spotify.music.newplaying.scroll.widgets.storylines.f;
import com.spotify.music.newplaying.scroll.widgets.storylines.i;
import com.spotify.music.newplaying.scroll.widgets.storylines.l;

/* renamed from: cob  reason: default package */
public abstract class cob {

    /* renamed from: cob$a */
    public static final class a extends cob {
        private final Throwable a;

        a(Throwable th) {
            th.getClass();
            this.a = th;
        }

        @Override // defpackage.cob
        public final void d(si0<c> si0, si0<b> si02, si0<a> si03) {
            ((f) si03).a.c(this);
        }

        public final Throwable e() {
            return this.a;
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
            return je.K0(je.V0("Error{throwable="), this.a, '}');
        }
    }

    /* renamed from: cob$b */
    public static final class b extends cob {
        private final StorylinesCardContent a;
        private final Optional<j> b;
        private final Optional<String> c;

        b(StorylinesCardContent storylinesCardContent, Optional<j> optional, Optional<String> optional2) {
            storylinesCardContent.getClass();
            this.a = storylinesCardContent;
            optional.getClass();
            this.b = optional;
            optional2.getClass();
            this.c = optional2;
        }

        @Override // defpackage.cob
        public final void d(si0<c> si0, si0<b> si02, si0<a> si03) {
            ((l) si02).a.b(this);
        }

        public final Optional<j> e() {
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
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b) || !bVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public final Optional<String> f() {
            return this.c;
        }

        public final StorylinesCardContent g() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 0) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Loaded{storylinesCardContent=");
            V0.append(this.a);
            V0.append(", followData=");
            V0.append(this.b);
            V0.append(", playbackId=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: cob$c */
    public static final class c extends cob {
        c() {
        }

        @Override // defpackage.cob
        public final void d(si0<c> si0, si0<b> si02, si0<a> si03) {
            ((i) si0).a.a(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Loading{}";
        }
    }

    cob() {
    }

    public static cob a(Throwable th) {
        return new a(th);
    }

    public static cob b(StorylinesCardContent storylinesCardContent, Optional<j> optional, Optional<String> optional2) {
        return new b(storylinesCardContent, optional, optional2);
    }

    public static cob c() {
        return new c();
    }

    public abstract void d(si0<c> si0, si0<b> si02, si0<a> si03);
}
