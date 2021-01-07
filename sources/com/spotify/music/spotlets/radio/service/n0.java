package com.spotify.music.spotlets.radio.service;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class n0 {
    private final Map<String, ThumbState> a = new HashMap();
    private RadioStationTracksModel b;
    private int c;
    private final Set<String> d = new LinkedHashSet();

    public n0(RadioStationTracksModel radioStationTracksModel, c cVar) {
        radioStationTracksModel.getClass();
        this.c = 0;
        this.b = radioStationTracksModel;
        c(radioStationTracksModel);
    }

    public ThumbState a(String str) {
        ThumbState thumbState = this.a.get(str);
        return thumbState == null ? ThumbState.NONE : thumbState;
    }

    public void b(PlayerTrack playerTrack, int i) {
        if (playerTrack != null) {
            String uri = playerTrack.uri();
            if (uri.length() > 14) {
                this.d.add(uri.substring(14));
            }
            PlayerTrack[] playerTrackArr = this.b.tracks;
            if (playerTrackArr.length != 0) {
                int length = i % playerTrackArr.length;
                int i2 = length;
                boolean z = false;
                while (!uri.equals(this.b.tracks[i2].uri())) {
                    if (!z || length != i2) {
                        i2++;
                        if (i2 == this.b.tracks.length) {
                            z = true;
                            i2 = 0;
                        }
                    } else {
                        return;
                    }
                }
                Map<String, ThumbState> map = this.a;
                int i3 = agd.b;
                map.put(uri, ThumbState.d(playerTrack.metadata().get(PlayerTrack.Metadata.TRACK_RADIO_THUMB_STATE)));
                this.c = i2;
                Double.isNaN((double) this.b.tracks.length);
            }
        }
    }

    public void c(RadioStationTracksModel radioStationTracksModel) {
        radioStationTracksModel.getClass();
        radioStationTracksModel.tracks.getClass();
        this.b = radioStationTracksModel;
        PlayerTrack[] playerTrackArr = radioStationTracksModel.tracks;
        for (PlayerTrack playerTrack : playerTrackArr) {
            Map<String, ThumbState> map = this.a;
            String uri = playerTrack.uri();
            int i = agd.b;
            map.put(uri, ThumbState.d(playerTrack.metadata().get(PlayerTrack.Metadata.TRACK_RADIO_THUMB_STATE)));
        }
    }
}
