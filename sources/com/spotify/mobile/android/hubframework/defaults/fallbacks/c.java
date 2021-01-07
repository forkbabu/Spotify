package com.spotify.mobile.android.hubframework.defaults.fallbacks;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;

/* access modifiers changed from: package-private */
public final class c implements v51 {
    private static final Function<HubsComponentCategory, Integer> b = new a();
    private final kg0<HubsComponentCategory> a = kg0.a(HubsComponentCategory.class);

    static class a implements Function<HubsComponentCategory, Integer> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.common.base.Function
        public Integer apply(HubsComponentCategory hubsComponentCategory) {
            HubsComponentCategory hubsComponentCategory2 = hubsComponentCategory;
            hubsComponentCategory2.getClass();
            int ordinal = hubsComponentCategory2.ordinal();
            if (ordinal == 0) {
                return Integer.valueOf(HubsGlueCard.g());
            }
            if (ordinal == 1) {
                return Integer.valueOf(HubsGlueComponent.p());
            }
            if (ordinal == 2) {
                return Integer.valueOf(HubsGlueRow.g());
            }
            if (ordinal == 3) {
                return Integer.valueOf(HubsGlueSectionHeader.g());
            }
            if (ordinal == 4) {
                return Integer.valueOf(HubsCommonComponent.LOADING_SPINNER.d());
            }
            throw new AssertionError("Category without a default: " + hubsComponentCategory2);
        }
    }

    c() {
    }

    @Override // defpackage.v51
    public int d(s81 s81) {
        return this.a.f(s81.componentId().category()).transform(b).or((Optional<V>) ((V) 0)).intValue();
    }
}
