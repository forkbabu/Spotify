package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class l implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();
    private final b[] a;
    private int b;
    public final String c;
    public final int f;

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public l[] newArray(int i) {
            return new l[i];
        }
    }

    public l(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public static l b(l lVar, l lVar2) {
        String str;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (lVar != null) {
            str = lVar.c;
            b[] bVarArr = lVar.a;
            for (b bVar : bVarArr) {
                if (bVar.n != null) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (lVar2 != null) {
            if (str == null) {
                str = lVar2.c;
            }
            int size = arrayList.size();
            b[] bVarArr2 = lVar2.a;
            for (b bVar2 : bVarArr2) {
                if (bVar2.n != null) {
                    UUID uuid = bVar2.b;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = false;
                            break;
                        } else if (((b) arrayList.get(i)).b.equals(uuid)) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        arrayList.add(bVar2);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new l(str, false, (b[]) arrayList.toArray(new b[0]));
    }

    public l a(String str) {
        if (f0.a(this.c, str)) {
            return this;
        }
        return new l(str, false, this.a);
    }

    public b c(int i) {
        return this.a[i];
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = u.a;
        if (uuid.equals(bVar3.b)) {
            return uuid.equals(bVar4.b) ? 0 : 1;
        }
        return bVar3.b.compareTo(bVar4.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public l e(l lVar) {
        String str;
        String str2 = this.c;
        g.m(str2 == null || (str = lVar.c) == null || TextUtils.equals(str2, str));
        String str3 = this.c;
        if (str3 == null) {
            str3 = lVar.c;
        }
        b[] bVarArr = this.a;
        b[] bVarArr2 = lVar.a;
        int i = f0.a;
        Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length + bVarArr2.length);
        System.arraycopy(bVarArr2, 0, copyOf, bVarArr.length, bVarArr2.length);
        return new l(str3, true, (b[]) copyOf);
    }

    @Override // java.util.Comparator, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (!f0.a(this.c, lVar.c) || !Arrays.equals(this.a, lVar.a)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public l(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public l(b... bVarArr) {
        this(null, true, bVarArr);
    }

    private l(String str, boolean z, b... bVarArr) {
        this.c = str;
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        this.a = bVarArr;
        this.f = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        private int a;
        private final UUID b;
        public final String c;
        public final String f;
        public final byte[] n;

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

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.b = uuid;
            this.c = str;
            str2.getClass();
            this.f = str2;
            this.n = bArr;
        }

        public b b(byte[] bArr) {
            return new b(this.b, this.c, this.f, bArr);
        }

        public boolean c(UUID uuid) {
            return u.a.equals(this.b) || uuid.equals(this.b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            if (!f0.a(this.c, bVar.c) || !f0.a(this.f, bVar.f) || !f0.a(this.b, bVar.b) || !Arrays.equals(this.n, bVar.n)) {
                return false;
            }
            return true;
        }

        @Override // java.lang.Object
        public int hashCode() {
            if (this.a == 0) {
                int hashCode = this.b.hashCode() * 31;
                String str = this.c;
                this.a = Arrays.hashCode(this.n) + je.Y0(this.f, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b.getMostSignificantBits());
            parcel.writeLong(this.b.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeString(this.f);
            parcel.writeByteArray(this.n);
        }

        b(Parcel parcel) {
            this.b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            String readString = parcel.readString();
            int i = f0.a;
            this.f = readString;
            this.n = parcel.createByteArray();
        }
    }

    l(Parcel parcel) {
        this.c = parcel.readString();
        Object[] createTypedArray = parcel.createTypedArray(b.CREATOR);
        int i = f0.a;
        b[] bVarArr = (b[]) createTypedArray;
        this.a = bVarArr;
        this.f = bVarArr.length;
    }
}
