package com.spotify.music.features.charts;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.z;

public interface j {
    @zqf("chartview/v4/charts/{block}/android")
    z<HubsJsonViewModel> a(@mrf("block") String str);

    @zqf("chartview/v4/albums/{id}/android")
    z<HubsJsonViewModel> b(@mrf("id") String str);

    @zqf("chartview/v4/overview/android")
    z<HubsJsonViewModel> c();
}
