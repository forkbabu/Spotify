package com.spotify.music.lyrics.core.experience.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class LyricsWrapper implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final a colors;
    private final boolean hasVocalRemoval;
    private final Lyrics lyrics;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new LyricsWrapper((Lyrics) Lyrics.CREATOR.createFromParcel(parcel), (a) a.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LyricsWrapper[i];
        }
    }

    public LyricsWrapper(@JsonProperty("lyrics") Lyrics lyrics2, @JsonProperty("colors") a aVar, @JsonProperty("has_vocal_removal") boolean z) {
        h.e(lyrics2, "lyrics");
        h.e(aVar, "colors");
        this.lyrics = lyrics2;
        this.colors = aVar;
        this.hasVocalRemoval = z;
    }

    public static /* synthetic */ LyricsWrapper copy$default(LyricsWrapper lyricsWrapper, Lyrics lyrics2, a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            lyrics2 = lyricsWrapper.lyrics;
        }
        if ((i & 2) != 0) {
            aVar = lyricsWrapper.colors;
        }
        if ((i & 4) != 0) {
            z = lyricsWrapper.hasVocalRemoval;
        }
        return lyricsWrapper.copy(lyrics2, aVar, z);
    }

    public final Lyrics component1() {
        return this.lyrics;
    }

    public final a component2() {
        return this.colors;
    }

    public final boolean component3() {
        return this.hasVocalRemoval;
    }

    public final LyricsWrapper copy(@JsonProperty("lyrics") Lyrics lyrics2, @JsonProperty("colors") a aVar, @JsonProperty("has_vocal_removal") boolean z) {
        h.e(lyrics2, "lyrics");
        h.e(aVar, "colors");
        return new LyricsWrapper(lyrics2, aVar, z);
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
        if (!(obj instanceof LyricsWrapper)) {
            return false;
        }
        LyricsWrapper lyricsWrapper = (LyricsWrapper) obj;
        return h.a(this.lyrics, lyricsWrapper.lyrics) && h.a(this.colors, lyricsWrapper.colors) && this.hasVocalRemoval == lyricsWrapper.hasVocalRemoval;
    }

    public final a getColors() {
        return this.colors;
    }

    public final boolean getHasVocalRemoval() {
        return this.hasVocalRemoval;
    }

    public final Lyrics getLyrics() {
        return this.lyrics;
    }

    @Override // java.lang.Object
    public int hashCode() {
        Lyrics lyrics2 = this.lyrics;
        int i = 0;
        int hashCode = (lyrics2 != null ? lyrics2.hashCode() : 0) * 31;
        a aVar = this.colors;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.hasVocalRemoval;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("LyricsWrapper(lyrics=");
        V0.append(this.lyrics);
        V0.append(", colors=");
        V0.append(this.colors);
        V0.append(", hasVocalRemoval=");
        return je.P0(V0, this.hasVocalRemoval, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        this.lyrics.writeToParcel(parcel, 0);
        this.colors.writeToParcel(parcel, 0);
        parcel.writeInt(this.hasVocalRemoval ? 1 : 0);
    }
}
