package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.spotify.voiceassistant.player.models.SearchResponse;
import java.util.Arrays;

public final class ConnectionResult extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new j();
    public static final int SUCCESS = 0;
    @RecentlyNonNull
    public static final ConnectionResult n = new ConnectionResult(0);
    private final int a;
    private final int b;
    private final PendingIntent c;
    private final String f;

    public ConnectionResult(int i) {
        this.a = 1;
        this.b = i;
        this.c = null;
        this.f = null;
    }

    static String r2(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return SearchResponse.RESULT_SUCCESS;
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final int I1() {
        return this.b;
    }

    @RecentlyNullable
    public final String Q1() {
        return this.f;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.b == connectionResult.b && m.a(this.c, connectionResult.c) && m.a(this.f, connectionResult.f);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.f});
    }

    @RecentlyNullable
    public final PendingIntent o2() {
        return this.c;
    }

    public final boolean p2() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public final boolean q2() {
        return this.b == 0;
    }

    @Override // java.lang.Object
    @RecentlyNonNull
    public final String toString() {
        m.a b2 = m.b(this);
        b2.a("statusCode", r2(this.b));
        b2.a("resolution", this.c);
        b2.a("message", this.f);
        return b2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.M(parcel, 2, this.b);
        SafeParcelReader.S(parcel, 3, this.c, i, false);
        SafeParcelReader.T(parcel, 4, this.f, false);
        SafeParcelReader.m(parcel, a2);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.f = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this.a = 1;
        this.b = i;
        this.c = pendingIntent;
        this.f = null;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this.a = 1;
        this.b = i;
        this.c = null;
        this.f = str;
    }
}
