package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: px1  reason: default package */
public abstract class px1 implements Parcelable {

    /* renamed from: px1$a */
    public static final class a extends px1 {
        public static final Parcelable.Creator CREATOR = new C0669a();
        public static final a a = new a();

        /* renamed from: px1$a$a  reason: collision with other inner class name */
        public static class C0669a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                if (parcel.readInt() != 0) {
                    return a.a;
                }
                return null;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new a[i];
            }
        }

        private a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            parcel.writeInt(1);
        }
    }

    /* renamed from: px1$b */
    public static final class b extends px1 {
        public static final Parcelable.Creator CREATOR = new a();
        public static final b a = new b();

        /* renamed from: px1$b$a */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                if (parcel.readInt() != 0) {
                    return b.a;
                }
                return null;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new b[i];
            }
        }

        private b() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            parcel.writeInt(1);
        }
    }

    /* renamed from: px1$c */
    public static final class c extends px1 {
        public static final Parcelable.Creator CREATOR = new a();
        public static final c a = new c();

        /* renamed from: px1$c$a */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                if (parcel.readInt() != 0) {
                    return c.a;
                }
                return null;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new c[i];
            }
        }

        private c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            parcel.writeInt(1);
        }
    }

    /* renamed from: px1$d */
    public static final class d extends px1 {
        public static final Parcelable.Creator CREATOR = new a();
        private final int a;

        /* renamed from: px1$d$a */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                return new d(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new d[i];
            }
        }

        public d(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && this.a == ((d) obj).a;
            }
            return true;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return this.a;
        }

        @Override // java.lang.Object
        public String toString() {
            return je.B0(je.V0("Success(storiesCount="), this.a, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            parcel.writeInt(this.a);
        }
    }

    private px1() {
    }

    public px1(f fVar) {
    }
}
