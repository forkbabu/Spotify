package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

/* renamed from: sy4  reason: default package */
public final class sy4 extends ty4 {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final String f;

    /* renamed from: sy4$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new sy4(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new sy4[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sy4(String str, String str2, String str3, String str4) {
        super(null);
        h.e(str, "entityUri");
        h.e(str2, "image");
        h.e(str3, "episodeTitle");
        h.e(str4, "podcastName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy4)) {
            return false;
        }
        sy4 sy4 = (sy4) obj;
        return h.a(this.a, sy4.a) && h.a(this.b, sy4.b) && h.a(this.c, sy4.c) && h.a(this.f, sy4.f);
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
        String str4 = this.f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("PodcastEpisode(entityUri=");
        V0.append(this.a);
        V0.append(", image=");
        V0.append(this.b);
        V0.append(", episodeTitle=");
        V0.append(this.c);
        V0.append(", podcastName=");
        return je.I0(V0, this.f, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
    }
}
