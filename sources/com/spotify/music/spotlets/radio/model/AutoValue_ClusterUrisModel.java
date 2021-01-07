package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

final class AutoValue_ClusterUrisModel extends C$AutoValue_ClusterUrisModel {
    public static final Parcelable.Creator<AutoValue_ClusterUrisModel> CREATOR = new a();
    private static final dpd STRING_LIST_TYPE_ADAPTER = new dpd();

    static class a implements Parcelable.Creator<AutoValue_ClusterUrisModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ClusterUrisModel createFromParcel(Parcel parcel) {
            return new AutoValue_ClusterUrisModel(AutoValue_ClusterUrisModel.STRING_LIST_TYPE_ADAPTER.a(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ClusterUrisModel[] newArray(int i) {
            return new AutoValue_ClusterUrisModel[i];
        }
    }

    AutoValue_ClusterUrisModel(List<String> list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        dpd dpd = STRING_LIST_TYPE_ADAPTER;
        List<String> clusterUris = clusterUris();
        dpd.getClass();
        parcel.writeStringList(clusterUris);
    }
}
