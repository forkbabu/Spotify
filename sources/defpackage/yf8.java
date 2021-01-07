package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.music.C0707R;
import defpackage.b91;
import defpackage.vqa;

/* renamed from: yf8  reason: default package */
public class yf8 implements qqa {
    private final Context a;
    private final z58 b;
    private final boolean c;

    public yf8(Context context, z58 z58, boolean z) {
        context.getClass();
        this.a = context;
        this.b = z58;
        this.c = z;
    }

    public static boolean f(b91 b91) {
        if (!b91.overlays().isEmpty()) {
            return "search-error-empty-view".equals(((s81) b91.overlays().get(0)).custom().get("tag"));
        }
        return false;
    }

    public static boolean g(b91 b91) {
        return "search-spinner".equals(b91.custom().get("tag"));
    }

    @Override // defpackage.qqa
    public b91 a(boolean z, boolean z2) {
        int i = !z ? C0707R.string.cosmos_no_internet_connection : C0707R.string.cosmos_search_start;
        int i2 = this.c ? C0707R.string.search_start_subtitle_assisted_curation : z2 ? C0707R.string.search_start_subtitle_podcast : C0707R.string.search_start_subtitle_free_user_online;
        p81 d = z81.a().p("tag", "search-start-empty-view").d();
        b91.a d2 = t71.d();
        vqa.a aVar = new vqa.a();
        aVar.e(this.a.getString(i));
        aVar.d(this.a.getString(i2));
        aVar.c(d);
        return d2.l(aVar.a()).g();
    }

    @Override // defpackage.qqa
    public b91 b(String str, boolean z) {
        int i = z ? C0707R.string.cosmos_search_start_subtitle_offline : C0707R.string.cosmos_search_no_results_subtitle;
        p81 d = z81.a().p("tag", "search-no-results-empty-view").a(rqa.a(str)).d();
        b91.a d2 = t71.d();
        vqa.a aVar = new vqa.a();
        Context context = this.a;
        str.getClass();
        aVar.e(context.getString(C0707R.string.cosmos_search_no_results, str));
        aVar.d(this.a.getString(i));
        aVar.c(d);
        return d2.l(aVar.a()).g();
    }

    @Override // defpackage.qqa
    public b91 c(String str) {
        p81 d = z81.a().p("tag", "search-offline-view").d();
        b91.a d2 = t71.d();
        vqa.a aVar = new vqa.a();
        aVar.e(this.a.getString(C0707R.string.error_no_connection_title));
        aVar.d(this.a.getString(C0707R.string.cosmos_search_start_subtitle_offline));
        aVar.c(d);
        return d2.l(aVar.a()).m(this.a.getString(C0707R.string.search_title, str)).g();
    }

    @Override // defpackage.qqa
    public b91 d(String str, Optional<String> optional) {
        p81 d = z81.a().p("tag", "search-error-empty-view").d();
        y58 a2 = this.b.a(optional);
        b91.a d2 = t71.d();
        vqa.a aVar = new vqa.a();
        aVar.e(this.a.getString(C0707R.string.cosmos_search_error));
        aVar.d(this.a.getString(C0707R.string.cosmos_search_error_retry));
        aVar.b(this.a.getString(C0707R.string.cosmos_search_error_retry_button), a2.a().a(), a2.b());
        aVar.c(d);
        return d2.l(aVar.a()).m(this.a.getString(C0707R.string.search_title, str)).g();
    }

    @Override // defpackage.qqa
    public b91 e() {
        return t71.d().l(z81.c().n(HubsCommonComponent.LOADING_SPINNER).l()).d("tag", "search-spinner").g();
    }
}
