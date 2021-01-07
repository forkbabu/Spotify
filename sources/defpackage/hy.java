package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hy  reason: default package */
public class hy extends l5 {
    public static final Parcelable.Creator<hy> CREATOR = new a();
    public final t1<String, Bundle> c;

    /* renamed from: hy$a */
    static class a implements Parcelable.ClassLoaderCreator<hy> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public hy createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new hy(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new hy[i];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new hy(parcel, null, null);
        }
    }

    public hy(Parcelable parcelable) {
        super(parcelable);
        this.c = new t1<>();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ExtendableSavedState{");
        V0.append(Integer.toHexString(System.identityHashCode(this)));
        V0.append(" states=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }

    @Override // defpackage.l5, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.c.i(i2);
            bundleArr[i2] = this.c.m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    hy(Parcel parcel, ClassLoader classLoader, a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.c = new t1<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.c.put(strArr[i], bundleArr[i]);
        }
    }
}
