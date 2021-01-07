package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.hubframework.defaults.g;
import com.spotify.music.C0707R;

public enum HubsGlue2TrackCloud implements q81, v51 {
    TRACK_CLOUD("glue2:trackCloud") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.TRACK_CLOUD.getId();
        }
    };
    
    private final String mComponentId;

    private enum Impl implements g {
        TRACK_CLOUD(C0707R.id.hub_glue2_solar_track_cloud) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new g0();
            }
        };
        
        private static final Impl[] b = values();
        private final int mId;

        Impl(int i, AnonymousClass1 r4) {
            this.mId = i;
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.g
        public int getId() {
            return this.mId;
        }
    }

    HubsGlue2TrackCloud(String str, AnonymousClass1 r4) {
        this.mComponentId = str;
    }

    public static u51 g(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return g.a.b(hubsGlueImageDelegate, Impl.b);
    }

    @Override // defpackage.q81
    public String category() {
        return HubsComponentCategory.ROW.d();
    }

    @Override // defpackage.q81
    public String id() {
        return this.mComponentId;
    }
}
