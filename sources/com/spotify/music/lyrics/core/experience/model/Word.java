package com.spotify.music.lyrics.core.experience.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Word implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String string;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new Word(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Word[i];
        }
    }

    public Word(@JsonProperty("string") String str) {
        h.e(str, "string");
        this.string = str;
    }

    public static /* synthetic */ Word copy$default(Word word, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = word.string;
        }
        return word.copy(str);
    }

    public final String component1() {
        return this.string;
    }

    public final Word copy(@JsonProperty("string") String str) {
        h.e(str, "string");
        return new Word(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Word) && h.a(this.string, ((Word) obj).string);
        }
        return true;
    }

    public final String getString() {
        return this.string;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.string;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.I0(je.V0("Word(string="), this.string, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.string);
    }
}
