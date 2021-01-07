package com.spotify.music.lyrics.core.experience.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0303a();
    private final int a;
    private final int b;
    private final int c;

    /* renamed from: com.spotify.music.lyrics.core.experience.model.a$a  reason: collision with other inner class name */
    public static class C0303a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new a(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(@JsonProperty("dark_color") int i, @JsonProperty("active_color") int i2, @JsonProperty("bright_color") int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final a copy(@JsonProperty("dark_color") int i, @JsonProperty("active_color") int i2, @JsonProperty("bright_color") int i3) {
        return new a(i, i2, i3);
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Colors(backgroundColor=");
        V0.append(this.a);
        V0.append(", activeTextColor=");
        V0.append(this.b);
        V0.append(", inactiveTextColor=");
        return je.B0(V0, this.c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
