package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hr  reason: default package */
public final class hr extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<hr> CREATOR = new ir();
    private final int a;
    private final Uri b;
    private final int c;
    private final int f;

    hr(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.f = i3;
    }

    @RecentlyNonNull
    public final Uri I1() {
        return this.b;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof hr)) {
            hr hrVar = (hr) obj;
            if (m.a(this.b, hrVar.b) && this.c == hrVar.c && this.f == hrVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.f)});
    }

    @Override // java.lang.Object
    @RecentlyNonNull
    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.c), Integer.valueOf(this.f), this.b.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.S(parcel, 2, this.b, i, false);
        SafeParcelReader.M(parcel, 3, this.c);
        SafeParcelReader.M(parcel, 4, this.f);
        SafeParcelReader.m(parcel, a2);
    }

    public hr(@RecentlyNonNull JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        this.a = 1;
        this.b = uri;
        this.c = optInt;
        this.f = optInt2;
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (optInt < 0 || optInt2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }
}
