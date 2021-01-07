package com.spotify.music.homecomponents.dialogs.showmore;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class g implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final List<String> a;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new g(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new g[i];
        }
    }

    public g() {
        EmptyList emptyList = EmptyList.a;
        h.e(emptyList, "contentUris");
        this.a = emptyList;
    }

    public final List<String> a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && h.a(this.a, ((g) obj).a);
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        List<String> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("ShowMoreContentList(contentUris="), this.a, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeStringList(this.a);
    }

    public g(List<String> list) {
        h.e(list, "contentUris");
        this.a = list;
    }

    public g(List list, int i) {
        EmptyList emptyList = (i & 1) != 0 ? EmptyList.a : null;
        h.e(emptyList, "contentUris");
        this.a = emptyList;
    }
}
