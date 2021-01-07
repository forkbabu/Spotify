package com.spotify.music.email;

import io.reactivex.z;

public interface d {
    @irf("email-verify/v1/send_verification_email")
    z<EmailVerifyResponse> a();
}
