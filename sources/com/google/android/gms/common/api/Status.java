package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.spotify.voiceassistant.player.models.SearchResponse;
import java.util.Arrays;

public final class Status extends a implements i, ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR = new m();
    @RecentlyNonNull
    public static final Status o = new Status(0, (String) null);
    @RecentlyNonNull
    public static final Status p = new Status(14, (String) null);
    @RecentlyNonNull
    public static final Status q = new Status(8, (String) null);
    @RecentlyNonNull
    public static final Status r = new Status(15, (String) null);
    @RecentlyNonNull
    public static final Status s = new Status(16, (String) null);
    private final int a;
    private final int b;
    private final String c;
    private final PendingIntent f;
    private final ConnectionResult n;

    Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.f = pendingIntent;
        this.n = connectionResult;
    }

    @RecentlyNullable
    public final ConnectionResult I1() {
        return this.n;
    }

    public final int Q1() {
        return this.b;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.a != status.a || this.b != status.b || !m.a(this.c, status.c) || !m.a(this.f, status.f) || !m.a(this.n, status.n)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.i
    @RecentlyNonNull
    public final Status h() {
        return this;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.f, this.n});
    }

    @RecentlyNullable
    public final String o2() {
        return this.c;
    }

    public final boolean p2() {
        return this.f != null;
    }

    public final boolean q2() {
        return this.b == 16;
    }

    public final boolean r2() {
        return this.b <= 0;
    }

    public final void s2(@RecentlyNonNull Activity activity, int i) {
        PendingIntent pendingIntent = this.f;
        if (pendingIntent != null) {
            g.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    @Override // java.lang.Object
    @RecentlyNonNull
    public final String toString() {
        m.a b2 = m.b(this);
        String str = this.c;
        if (str == null) {
            int i = this.b;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = SearchResponse.RESULT_SUCCESS;
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = je.f0(32, "unknown status code: ", i);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = SearchResponse.RESULT_ERROR;
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        b2.a("statusCode", str);
        b2.a("resolution", this.f);
        return b2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.b);
        SafeParcelReader.T(parcel, 2, this.c, false);
        SafeParcelReader.S(parcel, 3, this.f, i, false);
        SafeParcelReader.S(parcel, 4, this.n, i, false);
        SafeParcelReader.M(parcel, Constants.ONE_SECOND, this.a);
        SafeParcelReader.m(parcel, a2);
    }

    public Status(int i, String str) {
        this.a = 1;
        this.b = i;
        this.c = str;
        this.f = null;
        this.n = null;
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this.a = 1;
        this.b = i;
        this.c = str;
        this.f = null;
        this.n = null;
    }

    public Status(@RecentlyNonNull ConnectionResult connectionResult, @RecentlyNonNull String str) {
        this(1, 17, str, connectionResult.o2(), connectionResult);
    }
}
