package com.spotify.music.homecomponents.dialogs.showmore;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class i implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final String f;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new i[i];
        }
    }

    public i() {
        this(null, null, null, null, 15);
    }

    public i(String str, String str2, String str3, String str4) {
        h.e(str, "imageUri");
        h.e(str2, "title");
        h.e(str3, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str4, "navigationUri");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.a(this.a, iVar.a) && h.a(this.b, iVar.b) && h.a(this.c, iVar.c) && h.a(this.f, iVar.f);
    }

    public final String getImageUri() {
        return this.a;
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
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ShowMoreHeaderData(imageUri=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", subtitle=");
        V0.append(this.c);
        V0.append(", navigationUri=");
        return je.I0(V0, this.f, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? "" : null, (i & 2) != 0 ? "" : null, (i & 4) != 0 ? "" : null, (i & 8) != 0 ? "" : null);
    }
}
