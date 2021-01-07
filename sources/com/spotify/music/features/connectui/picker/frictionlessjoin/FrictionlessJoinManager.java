package com.spotify.music.features.connectui.picker.frictionlessjoin;

import com.spotify.music.features.connectui.picker.frictionlessjoin.model.AvailableSession;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.c;
import com.spotify.music.sociallistening.models.Session;
import com.spotify.music.sociallistening.models.b;
import io.reactivex.s;
import io.reactivex.z;
import java.util.List;

public interface FrictionlessJoinManager extends f4d {

    public enum Origin {
        POLLING("poll"),
        DEVICES_REFRESH("device_discovered"),
        PICKER_OPENED("picker_open");
        
        private final String label;

        private Origin(String str) {
            this.label = str;
        }

        public final String d() {
            return this.label;
        }
    }

    s<List<Session>> b(List<String> list);

    z<List<AvailableSession>> d(List<String> list, Origin origin);

    z<c> e(String str);

    b g();

    z<c> h(String str);

    z<c> n(String str);
}
