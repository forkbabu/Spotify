package com.spotify.music.features.creatorartist.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.creatorartist.model.CreatorAboutModel;
import java.util.List;

final class AutoValue_CreatorAboutModel extends C$AutoValue_CreatorAboutModel {
    public static final Parcelable.Creator<AutoValue_CreatorAboutModel> CREATOR = new a();
    private static final CreatorAboutModel.a IMAGES_ADAPTER = new CreatorAboutModel.a();

    static class a implements Parcelable.Creator<AutoValue_CreatorAboutModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CreatorAboutModel createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            Autobiography autobiography = (Autobiography) parcel.readParcelable(CreatorAboutModel.class.getClassLoader());
            CreatorAboutModel.a aVar = AutoValue_CreatorAboutModel.IMAGES_ADAPTER;
            aVar.getClass();
            return new AutoValue_CreatorAboutModel(readInt, readInt2, readString, readString2, readString3, autobiography, parcel.createTypedArrayList(aVar));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CreatorAboutModel[] newArray(int i) {
            return new AutoValue_CreatorAboutModel[i];
        }
    }

    AutoValue_CreatorAboutModel(int i, int i2, String str, String str2, String str3, Autobiography autobiography, List<ImageModel> list) {
        super(i, i2, str, str2, str3, autobiography, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(monthlyListeners());
        parcel.writeInt(globalChartPosition());
        if (biography() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(biography());
        }
        if (name() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(name());
        }
        if (mainImageUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mainImageUrl());
        }
        parcel.writeParcelable(autobiography(), i);
        CreatorAboutModel.a aVar = IMAGES_ADAPTER;
        List<ImageModel> images = images();
        aVar.getClass();
        parcel.writeTypedList(images);
    }
}
