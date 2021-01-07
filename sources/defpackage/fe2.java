package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: fe2  reason: default package */
public final class fe2 {
    private final zd2 a;
    private final le2 b;

    public fe2(zd2 zd2, le2 le2) {
        h.e(zd2, "alexaAppStateCheckProvider");
        h.e(le2, "urlEncoder");
        this.a = zd2;
        this.b = le2;
    }

    public final String a(String str) {
        h.e(str, "state");
        if (this.a.a()) {
            return "https://alexa.amazon.com/spa/skill-account-linking-consent?fragment=skill-account-linking-consent&client_id=amzn1.application-oa2-client.9ef35a57bbb445a9b329037d6fc3643b&scope=alexa::skills:account_linking&skill_stage=live&response_type=code&redirect_uri=" + this.b.a("https://open.spotify.com/alexa-auth") + "&state=" + str;
        }
        StringBuilder Z0 = je.Z0("https://www.amazon.com/ap/oa?client_id=amzn1.application-oa2-client.9ef35a57bbb445a9b329037d6fc3643b&scope=alexa::skills:account_linking&response_type=code&", "redirect_uri=");
        Z0.append(this.b.a("https://open.spotify.com/alexa-auth"));
        Z0.append('&');
        Z0.append("state=");
        Z0.append(str);
        return Z0.toString();
    }
}
