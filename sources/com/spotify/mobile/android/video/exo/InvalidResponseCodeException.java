package com.spotify.mobile.android.video.exo;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.m;
import java.util.List;
import java.util.Map;

public class InvalidResponseCodeException extends HttpDataSource.HttpDataSourceException {
    private static final long serialVersionUID = 9235823475L;
    public final Map<String, List<String>> mHeaderFields;
    public final String mResponseBody;
    public final int mResponseCode;

    public InvalidResponseCodeException(int i, Map<String, List<String>> map, m mVar, String str) {
        super(je.p0("Response code: ", i), mVar, 1);
        this.mResponseCode = i;
        this.mHeaderFields = map;
        this.mResponseBody = str;
    }
}
