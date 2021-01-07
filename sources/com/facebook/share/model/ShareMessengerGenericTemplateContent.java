package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerGenericTemplateContent extends d<ShareMessengerGenericTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateContent> CREATOR = new a();
    private final boolean p;
    private final ImageAspectRatio q;
    private final i r;

    public enum ImageAspectRatio {
        HORIZONTAL,
        SQUARE
    }

    static class a implements Parcelable.Creator<ShareMessengerGenericTemplateContent> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ShareMessengerGenericTemplateContent[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        this.p = parcel.readByte() != 0;
        this.q = (ImageAspectRatio) parcel.readSerializable();
        this.r = (i) parcel.readParcelable(i.class.getClassLoader());
    }

    @Override // com.facebook.share.model.d
    public int describeContents() {
        return 0;
    }

    public i h() {
        return this.r;
    }

    public ImageAspectRatio i() {
        return this.q;
    }

    public boolean j() {
        return this.p;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.p ? (byte) 1 : 0);
        parcel.writeSerializable(this.q);
        parcel.writeParcelable(this.r, i);
    }
}
