package com.spotify.music.features.listeninghistory.datasource;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;

public interface c {
    @zqf("listening-history/v2/mobile/{timestamp}")
    z<HubsJsonViewModel> a(@mrf("timestamp") String str, @nrf("type") String str2);
}
