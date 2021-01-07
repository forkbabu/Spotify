package com.spotify.mobile.android.quotesharing;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0183a();
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final Map<String, String> n;

    /* renamed from: com.spotify.mobile.android.quotesharing.a$a  reason: collision with other inner class name */
    public static class C0183a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (readInt != 0) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                readInt--;
            }
            return new a(readString, readString2, readString3, readString4, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(String str, String str2, String str3, String str4, Map<String, String> map) {
        h.e(str, "shareUri");
        h.e(str2, "imageUri");
        h.e(str3, "message");
        h.e(str4, "loggingUri");
        h.e(map, "queryParams");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = map;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.c;
    }

    public final Map<String, String> c() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.f, aVar.f) && h.a(this.n, aVar.n);
    }

    public final String getImageUri() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Map<String, String> map = this.n;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("QuoteCardShareData(shareUri=");
        V0.append(this.a);
        V0.append(", imageUri=");
        V0.append(this.b);
        V0.append(", message=");
        V0.append(this.c);
        V0.append(", loggingUri=");
        V0.append(this.f);
        V0.append(", queryParams=");
        return je.M0(V0, this.n, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        Map<String, String> map = this.n;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }
}
