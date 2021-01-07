package defpackage;

import android.view.View;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: lra  reason: default package */
public final class lra implements kra {
    @Override // defpackage.kra
    public void a(w51 w51, p90 p90, s81 s81) {
        Optional<SpotifyIconV2> a = n71.a(s81.custom().string("secondary_icon"));
        if (!a.isPresent() && s81.events().containsKey("rightAccessoryClick")) {
            a = Optional.of(SpotifyIconV2.MORE_ANDROID);
        }
        if (a.isPresent()) {
            asa asa = (asa) p90;
            View k = z42.k(asa.getView().getContext(), a.get());
            if (s81.events().containsKey("rightAccessoryClick")) {
                i91.b(w51.b()).e("rightAccessoryClick").d(s81).c(k).a();
            }
            k.setContentDescription(s81.custom().string("accessoryContentDesc"));
            asa.z0(k);
            return;
        }
        ((asa) p90).z0(null);
    }
}
