package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();
    public final String a;
    public final String b;
    public final Uri c;
    public final List<x> f;
    public final String n;
    public final byte[] o;

    public static class UnsupportedRequestException extends IOException {
    }

    static class a implements Parcelable.Creator<DownloadRequest> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public DownloadRequest(String str, String str2, Uri uri, List<x> list, String str3, byte[] bArr) {
        if ("dash".equals(str2) || "hls".equals(str2) || "ss".equals(str2)) {
            boolean z = str3 == null;
            g.b(z, "customCacheKey must be null for type: " + str2);
        }
        this.a = str;
        this.b = str2;
        this.c = uri;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f = Collections.unmodifiableList(arrayList);
        this.n = str3;
        this.o = bArr != null ? Arrays.copyOf(bArr, bArr.length) : f0.f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.a.equals(downloadRequest.a) || !this.b.equals(downloadRequest.b) || !this.c.equals(downloadRequest.c) || !this.f.equals(downloadRequest.f) || !f0.a(this.n, downloadRequest.n) || !Arrays.equals(this.o, downloadRequest.o)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, this.b.hashCode() * 31, 31), 31)) * 31)) * 31;
        String str = this.n;
        return Arrays.hashCode(this.o) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // java.lang.Object
    public String toString() {
        return this.b + ":" + this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.toString());
        parcel.writeInt(this.f.size());
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            parcel.writeParcelable(this.f.get(i2), 0);
        }
        parcel.writeString(this.n);
        parcel.writeInt(this.o.length);
        parcel.writeByteArray(this.o);
    }

    DownloadRequest(Parcel parcel) {
        String readString = parcel.readString();
        int i = f0.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = Uri.parse(parcel.readString());
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(parcel.readParcelable(x.class.getClassLoader()));
        }
        this.f = Collections.unmodifiableList(arrayList);
        this.n = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        this.o = bArr;
        parcel.readByteArray(bArr);
    }
}
