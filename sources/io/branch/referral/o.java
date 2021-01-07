package io.branch.referral;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

class o {
    private static String a = "bnc_no_value";
    private static c b;
    static boolean c;
    static boolean d;

    class a implements InstallReferrerStateListener {
        final /* synthetic */ InstallReferrerClient a;
        final /* synthetic */ Context b;

        a(o oVar, InstallReferrerClient installReferrerClient, Context context) {
            this.a = installReferrerClient;
            this.b = context;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            long j;
            long j2;
            String str;
            if (i != -1) {
                if (i == 0) {
                    try {
                        ReferrerDetails installReferrer = this.a.getInstallReferrer();
                        if (installReferrer != null) {
                            String installReferrer2 = installReferrer.getInstallReferrer();
                            long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                            j = installReferrer.getInstallBeginTimestampSeconds();
                            j2 = referrerClickTimestampSeconds;
                            str = installReferrer2;
                        } else {
                            j = 0;
                            str = null;
                            j2 = 0;
                        }
                        o.a(this.b, str, j2, j);
                        return;
                    } catch (RemoteException e) {
                        e.getMessage();
                        o.b();
                        return;
                    }
                } else if (!(i == 1 || i == 2 || i == 3)) {
                    return;
                }
            }
            o.b();
        }
    }

    class b extends TimerTask {
        b(o oVar) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            o.f();
        }
    }

    /* access modifiers changed from: package-private */
    public interface c {
    }

    o() {
    }

    static void a(Context context, String str, long j, long j2) {
        r r = r.r(context);
        if (j > 0) {
            r.M("bnc_referrer_click_ts", j);
        }
        if (j2 > 0) {
            r.M("bnc_install_begin_ts", j2);
        }
        if (str != null) {
            try {
                String decode = URLDecoder.decode(str, Constants.ENCODING);
                HashMap hashMap = new HashMap();
                String[] split = decode.split("&");
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = "-";
                        if (str2.contains("=") || !str2.contains(str3)) {
                            str3 = "=";
                        }
                        String[] split2 = str2.split(str3);
                        if (split2.length > 1) {
                            hashMap.put(URLDecoder.decode(split2[0], Constants.ENCODING), URLDecoder.decode(split2[1], Constants.ENCODING));
                        }
                    }
                }
                Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.LinkClickID;
                if (hashMap.containsKey(defines$Jsonkey.d())) {
                    String str4 = (String) hashMap.get(defines$Jsonkey.d());
                    a = str4;
                    r.O("bnc_link_click_identifier", str4);
                }
                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.IsFullAppConv;
                if (hashMap.containsKey(defines$Jsonkey2.d())) {
                    Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.ReferringLink;
                    if (hashMap.containsKey(defines$Jsonkey3.d())) {
                        r.L(Boolean.parseBoolean((String) hashMap.get(defines$Jsonkey2.d())));
                        r.O("bnc_app_link", (String) hashMap.get(defines$Jsonkey3.d()));
                    }
                }
                Defines$Jsonkey defines$Jsonkey4 = Defines$Jsonkey.GoogleSearchInstallReferrer;
                if (hashMap.containsKey(defines$Jsonkey4.d())) {
                    r.O("bnc_google_search_install_identifier", (String) hashMap.get(defines$Jsonkey4.d()));
                    r.O("bnc_google_play_install_referrer_extras", decode);
                }
                if (hashMap.containsValue(Defines$Jsonkey.PlayAutoInstalls.d())) {
                    r.O("bnc_google_play_install_referrer_extras", decode);
                    a.b(context, hashMap);
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
        f();
    }

    static void b() {
        d = true;
        f();
    }

    public static String e() {
        return a;
    }

    /* access modifiers changed from: private */
    public static void f() {
        c cVar = b;
        if (cVar != null) {
            ((Branch) cVar).V();
            b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Context context, long j, c cVar) {
        c = true;
        b = cVar;
        try {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            build.startConnection(new a(this, build, context));
        } catch (Throwable th) {
            th.getMessage();
        }
        new Timer().schedule(new b(this), j);
    }
}
