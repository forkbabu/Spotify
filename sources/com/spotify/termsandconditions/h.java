package com.spotify.termsandconditions;

import android.content.Context;
import com.spotify.music.C0707R;
import com.spotify.termsandconditions.model.LicenseUrlType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class h {
    private static final Pattern c = Pattern.compile("https?://(www\\.)?spotify\\.com.*");
    private final String a;
    private final LicenseUrlType b;

    public h(Context context, String str) {
        LicenseUrlType licenseUrlType = LicenseUrlType.TERMS_OF_SERVICE;
        if (str.startsWith("com.spotify.mobile.android.tos:spotify:internal:signup:tos")) {
            String string = context.getString(C0707R.string.terms_and_conditions_url);
            Matcher matcher = c.matcher(str);
            this.a = matcher.find() ? matcher.group() : string;
            context.getText(C0707R.string.terms_and_conditions_title_terms_and_conditions);
            this.b = licenseUrlType;
        } else if (str.startsWith("com.spotify.mobile.android.tos:spotify:internal:signup:policy")) {
            String string2 = context.getString(C0707R.string.terms_and_conditions_privacy_policy_url);
            Matcher matcher2 = c.matcher(str);
            this.a = matcher2.find() ? matcher2.group() : string2;
            context.getText(C0707R.string.terms_and_conditions_title_privacy_policy);
            this.b = LicenseUrlType.PRIVACY_POLICY;
        } else if (str.startsWith("com.spotify.mobile.android.tos:spotify:internal:signup:thirdparty")) {
            this.a = context.getString(C0707R.string.agreement_third_party_provision);
            context.getText(C0707R.string.korean_agreement_third_party_title);
            this.b = LicenseUrlType.THIRD_PARTY_POLICY;
        } else if (str.startsWith("com.spotify.mobile.android.tos:spotify:internal:signup:personal")) {
            this.a = context.getString(C0707R.string.agreement_collection_personal_information);
            context.getText(C0707R.string.korean_agreement_collection_personal_information_title);
            this.b = LicenseUrlType.PERSONAL_INFORMATION_POLICY;
        } else {
            this.a = context.getString(C0707R.string.terms_and_conditions_url);
            context.getText(C0707R.string.terms_and_conditions_title_terms_and_conditions);
            this.b = licenseUrlType;
        }
    }

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.b == LicenseUrlType.PERSONAL_INFORMATION_POLICY;
    }

    public boolean c() {
        return this.b == LicenseUrlType.PRIVACY_POLICY;
    }

    public boolean d() {
        return this.b == LicenseUrlType.THIRD_PARTY_POLICY;
    }
}
