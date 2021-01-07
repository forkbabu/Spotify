package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: wy1  reason: default package */
public abstract class wy1 implements Parcelable {

    /* renamed from: wy1$a */
    public static final class a extends wy1 {
        public static final Parcelable.Creator CREATOR = new C0693a();
        public static final a a = new a();

        /* renamed from: wy1$a$a  reason: collision with other inner class name */
        public static class C0693a implements Parcelable.Creator {
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

    /* renamed from: wy1$b */
    public static final class b extends wy1 {
        public static final Parcelable.Creator CREATOR = new a();
        public static final b a = new b();

        /* renamed from: wy1$b$a */
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

    /* renamed from: wy1$c */
    public static final class c extends wy1 {
        public static final Parcelable.Creator CREATOR = new a();
        public static final c a = new c();

        /* renamed from: wy1$c$a */
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

    private wy1() {
    }

    public wy1(f fVar) {
    }
}
