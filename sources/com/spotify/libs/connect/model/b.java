package com.spotify.libs.connect.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class b implements Parcelable {
    public static final a CREATOR = new a(null);
    private final String a;
    private final List<d> b;

    public static final class a implements Parcelable.Creator<b> {
        public a(f fVar) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            h.e(parcel, "parcel");
            return new b(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(String str, List<d> list) {
        h.e(str, "joinToken");
        h.e(list, "participants");
        this.a = str;
        this.b = list;
    }

    public final String a() {
        return this.a;
    }

    public final List<d> b() {
        return this.b;
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<d> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FrictionlessJoinData(joinToken=");
        V0.append(this.a);
        V0.append(", participants=");
        return je.L0(V0, this.b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeTypedList(this.b);
    }

    public b(Parcel parcel) {
        h.e(parcel, "parcel");
        String readString = parcel.readString();
        h.c(readString);
        h.d(readString, "parcel.readString()!!");
        ArrayList createTypedArrayList = parcel.createTypedArrayList(d.CREATOR);
        h.c(createTypedArrayList);
        h.d(createTypedArrayList, "parcel.createTypedArrayList(Participant.CREATOR)!!");
        h.e(readString, "joinToken");
        h.e(createTypedArrayList, "participants");
        this.a = readString;
        this.b = createTypedArrayList;
    }
}
