package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import defpackage.f61;
import defpackage.h61;
import defpackage.q51;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: b61  reason: default package */
public class b61 {
    private final i61 a;
    private final h61 b;
    private final i61 c;
    private final h61 d;
    private final q61 e;
    private final h61 f;
    private final e61 g;
    private final Set<c61> h;
    private b91 i;
    private final x51<b91, u61> j = new a();

    /* access modifiers changed from: package-private */
    /* renamed from: b61$a */
    public class a extends x51<b91, u61> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.x51
        public u61 a() {
            return u61.b(b61.this.i, b61.this.a.Y().a(), b61.this.c.Y().a(), b61.this.e.d().a());
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.x51
        public b91 b() {
            return b61.this.i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b61$b */
    public static class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final Parcelable a;
        public final Parcelable b;
        public final Parcelable c;
        public final Parcelable f;

        /* renamed from: b61$b$a */
        static class a implements Parcelable.Creator<b> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readParcelable(b61.class.getClassLoader()), parcel.readParcelable(b61.class.getClassLoader()), parcel.readParcelable(b61.class.getClassLoader()), parcel.readParcelable(b61.class.getClassLoader()), null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        b(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, Parcelable parcelable4, a aVar) {
            this.a = parcelable;
            this.b = parcelable2;
            this.c = parcelable3;
            this.f = parcelable4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.f, i);
        }
    }

    public b61(w51 w51, e61 e61) {
        i61 i61 = new i61(w51);
        i61 i612 = new i61(w51);
        q61 q61 = new q61(w51);
        e61.getClass();
        this.g = e61;
        this.a = i61;
        this.b = h61.a.a(i61);
        this.c = i612;
        this.d = h61.a.a(i612);
        this.e = q61;
        this.f = h61.a.b(q61);
        this.h = new HashSet();
        e61.i(i612);
        e61.k(q61);
        this.i = HubsImmutableViewModel.EMPTY;
    }

    public h61 e() {
        return this.b;
    }

    public x51<b91, u61> f() {
        return this.j;
    }

    public h61 g() {
        return this.f;
    }

    public h61 h() {
        return this.d;
    }

    public void i(Parcelable parcelable) {
        if (parcelable instanceof b) {
            b bVar = (b) parcelable;
            this.g.f(bVar.a);
            this.a.Z(bVar.b);
            this.c.Z(bVar.c);
            this.e.g(bVar.f);
        }
    }

    public Parcelable j() {
        return new b(this.g.e(), this.a.b0(), this.c.b0(), this.e.h(), null);
    }

    public void k(b91 b91) {
        f61.b bVar = new f61.b(b91);
        bVar.b(false);
        l(bVar.a());
    }

    public void l(f61 f61) {
        b91 a2 = f61.a();
        q51 c2 = f61.c();
        boolean b2 = f61.b();
        if (!a2.body().isEmpty() && !this.g.w()) {
            this.g.C(this.a);
        }
        q51.a a3 = c2.a(this.a, a2.body());
        this.i = a2;
        this.e.j(a2.header());
        this.c.c0(a2.overlays());
        this.g.s(a2);
        a3.a();
        this.c.z();
        this.e.f();
        Iterator<c61> it = this.h.iterator();
        while (it.hasNext()) {
            if (it.next().a(a2)) {
                it.remove();
            }
        }
        if (b2) {
            if (this.g.w()) {
                this.g.n(0);
            }
            this.g.h(0);
        }
    }
}
