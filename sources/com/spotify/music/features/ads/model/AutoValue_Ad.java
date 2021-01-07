package com.spotify.music.features.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.ads.model.CompanionAd;
import com.spotify.music.features.ads.model.Display;
import com.spotify.music.features.ads.model.Image;
import com.spotify.music.features.ads.model.Video;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class AutoValue_Ad extends C$AutoValue_Ad {
    public static final Parcelable.Creator<AutoValue_Ad> CREATOR = new a();
    private static final Video.a LIST_TYPE_ADAPTER = new Video.a();
    private static final Image.a LIST_TYPE_ADAPTER_ = new Image.a();
    private static final Display.a LIST_TYPE_ADAPTER__ = new Display.a();
    private static final CompanionAd.a LIST_TYPE_ADAPTER___ = new CompanionAd.a();

    static class a implements Parcelable.Creator<AutoValue_Ad> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Ad createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readInt() == 0 ? parcel.readString() : null;
            long readLong = parcel.readLong();
            String readString7 = parcel.readInt() == 0 ? parcel.readString() : null;
            int readInt = parcel.readInt();
            boolean z = parcel.readInt() == 1;
            boolean z2 = parcel.readInt() == 1;
            HashMap readHashMap = parcel.readHashMap(Ad.class.getClassLoader());
            CompanionAd companionAd = (CompanionAd) parcel.readParcelable(Ad.class.getClassLoader());
            if (parcel.readInt() == 0) {
                Video.a aVar = AutoValue_Ad.LIST_TYPE_ADAPTER;
                aVar.getClass();
                arrayList = parcel.createTypedArrayList(aVar);
            } else {
                arrayList = null;
            }
            if (parcel.readInt() == 0) {
                Image.a aVar2 = AutoValue_Ad.LIST_TYPE_ADAPTER_;
                aVar2.getClass();
                arrayList2 = parcel.createTypedArrayList(aVar2);
            } else {
                arrayList2 = null;
            }
            if (parcel.readInt() == 0) {
                Display.a aVar3 = AutoValue_Ad.LIST_TYPE_ADAPTER__;
                aVar3.getClass();
                arrayList3 = parcel.createTypedArrayList(aVar3);
            } else {
                arrayList3 = null;
            }
            if (parcel.readInt() == 0) {
                CompanionAd.a aVar4 = AutoValue_Ad.LIST_TYPE_ADAPTER___;
                aVar4.getClass();
                arrayList4 = parcel.createTypedArrayList(aVar4);
            } else {
                arrayList4 = null;
            }
            return new AutoValue_Ad(readString, readString2, readString3, readString4, readString5, readString6, readLong, readString7, readInt, z, z2, readHashMap, companionAd, arrayList, arrayList2, arrayList3, arrayList4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Ad[] newArray(int i) {
            return new AutoValue_Ad[i];
        }
    }

    AutoValue_Ad(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i, boolean z, boolean z2, Map<String, String> map, CompanionAd companionAd, List<Video> list, List<Image> list2, List<Display> list3, List<CompanionAd> list4, String str8, String str9, String str10, boolean z3) {
        super(str, str2, str3, str4, str5, str6, j, str7, i, z, z2, map, companionAd, list, list2, list3, list4, str8, str9, str10, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id());
        parcel.writeString(uri());
        parcel.writeString(advertiser());
        parcel.writeString(title());
        parcel.writeString(clickUrl());
        if (clickTrackingUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(clickTrackingUrl());
        }
        parcel.writeLong(duration());
        if (caption() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(caption());
        }
        parcel.writeInt(adType());
        parcel.writeInt(testAd() ? 1 : 0);
        parcel.writeInt(nonExplicit() ? 1 : 0);
        parcel.writeMap(metadata());
        parcel.writeParcelable(companionAd(), i);
        if (videos() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            Video.a aVar = LIST_TYPE_ADAPTER;
            List<Video> videos = videos();
            aVar.getClass();
            parcel.writeTypedList(videos);
        }
        if (images() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            Image.a aVar2 = LIST_TYPE_ADAPTER_;
            List<Image> images = images();
            aVar2.getClass();
            parcel.writeTypedList(images);
        }
        if (displays() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            Display.a aVar3 = LIST_TYPE_ADAPTER__;
            List<Display> displays = displays();
            aVar3.getClass();
            parcel.writeTypedList(displays);
        }
        if (companionAds() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            CompanionAd.a aVar4 = LIST_TYPE_ADAPTER___;
            List<CompanionAd> companionAds = companionAds();
            aVar4.getClass();
            parcel.writeTypedList(companionAds);
        }
        parcel.writeString(lineItemId());
        parcel.writeString(creativeId());
        parcel.writeString(adPlaybackId());
        parcel.writeInt(skippable() ? 1 : 0);
    }
}
