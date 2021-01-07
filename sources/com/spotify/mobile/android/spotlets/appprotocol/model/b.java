package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails;
import com.spotify.music.builtinauth.model.FieldValidator;

public class b extends FieldValidator {
    public void g(String str, HelloDetailsAppProtocol$HelloDetails helloDetailsAppProtocol$HelloDetails) {
        e(helloDetailsAppProtocol$HelloDetails, "details");
        b("spotify", str, "uri");
        c(helloDetailsAppProtocol$HelloDetails, AppProtocol.LogMessage.SEVERITY_INFO, "details");
        b(1, Integer.valueOf(helloDetailsAppProtocol$HelloDetails.info.protocolVersion), "protocol version");
        d(helloDetailsAppProtocol$HelloDetails.info.name, "name");
        d(helloDetailsAppProtocol$HelloDetails.info.id, "id");
        f(0, 10000, helloDetailsAppProtocol$HelloDetails.info.defaultImageWidth, "default image width");
        f(0, 10000, helloDetailsAppProtocol$HelloDetails.info.defaultImageHeight, "default image height");
        f(0, 10000, helloDetailsAppProtocol$HelloDetails.info.defaultThumbnailImageWidth, "default thumbnail image width");
        f(0, 10000, helloDetailsAppProtocol$HelloDetails.info.defaultThumbnailImageHeight, "default thumbnail image height");
        c(helloDetailsAppProtocol$HelloDetails.roles, "subscriber", "roles");
        c(helloDetailsAppProtocol$HelloDetails.roles, "caller", "roles");
    }

    public void h(HelloDetailsAppProtocol$HelloDetails helloDetailsAppProtocol$HelloDetails) {
        d(helloDetailsAppProtocol$HelloDetails.authid, "authid");
        a(helloDetailsAppProtocol$HelloDetails.authmethods, "authmethods");
        String[] strArr = helloDetailsAppProtocol$HelloDetails.authmethods;
        for (String str : strArr) {
            if (!a.a.contains(str)) {
                throw new FieldValidator.ValidationException('\"' + str + "\" is not a valid auth method");
            }
        }
    }
}
