package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.C0707R;

/* renamed from: g48  reason: default package */
public class g48 {
    private final Context a;

    public g48(Context context) {
        context.getClass();
        this.a = context;
    }

    public b91 a() {
        return t71.b(SpotifyIconV2.WARNING, this.a.getString(C0707R.string.error_general_title), this.a.getString(C0707R.string.error_general_body), z81.a().p("radio-hub-placeholder", "radio-hub-error-empty-view").d()).toBuilder().d("radio-hub-placeholder", "radio-hub-error-empty-view").g();
    }

    public b91 b() {
        return t71.d().l(z81.c().n(HubsGlueComponent.EMPTY_VIEW).t(z81.f().d(SpotifyIconV2.OFFLINE)).y(z81.h().a(this.a.getString(C0707R.string.error_no_connection_title)).c(this.a.getString(C0707R.string.error_no_connection_body))).p(z81.a().p("radio-hub-placeholder", "radio-hub-no-network-empty-view").d()).v(z81.a().p("ui:group", "radio-hub-no-network-empty-view").d()).l()).g();
    }
}
