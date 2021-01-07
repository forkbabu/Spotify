package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = ClusterRadioStationModel_Deserializer.class)
public class ClusterRadioStationModel extends RadioStationModel {
    public static final Parcelable.Creator<ClusterRadioStationModel> CREATOR = new a();
    private static final String STATION = "station";
    @JsonProperty("clusterType")
    public final String clusterType;
    @JsonProperty("description")
    public final String description;
    private boolean mIsSelectedForPlaying;
    @JsonProperty("username")
    public final String username;

    static class a implements Parcelable.Creator<ClusterRadioStationModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ClusterRadioStationModel createFromParcel(Parcel parcel) {
            return new ClusterRadioStationModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray(), (RelatedArtistModel[]) parcel.createTypedArray(AutoValue_RelatedArtistModel.CREATOR), (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ClusterRadioStationModel[] newArray(int i) {
            return new ClusterRadioStationModel[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.fasterxml.jackson.annotation.JsonCreator
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClusterRadioStationModel(@com.fasterxml.jackson.annotation.JsonProperty("uri") java.lang.String r15, @com.fasterxml.jackson.annotation.JsonProperty("title") java.lang.String r16, @com.fasterxml.jackson.annotation.JsonProperty("titleUri") java.lang.String r17, @com.fasterxml.jackson.annotation.JsonProperty("imageUri") java.lang.String r18, @com.fasterxml.jackson.annotation.JsonProperty("playlistUri") java.lang.String r19, @com.fasterxml.jackson.annotation.JsonProperty("subtitle") java.lang.String r20, @com.fasterxml.jackson.annotation.JsonProperty("subtitleUri") java.lang.String r21, @com.fasterxml.jackson.annotation.JsonProperty("seeds") java.lang.String[] r22, @com.fasterxml.jackson.annotation.JsonProperty("related_artists") com.spotify.music.spotlets.radio.model.RelatedArtistModel[] r23, @com.fasterxml.jackson.annotation.JsonProperty("tracks") com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r24, @com.fasterxml.jackson.annotation.JsonProperty("next_page_url") java.lang.String r25, @com.fasterxml.jackson.annotation.JsonProperty("explicitSave") boolean r26, @com.fasterxml.jackson.annotation.JsonProperty("username") java.lang.String r27, @com.fasterxml.jackson.annotation.JsonProperty("clusterType") java.lang.String r28, @com.fasterxml.jackson.annotation.JsonProperty("description") java.lang.String r29) {
        /*
            r14 = this;
            r13 = r14
            r0 = r15
            r1 = r22
            java.lang.String r2 = "station"
            boolean r2 = r15.contains(r2)
            if (r2 == 0) goto L_0x000e
            r2 = r0
            goto L_0x0012
        L_0x000e:
            java.lang.String r2 = defpackage.agd.c(r15)
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            int r3 = r1.length
            if (r3 != 0) goto L_0x001d
        L_0x0017:
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r3 = 0
            r1[r3] = r0
        L_0x001d:
            r8 = r1
            r0 = r14
            r1 = r2
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r27
            r13.username = r0
            r0 = r28
            r13.clusterType = r0
            r0 = r29
            r13.description = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.ClusterRadioStationModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String[], com.spotify.music.spotlets.radio.model.RelatedArtistModel[], com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[], java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.spotify.music.spotlets.radio.model.RadioStationModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.spotify.music.spotlets.radio.model.RadioStationModel, java.lang.Object
    @JsonIgnore
    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterRadioStationModel)) {
            return false;
        }
        ClusterRadioStationModel clusterRadioStationModel = (ClusterRadioStationModel) obj;
        if (!super.equals(obj) || !rw.equal(this.username, clusterRadioStationModel.username) || !rw.equal(this.clusterType, clusterRadioStationModel.clusterType) || !rw.equal(this.description, clusterRadioStationModel.description)) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.spotlets.radio.model.RadioStationModel, java.lang.Object
    @JsonIgnore
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.username, this.description, this.clusterType});
    }

    public boolean isPlaying() {
        return this.mIsSelectedForPlaying;
    }

    public void setPlaying(boolean z) {
        this.mIsSelectedForPlaying = z;
    }

    @Override // com.spotify.music.spotlets.radio.model.RadioStationModel, android.os.Parcelable
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
        parcel.writeTypedArray(this.tracks, 0);
        parcel.writeString(this.nextPageUrl);
        parcel.writeInt(this.explicitSave ? 1 : 0);
        parcel.writeString(this.username);
        parcel.writeString(this.clusterType);
        parcel.writeString(this.description);
    }

    public ClusterRadioStationModel(ClusterRadioStationModel clusterRadioStationModel, RadioStationTracksModel radioStationTracksModel) {
        super(clusterRadioStationModel, radioStationTracksModel);
        this.username = clusterRadioStationModel.username;
        this.clusterType = clusterRadioStationModel.clusterType;
        this.description = clusterRadioStationModel.description;
    }
}
