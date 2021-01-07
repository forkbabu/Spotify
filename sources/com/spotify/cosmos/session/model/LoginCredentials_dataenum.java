package com.spotify.cosmos.session.model;

import com.spotify.dataenum.dataenum_case;

public interface LoginCredentials_dataenum {
    dataenum_case Autologin();

    dataenum_case Facebook(String str, String str2);

    dataenum_case GoogleSignIn(String str, String str2);

    dataenum_case OneTimeToken(String str);

    dataenum_case ParentChild(String str, String str2, byte[] bArr);

    dataenum_case Password(String str, String str2);

    dataenum_case PhoneNumber(String str);

    dataenum_case RefreshToken(String str, String str2);

    dataenum_case SamsungSignIn(String str, String str2, String str3);

    dataenum_case SpotifyToken(String str, byte[] bArr);

    dataenum_case StoredCredentials(String str, byte[] bArr);
}
