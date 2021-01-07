package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;
import defpackage.um;

/* renamed from: gn  reason: default package */
public final class gn implements um.b {
    public static final Parcelable.Creator<gn> CREATOR = new a();
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: gn$a */
    static class a implements Parcelable.Creator<gn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public gn createFromParcel(Parcel parcel) {
            return new gn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public gn[] newArray(int i) {
            return new gn[i];
        }
    }

    public gn(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
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
        if (obj == null || gn.class != obj.getClass()) {
            return false;
        }
        return f0.a(this.a, ((gn) obj).a);
    }

    @Override // defpackage.um.b
    public /* synthetic */ byte[] f2() {
        return vm.a(this);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata=\"%s\"", this.b, this.c, this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    gn(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
