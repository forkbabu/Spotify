package com.spotify.music.offlinetrials.limited.uicomponents;

import android.content.Context;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixImpressionLogger;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixInteractionLogger;
import com.spotify.music.offlinetrials.limited.logging.c;

public class u {
    private final Context a;
    private final g b;
    private final OfflineUserMixImpressionLogger c;
    private final OfflineUserMixInteractionLogger d;

    public interface a {
        void a();
    }

    public interface b {
        void a();
    }

    public u(Context context, com.spotify.music.offlinetrials.limited.logging.a aVar, c cVar) {
        g gVar = new g(context);
        this.a = context;
        this.b = gVar;
        com.spotify.music.libs.viewuri.c cVar2 = ViewUris.b0;
        PageIdentifiers pageIdentifiers = PageIdentifiers.OFFLINE_MIX_ENTITY;
        this.c = aVar.a(cVar2, pageIdentifiers);
        this.d = cVar.b(cVar2, pageIdentifiers);
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, b bVar, String str, String str2, String str3) {
        f c2 = this.b.c(str, str2);
        c2.e(this.a.getString(C0707R.string.user_mix_dialog_negative_button), new k(aVar));
        c2.f(str3, new i(bVar));
        c2.h(new l(aVar));
        c2.b().a();
    }

    public /* synthetic */ void b(a aVar) {
        aVar.a();
        this.d.b();
    }

    public /* synthetic */ void c(b bVar) {
        bVar.a();
        this.d.c();
    }

    public void d(a aVar, b bVar) {
        a(aVar, bVar, this.a.getString(C0707R.string.user_mix_track_error_header), this.a.getString(C0707R.string.user_mix_track_error_body), this.a.getString(C0707R.string.user_mix_track_error_positive_button));
        this.c.a();
    }

    public void e(a aVar, b bVar) {
        a(aVar, bVar, this.a.getResources().getQuantityString(C0707R.plurals.user_mix_songs_limit_popup_header, 30, 30), this.a.getString(C0707R.string.user_mix_songs_limit_popup_body), this.a.getString(C0707R.string.user_mix_dialog_reach_limit_positive_button));
        this.c.b();
    }

    public void f(a aVar, b bVar) {
        a(new m(this, aVar), new j(this, bVar), this.a.getString(C0707R.string.user_mix_track_remove_popup_header), this.a.getString(C0707R.string.user_mix_track_remove_popup_body), this.a.getString(C0707R.string.user_mix_dialog_track_remove_positive_button));
        this.c.c();
    }
}
