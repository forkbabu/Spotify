package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: co  reason: default package */
public final class co implements Parcelable {
    public static final Parcelable.Creator<co> CREATOR = new a();
    private final int a;

    /* renamed from: co$a */
    static class a implements Parcelable.Creator<co> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public co createFromParcel(Parcel parcel) {
            return new co(parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public co[] newArray(int i) {
            return new co[i];
        }
    }

    public co(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(android.content.Context r9) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.a(android.content.Context):int");
    }

    public boolean b() {
        return (this.a & 8) != 0;
    }

    public boolean c() {
        return (this.a & 4) != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return (this.a & 1) != 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && co.class == obj.getClass() && this.a == ((co) obj).a) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
