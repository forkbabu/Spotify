package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.util.f0;
import java.util.Locale;

/* renamed from: iq  reason: default package */
public class iq implements Parcelable {
    public static final Parcelable.Creator<iq> CREATOR = new a();
    public static final iq o = new iq(null, null, 0, false, 0);
    public final String a;
    public final String b;
    public final int c;
    public final boolean f;
    public final int n;

    /* renamed from: iq$a */
    static class a implements Parcelable.Creator<iq> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public iq createFromParcel(Parcel parcel) {
            return new iq(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public iq[] newArray(int i) {
            return new iq[i];
        }
    }

    iq(String str, String str2, int i, boolean z, int i2) {
        this.a = f0.E(str);
        this.b = f0.E(str2);
        this.c = i;
        this.f = z;
        this.n = i2;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iq iqVar = (iq) obj;
        if (TextUtils.equals(this.a, iqVar.a) && TextUtils.equals(this.b, iqVar.b) && this.c == iqVar.c && this.f == iqVar.f && this.n == iqVar.n) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((hashCode + i) * 31) + this.c) * 31) + (this.f ? 1 : 0)) * 31) + this.n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        boolean z = this.f;
        int i2 = f0.a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.n);
    }

    /* renamed from: iq$b */
    public static class b {
        String a;
        String b;
        int c;
        boolean d;
        int e;

        @Deprecated
        public b() {
            this.a = null;
            this.b = null;
            this.c = 0;
            this.d = false;
            this.e = 0;
        }

        public b a(Context context) {
            CaptioningManager captioningManager;
            String str;
            int i = f0.a;
            if (i >= 19 && ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
                this.c = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    if (i >= 21) {
                        str = locale.toLanguageTag();
                    } else {
                        str = locale.toString();
                    }
                    this.b = str;
                }
            }
            return this;
        }

        b(iq iqVar) {
            this.a = iqVar.a;
            this.b = iqVar.b;
            this.c = iqVar.c;
            this.d = iqVar.f;
            this.e = iqVar.n;
        }
    }

    iq(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        int i = f0.a;
        this.f = parcel.readInt() != 0;
        this.n = parcel.readInt();
    }
}
