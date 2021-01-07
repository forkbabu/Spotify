package com.spotify.player.internal;

import com.spotify.cosmos.router.Response;
import kotlin.jvm.internal.h;

public final class f {
    public static final zwd a(Response response) {
        h.e(response, "response");
        int status = response.getStatus();
        if (status != 200) {
            String str = "";
            if (status == 400) {
                String str2 = response.getHeaders().get("error-description");
                if (str2 != null) {
                    str = str2;
                }
                zwd a = zwd.a(str);
                h.d(a, "failure(response.headers…R_DESCRIPTION_KEY] ?: \"\")");
                return a;
            } else if (status != 403) {
                StringBuilder V0 = je.V0("Unknown error for ");
                V0.append(response.getUri());
                V0.append(" with status code ");
                V0.append(response.getStatus());
                V0.append('!');
                zwd a2 = zwd.a(V0.toString());
                h.d(a2, "failure(\"Unknown error f…ode ${response.status}!\")");
                return a2;
            } else {
                String str3 = response.getHeaders().get("forbidden-reasons");
                if (str3 != null) {
                    str = str3;
                }
                zwd a3 = zwd.a(str);
                h.d(a3, "failure(response.headers…IDDEN_REASONS_KEY] ?: \"\")");
                return a3;
            }
        } else {
            zwd b = zwd.b();
            h.d(b, "success()");
            return b;
        }
    }
}
