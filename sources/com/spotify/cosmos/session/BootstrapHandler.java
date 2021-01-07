package com.spotify.cosmos.session;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.concurrent.Callable;

public interface BootstrapHandler {
    l<LoginResponse, z<LoginResponse>> continueWith(l<byte[], z<LoginResponse>> lVar);

    l<LoginResponse, z<LoginResponse>> continueWith(l<byte[], z<LoginResponse>> lVar, Callable<z<LoginResponse>> callable);
}
