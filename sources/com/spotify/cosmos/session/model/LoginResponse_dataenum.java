package com.spotify.cosmos.session.model;

import com.spotify.dataenum.dataenum_case;

public interface LoginResponse_dataenum {
    dataenum_case BootstrapRequired(String str);

    dataenum_case CodeRequired(String str, int i, long j, String str2, long j2, int i2);

    dataenum_case CodeSuccess(String str, String str2, Boolean bool);

    dataenum_case Error(int i, String str);

    dataenum_case Success(SessionInfo sessionInfo);
}
