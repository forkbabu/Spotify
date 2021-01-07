package com.spotify.music.lyrics.core.experience.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Syllable implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final int length;
    private final int time;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new Syllable(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Syllable[i];
        }
    }

    public Syllable(@JsonProperty("time") int i, @JsonProperty("length") int i2) {
        this.time = i;
        this.length = i2;
    }

    public static /* synthetic */ Syllable copy$default(Syllable syllable, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = syllable.time;
        }
        if ((i3 & 2) != 0) {
            i2 = syllable.length;
        }
        return syllable.copy(i, i2);
    }

    public final int component1() {
        return this.time;
    }

    public final int component2() {
        return this.length;
    }

    public final Syllable copy(@JsonProperty("time") int i, @JsonProperty("length") int i2) {
        return new Syllable(i, i2);
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
        if (!(obj instanceof Syllable)) {
            return false;
        }
        Syllable syllable = (Syllable) obj;
        return this.time == syllable.time && this.length == syllable.length;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getTime() {
        return this.time;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (this.time * 31) + this.length;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Syllable(time=");
        V0.append(this.time);
        V0.append(", length=");
        return je.B0(V0, this.length, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.time);
        parcel.writeInt(this.length);
    }
}
