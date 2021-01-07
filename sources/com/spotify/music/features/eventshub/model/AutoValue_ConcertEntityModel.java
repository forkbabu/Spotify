package com.spotify.music.features.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.eventshub.model.ConcertEntityModel;
import java.util.ArrayList;
import java.util.List;

final class AutoValue_ConcertEntityModel extends C$AutoValue_ConcertEntityModel {
    private static final ConcertEntityModel.a ALBUMS_FOR_CONCERT_PARCEL_ADAPTER = new ConcertEntityModel.a();
    private static final ConcertEntityModel.b ARTIST_ADAPTER = new ConcertEntityModel.b();
    private static final ConcertEntityModel.c CONCERT_RESULT_PARCEL_ADAPTER = new ConcertEntityModel.c();
    public static final Parcelable.Creator<AutoValue_ConcertEntityModel> CREATOR = new a();
    private static final ConcertEntityModel.d UPCOMING_CONCERTS_PARCEL_ADAPTER = new ConcertEntityModel.d();

    static class a implements Parcelable.Creator<AutoValue_ConcertEntityModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ConcertEntityModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ConcertResult concertResult = (ConcertResult) AutoValue_ConcertEntityModel.CONCERT_RESULT_PARCEL_ADAPTER.a(parcel);
            ConcertEntityModel.b bVar = AutoValue_ConcertEntityModel.ARTIST_ADAPTER;
            bVar.getClass();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(bVar);
            if (parcel.readInt() == 0) {
                ConcertEntityModel.d dVar = AutoValue_ConcertEntityModel.UPCOMING_CONCERTS_PARCEL_ADAPTER;
                dVar.getClass();
                arrayList = parcel.createTypedArrayList(dVar);
            } else {
                arrayList = null;
            }
            if (parcel.readInt() == 0) {
                ConcertEntityModel.a aVar = AutoValue_ConcertEntityModel.ALBUMS_FOR_CONCERT_PARCEL_ADAPTER;
                aVar.getClass();
                arrayList2 = parcel.createTypedArrayList(aVar);
            } else {
                arrayList2 = null;
            }
            return new AutoValue_ConcertEntityModel(concertResult, createTypedArrayList, arrayList, arrayList2, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ConcertEntityModel[] newArray(int i) {
            return new AutoValue_ConcertEntityModel[i];
        }
    }

    AutoValue_ConcertEntityModel(ConcertResult concertResult, List<Artist> list, List<ConcertResult> list2, List<Album> list3, String str, String str2, String str3, String str4) {
        super(concertResult, list, list2, list3, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ConcertEntityModel.c cVar = CONCERT_RESULT_PARCEL_ADAPTER;
        ConcertResult concertResult = getConcertResult();
        cVar.getClass();
        gf0.v(parcel, concertResult, 0);
        ConcertEntityModel.b bVar = ARTIST_ADAPTER;
        List<Artist> artists = getArtists();
        bVar.getClass();
        parcel.writeTypedList(artists);
        if (getUpcomingConcerts() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            ConcertEntityModel.d dVar = UPCOMING_CONCERTS_PARCEL_ADAPTER;
            List<ConcertResult> upcomingConcerts = getUpcomingConcerts();
            dVar.getClass();
            parcel.writeTypedList(upcomingConcerts);
        }
        if (getAlbumsForConcert() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            ConcertEntityModel.a aVar = ALBUMS_FOR_CONCERT_PARCEL_ADAPTER;
            List<Album> albumsForConcert = getAlbumsForConcert();
            aVar.getClass();
            parcel.writeTypedList(albumsForConcert);
        }
        if (getUserLocation() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getUserLocation());
        }
        if (getUpcomingConcertsSource() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getUpcomingConcertsSource());
        }
        if (getColor() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getColor());
        }
        if (getTicketAvailability() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getTicketAvailability());
    }
}
