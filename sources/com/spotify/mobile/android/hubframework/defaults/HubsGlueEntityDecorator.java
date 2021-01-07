package com.spotify.mobile.android.hubframework.defaults;

import com.google.common.collect.ImmutableSet;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import defpackage.x81;

@Deprecated
final class HubsGlueEntityDecorator implements a61 {
    private static final ImmutableSet<String> a = ImmutableSet.of(HubsGlueCard.ENTITY.id(), HubsGlueRow.ENTITY.id());

    /* access modifiers changed from: private */
    public enum AllowedLabel {
        EXPLICIT("explicit"),
        PREMIUM("premium"),
        PLUS_19("19");
        
        private final String mKey;

        private static class a {
            private static final kg0<AllowedLabel> a = kg0.b(AllowedLabel.class, c.a);
        }

        private AllowedLabel(String str) {
            this.mKey = str;
        }

        public String d() {
            return this.mKey;
        }
    }

    HubsGlueEntityDecorator() {
    }

    @Override // defpackage.a61
    public s81 a(s81 s81) {
        HubsGlueImageSettings.Style style;
        if (!a.contains(s81.componentId().id())) {
            return s81;
        }
        a91 target = s81.target();
        x81 main = s81.images().main();
        if (!(target == null || main == null || (main.placeholder() != null && main.custom().keySet().contains("style")))) {
            String uri = target.uri();
            SpotifyIconV2 spotifyIconV2 = null;
            if (uri != null) {
                spotifyIconV2 = h71.a(uri);
                style = h71.b(uri);
            } else {
                style = null;
            }
            x81.a builder = main.toBuilder();
            if (main.placeholder() == null) {
                builder = builder.e(spotifyIconV2);
            }
            if (style != null && !main.custom().keySet().contains("style")) {
                builder = builder.a(HubsGlueImageSettings.b(style));
            }
            s81 = s81.toBuilder().t(s81.images().toBuilder().g(builder.c())).l();
        }
        AllowedLabel allowedLabel = (AllowedLabel) AllowedLabel.a.a.c(s81.custom().string("label")).orNull();
        return s81.toBuilder().d("label", allowedLabel != null ? allowedLabel.d() : "").l();
    }
}
