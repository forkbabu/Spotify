package androidx.navigation;

import android.content.Intent;
import android.net.Uri;

public class l {
    private final Uri a;
    private final String b;
    private final String c;

    l(Intent intent) {
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.a = data;
        this.b = action;
        this.c = type;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public Uri c() {
        return this.a;
    }

    public String toString() {
        StringBuilder Z0 = je.Z0("NavDeepLinkRequest", "{");
        if (this.a != null) {
            Z0.append(" uri=");
            Z0.append(this.a.toString());
        }
        if (this.b != null) {
            Z0.append(" action=");
            Z0.append(this.b);
        }
        if (this.c != null) {
            Z0.append(" mimetype=");
            Z0.append(this.c);
        }
        Z0.append(" }");
        return Z0.toString();
    }
}
