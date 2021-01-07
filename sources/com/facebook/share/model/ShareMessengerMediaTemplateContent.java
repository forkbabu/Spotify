package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerMediaTemplateContent extends d<ShareMessengerMediaTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new a();
    private final MediaType p;
    private final String q;
    private final Uri r;
    private final h s;

    public enum MediaType {
        IMAGE,
        VIDEO
    }

    static class a implements Parcelable.Creator<ShareMessengerMediaTemplateContent> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ShareMessengerMediaTemplateContent[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.p = (MediaType) parcel.readSerializable();
        this.q = parcel.readString();
        this.r = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.s = (h) parcel.readParcelable(h.class.getClassLoader());
    }

    @Override // com.facebook.share.model.d
    public int describeContents() {
        return 0;
    }

    public String h() {
        return this.q;
    }

    public h i() {
        return this.s;
    }

    public MediaType j() {
        return this.p;
    }

    public Uri k() {
        return this.r;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.p);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.r, i);
        parcel.writeParcelable(this.s, i);
    }
}
