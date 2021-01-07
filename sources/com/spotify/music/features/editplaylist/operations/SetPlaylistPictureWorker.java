package com.spotify.music.features.editplaylist.operations;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.k;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.editplaylist.upload.ImageUploadEndpoint;
import com.spotify.music.features.editplaylist.upload.a;
import com.spotify.playlist.endpoints.i;
import io.reactivex.z;
import java.io.File;
import okhttp3.c0;
import okhttp3.w;

public class SetPlaylistPictureWorker extends RxWorker {
    private final Context p;
    private final NotificationManager q;
    a r;
    ImageUploadEndpoint s;
    i t;

    public SetPlaylistPictureWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.p = context;
        this.q = (NotificationManager) context.getSystemService("notification");
    }

    @Override // androidx.work.RxWorker
    public z<ListenableWorker.a> p() {
        io.reactivex.a aVar;
        com.spotify.workmanager.a.a(this);
        String string = this.p.getString(C0707R.string.edit_playlist_change_image_notification_title);
        if (Build.VERSION.SDK_INT >= 26) {
            this.q.createNotificationChannel(new NotificationChannel("set_playlist_picture_channel", this.p.getString(C0707R.string.edit_playlist_change_image_notification_channel_title), 2));
        }
        k kVar = new k(this.p, "set_playlist_picture_channel");
        kVar.j(string);
        kVar.D(string);
        kVar.z(C0707R.drawable.icn_notification);
        kVar.u(true);
        l(new e(147, kVar.a()));
        d e = e();
        String e2 = e.e("KEY_PLAYLIST_URI");
        String e3 = e.e("KEY_IMAGE_URI");
        if (e2 == null || e3 == null) {
            return z.z(new ListenableWorker.a.C0051a());
        }
        Uri parse = Uri.parse(e3);
        if (Uri.EMPTY.equals(parse)) {
            aVar = this.t.f(e2, "");
        } else {
            aVar = this.s.a(c0.c(w.d("image/jpeg"), new File(parse.getPath()))).s(new n(this, e2)).A(l.a).t(new m(this, e2));
        }
        return aVar.P(new ListenableWorker.a.c());
    }
}
