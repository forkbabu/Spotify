package com.spotify.music.features.browse.view;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.music.C0707R;
import com.spotify.ubi.specification.factories.b0;
import defpackage.a94;

public class a {
    private final Context a;
    private final b0 b;

    public a(Context context, b0 b0Var) {
        context.getClass();
        this.a = context;
        this.b = b0Var;
    }

    public static boolean e(b91 b91) {
        return h(b91, "browse-error-empty-view");
    }

    public static boolean f(b91 b91) {
        return h(b91, "browse-loading-empty-view");
    }

    public static boolean g(b91 b91) {
        return h(b91, "browse-no-network-empty-view") || "browse-no-network-empty-view".equals(b91.custom().string("browse-placeholder"));
    }

    private static boolean h(b91 b91, String str) {
        int i = t71.c;
        return "hubs/placeholder".equals(b91.id()) && str.equals(b91.custom().string("browse-placeholder"));
    }

    public b91 a() {
        p81 a2 = n81.a(this.b.b().a());
        a94.a aVar = new a94.a();
        aVar.d(this.a.getString(C0707R.string.find_error_title));
        aVar.c(this.a.getString(C0707R.string.find_error_body));
        String string = this.a.getString(C0707R.string.find_error_retry);
        int i = q54.n;
        aVar.b(string, z81.b().e("retry").c(), a2);
        return t71.d().f(aVar.a()).h(e.a("browse-error-empty-view")).g();
    }

    public b91 b() {
        return t71.d().l(z81.c().n(HubsCommonComponent.LOADING_SPINNER).l()).h(e.a("browse-loading-empty-view")).g();
    }

    public b91 c() {
        return t71.d().f(z81.c().n(HubsCommonComponent.LOADING_SPINNER).l()).h(e.a("browse-loading-empty-view")).g();
    }

    public b91 d() {
        a94.a aVar = new a94.a();
        aVar.d(this.a.getString(C0707R.string.find_error_no_connection_title));
        aVar.c(this.a.getString(C0707R.string.find_error_no_connection_body));
        return t71.d().f(aVar.a()).h(e.a("browse-no-network-empty-view")).g();
    }
}
