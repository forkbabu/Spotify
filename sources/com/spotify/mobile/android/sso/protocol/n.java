package com.spotify.mobile.android.sso.protocol;

import android.content.Intent;
import android.net.Uri;
import java.util.Set;

public class n {
    n() {
    }

    static String c(Intent intent) {
        if (intent.getSerializableExtra("VERSION") instanceof Integer) {
            return String.valueOf(intent.getIntExtra("VERSION", 0));
        }
        return intent.getStringExtra("VERSION");
    }

    static boolean d(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (!parse.isHierarchical() || !queryParameterNames.contains("client_id") || !queryParameterNames.contains("scope")) {
            return false;
        }
        return true;
    }

    public m a(Intent intent) {
        int ordinal = b(intent).ordinal();
        if (ordinal == 1) {
            return new k(new i(intent), intent);
        }
        if (ordinal == 2) {
            return new j(new i(intent), intent);
        }
        if (ordinal != 3) {
            return new i(intent);
        }
        Uri data = intent.getData();
        data.getClass();
        return new p(data.toString());
    }

    public ProtocolVersion b(Intent intent) {
        if ("sonos-v1".equals(c(intent))) {
            return ProtocolVersion.SONOS_V1;
        }
        if ("com.spotify.sso.action.START_GOOGLE_AUTH_FLOW_V1".equals(intent.getAction())) {
            return ProtocolVersion.GOOGLE_V1;
        }
        if (d(intent.getDataString())) {
            return ProtocolVersion.URI_V1;
        }
        if ("1".equals(c(intent))) {
            return ProtocolVersion.V1;
        }
        if ("google-assistant-v1".equals(c(intent))) {
            return ProtocolVersion.GOOGLE_ASSISTANT_V1;
        }
        return ProtocolVersion.UNRESOLVED;
    }
}
