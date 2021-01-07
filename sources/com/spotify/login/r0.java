package com.spotify.login;

import com.spotify.login.AuthenticationMetadata;
import io.reactivex.a;
import io.reactivex.z;

public interface r0 {
    z<w0> a(String str, String str2, boolean z);

    z<w0> b(String str, String str2, boolean z, AuthenticationMetadata.AuthSource authSource);

    z<x0> c(String str, String str2);

    z<w0> d(String str, boolean z, AuthenticationMetadata.AuthSource authSource);

    z<x0> e(String str);

    z<u0> f(String str, boolean z);

    z<w0> g(String str, String str2, boolean z);

    z<w0> h(String str, String str2, boolean z, boolean z2, AuthenticationMetadata.AuthSource authSource);

    z<x0> resendCode(String str);

    a w();
}
