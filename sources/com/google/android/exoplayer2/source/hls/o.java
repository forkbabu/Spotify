package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.d0;
import defpackage.um;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class o implements um.b {
    public static final Parcelable.Creator<o> CREATOR = new a();
    public final String a;
    public final String b;
    public final List<b> c;

    static class a implements Parcelable.Creator<o> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public o[] newArray(int i) {
            return new o[i];
        }
    }

    public o(String str, String str2, List<b> list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // defpackage.um.b
    public /* synthetic */ d0 O() {
        return vm.b(this);
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
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (!TextUtils.equals(this.a, oVar.a) || !TextUtils.equals(this.b, oVar.b) || !this.c.equals(oVar.c)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.um.b
    public /* synthetic */ byte[] f2() {
        return vm.a(this);
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }

    @Override // java.lang.Object
    public String toString() {
        String str;
        StringBuilder V0 = je.V0("HlsTrackMetadataEntry");
        if (this.a != null) {
            StringBuilder V02 = je.V0(" [");
            V02.append(this.a);
            V02.append(", ");
            str = je.I0(V02, this.b, "]");
        } else {
            str = "";
        }
        V0.append(str);
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        int size = this.c.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.c.get(i2), 0);
        }
    }

    o(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(parcel.readParcelable(b.class.getClassLoader()));
        }
        this.c = Collections.unmodifiableList(arrayList);
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final long a;
        public final String b;
        public final String c;
        public final String f;
        public final String n;

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

        public b(long j, String str, String str2, String str3, String str4) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.f = str3;
            this.n = str4;
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
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a || !TextUtils.equals(this.b, bVar.b) || !TextUtils.equals(this.c, bVar.c) || !TextUtils.equals(this.f, bVar.f) || !TextUtils.equals(this.n, bVar.n)) {
                return false;
            }
            return true;
        }

        @Override // java.lang.Object
        public int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.n;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.f);
            parcel.writeString(this.n);
        }

        b(Parcel parcel) {
            this.a = parcel.readLong();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.f = parcel.readString();
            this.n = parcel.readString();
        }
    }
}
