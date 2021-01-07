package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.localization.SpotifyLocale;
import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.notification.CategorySection;
import com.spotify.music.notification.NotificationV2;
import com.spotify.music.notification.c;
import com.spotify.pageloader.m0;
import com.spotify.pageloader.o0;
import io.reactivex.functions.l;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class n implements m {
    private final c a;
    private final y b;

    static final class a<T, R> implements l<List<CategorySection>, Pair<? extends List<? extends com.spotify.music.features.notificationsettings.common.a>, ? extends Channel>> {
        final /* synthetic */ Channel a;

        a(Channel channel) {
            this.a = channel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Pair<? extends List<? extends com.spotify.music.features.notificationsettings.common.a>, ? extends Channel> apply(List<CategorySection> list) {
            List<CategorySection> list2 = list;
            h.e(list2, "it");
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                h.d(t, "categorySection");
                List<NotificationV2> preferences = t.getPreferences();
                h.d(preferences, "categorySection.preferences");
                for (T t2 : preferences) {
                    h.d(t2, "notificationV2");
                    String name = t2.getName();
                    h.d(name, "notificationV2.name");
                    String description = t2.getDescription();
                    h.d(description, "notificationV2.description");
                    String key = t2.getKey();
                    h.d(key, "notificationV2.key");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (t2.isEmailEnabled()) {
                        linkedHashSet.add(Channel.EMAIL);
                    }
                    if (t2.isPushEnabled()) {
                        linkedHashSet.add(Channel.PUSH);
                    }
                    arrayList.add(new com.spotify.music.features.notificationsettings.common.a(name, description, key, linkedHashSet));
                }
            }
            return new Pair<>(arrayList, this.a);
        }
    }

    public n(c cVar, y yVar) {
        h.e(cVar, "endpoint");
        h.e(yVar, "scheduler");
        this.a = cVar;
        this.b = yVar;
    }

    @Override // com.spotify.music.features.notificationsettings.channeldetails.m
    public o0<Pair<List<com.spotify.music.features.notificationsettings.common.a>, Channel>> a(Channel channel) {
        h.e(channel, "channel");
        o0<Pair<List<com.spotify.music.features.notificationsettings.common.a>, Channel>> a2 = m0.a(this.a.a(SpotifyLocale.c()).H(this.b).A(new a(channel)));
        h.d(a2, "SingleLoadable.create(\n …              }\n        )");
        return a2;
    }
}
