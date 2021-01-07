package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.x;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    final int[] a;
    final ArrayList<String> b;
    final int[] c;
    final int[] f;
    final int n;
    final String o;
    final int p;
    final int q;
    final CharSequence r;
    final int s;
    final CharSequence t;
    final ArrayList<String> u;
    final ArrayList<String> v;
    final boolean w;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(a aVar) {
        int size = aVar.a.size();
        this.a = new int[(size * 5)];
        if (aVar.g) {
            this.b = new ArrayList<>(size);
            this.c = new int[size];
            this.f = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                x.a aVar2 = aVar.a.get(i);
                int i3 = i2 + 1;
                this.a[i2] = aVar2.a;
                ArrayList<String> arrayList = this.b;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.n : null);
                int[] iArr = this.a;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.e;
                iArr[i6] = aVar2.f;
                this.c[i] = aVar2.g.ordinal();
                this.f[i] = aVar2.h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.n = aVar.f;
            this.o = aVar.i;
            this.p = aVar.t;
            this.q = aVar.j;
            this.r = aVar.k;
            this.s = aVar.l;
            this.t = aVar.m;
            this.u = aVar.n;
            this.v = aVar.o;
            this.w = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.f);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        TextUtils.writeToParcel(this.r, parcel, 0);
        parcel.writeInt(this.s);
        TextUtils.writeToParcel(this.t, parcel, 0);
        parcel.writeStringList(this.u);
        parcel.writeStringList(this.v);
        parcel.writeInt(this.w ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.f = parcel.createIntArray();
        this.n = parcel.readInt();
        this.o = parcel.readString();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.s = parcel.readInt();
        this.t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.u = parcel.createStringArrayList();
        this.v = parcel.createStringArrayList();
        this.w = parcel.readInt() != 0;
    }
}
