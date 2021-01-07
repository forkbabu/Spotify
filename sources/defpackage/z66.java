package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

/* renamed from: z66  reason: default package */
public final class z66 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new b();
    private final String a;
    private final ane b;

    /* renamed from: z66$a */
    public static final class a {
        private String a;
        private ane b;

        public a() {
            this(null, null, 3);
        }

        public a(String str, ane ane) {
            this.a = str;
            this.b = ane;
        }

        public final z66 a() {
            return new z66(this.a, this.b);
        }

        public final a b(ane ane) {
            this.b = ane;
            return this;
        }

        public final a c(String str) {
            this.a = str;
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            ane ane = this.b;
            if (ane != null) {
                i = ane.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(textFilter=");
            V0.append(this.a);
            V0.append(", sortOrder=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }

        public a(String str, ane ane, int i) {
            int i2 = i & 1;
            int i3 = i & 2;
            this.a = null;
            this.b = null;
        }
    }

    /* renamed from: z66$b */
    public static class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new z66(parcel.readString(), (ane) parcel.readParcelable(z66.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new z66[i];
        }
    }

    public z66() {
        this(null, null, 3);
    }

    public z66(String str, ane ane) {
        this.a = str;
        this.b = ane;
    }

    public final ane a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final a c() {
        return new a(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z66)) {
            return false;
        }
        z66 z66 = (z66) obj;
        return h.a(this.a, z66.a) && h.a(this.b, z66.b);
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ane ane = this.b;
        if (ane != null) {
            i = ane.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FilterAndSort(textFilter=");
        V0.append(this.a);
        V0.append(", sortOrder=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z66(String str, ane ane, int i) {
        this(null, null);
        int i2 = i & 1;
        int i3 = i & 2;
    }
}
