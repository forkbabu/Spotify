package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l5  reason: default package */
public abstract class l5 implements Parcelable {
    public static final Parcelable.Creator<l5> CREATOR = new b();
    public static final l5 b = new a();
    private final Parcelable a;

    /* renamed from: l5$a */
    class a extends l5 {
        a() {
            super((a) null);
        }
    }

    l5(a aVar) {
        this.a = null;
    }

    public final Parcelable a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    /* renamed from: l5$b */
    class b implements Parcelable.ClassLoaderCreator<l5> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return l5.b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new l5[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public l5 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return l5.b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    protected l5(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected l5(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.a = readParcelable == null ? b : readParcelable;
    }
}
