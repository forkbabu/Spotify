package com.spotify.music.libs.fullscreen.story.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class OverlayModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final ImageStyle f;
    private final int n;
    private final String o;
    private final String p;
    private final Type q;
    private final boolean r;

    public enum ImageStyle {
        SQUARE,
        CIRCULAR,
        ROUNDED
    }

    public enum Type {
        TRACK,
        ALBUM,
        ARTIST,
        PLAYLIST,
        EPISODE,
        SHOW
    }

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new OverlayModel(parcel.readString(), parcel.readString(), parcel.readString(), (ImageStyle) Enum.valueOf(ImageStyle.class, parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readString(), (Type) Enum.valueOf(Type.class, parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OverlayModel[i];
        }
    }

    public OverlayModel(String str, String str2, String str3, ImageStyle imageStyle, int i, String str4, String str5, Type type, boolean z) {
        h.e(str, "title");
        h.e(str2, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str3, "imageUri");
        h.e(imageStyle, "imageStyle");
        h.e(str4, "entityUri");
        h.e(str5, "contextUri");
        h.e(type, "type");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = imageStyle;
        this.n = i;
        this.o = str4;
        this.p = str5;
        this.q = type;
        this.r = z;
    }

    public static OverlayModel a(OverlayModel overlayModel, String str, String str2, String str3, ImageStyle imageStyle, int i, String str4, String str5, Type type, boolean z, int i2) {
        Type type2 = null;
        String str6 = (i2 & 1) != 0 ? overlayModel.a : null;
        String str7 = (i2 & 2) != 0 ? overlayModel.b : null;
        String str8 = (i2 & 4) != 0 ? overlayModel.c : null;
        ImageStyle imageStyle2 = (i2 & 8) != 0 ? overlayModel.f : null;
        int i3 = (i2 & 16) != 0 ? overlayModel.n : i;
        String str9 = (i2 & 32) != 0 ? overlayModel.o : null;
        String str10 = (i2 & 64) != 0 ? overlayModel.p : null;
        if ((i2 & 128) != 0) {
            type2 = overlayModel.q;
        }
        boolean z2 = (i2 & 256) != 0 ? overlayModel.r : z;
        h.e(str6, "title");
        h.e(str7, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str8, "imageUri");
        h.e(imageStyle2, "imageStyle");
        h.e(str9, "entityUri");
        h.e(str10, "contextUri");
        h.e(type2, "type");
        return new OverlayModel(str6, str7, str8, imageStyle2, i3, str9, str10, type2, z2);
    }

    public final int b() {
        return this.n;
    }

    public final String c() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.o;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlayModel)) {
            return false;
        }
        OverlayModel overlayModel = (OverlayModel) obj;
        return h.a(this.a, overlayModel.a) && h.a(this.b, overlayModel.b) && h.a(this.c, overlayModel.c) && h.a(this.f, overlayModel.f) && this.n == overlayModel.n && h.a(this.o, overlayModel.o) && h.a(this.p, overlayModel.p) && h.a(this.q, overlayModel.q) && this.r == overlayModel.r;
    }

    public final ImageStyle f() {
        return this.f;
    }

    public final boolean g() {
        return this.r;
    }

    public final String getImageUri() {
        return this.c;
    }

    public final String h() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ImageStyle imageStyle = this.f;
        int hashCode4 = (((hashCode3 + (imageStyle != null ? imageStyle.hashCode() : 0)) * 31) + this.n) * 31;
        String str4 = this.o;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.p;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Type type = this.q;
        if (type != null) {
            i = type.hashCode();
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z = this.r;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String i() {
        return this.a;
    }

    public final Type j() {
        return this.q;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("OverlayModel(title=");
        V0.append(this.a);
        V0.append(", subtitle=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append(", imageStyle=");
        V0.append(this.f);
        V0.append(", backgroundColor=");
        V0.append(this.n);
        V0.append(", entityUri=");
        V0.append(this.o);
        V0.append(", contextUri=");
        V0.append(this.p);
        V0.append(", type=");
        V0.append(this.q);
        V0.append(", inCollection=");
        return je.P0(V0, this.r, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f.name());
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q.name());
        parcel.writeInt(this.r ? 1 : 0);
    }
}
