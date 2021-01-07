package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.player.model.Context;
import defpackage.s81;

/* renamed from: bf7  reason: default package */
public class bf7 {
    private final boolean a;
    private final df7 b;
    private final k91 c = new k91(new xe7(this));

    public bf7(boolean z, df7 df7) {
        this.a = z;
        this.b = df7;
    }

    public static s81 a(bf7 bf7, s81 s81) {
        bf7.getClass();
        if (!je.B(s81, HubsGlue2Row.IMAGE_ROW.id())) {
            return null;
        }
        Optional<String> a2 = af7.a(s81);
        if (!a2.isPresent()) {
            return null;
        }
        String str = a2.get();
        l0 z = l0.z(str);
        s81.a builder = s81.toBuilder();
        w81 text = s81.text();
        s81.a z2 = builder.z(text.toBuilder().d(bf7.b.a(text.subtitle(), z)).build());
        if (!(z.q() == LinkType.TRACK && bf7.a)) {
            return z2.d("accessoryRightIcon", SpotifyIconV2.CHEVRON_RIGHT.name()).l();
        }
        return z2.d("accessoryRightIcon", SpotifyIconV2.MORE_ANDROID.name()).f("click", z81.b().e("playFromContext").b("uri", str).a(HubsImmutableComponentBundle.builder().e("player", HubsImmutableComponentBundle.builder().e("context", b81.b(Context.fromTrackUris(str, ImmutableList.of(str)))).d()).d()).c()).f("rightAccessoryClick", b71.a(str, null)).l();
    }

    public b91 b(b91 b91) {
        return this.c.b(b91);
    }
}
