package com.spotify.music.lyrics.core.experience.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Lyrics implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final List<LyricsLineData> lines;
    private final String provider;
    private final ProviderAndroidIntent providerIntent;
    private final String publisherCredits;
    private final SyncMode syncMode;
    private final String trackId;
    private final String writers;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((LyricsLineData) LyricsLineData.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new Lyrics(arrayList, (SyncMode) Enum.valueOf(SyncMode.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (ProviderAndroidIntent) ProviderAndroidIntent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Lyrics[i];
        }
    }

    public Lyrics(@JsonProperty("lines") List<LyricsLineData> list, @JsonProperty("kind") SyncMode syncMode2, @JsonProperty("trackId") String str, @JsonProperty("provider") String str2, @JsonProperty("providerAndroidIntent") ProviderAndroidIntent providerAndroidIntent, @JsonProperty("writers") String str3, @JsonProperty("publisherCredits") String str4) {
        h.e(list, "lines");
        h.e(syncMode2, "syncMode");
        h.e(str, "trackId");
        this.lines = list;
        this.syncMode = syncMode2;
        this.trackId = str;
        this.provider = str2;
        this.providerIntent = providerAndroidIntent;
        this.writers = str3;
        this.publisherCredits = str4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.spotify.music.lyrics.core.experience.model.Lyrics */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Lyrics copy$default(Lyrics lyrics, List list, SyncMode syncMode2, String str, String str2, ProviderAndroidIntent providerAndroidIntent, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lyrics.lines;
        }
        if ((i & 2) != 0) {
            syncMode2 = lyrics.syncMode;
        }
        if ((i & 4) != 0) {
            str = lyrics.trackId;
        }
        if ((i & 8) != 0) {
            str2 = lyrics.provider;
        }
        if ((i & 16) != 0) {
            providerAndroidIntent = lyrics.providerIntent;
        }
        if ((i & 32) != 0) {
            str3 = lyrics.writers;
        }
        if ((i & 64) != 0) {
            str4 = lyrics.publisherCredits;
        }
        return lyrics.copy(list, syncMode2, str, str2, providerAndroidIntent, str3, str4);
    }

    public final List<LyricsLineData> component1() {
        return this.lines;
    }

    public final SyncMode component2() {
        return this.syncMode;
    }

    public final String component3() {
        return this.trackId;
    }

    public final String component4() {
        return this.provider;
    }

    public final ProviderAndroidIntent component5() {
        return this.providerIntent;
    }

    public final String component6() {
        return this.writers;
    }

    public final String component7() {
        return this.publisherCredits;
    }

    public final Lyrics copy(@JsonProperty("lines") List<LyricsLineData> list, @JsonProperty("kind") SyncMode syncMode2, @JsonProperty("trackId") String str, @JsonProperty("provider") String str2, @JsonProperty("providerAndroidIntent") ProviderAndroidIntent providerAndroidIntent, @JsonProperty("writers") String str3, @JsonProperty("publisherCredits") String str4) {
        h.e(list, "lines");
        h.e(syncMode2, "syncMode");
        h.e(str, "trackId");
        return new Lyrics(list, syncMode2, str, str2, providerAndroidIntent, str3, str4);
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
        if (!(obj instanceof Lyrics)) {
            return false;
        }
        Lyrics lyrics = (Lyrics) obj;
        return h.a(this.lines, lyrics.lines) && h.a(this.syncMode, lyrics.syncMode) && h.a(this.trackId, lyrics.trackId) && h.a(this.provider, lyrics.provider) && h.a(this.providerIntent, lyrics.providerIntent) && h.a(this.writers, lyrics.writers) && h.a(this.publisherCredits, lyrics.publisherCredits);
    }

    public final List<LyricsLineData> getLines() {
        return this.lines;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final ProviderAndroidIntent getProviderIntent() {
        return this.providerIntent;
    }

    public final String getPublisherCredits() {
        return this.publisherCredits;
    }

    public final SyncMode getSyncMode() {
        return this.syncMode;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final String getWriters() {
        return this.writers;
    }

    @Override // java.lang.Object
    public int hashCode() {
        List<LyricsLineData> list = this.lines;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        SyncMode syncMode2 = this.syncMode;
        int hashCode2 = (hashCode + (syncMode2 != null ? syncMode2.hashCode() : 0)) * 31;
        String str = this.trackId;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.provider;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ProviderAndroidIntent providerAndroidIntent = this.providerIntent;
        int hashCode5 = (hashCode4 + (providerAndroidIntent != null ? providerAndroidIntent.hashCode() : 0)) * 31;
        String str3 = this.writers;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.publisherCredits;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Lyrics(lines=");
        V0.append(this.lines);
        V0.append(", syncMode=");
        V0.append(this.syncMode);
        V0.append(", trackId=");
        V0.append(this.trackId);
        V0.append(", provider=");
        V0.append(this.provider);
        V0.append(", providerIntent=");
        V0.append(this.providerIntent);
        V0.append(", writers=");
        V0.append(this.writers);
        V0.append(", publisherCredits=");
        return je.I0(V0, this.publisherCredits, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        List<LyricsLineData> list = this.lines;
        parcel.writeInt(list.size());
        for (LyricsLineData lyricsLineData : list) {
            lyricsLineData.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.syncMode.name());
        parcel.writeString(this.trackId);
        parcel.writeString(this.provider);
        ProviderAndroidIntent providerAndroidIntent = this.providerIntent;
        if (providerAndroidIntent != null) {
            parcel.writeInt(1);
            providerAndroidIntent.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.writers);
        parcel.writeString(this.publisherCredits);
    }
}
