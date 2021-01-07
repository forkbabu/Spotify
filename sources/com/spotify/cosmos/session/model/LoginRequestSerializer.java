package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.common.io.BaseEncoding;
import com.spotify.cosmos.session.model.LoginCredentials;
import com.spotify.cosmos.session.model.LoginOptions;
import java.io.IOException;

class LoginRequestSerializer extends JsonSerializer<LoginRequest> {
    LoginRequestSerializer() {
    }

    static /* synthetic */ void a(JsonGenerator jsonGenerator, LoginCredentials.Password password) {
        writeStringField(jsonGenerator, "authenticationType", "password");
        writeStringField(jsonGenerator, "username", password.username());
        writeStringField(jsonGenerator, "password", password.password());
    }

    static /* synthetic */ void b(JsonGenerator jsonGenerator, LoginCredentials.Facebook facebook) {
        writeStringField(jsonGenerator, "authenticationType", "facebookToken");
        writeStringField(jsonGenerator, "username", facebook.username());
        writeStringField(jsonGenerator, "blob", facebook.blob());
    }

    static /* synthetic */ void c(JsonGenerator jsonGenerator, LoginCredentials.GoogleSignIn googleSignIn) {
        writeStringField(jsonGenerator, "authenticationType", "googleSignIn");
        writeStringField(jsonGenerator, "authCode", googleSignIn.authCode());
        if (googleSignIn.redirectUri() != null) {
            writeStringField(jsonGenerator, "redirectUri", googleSignIn.redirectUri());
        }
    }

    static /* synthetic */ void d(JsonGenerator jsonGenerator, LoginCredentials.StoredCredentials storedCredentials) {
        writeStringField(jsonGenerator, "authenticationType", "storedSpotifyCredentials");
        writeStringField(jsonGenerator, "username", storedCredentials.username());
        writeStringField(jsonGenerator, "blobBase64", BaseEncoding.base64().encode(storedCredentials.blob()));
    }

    static /* synthetic */ void e(JsonGenerator jsonGenerator, LoginCredentials.PhoneNumber phoneNumber) {
        writeStringField(jsonGenerator, "authenticationType", "phoneNumber");
        writeStringField(jsonGenerator, "number", phoneNumber.number());
    }

    static /* synthetic */ void f(JsonGenerator jsonGenerator, LoginCredentials.OneTimeToken oneTimeToken) {
        writeStringField(jsonGenerator, "authenticationType", "oneTimeToken");
        writeStringField(jsonGenerator, "token", oneTimeToken.token());
    }

    static /* synthetic */ void g(JsonGenerator jsonGenerator, LoginCredentials.SpotifyToken spotifyToken) {
        writeStringField(jsonGenerator, "authenticationType", "spotifyToken");
        writeStringField(jsonGenerator, "username", spotifyToken.username());
        writeStringField(jsonGenerator, "blobBase64", BaseEncoding.base64().encode(spotifyToken.blob()));
    }

    static /* synthetic */ void h(JsonGenerator jsonGenerator, LoginCredentials.ParentChild parentChild) {
        writeStringField(jsonGenerator, "authenticationType", "parentChild");
        writeStringField(jsonGenerator, "childId", parentChild.childId());
        writeStringField(jsonGenerator, "parentUsername", parentChild.parentUsername());
        writeStringField(jsonGenerator, "parentDataBase64", BaseEncoding.base64().encode(parentChild.parentBlob()));
    }

    static /* synthetic */ void j(JsonGenerator jsonGenerator, LoginCredentials.RefreshToken refreshToken) {
        writeStringField(jsonGenerator, "authenticationType", "refreshToken");
        writeStringField(jsonGenerator, "refreshToken", refreshToken.refreshToken());
        if (refreshToken.obfuscatedSecret() != null) {
            writeStringField(jsonGenerator, "obfuscatedSecret", refreshToken.obfuscatedSecret());
        }
    }

    static /* synthetic */ void k(JsonGenerator jsonGenerator, LoginCredentials.SamsungSignIn samsungSignIn) {
        writeStringField(jsonGenerator, "authenticationType", "samsungSignIn");
        writeStringField(jsonGenerator, "authCode", samsungSignIn.authCode());
        writeStringField(jsonGenerator, "redirectUri", samsungSignIn.redirectUri());
        writeStringField(jsonGenerator, "tokenEndpointUrl", samsungSignIn.tokenEndpointUrl());
    }

    private static void writeOptions(LoginOptions loginOptions, JsonGenerator jsonGenerator) {
        if (loginOptions != null) {
            jsonGenerator.writeFieldName("options");
            jsonGenerator.writeStartObject();
            LoginOptions.PreAuthenticationSetting preAuthenticationSetting = loginOptions.preAuthenticationSetting();
            if (preAuthenticationSetting != null) {
                jsonGenerator.writeStringField("pre_authentication_setting", preAuthenticationSetting.toString());
            }
            Boolean authOnlySetting = loginOptions.authOnlySetting();
            if (authOnlySetting != null) {
                boolean booleanValue = authOnlySetting.booleanValue();
                jsonGenerator.writeFieldName("auth_only_setting");
                jsonGenerator.writeBoolean(booleanValue);
            }
            Boolean bootstrapRequired = loginOptions.bootstrapRequired();
            if (bootstrapRequired != null) {
                boolean booleanValue2 = bootstrapRequired.booleanValue();
                jsonGenerator.writeFieldName("bootstrap_required");
                jsonGenerator.writeBoolean(booleanValue2);
            }
            jsonGenerator.writeEndObject();
        }
    }

    /* access modifiers changed from: private */
    public static void writeStringField(JsonGenerator jsonGenerator, String str, String str2) {
        try {
            jsonGenerator.writeStringField(str, str2);
        } catch (IOException unused) {
            throw new AssertionError(je.y0(str, " : ", str2));
        }
    }

    public void serialize(LoginRequest loginRequest, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("credentials");
        jsonGenerator.writeStartObject();
        loginRequest.credentials().match(new g(jsonGenerator), new k(jsonGenerator), new j(jsonGenerator), new c(jsonGenerator), new a(jsonGenerator), new b(jsonGenerator), new i(jsonGenerator), new e(jsonGenerator), new d(jsonGenerator), new h(jsonGenerator), new f(jsonGenerator));
        jsonGenerator.writeEndObject();
        writeOptions(loginRequest.options(), jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
