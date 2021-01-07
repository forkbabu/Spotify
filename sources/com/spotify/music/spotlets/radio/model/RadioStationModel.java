package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.ContextTrack;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = RadioStationModel_Deserializer.class)
public class RadioStationModel implements Parcelable, JacksonModel {
    public static final Parcelable.Creator<RadioStationModel> CREATOR = new a();
    @JsonProperty("explicitSave")
    public final boolean explicitSave;
    @JsonProperty("imageUri")
    public final String imageUri;
    @JsonProperty("next_page_url")
    public final String nextPageUrl;
    @JsonProperty("playlistUri")
    public final String playlistUri;
    @JsonProperty("related_artists")
    public final RelatedArtistModel[] relatedArtists;
    @JsonProperty("seeds")
    public final String[] seeds;
    @JsonIgnore
    public final c stationUri;
    @JsonProperty(ContextTrack.Metadata.KEY_SUBTITLE)
    public final String subtitle;
    @JsonProperty("subtitleUri")
    public final String subtitleUri;
    @JsonProperty("title")
    public final String title;
    @JsonProperty("titleUri")
    public final String titleUri;
    @JsonProperty("tracks")
    public final PlayerTrack[] tracks;
    @JsonProperty("uri")
    public final String uri;

    static class a implements Parcelable.Creator<RadioStationModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public RadioStationModel createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String[] createStringArray = parcel.createStringArray();
            RelatedArtistModel[] relatedArtistModelArr = (RelatedArtistModel[]) parcel.createTypedArray(AutoValue_RelatedArtistModel.CREATOR);
            PlayerTrack[] playerTrackArr = new PlayerTrack[parcel.readInt()];
            parcel.readTypedArray(playerTrackArr, PlayerTrack.CREATOR);
            return new RadioStationModel(readString, readString2, readString3, readString4, readString5, readString6, readString7, createStringArray, relatedArtistModelArr, playerTrackArr, parcel.readString(), parcel.readInt() != 0);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public RadioStationModel[] newArray(int i) {
            return new RadioStationModel[i];
        }
    }

    @JsonCreator
    public RadioStationModel(@JsonProperty("uri") String str, @JsonProperty("title") String str2, @JsonProperty("titleUri") String str3, @JsonProperty("imageUri") String str4, @JsonProperty("playlistUri") String str5, @JsonProperty("subtitle") String str6, @JsonProperty("subtitleUri") String str7, @JsonProperty("seeds") String[] strArr, @JsonProperty("related_artists") RelatedArtistModel[] relatedArtistModelArr, @JsonProperty("tracks") PlayerTrack[] playerTrackArr, @JsonProperty("next_page_url") String str8, @JsonProperty("explicitSave") boolean z) {
        if (str == null) {
            StringBuilder V0 = je.V0("spotify:station:");
            V0.append(strArr[0].substring(8));
            str = V0.toString();
        }
        this.uri = str;
        this.stationUri = ViewUris.r0.b(str);
        this.title = str2;
        this.titleUri = str3;
        this.imageUri = str4;
        this.playlistUri = str5;
        this.subtitle = str6;
        this.subtitleUri = str7;
        this.seeds = strArr;
        this.relatedArtists = relatedArtistModelArr == null ? new RelatedArtistModel[0] : relatedArtistModelArr;
        this.tracks = playerTrackArr == null ? new PlayerTrack[0] : playerTrackArr;
        this.nextPageUrl = str8;
        this.explicitSave = z;
    }

    @Override // android.os.Parcelable
    @JsonIgnore
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof RadioStationModel)) {
            return false;
        }
        RadioStationModel radioStationModel = (RadioStationModel) obj;
        if (!rw.equal(this.uri, radioStationModel.uri) || !rw.equal(this.title, radioStationModel.title) || !rw.equal(this.titleUri, radioStationModel.titleUri) || !rw.equal(this.imageUri, radioStationModel.imageUri) || !rw.equal(this.playlistUri, radioStationModel.playlistUri) || !rw.equal(this.subtitle, radioStationModel.subtitle) || !rw.equal(this.subtitleUri, radioStationModel.subtitleUri) || !Arrays.equals(this.seeds, radioStationModel.seeds) || !Arrays.equals(this.tracks, radioStationModel.tracks) || !rw.equal(this.nextPageUrl, radioStationModel.nextPageUrl) || !rw.equal(Boolean.valueOf(this.explicitSave), Boolean.valueOf(radioStationModel.explicitSave))) {
            return false;
        }
        return true;
    }

    @JsonIgnore
    public String getPlayerContextUri() {
        String c = agd.c(getStationSeed());
        c.getClass();
        return c;
    }

    @JsonIgnore
    public String getStationSeed() {
        return this.seeds[0];
    }

    @Override // java.lang.Object
    @JsonIgnore
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.uri, this.title, this.titleUri, this.imageUri, this.playlistUri, this.subtitle, this.subtitleUri, Integer.valueOf(Arrays.hashCode(this.seeds)), Integer.valueOf(Arrays.hashCode(this.tracks)), this.nextPageUrl, Boolean.valueOf(this.explicitSave)});
    }

    public boolean isMyContext(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (rw.equal(str, getPlayerContextUri()) || Arrays.asList(this.seeds).contains(str)) {
            return true;
        }
        return false;
    }

    @JsonIgnore
    public String resolvedStationURI() {
        String str = this.playlistUri;
        if (str == null || str.isEmpty()) {
            return this.uri;
        }
        return this.playlistUri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.title);
        parcel.writeString(this.titleUri);
        parcel.writeString(this.imageUri);
        parcel.writeString(this.playlistUri);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.subtitleUri);
        parcel.writeStringArray(this.seeds);
        parcel.writeTypedArray(this.relatedArtists, 0);
        parcel.writeInt(this.tracks.length);
        parcel.writeTypedArray(this.tracks, 0);
        parcel.writeString(this.nextPageUrl);
        parcel.writeInt(this.explicitSave ? 1 : 0);
    }

    public RadioStationModel(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel) {
        this.uri = radioStationModel.uri;
        this.stationUri = radioStationModel.stationUri;
        this.title = radioStationModel.title;
        this.titleUri = radioStationModel.titleUri;
        this.imageUri = radioStationModel.imageUri;
        this.subtitle = radioStationModel.subtitle;
        this.subtitleUri = radioStationModel.subtitleUri;
        this.seeds = radioStationModel.seeds;
        this.relatedArtists = radioStationModel.relatedArtists;
        this.tracks = radioStationTracksModel.tracks;
        this.nextPageUrl = radioStationTracksModel.nextPageUrl;
        this.explicitSave = radioStationModel.explicitSave;
        this.playlistUri = radioStationModel.playlistUri;
    }
}
