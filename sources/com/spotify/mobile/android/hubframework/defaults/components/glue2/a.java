package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.mobile.android.util.x;

/* access modifiers changed from: package-private */
public final class a {
    static void a(p90 p90, s81 s81, w51 w51) {
        Optional<SpotifyIconV2> a = n71.a((String) s81.custom().get("accessoryRightIcon"));
        if (a.isPresent()) {
            View k = z42.k(p90.getView().getContext(), a.get());
            if (s81.events().containsKey("rightAccessoryClick")) {
                i91.b(w51.b()).e("rightAccessoryClick").d(s81).c(k).a();
            }
            p90.z0(k);
            return;
        }
        p90.z0(null);
    }

    static void b(t90 t90, s81 s81) {
        String title = s81.text().title();
        Assertion.l(!MoreObjects.isNullOrEmpty(title), "title is missing");
        t90.setText(title);
    }

    static void c(x90 x90, s81 s81) {
        String title = s81.text().title();
        Assertion.l(!MoreObjects.isNullOrEmpty(title), "title is missing");
        x90.setTitle(title);
        String subtitle = s81.text().subtitle();
        if (!TextUtils.isEmpty(subtitle)) {
            String str = "";
            if (rw.equal("metadata", s81.custom().string("subtitleStyle", str))) {
                x90.e(subtitle);
            } else {
                x90.setSubtitle(subtitle);
            }
            TextView subtitleView = x90.getSubtitleView();
            String string = s81.custom().string("label");
            Context context = subtitleView.getContext();
            if (string != null) {
                str = string;
            }
            TextLabelUtil.d(context, subtitleView, str);
            return;
        }
        x90.setSubtitle(null);
    }

    static HubsGlueImageSettings.Style d(String str) {
        String str2 = (String) x.n(str, "");
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -2099210387:
                if (str2.equals("rippleSquare")) {
                    c = 0;
                    break;
                }
                break;
            case -1498085729:
                if (str2.equals("circular")) {
                    c = 1;
                    break;
                }
                break;
            case 584249583:
                if (str2.equals("rippleCircular")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return HubsGlueImageSettings.Style.SQUARE_WITH_RIPPLE;
            case 1:
                return HubsGlueImageSettings.Style.CIRCULAR;
            case 2:
                return HubsGlueImageSettings.Style.CIRCULAR_WITH_RIPPLE;
            default:
                return HubsGlueImageSettings.Style.DEFAULT;
        }
    }
}
