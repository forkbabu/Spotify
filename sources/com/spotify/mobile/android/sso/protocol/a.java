package com.spotify.mobile.android.sso.protocol;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationActivity;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import java.util.Locale;

public final class a {
    private static void a(Intent intent, AuthorizationRequest authorizationRequest) {
        intent.putExtra("CLIENT_ID", authorizationRequest.b());
        intent.putExtra("CLIENT_IDENTITY", authorizationRequest.c());
        intent.putExtra("REDIRECT_URI", authorizationRequest.e());
        intent.putExtra("RESPONSE_TYPE", authorizationRequest.f().toString().toLowerCase(Locale.ENGLISH));
        intent.putExtra("SCOPES", authorizationRequest.g());
        if (authorizationRequest.i() != null) {
            intent.putExtra("STATE", authorizationRequest.i());
        }
    }

    public Intent b(Context context, AuthorizationRequest authorizationRequest) {
        Intent addCategory = new Intent(context, AuthorizationActivity.class).setAction("com.spotify.mobile.android.sso.action.ACTIVITY").setPackage(context.getPackageName()).addCategory("android.intent.category.DEFAULT");
        addCategory.putExtra("VERSION", 1);
        a(addCategory, authorizationRequest);
        return addCategory;
    }

    public Intent c(Context context, AuthorizationRequest authorizationRequest) {
        Intent addCategory = new Intent(context, AuthorizationActivity.class).setAction("com.spotify.mobile.android.sso.action.ACTIVITY").setPackage(context.getPackageName()).addCategory("android.intent.category.DEFAULT");
        addCategory.putExtra("VERSION", "google-assistant-v1");
        a(addCategory, authorizationRequest);
        return addCategory;
    }
}
