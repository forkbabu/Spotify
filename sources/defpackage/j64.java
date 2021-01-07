package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.a1;
import defpackage.s81;

/* renamed from: j64  reason: default package */
public class j64 {
    private final a1 a;

    public j64(a1 a1Var) {
        this.a = a1Var;
    }

    public s81 a(String str, String str2, boolean z) {
        s81.a v = z81.c().s("find-search-field").o("find:searchField", HubsComponentCategory.ROW.d()).r("primary_buttons").y(z81.h().a(str).c(str2)).e("click", z81.b().e("openSearchWithTransition")).v(n81.a(this.a.b().a()).toBuilder().p("ui:source", kfd.a0.getName()).p("ui:group", "search-field").p("ui:uri", ViewUris.p0.toString()).d());
        if (z) {
            v = v.e("voiceMicrophoneClick", z81.b().e("openVoice"));
        }
        return v.l();
    }
}
