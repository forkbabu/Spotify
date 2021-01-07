package com.spotify.music.libs.googleassistantaccountlinking;

import android.app.PendingIntent;
import android.content.Context;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import kotlin.jvm.internal.h;

public final class a {
    private final Context a;
    private final com.spotify.mobile.android.sso.protocol.a b;

    public a(Context context, com.spotify.mobile.android.sso.protocol.a aVar) {
        h.e(context, "activity");
        h.e(aVar, "authorizationActivityIntentProvider");
        this.a = context;
        this.b = aVar;
    }

    public PendingIntent a(int i) {
        AuthorizationRequest a2 = AuthorizationRequest.a("805f2916c4d64f3cb684aa991527168e", AuthorizationRequest.ResponseType.CODE, "https://oauth-redirect.googleusercontent.com/r/account-linking-65ff0", null, null, e.a(), false);
        Context context = this.a;
        PendingIntent activity = PendingIntent.getActivity(context, i, this.b.c(context, a2), 134217728);
        h.d(activity, "PendingIntent.getActivit…_UPDATE_CURRENT\n        )");
        return activity;
    }
}
