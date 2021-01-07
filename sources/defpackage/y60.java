package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: y60  reason: default package */
public class y60 {
    private String a;

    y60(String str, Bundle bundle) {
        this.a = bundle.getString("event");
        b(bundle);
    }

    public static y60 c(Bundle bundle) {
        String string = bundle.getString("eventType");
        if (TextUtils.isEmpty(string)) {
            string = "default";
        }
        string.hashCode();
        char c = 65535;
        switch (string.hashCode()) {
            case 366526597:
                if (string.equals("SearchTextEvent")) {
                    c = 0;
                    break;
                }
                break;
            case 530697857:
                if (string.equals("ItemSelectionEvent")) {
                    c = 1;
                    break;
                }
                break;
            case 1544803905:
                if (string.equals("default")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new a70(string, bundle);
            case 1:
                return new z60(string, bundle);
            case 2:
                return new y60(string, bundle);
            default:
                return null;
        }
    }

    public String a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void b(Bundle bundle) {
    }
}
