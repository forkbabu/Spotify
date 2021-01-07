package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.channeldetails.g;
import com.spotify.ubi.specification.factories.MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled;
import com.spotify.ubi.specification.factories.MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled;
import com.spotify.ubi.specification.factories.MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled;
import com.spotify.ubi.specification.factories.MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled;
import com.spotify.ubi.specification.factories.s1;
import io.reactivex.functions.g;
import kotlin.NoWhenBranchMatchedException;

final class e<T> implements g<g.a> {
    final /* synthetic */ s1 a;
    final /* synthetic */ ere b;

    e(s1 s1Var, ere ere) {
        this.a = s1Var;
        this.b = ere;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(g.a aVar) {
        nqe nqe;
        MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled;
        MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled;
        MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled;
        MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled;
        g.a aVar2 = aVar;
        boolean b2 = aVar2.b();
        if (b2) {
            s1.b c = this.a.c(aVar2.a().c(), 1);
            int ordinal = aVar2.c().ordinal();
            if (ordinal == 0) {
                mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled.PUSH;
            } else if (ordinal == 1) {
                mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled.EMAIL;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String c2 = aVar2.a().c();
            switch (c2.hashCode()) {
                case -1474763089:
                    if (c2.equals("notify-recommended-music")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled.RECOMMENDED_MUSIC;
                        nqe = c.b(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case -1318328504:
                    if (c2.equals("notify-artist-updates")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled.ARTIST_UPDATES;
                        nqe = c.b(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case -828406013:
                    if (c2.equals("notify-news-and-offers")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled.NEWS_AND_OFFERS;
                        nqe = c.b(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case 203138612:
                    if (c2.equals("notify-new-music")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled.NEW_MUSIC;
                        nqe = c.b(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case 822001277:
                    if (c2.equals("notify-concert-notifications")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled.CONCERT_NOTIFICATIONS;
                        nqe = c.b(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case 1331895763:
                    if (c2.equals("notify-playlist-updates")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled.PLAYLIST_UPDATES;
                        nqe = c.b(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case 1648494837:
                    if (c2.equals("notify-product-news")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled.PRODUCT_NEWS;
                        nqe = c.b(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                default:
                    throw new IllegalArgumentException("Unknown category key");
            }
        } else if (!b2) {
            s1.b c3 = this.a.c(aVar2.a().c(), 1);
            int ordinal2 = aVar2.c().ordinal();
            if (ordinal2 == 0) {
                mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled.PUSH;
            } else if (ordinal2 == 1) {
                mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled.EMAIL;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String c4 = aVar2.a().c();
            switch (c4.hashCode()) {
                case -1474763089:
                    if (c4.equals("notify-recommended-music")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled.RECOMMENDED_MUSIC;
                        nqe = c3.a(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case -1318328504:
                    if (c4.equals("notify-artist-updates")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled.ARTIST_UPDATES;
                        nqe = c3.a(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case -828406013:
                    if (c4.equals("notify-news-and-offers")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled.NEWS_AND_OFFERS;
                        nqe = c3.a(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case 203138612:
                    if (c4.equals("notify-new-music")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled.NEW_MUSIC;
                        nqe = c3.a(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case 822001277:
                    if (c4.equals("notify-concert-notifications")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled.CONCERT_NOTIFICATIONS;
                        nqe = c3.a(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case 1331895763:
                    if (c4.equals("notify-playlist-updates")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled.PLAYLIST_UPDATES;
                        nqe = c3.a(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                case 1648494837:
                    if (c4.equals("notify-product-news")) {
                        mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled = MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled.PRODUCT_NEWS;
                        nqe = c3.a(mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled, mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled);
                        break;
                    }
                    throw new IllegalArgumentException("Unknown category key");
                default:
                    throw new IllegalArgumentException("Unknown category key");
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.b.a(nqe);
    }
}
