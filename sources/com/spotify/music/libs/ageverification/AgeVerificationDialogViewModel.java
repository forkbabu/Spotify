package com.spotify.music.libs.ageverification;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.slate.model.u;
import kotlin.jvm.internal.h;

public final class AgeVerificationDialogViewModel implements i3d {
    public static final Parcelable.Creator CREATOR = new b();
    private final State a;
    private final String b;
    private final String c;
    private final int f;
    private final u n;
    private final u o;
    private final u p;
    private final u q;
    private final String r;
    private final boolean s;

    public enum State {
        INITIAL,
        LOADED,
        FAILED,
        RETRYING
    }

    public static final class a {
        private State a;
        private String b;
        private String c;
        private int d;
        private u e;
        private u f;
        private u g;
        private u h;
        private String i;
        private boolean j;

        public a(State state, String str, String str2, int i2, u uVar, u uVar2, u uVar3, u uVar4, String str3, boolean z) {
            h.e(state, "state");
            h.e(str, "entityURI");
            this.a = state;
            this.b = str;
            this.c = str2;
            this.d = i2;
            this.e = uVar;
            this.f = uVar2;
            this.g = uVar3;
            this.h = uVar4;
            this.i = str3;
            this.j = z;
        }

        public final a a(int i2) {
            this.d = i2;
            return this;
        }

        public final a b(u uVar) {
            this.f = uVar;
            return this;
        }

        public final AgeVerificationDialogViewModel c() {
            return new AgeVerificationDialogViewModel(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public final a d(String str) {
            this.c = str;
            return this;
        }

        public final a e(u uVar) {
            this.h = uVar;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && this.d == aVar.d && h.a(this.e, aVar.e) && h.a(this.f, aVar.f) && h.a(this.g, aVar.g) && h.a(this.h, aVar.h) && h.a(this.i, aVar.i) && this.j == aVar.j;
        }

        public final a f(String str) {
            h.e(str, "entityURI");
            this.b = str;
            return this;
        }

        public final a g(u uVar) {
            this.g = uVar;
            return this;
        }

        public final a h(String str) {
            this.i = str;
            return this;
        }

        public int hashCode() {
            State state = this.a;
            int i2 = 0;
            int hashCode = (state != null ? state.hashCode() : 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d) * 31;
            u uVar = this.e;
            int hashCode4 = (hashCode3 + (uVar != null ? uVar.hashCode() : 0)) * 31;
            u uVar2 = this.f;
            int hashCode5 = (hashCode4 + (uVar2 != null ? uVar2.hashCode() : 0)) * 31;
            u uVar3 = this.g;
            int hashCode6 = (hashCode5 + (uVar3 != null ? uVar3.hashCode() : 0)) * 31;
            u uVar4 = this.h;
            int hashCode7 = (hashCode6 + (uVar4 != null ? uVar4.hashCode() : 0)) * 31;
            String str3 = this.i;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            int i3 = (hashCode7 + i2) * 31;
            boolean z = this.j;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            return i3 + i4;
        }

        public final a i(boolean z) {
            this.j = z;
            return this;
        }

        public final a j(State state) {
            h.e(state, "state");
            this.a = state;
            return this;
        }

        public final a k(u uVar) {
            this.e = uVar;
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(state=");
            V0.append(this.a);
            V0.append(", entityURI=");
            V0.append(this.b);
            V0.append(", coverArtURI=");
            V0.append(this.c);
            V0.append(", backgroundColor=");
            V0.append(this.d);
            V0.append(", title=");
            V0.append(this.e);
            V0.append(", body=");
            V0.append(this.f);
            V0.append(", positiveActionLabel=");
            V0.append(this.g);
            V0.append(", dismissActionLabel=");
            V0.append(this.h);
            V0.append(", providerURL=");
            V0.append(this.i);
            V0.append(", showLoadingIndicator=");
            return je.P0(V0, this.j, ")");
        }

        public a() {
            this(State.INITIAL, "", null, 0, null, null, null, null, null, false);
        }
    }

    public static class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new AgeVerificationDialogViewModel((State) Enum.valueOf(State.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt(), (u) parcel.readParcelable(AgeVerificationDialogViewModel.class.getClassLoader()), (u) parcel.readParcelable(AgeVerificationDialogViewModel.class.getClassLoader()), (u) parcel.readParcelable(AgeVerificationDialogViewModel.class.getClassLoader()), (u) parcel.readParcelable(AgeVerificationDialogViewModel.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AgeVerificationDialogViewModel[i];
        }
    }

    public AgeVerificationDialogViewModel(State state, String str, String str2, int i, u uVar, u uVar2, u uVar3, u uVar4, String str3, boolean z) {
        h.e(state, "state");
        h.e(str, "entityURI");
        this.a = state;
        this.b = str;
        this.c = str2;
        this.f = i;
        this.n = uVar;
        this.o = uVar2;
        this.p = uVar3;
        this.q = uVar4;
        this.r = str3;
        this.s = z;
    }

    public final int a() {
        return this.f;
    }

    public final u b() {
        return this.o;
    }

    public final String c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeVerificationDialogViewModel)) {
            return false;
        }
        AgeVerificationDialogViewModel ageVerificationDialogViewModel = (AgeVerificationDialogViewModel) obj;
        return h.a(this.a, ageVerificationDialogViewModel.a) && h.a(this.b, ageVerificationDialogViewModel.b) && h.a(this.c, ageVerificationDialogViewModel.c) && this.f == ageVerificationDialogViewModel.f && h.a(this.n, ageVerificationDialogViewModel.n) && h.a(this.o, ageVerificationDialogViewModel.o) && h.a(this.p, ageVerificationDialogViewModel.p) && h.a(this.q, ageVerificationDialogViewModel.q) && h.a(this.r, ageVerificationDialogViewModel.r) && this.s == ageVerificationDialogViewModel.s;
    }

