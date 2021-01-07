package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;
import java.util.Arrays;
import java.util.List;

/* renamed from: um  reason: default package */
public final class um implements Parcelable {
    public static final Parcelable.Creator<um> CREATOR = new a();
    private final b[] a;

    /* renamed from: um$a */
    static class a implements Parcelable.Creator<um> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public um createFromParcel(Parcel parcel) {
            return new um(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public um[] newArray(int i) {
            return new um[i];
        }
    }

    /* renamed from: um$b */
    public interface b extends Parcelable {
        d0 O();

        byte[] f2();
    }

    public um(b... bVarArr) {
        this.a = bVarArr;
    }

    public um a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        b[] bVarArr2 = this.a;
        int i = f0.a;
        Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
        return new um((b[]) copyOf);
    }

    public um b(um umVar) {
        return umVar == null ? this : a(umVar.a);
    }

    public b c(int i) {
        return this.a[i];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.a.length;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || um.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((um) obj).a);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("entries=");
        V0.append(Arrays.toString(this.a));
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (b bVar : this.a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public um(List<? extends b> list) {
        b[] bVarArr = new b[list.size()];
        this.a = bVarArr;
        list.toArray(bVarArr);
    }

    um(Parcel parcel) {
        this.a = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.a;
            if (i < bVarArr.length) {
                bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
