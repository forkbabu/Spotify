package com.google.android.gms.auth.api.signin.internal;

import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.r;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class e implements Runnable {
    private static final pr c = new pr("RevokeAccessOperation", new String[0]);
    private final String a;
    private final r b = new r(null);

    private e(String str) {
        g.i(str);
        this.a = str;
    }

    public static com.google.android.gms.common.api.e<Status> a(String str) {
        if (str == null) {
            return f.a(new Status(4, (String) null), null);
        }
        e eVar = new e(str);
        new Thread(eVar).start();
        return eVar.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.q;
        try {
            String valueOf = String.valueOf(this.a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.o;
            } else {
                c.b("Unable to revoke access!", new Object[0]);
            }
            pr prVar = c;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            prVar.a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            pr prVar2 = c;
            String valueOf2 = String.valueOf(e.toString());
            prVar2.b(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            pr prVar3 = c;
            String valueOf3 = String.valueOf(e2.toString());
            prVar3.b(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.b.a(status);
    }
}
