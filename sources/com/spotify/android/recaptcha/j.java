package com.spotify.android.recaptcha;

import io.reactivex.z;
import java.util.Map;

public interface j {
    @erf({"No-Webgate-Authentication: true"})
    @irf("recaptcha-assess-service/v1/assessment")
    z<String> a(@uqf Map<String, String> map);
}
