package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: bi9  reason: default package */
final class bi9 extends th9 {
    public static final Parcelable.Creator<bi9> CREATOR = new a();

    /* renamed from: bi9$a */
    static class a implements Parcelable.Creator<bi9> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public bi9 createFromParcel(Parcel parcel) {
            return new bi9(parcel.readString(), parcel.readString(), parcel.readString(), (SpotifyIconV2) Enum.valueOf(SpotifyIconV2.class, parcel.readString()), (SpotifyIconV2) Enum.valueOf(SpotifyIconV2.class, parcel.readString()), parcel.readInt() == 1);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public bi9[] newArray(int i) {
            return new bi9[i];
        }
    }

    bi9(String str, String str2, String str3, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, boolean z) {
        super(str, str2, str3, spotifyIconV2, spotifyIconV22, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(e());
        parcel.writeString(g());
        parcel.writeString(b());
        parcel.writeString(f().name());
        parcel.writeString(a().name());
        parcel.writeInt(h() ? 1 : 0);
    }
}
