package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import java.util.Collections;
import java.util.List;

/* renamed from: zn4  reason: default package */
public class zn4 implements Parcelable {
    public static final Parcelable.Creator<zn4> CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;
    private final List<b> o;

    /* renamed from: zn4$a */
    static class a implements Parcelable.Creator<zn4> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public zn4 createFromParcel(Parcel parcel) {
            return new zn4(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public zn4[] newArray(int i) {
            return new zn4[i];
        }
    }

    protected zn4(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.f = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.createTypedArrayList(b.CREATOR);
    }

    public static zn4 a() {
        return new zn4();
    }

    public int b() {
        int i = this.a;
        if (i == 0) {
            return C0707R.drawable.connect_education_computer;
        }
        if (i == 1) {
            return C0707R.drawable.connect_education_tv;
        }
        if (i == 3 || i == 4 || i == 5) {
            return 0;
        }
        return C0707R.drawable.connect_education_speaker;
    }

    public String c() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.c;
    }

    public SpotifyIconV2 f() {
        int i = this.a;
        if (i == 0) {
            return SpotifyIconV2.DEVICE_COMPUTER;
        }
        if (i == 1) {
            return SpotifyIconV2.DEVICE_TV;
        }
        if (i == 3) {
            return SpotifyIconV2.GAMES_CONSOLE;
        }
        if (i == 4) {
            return SpotifyIconV2.CHROMECAST_DISCONNECTED;
        }
        if (i != 5) {
            return SpotifyIconV2.DEVICE_SPEAKER;
        }
        return SpotifyIconV2.BLUETOOTH;
    }

    public List<b> g() {
        return this.o;
    }

    public int getType() {
        return this.a;
    }

    public String h() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.n);
        parcel.writeTypedList(this.o);
    }

    /* renamed from: zn4$b */
    public static class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        private final String a;
        private final CharSequence b;

        /* renamed from: zn4$b$a */
        static class a implements Parcelable.Creator<b> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(String str, CharSequence charSequence) {
            this.a = str;
            this.b = charSequence;
        }

        public CharSequence a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
        }

        protected b(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public zn4(int i, String str, String str2, String str3, String str4, List<b> list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.n = str4;
        this.o = list;
    }

    private zn4() {
        this.a = 0;
        this.b = "";
        this.c = "";
        this.f = null;
        this.n = null;
        this.o = Collections.emptyList();
    }
}
