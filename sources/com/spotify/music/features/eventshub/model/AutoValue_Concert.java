package com.spotify.music.features.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.eventshub.model.Concert;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_Concert extends C$AutoValue_Concert {
    private static final Concert.d ARTIST_ADAPTER = new Concert.d();
    private static final Concert.e CONCERT_PARTNER_ADAPTER = new Concert.e();
    private static final Concert.f CONCERT_TICKETING_ADAPTER = new Concert.f();
    public static final Parcelable.Creator<AutoValue_Concert> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_Concert> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Concert createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString5 = parcel.readInt() == 0 ? parcel.readString() : null;
            Concert.d dVar = AutoValue_Concert.ARTIST_ADAPTER;
            dVar.getClass();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(dVar);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            if (parcel.readInt() == 0) {
                Concert.e eVar = AutoValue_Concert.CONCERT_PARTNER_ADAPTER;
                eVar.getClass();
                arrayList = parcel.createTypedArrayList(eVar);
            } else {
                arrayList = null;
            }
            if (parcel.readInt() == 0) {
                Concert.f fVar = AutoValue_Concert.CONCERT_TICKETING_ADAPTER;
                fVar.getClass();
                arrayList2 = parcel.createTypedArrayList(fVar);
            } else {
                arrayList2 = null;
            }
            return new AutoValue_Concert(readString, readString2, readString3, readString4, readString5, createTypedArrayList, z, arrayList, arrayList2, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Concert[] newArray(int i) {
            return new AutoValue_Concert[i];
        }
    }

    AutoValue_Concert(String str, String str2, String str3, String str4, String str5, List<Artist> list, boolean z, List<ConcertPartner> list2, List<ConcertTicketing> list3, String str6) {
        super(str, str2, str3, str4, str5, list, z, list2, list3, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (getId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getId());
        }
        if (getDateString() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDateString());
        }
        if (getTitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTitle());
        }
        if (getLocation() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getLocation());
        }
        if (getVenue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getVenue());
        }
        Concert.d dVar = ARTIST_ADAPTER;
        List<Artist> artists = getArtists();
        dVar.getClass();
        parcel.writeTypedList(artists);
        parcel.writeInt(isFestival() ? 1 : 0);
        if (getPartnerConcerts() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            Concert.e eVar = CONCERT_PARTNER_ADAPTER;
            List<ConcertPartner> partnerConcerts = getPartnerConcerts();
            eVar.getClass();
            parcel.writeTypedList(partnerConcerts);
        }
        if (getTicketing() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            Concert.f fVar = CONCERT_TICKETING_ADAPTER;
            List<ConcertTicketing> ticketing = getTicketing();
            fVar.getClass();
            parcel.writeTypedList(ticketing);
        }
        if (getCategory() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getCategory());
    }
}
