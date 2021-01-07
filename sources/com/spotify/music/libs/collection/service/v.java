package com.spotify.music.libs.collection.service;

import android.content.res.Resources;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public class v {
    private final SnackbarManager a;
    private final caa b;
    private final Resources c;

    /* access modifiers changed from: package-private */
    public interface a {
        v a(Resources resources);
    }

    public v(SnackbarManager snackbarManager, caa caa, Resources resources) {
        this.c = resources;
        this.a = snackbarManager;
        this.b = caa;
    }

    private String d(int i) {
        return this.c.getString(i);
    }

    private String e(int i, Object... objArr) {
        return this.c.getString(i, objArr);
    }

    public static void g(v vVar, String str) {
        vVar.getClass();
        vVar.t(SnackbarConfiguration.builder(str));
    }

    private z<String> r(String str, LinkType linkType) {
        return this.b.a(str, linkType).I(200, TimeUnit.MILLISECONDS);
    }

    private void s(int i) {
        t(SnackbarConfiguration.builder(this.c.getString(i)));
    }

    private void t(SnackbarConfiguration.Builder builder) {
        SnackbarConfiguration build = builder.build();
        if (this.a.isAttached()) {
            this.a.show(build);
        } else {
            this.a.showOnNextAttach(build);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        s(C0707R.string.snackbar_added_to_liked_songs);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        s(C0707R.string.toast_liked_show_your_library);
    }

    /* access modifiers changed from: package-private */
    public io.reactivex.a c(String str) {
        return new i(r(str, LinkType.SHOW_SHOW).A(new g(this)).E(new h(this)).p(new d(this)));
    }

    /* access modifiers changed from: package-private */
    public void f() {
        s(C0707R.string.toast_banned_track);
    }

    public /* synthetic */ String h(String str) {
        return e(C0707R.string.snackbar_following_entity, str);
    }

    public /* synthetic */ String i(Throwable th) {
        return d(C0707R.string.toast_liked_show_your_library);
    }

    public /* synthetic */ String j(String str) {
        return e(C0707R.string.snackbar_banned_track_hide, str);
    }

    public /* synthetic */ String k(Throwable th) {
        return d(C0707R.string.snackbar_banned_track_hide_generic);
    }

    public void l(Runnable runnable, String str) {
        t(SnackbarConfiguration.builder(str).actionTextRes(C0707R.string.player_toastie_undo).onClickListener(runnable == null ? null : new j(runnable)));
    }

    public /* synthetic */ String m(String str) {
        return e(C0707R.string.snackbar_unfollowing_entity, str);
    }

    public /* synthetic */ String n(Throwable th) {
        return d(C0707R.string.toast_removed_from_collection_your_library);
    }

    /* access modifiers changed from: package-private */
    public io.reactivex.a o(String str, Runnable runnable) {
        return new i(r(str, l0.z(str).q()).A(new e(this)).E(new f(this)).p(new b(this, runnable)));
    }

    /* access modifiers changed from: package-private */
    public void p() {
        s(C0707R.string.snackbar_removed_from_liked_songs);
    }

    /* access modifiers changed from: package-private */
    public void q() {
        s(C0707R.string.toast_removed_from_collection_your_library);
    }

    /* access modifiers changed from: package-private */
    public io.reactivex.a u(String str) {
        return new i(r(str, LinkType.SHOW_SHOW).A(new i(this)).E(new c(this)).p(new d(this)));
    }
}
