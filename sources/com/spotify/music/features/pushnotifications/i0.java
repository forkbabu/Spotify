package com.spotify.music.features.pushnotifications;

import android.app.NotificationChannel;
import android.content.Context;
import androidx.core.app.q;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.spotify.music.C0707R;
import com.spotify.music.notification.NotificationCategoryEnum;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.s;
import io.reactivex.z;
import java.util.List;

public class i0 implements t0 {
    private final Context a;
    private final q b;

    public i0(Context context, q qVar) {
        this.a = context;
        this.b = qVar;
    }

    @Override // com.spotify.music.features.pushnotifications.t0
    public a a(NotificationCategoryEnum notificationCategoryEnum, boolean z) {
        return b.a;
    }

    @Override // com.spotify.music.features.pushnotifications.t0
    public Optional<NotificationCategoryEnum> b(String str) {
        q qVar = this.b;
        NotificationCategoryEnum notificationCategoryEnum = NotificationCategoryEnum.DEFAULT;
        NotificationChannel g = qVar.g(notificationCategoryEnum.getOSId());
        if (g == null || g.getImportance() == 0) {
            return Optional.absent();
        }
        return Optional.of(notificationCategoryEnum);
    }

    @Override // com.spotify.music.features.pushnotifications.t0
    public z<List<n0>> c() {
        return s.i0(new h0(NotificationCategoryEnum.DEFAULT, this.a.getString(C0707R.string.default_notification_channel_name), this.a.getString(C0707R.string.default_notification_channel_description), true)).Q(new a(this)).Z0();
    }

    @Override // com.spotify.music.features.pushnotifications.t0
    public List<NotificationCategoryEnum> d() {
        return Collections2.newArrayList(NotificationCategoryEnum.DEFAULT);
    }
}
