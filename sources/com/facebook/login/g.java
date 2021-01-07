package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.c;
import com.facebook.internal.f0;
import com.facebook.login.LoginClient;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* access modifiers changed from: package-private */
public class g extends p {
    public static final Parcelable.Creator<g> CREATOR = new a();
    private static ScheduledThreadPoolExecutor c;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new g[i];
        }
    }

    g(LoginClient loginClient) {
        super(loginClient);
    }

    public static synchronized ScheduledThreadPoolExecutor l() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (g.class) {
            if (c == null) {
                c = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = c;
        }
        return scheduledThreadPoolExecutor;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public String f() {
        return "device_auth";
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public boolean k(LoginClient.d dVar) {
        c f = this.b.f();
        if (f == null || f.isFinishing()) {
            return true;
        }
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.Y4(f.v0(), "login_with_facebook");
        deviceAuthDialog.s5(dVar);
        return true;
    }

    @Override // com.facebook.login.p, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f0.U(parcel, this.a);
    }

    protected g(Parcel parcel) {
        super(parcel);
    }
}
