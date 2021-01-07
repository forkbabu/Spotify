package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class f {

    static class a<T> implements Parcelable.ClassLoaderCreator<T> {
        private final g<T> a;

        a(g<T> gVar) {
            this.a = gVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.a.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.a.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(g<T> gVar) {
        return new a(gVar);
    }
}
