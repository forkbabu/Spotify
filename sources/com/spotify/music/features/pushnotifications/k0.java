package com.spotify.music.features.pushnotifications;

import android.app.NotificationChannel;
import androidx.core.app.q;
import com.adjust.sdk.Constants;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.spotify.localization.SpotifyLocale;
import com.spotify.music.notification.NotificationCategoryEnum;
import com.spotify.music.notification.c;
import io.reactivex.a;
import io.reactivex.internal.operators.observable.r;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class k0 implements t0 {
    private final c a;
    private final q b;
    private final Random c;

    public k0(c cVar, q qVar, Random random) {
        this.a = cVar;
        this.b = qVar;
        this.c = random;
    }

    @Override // com.spotify.music.features.pushnotifications.t0
    public a a(NotificationCategoryEnum notificationCategoryEnum, boolean z) {
        if (z) {
            return this.a.b(Constants.PUSH, notificationCategoryEnum.getRemoteId()).q(new h(notificationCategoryEnum, z));
        }
        return this.a.c(Constants.PUSH, notificationCategoryEnum.getRemoteId()).q(new c(notificationCategoryEnum, z));
    }

    @Override // com.spotify.music.features.pushnotifications.t0
    public Optional<NotificationCategoryEnum> b(String str) {
        ArrayList newArrayList = Collections2.newArrayList(NotificationCategoryEnum.ARTIST_UPDATES, NotificationCategoryEnum.CONCERT_NOTIFICATIONS, NotificationCategoryEnum.NEWS_AND_OFFERS, NotificationCategoryEnum.NEW_MUSIC, NotificationCategoryEnum.PLAYLIST_UPDATES, NotificationCategoryEnum.PRODUCT_NEWS, NotificationCategoryEnum.RECOMMENDED_MUSIC);
        ArrayList arrayList = new ArrayList();
        Iterator it = newArrayList.iterator();
        while (it.hasNext()) {
            NotificationCategoryEnum notificationCategoryEnum = (NotificationCategoryEnum) it.next();
            NotificationChannel g = this.b.g(notificationCategoryEnum.getOSId());
            if (!(g == null || g.getImportance() == 0)) {
                arrayList.add(notificationCategoryEnum);
            }
        }
        if (arrayList.isEmpty()) {
            return Optional.absent();
        }
        return Optional.of(arrayList.get(this.c.nextInt(arrayList.size())));
    }

    @Override // com.spotify.music.features.pushnotifications.t0
    public z<List<n0>> c() {
        return new r(this.a.a(SpotifyLocale.c()).x(e.a).j0(e0.a), f.a).j0(d.a).Q(new g(this)).Z0().m(b.a);
    }

    @Override // com.spotify.music.features.pushnotifications.t0
    public List<NotificationCategoryEnum> d() {
        return Collections2.newArrayList(NotificationCategoryEnum.ARTIST_UPDATES, NotificationCategoryEnum.CONCERT_NOTIFICATIONS, NotificationCategoryEnum.NEW_MUSIC, NotificationCategoryEnum.RECOMMENDED_MUSIC, NotificationCategoryEnum.PLAYLIST_UPDATES, NotificationCategoryEnum.NEWS_AND_OFFERS, NotificationCategoryEnum.PRODUCT_NEWS);
    }
}
