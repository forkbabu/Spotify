package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;

/* renamed from: t02  reason: default package */
public class t02 {
    private final WeakReference<Context> a;

    public t02(Context context) {
        this.a = new WeakReference<>(context);
    }

    public void a() {
        this.a.clear();
    }

    public String b() {
        Context context = this.a.get();
        return context != null ? context.getResources().getString(C0707R.string.premium_destination_30_day_secondary_cta) : "";
    }

    public String c(boolean z) {
        Context context = this.a.get();
        if (context == null) {
            return "";
        }
        return context.getString(z ? C0707R.string.premium_in_app_destination_feature_heading_ontrial : C0707R.string.premium_destination_what_you_get);
    }

    public String d(boolean z) {
        Context context = this.a.get();
        if (context == null) {
            return "";
        }
        return context.getString(z ? C0707R.string.premium_in_app_destination_heading_ontrial : C0707R.string.premium_in_app_destination_heading_free);
    }

    public CharSequence e(String str) {
        SpannableString spannableString;
        String str2;
        Context context = this.a.get();
        if (context == null) {
            return "";
        }
        String string = context.getString(C0707R.string.premium_destination_terms_apply);
        Context context2 = this.a.get();
        if (context2 == null) {
            spannableString = SpannableString.valueOf("");
        } else {
            SpannableString spannableString2 = new SpannableString(context2.getString(C0707R.string.premium_destination_learn_more));
            if (Offer.AD_TARGETING_KEY_30_DAY_TRIAL.equals(str)) {
                str2 = context2.getString(C0707R.string.trial_tos_url);
            } else {
                str2 = context2.getString(C0707R.string.terms_and_conditions_url);
            }
            spannableString2.setSpan(new u02(str2), 0, spannableString2.length(), 17);
            spannableString = spannableString2;
        }
        return SpannableStringBuilder.valueOf(string).append((CharSequence) " ").append((CharSequence) spannableString);
    }

    public String f() {
        Context context = this.a.get();
        if (context == null) {
            return "";
        }
        return context.getString(C0707R.string.premium_in_app_destination_heading_6_month_trial);
    }

    public String g() {
        Context context = this.a.get();
        if (context == null) {
            return "";
        }
        return context.getString(C0707R.string.premium_destination_terms_apply_6_month_trial);
    }

    public String h() {
        Context context = this.a.get();
        if (context == null) {
            return "";
        }
        return context.getString(C0707R.string.premium_destination_6_month_secondary_cta);
    }

    public String i() {
        Context context = this.a.get();
        return context != null ? context.getResources().getString(C0707R.string.premium_destination_cta_trial) : "";
    }

    public String j() {
        Context context = this.a.get();
        if (context == null) {
            return "";
        }
        return context.getString(C0707R.string.premium_destination_7_day_secondary_cta);
    }

    public String k() {
        Context context = this.a.get();
        return context != null ? context.getString(C0707R.string.premium_upsell_interstitial_call_to_action_get_premium) : "";
    }
}
