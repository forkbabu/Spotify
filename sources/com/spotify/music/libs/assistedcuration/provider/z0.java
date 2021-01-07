package com.spotify.music.libs.assistedcuration.provider;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.e;
import java.util.List;

/* access modifiers changed from: package-private */
public class z0 extends x<z0> {
    public static final Parcelable.Creator<z0> CREATOR = new a();
    private final String o;
    private final String p;

    static class a implements Parcelable.Creator<z0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public z0 createFromParcel(Parcel parcel) {
            return new z0(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public z0[] newArray(int i) {
            return new z0[i];
        }
    }

    z0(String str, String str2, List<e> list, b bVar) {
        super(list, bVar);
        this.o = str;
        this.p = str2;
    }

    /* access modifiers changed from: package-private */
    public String getUri() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public String k() {
        return this.p;
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.x, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
    }

    z0(Parcel parcel, a aVar) {
        super(parcel);
        String readString = parcel.readString();
        String str = "";
        this.o = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.p = readString2 != null ? readString2 : str;
    }
}
