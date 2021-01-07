package com.spotify.music.homecomponents.dialogs.showmore;

import android.os.Parcel;
import android.os.Parcelable;

public final class h implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.h.e(parcel, "in");
            return new h(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new h[i];
        }
    }

    public h() {
        kotlin.jvm.internal.h.e("", "actionText");
        this.a = "";
    }

    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && kotlin.jvm.internal.h.a(this.a, ((h) obj).a);
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.I0(je.V0("ShowMoreFooterData(actionText="), this.a, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.h.e(parcel, "parcel");
        parcel.writeString(this.a);
    }

    public h(String str, int i) {
        String str2 = (i & 1) != 0 ? "" : null;
        kotlin.jvm.internal.h.e(str2, "actionText");
        this.a = str2;
    }

    public h(String str) {
        kotlin.jvm.internal.h.e(str, "actionText");
        this.a = str;
    }
}