    public final u f() {
        return this.p;
    }

    public final String g() {
        return this.r;
    }

    public final boolean h() {
        return this.s;
    }

    @Override // java.lang.Object
    public int hashCode() {
        State state = this.a;
        int i = 0;
        int hashCode = (state != null ? state.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f) * 31;
        u uVar = this.n;
        int hashCode4 = (hashCode3 + (uVar != null ? uVar.hashCode() : 0)) * 31;
        u uVar2 = this.o;
        int hashCode5 = (hashCode4 + (uVar2 != null ? uVar2.hashCode() : 0)) * 31;
        u uVar3 = this.p;
        int hashCode6 = (hashCode5 + (uVar3 != null ? uVar3.hashCode() : 0)) * 31;
        u uVar4 = this.q;
        int hashCode7 = (hashCode6 + (uVar4 != null ? uVar4.hashCode() : 0)) * 31;
        String str3 = this.r;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z = this.s;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final State i() {
        return this.a;
    }

    public final u j() {
        return this.n;
    }

    public final a k() {
        return new a(this.a, this.b, this.c, this.f, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AgeVerificationDialogViewModel(state=");
        V0.append(this.a);
        V0.append(", entityURI=");
        V0.append(this.b);
        V0.append(", coverArtURI=");
        V0.append(this.c);
        V0.append(", backgroundColor=");
        V0.append(this.f);
        V0.append(", title=");
        V0.append(this.n);
        V0.append(", body=");
        V0.append(this.o);
        V0.append(", positiveActionLabel=");
        V0.append(this.p);
        V0.append(", dismissActionLabel=");
        V0.append(this.q);
        V0.append(", providerURL=");
        V0.append(this.r);
        V0.append(", showLoadingIndicator=");
        return je.P0(V0, this.s, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.f);
        parcel.writeParcelable(this.n, i);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.p, i);
        parcel.writeParcelable(this.q, i);
        parcel.writeString(this.r);
        parcel.writeInt(this.s ? 1 : 0);
    }
}
