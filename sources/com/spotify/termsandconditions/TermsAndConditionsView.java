package com.spotify.termsandconditions;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.c;
import com.google.common.base.Joiner;
import com.spotify.music.C0707R;

public class TermsAndConditionsView extends AppCompatTextView {
    private final n a = new n();

    public TermsAndConditionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c.n(this, C0707R.style.SignUpTocTextAppearance);
        j();
    }

    public final void j() {
        Resources resources = getResources();
        this.a.c(this, Joiner.on("<p>").join(resources.getString(C0707R.string.terms_and_conditions_text_terms_and_conditions), resources.getString(C0707R.string.terms_and_conditions_text_privacy_policy), resources.getString(C0707R.string.terms_and_conditions_service_based_messages)));
    }

    public void k() {
        Resources resources = getResources();
        this.a.c(this, Joiner.on("<p>").join(resources.getString(C0707R.string.terms_and_conditions_text_terms_and_conditions), resources.getString(C0707R.string.terms_and_conditions_text_privacy_policy), resources.getString(C0707R.string.terms_and_conditions_service_based_messages), resources.getString(C0707R.string.terms_and_conditions_text_choose_username_accept_tos_email_optout_info)));
    }

    public void setTermsAndConditionClickListener(k kVar) {
        this.a.b(kVar);
    }
}
