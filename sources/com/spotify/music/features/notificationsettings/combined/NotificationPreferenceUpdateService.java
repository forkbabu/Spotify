package com.spotify.music.features.notificationsettings.combined;

import android.content.Intent;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.notification.NotificationCategoryEnum;
import com.spotify.music.notification.c;
import com.spotify.rxjava2.q;
import dagger.android.g;
import io.reactivex.disposables.b;
import io.reactivex.y;
import java.util.Locale;

public class NotificationPreferenceUpdateService extends g {
    public static final /* synthetic */ int o = 0;
    public c a;
    public y b;
    public y c;
    public SnackbarManager f;
    private final q n = new q();

    class a implements io.reactivex.c {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // io.reactivex.c
        public void onComplete() {
            SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.notification_preferences_saved).actionText(null).onClickListener(null).build();
            if (NotificationPreferenceUpdateService.this.f.isAttached()) {
                NotificationPreferenceUpdateService.this.f.show(build);
            } else {
                NotificationPreferenceUpdateService.this.f.showOnNextAttach(build);
            }
            NotificationPreferenceUpdateService.this.n.c();
            NotificationPreferenceUpdateService.this.stopSelf(this.a);
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            Logger.d("Error: %s", th.getMessage());
            NotificationPreferenceUpdateService.this.n.c();
            NotificationPreferenceUpdateService.this.stopSelf(this.a);
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            NotificationPreferenceUpdateService.this.n.a(bVar);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.n.c();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        super.onStartCommand(intent, i, i2);
        String str2 = null;
        String action = intent != null ? intent.getAction() : null;
        boolean z = false;
        if (action != null) {
            char c2 = 65535;
            switch (action.hashCode()) {
                case -2073905262:
                    if (action.equals("client:email:playlistUpdates:enable")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1865668671:
                    if (action.equals("client:push:concertNotifications:disable")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1853327127:
                    if (action.equals("client:push:recommendedMusic:disable")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1802509403:
                    if (action.equals("client:email:recommendedMusic:disable")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1738025859:
                    if (action.equals("client:email:concertNotifications:disable")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1607167285:
                    if (action.equals("client:push:artistUpdates:enable")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1174745085:
                    if (action.equals("client:email:productNews:disable")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -880618823:
                    if (action.equals("client:email:playlistUpdates:disable")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -443113078:
                    if (action.equals("client:push:concertNotifications:enable")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case -392314221:
                    if (action.equals("client:push:newsAndOffers:enable")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case -290904104:
                    if (action.equals("client:push:newsAndOffers:disable")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case -217857716:
                    if (action.equals("client:push:productNews:enable")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case -163981018:
                    if (action.equals("client:email:recommendedMusic:enable")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                case -5183224:
                    if (action.equals("client:email:productNews:enable")) {
                        c2 = '\r';
                        break;
                    }
                    break;
                case 418125468:
                    if (action.equals("client:email:newsAndOffers:disable")) {
                        c2 = 14;
                        break;
                    }
                    break;
                case 641762549:
                    if (action.equals("client:push:playlistUpdates:disable")) {
                        c2 = 15;
                        break;
                    }
                    break;
                case 651163175:
                    if (action.equals("client:push:newMusic:enable")) {
                        c2 = 16;
                        break;
                    }
                    break;
                case 703356576:
                    if (action.equals("client:push:artistUpdates:disable")) {
                        c2 = 17;
                        break;
                    }
                    break;
                case 822280255:
                    if (action.equals("client:push:productNews:disable")) {
                        c2 = 18;
                        break;
                    }
                    break;
                case 909556615:
                    if (action.equals("client:email:artistUpdates:enable")) {
                        c2 = 19;
                        break;
                    }
                    break;
                case 1049511915:
                    if (action.equals("client:email:newMusic:enable")) {
                        c2 = 20;
                        break;
                    }
                    break;
                case 1358400354:
                    if (action.equals("client:push:recommendedMusic:enable")) {
                        c2 = 21;
                        break;
                    }
                    break;
                case 1412386148:
                    if (action.equals("client:email:artistUpdates:disable")) {
                        c2 = 22;
                        break;
                    }
                    break;
                case 1456033152:
                    if (action.equals("client:email:newMusic:disable")) {
                        c2 = 23;
                        break;
                    }
                    break;
                case 1639214414:
                    if (action.equals("client:email:concertNotifications:enable")) {
                        c2 = 24;
                        break;
                    }
                    break;
                case 1715981782:
                    if (action.equals("client:push:playlistUpdates:enable")) {
                        c2 = 25;
                        break;
                    }
                    break;
                case 1992124100:
                    if (action.equals("client:push:newMusic:disable")) {
                        c2 = 26;
                        break;
                    }
                    break;
                case 2124409679:
                    if (action.equals("client:email:newsAndOffers:enable")) {
                        c2 = 27;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.PLAYLIST_UPDATES.getRemoteId();
                    z = true;
                    break;
                case 1:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.CONCERT_NOTIFICATIONS.getRemoteId();
                    break;
                case 2:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.RECOMMENDED_MUSIC.getRemoteId();
                    break;
                case 3:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.RECOMMENDED_MUSIC.getRemoteId();
                    break;
                case 4:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.CONCERT_NOTIFICATIONS.getRemoteId();
                    break;
                case 5:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.ARTIST_UPDATES.getRemoteId();
                    z = true;
                    break;
                case 6:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.PRODUCT_NEWS.getRemoteId();
                    break;
                case 7:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.PLAYLIST_UPDATES.getRemoteId();
                    break;
                case '\b':
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.CONCERT_NOTIFICATIONS.getRemoteId();
                    z = true;
                    break;
                case '\t':
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.NEWS_AND_OFFERS.getRemoteId();
                    z = true;
                    break;
                case '\n':
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.NEWS_AND_OFFERS.getRemoteId();
                    break;
                case 11:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.PRODUCT_NEWS.getRemoteId();
                    z = true;
                    break;
                case '\f':
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.RECOMMENDED_MUSIC.getRemoteId();
                    z = true;
                    break;
                case '\r':
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.PRODUCT_NEWS.getRemoteId();
                    z = true;
                    break;
                case 14:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.NEWS_AND_OFFERS.getRemoteId();
                    break;
                case 15:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.PLAYLIST_UPDATES.getRemoteId();
                    break;
                case 16:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.NEW_MUSIC.getRemoteId();
                    z = true;
                    break;
                case 17:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.ARTIST_UPDATES.getRemoteId();
                    break;
                case 18:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.PRODUCT_NEWS.getRemoteId();
                    break;
                case 19:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.ARTIST_UPDATES.getRemoteId();
                    z = true;
                    break;
                case 20:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.NEW_MUSIC.getRemoteId();
                    z = true;
                    break;
                case 21:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.RECOMMENDED_MUSIC.getRemoteId();
                    z = true;
                    break;
                case 22:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.ARTIST_UPDATES.getRemoteId();
                    break;
                case 23:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.NEW_MUSIC.getRemoteId();
                    break;
                case 24:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.CONCERT_NOTIFICATIONS.getRemoteId();
                    z = true;
                    break;
                case 25:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.PLAYLIST_UPDATES.getRemoteId();
                    z = true;
                    break;
                case 26:
                    str2 = Channel.PUSH.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.NEW_MUSIC.getRemoteId();
                    break;
                case 27:
                    str2 = Channel.EMAIL.name().toLowerCase(Locale.US);
                    str = NotificationCategoryEnum.NEWS_AND_OFFERS.getRemoteId();
                    z = true;
                    break;
                default:
                    stopSelf(i2);
                    break;
            }
            if (str2 != null || str == null) {
                stopSelf(i2);
            } else {
                a aVar = new a(i2);
                if (z) {
                    this.a.b(str2, str).G(this.b).A(this.c).subscribe(aVar);
                } else {
                    this.a.c(str2, str).G(this.b).A(this.c).subscribe(aVar);
                }
            }
            return 2;
        }
        stopSelf(i2);
        str = null;
        if (str2 != null) {
        }
        stopSelf(i2);
        return 2;
    }
}
