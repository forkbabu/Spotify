package com.spotify.music.features.home.common.datasource;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.hubs.view.proto.View;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.json.e;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;

public class j {
    private final ObjectMapper a;
    private final AndroidFeatureHomeProperties b;

    public j(e eVar, AndroidFeatureHomeProperties androidFeatureHomeProperties) {
        this.a = eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build();
        this.b = androidFeatureHomeProperties;
    }

    public b91 a(byte[] bArr) {
        if (bArr.length <= 0) {
            throw new HomeResponseParseException();
        } else if (this.b.g()) {
            return kha.d(View.p(bArr));
        } else {
            return (b91) this.a.readValue(bArr, HubsJsonViewModel.class);
        }
    }
}
