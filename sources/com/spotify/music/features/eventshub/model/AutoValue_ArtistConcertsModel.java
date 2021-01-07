package com.spotify.music.features.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.eventshub.model.ArtistConcertsModel;
import java.util.List;

final class AutoValue_ArtistConcertsModel extends C$AutoValue_ArtistConcertsModel {
    private static final ArtistConcertsModel.a ARTIST_CONCERTS_PARCEL_ADAPTER = new ArtistConcertsModel.a();
    private static final ArtistConcertsModel.b ARTIST_PARCEL_ADAPTER = new ArtistConcertsModel.b();
    public static final Parcelable.Creator<AutoValue_ArtistConcertsModel> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_ArtistConcertsModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ArtistConcertsModel createFromParcel(Parcel parcel) {
            Artist artist = (Artist) AutoValue_ArtistConcertsModel.ARTIST_PARCEL_ADAPTER.a(parcel);
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            ArtistConcertsModel.a aVar = AutoValue_ArtistConcertsModel.ARTIST_CONCERTS_PARCEL_ADAPTER;
            aVar.getClass();
            return new AutoValue_ArtistConcertsModel(artist, readString, parcel.createTypedArrayList(aVar));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ArtistConcertsModel[] newArray(int i) {
            return new AutoValue_ArtistConcertsModel[i];
        }
    }

    AutoValue_ArtistConcertsModel(Artist artist, String str, List<ConcertResult> list) {
        super(artist, str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ArtistConcertsModel.b bVar = ARTIST_PARCEL_ADAPTER;
        Artist artist = getArtist();
        bVar.getClass();
        gf0.v(parcel, artist, 0);
        if (getUserLocation() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getUserLocation());
        }
        ArtistConcertsModel.a aVar = ARTIST_CONCERTS_PARCEL_ADAPTER;
        List<ConcertResult> concerts = getConcerts();
        aVar.getClass();
        parcel.writeTypedList(concerts);
    }
}
