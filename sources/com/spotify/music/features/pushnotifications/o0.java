package com.spotify.music.features.pushnotifications;

import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;
import com.spotify.music.notification.NotificationCategoryEnum;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.v;
import org.json.JSONObject;

public class o0 {
    private final s<String> a;
    private final Context b;
    private final i c;
    private final ObjectMapper d;

    public o0(s<String> sVar, Context context, i iVar, g gVar) {
        this.a = sVar;
        this.b = context;
        this.c = iVar;
        this.d = gVar.a();
    }

    public a a(NotificationCategoryEnum notificationCategoryEnum, boolean z, boolean z2) {
        return this.a.Y(new k(this, notificationCategoryEnum, z, z2)).q(new j(notificationCategoryEnum, z, z2));
    }

    public s<p0> b(NotificationCategoryEnum notificationCategoryEnum) {
        return this.a.W(new n(this, notificationCategoryEnum), false, Integer.MAX_VALUE).L(new l(notificationCategoryEnum));
    }

    public /* synthetic */ a c(NotificationCategoryEnum notificationCategoryEnum, boolean z, boolean z2, String str) {
        return a.u(new m(this, this.c.b(this.b, str), notificationCategoryEnum.getCacheKey(), p0.create(notificationCategoryEnum.getId(), z, z2)));
    }

    public /* synthetic */ v d(NotificationCategoryEnum notificationCategoryEnum, String str) {
        return s.i0(this.d.readValue(this.c.b(this.b, str).h(notificationCategoryEnum.getCacheKey()).toString(), p0.class));
    }

    public /* synthetic */ void e(SpSharedPreferences spSharedPreferences, SpSharedPreferences.b bVar, p0 p0Var) {
        SpSharedPreferences.a b2 = spSharedPreferences.b();
        b2.d(bVar, new JSONObject(this.d.writeValueAsString(p0Var)));
        b2.j();
    }
}
