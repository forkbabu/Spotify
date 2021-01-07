package com.spotify.mobile.android.recentlyplayed.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentlyPlayedItems implements JacksonModel, Parcelable, i<RecentlyPlayedItem> {
    public static final Parcelable.Creator<RecentlyPlayedItems> CREATOR = new a();
    public List<RecentlyPlayedItem> items;
    public int length;
    public boolean loaded;

    static class a implements Parcelable.Creator<RecentlyPlayedItems> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public RecentlyPlayedItems createFromParcel(Parcel parcel) {
            return new RecentlyPlayedItems(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public RecentlyPlayedItems[] newArray(int i) {
            return new RecentlyPlayedItems[i];
        }
    }

    /* synthetic */ RecentlyPlayedItems(Parcel parcel, a aVar) {
        this(parcel);
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
        if (!(obj instanceof RecentlyPlayedItems)) {
            return false;
        }
        RecentlyPlayedItems recentlyPlayedItems = (RecentlyPlayedItems) obj;
        return this.length == recentlyPlayedItems.length && this.loaded == recentlyPlayedItems.loaded && this.items.equals(recentlyPlayedItems.items);
    }

    @Override // com.spotify.playlist.models.i
    public int getUnfilteredLength() {
        return this.length;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnrangedLength() {
        return this.length;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.length), Boolean.valueOf(this.loaded), this.items});
    }

    @Override // com.spotify.playlist.models.i
    public boolean isLoading() {
        return !this.loaded;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.length);
        parcel.writeInt(this.loaded ? 1 : 0);
        parcel.writeTypedList(this.items);
    }

    public RecentlyPlayedItems(@JsonProperty("length") int i, @JsonProperty("loaded") boolean z, @JsonProperty("items") List<RecentlyPlayedItem> list) {
        this.length = i;
        this.loaded = z;
        this.items = list == null ? new ArrayList<>(0) : list;
    }

    /* Return type fixed from 'com.google.common.collect.ImmutableList<com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem>' to match base method */
    @Override // com.spotify.playlist.models.i
    public List<RecentlyPlayedItem> getItems() {
        return ImmutableList.copyOf((Collection) this.items);
    }

    private RecentlyPlayedItems(Parcel parcel) {
        this.length = parcel.readInt();
        this.loaded = parcel.readInt() != 0;
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        parcel.readTypedList(arrayList, RecentlyPlayedItem.CREATOR);
    }
}
