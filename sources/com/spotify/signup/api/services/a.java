package com.spotify.signup.api.services;

import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import com.spotify.signup.api.services.model.EmailSignupResponse;
import com.spotify.signup.api.services.model.EmailValidationAndDisplayNameSuggestionResponse;
import com.spotify.signup.api.services.model.FacebookSignupRequest;
import com.spotify.signup.api.services.model.FacebookSignupResponse;
import com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody;
import com.spotify.signup.api.services.model.IdentifierTokenSignupResponse;
import com.spotify.signup.api.services.model.PasswordValidationResponse;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.z;

public interface a {
    @erf({"No-Webgate-Authentication: true"})
    @irf("signup/public/v1/account/")
    @yqf
    z<EmailSignupResponse> a(@xqf EmailSignupRequestBody emailSignupRequestBody);

    @erf({"No-Webgate-Authentication: true"})
    @zqf("signup/public/v1/account/?validate=1")
    z<SignupConfigurationResponse> b(@nrf("key") String str);

    @erf({"No-Webgate-Authentication: true"})
    @zqf("signup/public/v1/account/?validate=1&suggest=1")
    z<PasswordValidationResponse> c(@nrf("key") String str, @nrf("password") String str2);

    @erf({"No-Webgate-Authentication: true"})
    @irf("signup/public/v1/account/")
    @yqf
    z<FacebookSignupResponse> d(@xqf FacebookSignupRequest facebookSignupRequest);

    @erf({"No-Webgate-Authentication: true"})
    @irf("signup/public/v1/account/")
    @yqf
    z<IdentifierTokenSignupResponse> e(@xqf IdentifierTokenSignupRequestBody identifierTokenSignupRequestBody);

    @erf({"No-Webgate-Authentication: true"})
    @zqf("signup/public/v1/account/?validate=1&suggest=1")
    z<EmailValidationAndDisplayNameSuggestionResponse> f(@nrf("key") String str, @nrf("email") String str2);
}
