package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) versionedParcel.t(remoteActionCompat.a, 1);
        remoteActionCompat.b = versionedParcel.k(remoteActionCompat.b, 2);
        remoteActionCompat.c = versionedParcel.k(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) versionedParcel.p(remoteActionCompat.d, 4);
        remoteActionCompat.e = versionedParcel.g(remoteActionCompat.e, 5);
        remoteActionCompat.f = versionedParcel.g(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.I(remoteActionCompat.a, 1);
        versionedParcel.A(remoteActionCompat.b, 2);
        versionedParcel.A(remoteActionCompat.c, 3);
        versionedParcel.E(remoteActionCompat.d, 4);
        versionedParcel.w(remoteActionCompat.e, 5);
        versionedParcel.w(remoteActionCompat.f, 6);
    }
}
