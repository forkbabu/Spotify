package com.spotify.signup.splitflow.agreements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.music.C0707R;
import com.spotify.termsandconditions.n;
import kotlin.jvm.internal.h;

public final class KoreanAgreementsView extends LinearLayout {
    private final n a;
    private SwitchCompat b;
    private SwitchCompat c;
    private TextView f;
    private SwitchCompat n;
    private a o;

    public interface a {
    }

    public KoreanAgreementsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void a(KoreanAgreementsView koreanAgreementsView) {
        SwitchCompat switchCompat = koreanAgreementsView.c;
        if (switchCompat != null) {
            boolean z = false;
            if (switchCompat.getVisibility() == 0) {
                a aVar = koreanAgreementsView.o;
                if (aVar != null) {
                    SwitchCompat switchCompat2 = koreanAgreementsView.b;
                    if (switchCompat2 != null) {
                        if (switchCompat2.isChecked()) {
                            SwitchCompat switchCompat3 = koreanAgreementsView.c;
                            if (switchCompat3 == null) {
                                h.k("personalInformationToggle");
                                throw null;
                            } else if (switchCompat3.isChecked()) {
                                z = true;
                            }
                        }
                        SwitchCompat switchCompat4 = koreanAgreementsView.n;
                        if (switchCompat4 != null) {
                            boolean isChecked = switchCompat4.isChecked();
                            SwitchCompat switchCompat5 = koreanAgreementsView.c;
                            if (switchCompat5 != null) {
                                ((vje) aVar).a.accept(rje.a(z, isChecked, switchCompat5.isChecked()));
                                return;
                            }
                            h.k("personalInformationToggle");
                            throw null;
                        }
                        h.k("thirdPartyToggle");
                        throw null;
                    }
                    h.k("termsAndConditionToggle");
                    throw null;
                }
                return;
            }
            a aVar2 = koreanAgreementsView.o;
            if (aVar2 != null) {
                SwitchCompat switchCompat6 = koreanAgreementsView.b;
                if (switchCompat6 != null) {
                    boolean isChecked2 = switchCompat6.isChecked();
                    SwitchCompat switchCompat7 = koreanAgreementsView.n;
                    if (switchCompat7 != null) {
                        ((vje) aVar2).a.accept(rje.a(isChecked2, switchCompat7.isChecked(), false));
                        return;
                    }
                    h.k("thirdPartyToggle");
                    throw null;
                }
                h.k("termsAndConditionToggle");
                throw null;
            }
            return;
        }
        h.k("personalInformationToggle");
        throw null;
    }

    public final void b(boolean z) {
        if (z) {
            SwitchCompat switchCompat = this.c;
            if (switchCompat != null) {
                switchCompat.setVisibility(0);
                TextView textView = this.f;
                if (textView != null) {
                    textView.setVisibility(0);
                } else {
                    h.k("personalInformationTag");
                    throw null;
                }
            } else {
                h.k("personalInformationToggle");
                throw null;
            }
        } else {
            SwitchCompat switchCompat2 = this.c;
            if (switchCompat2 != null) {
                switchCompat2.setVisibility(8);
                TextView textView2 = this.f;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                } else {
                    h.k("personalInformationTag");
                    throw null;
                }
            } else {
                h.k("personalInformationToggle");
                throw null;
            }
        }
    }

    public final a getValidationListener() {
        return this.o;
    }

    public final void setValidationListener(a aVar) {
        this.o = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KoreanAgreementsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        n nVar = new n();
        this.a = nVar;
        LayoutInflater.from(context).inflate(C0707R.layout.korean_agreements_view, (ViewGroup) this, true);
        setOrientation(1);
        KoreanAgreementsView$setupToggles$listener$1 koreanAgreementsView$setupToggles$listener$1 = new KoreanAgreementsView$setupToggles$listener$1(this);
        View findViewById = findViewById(C0707R.id.switch_terms_conditions);
        h.d(findViewById, "this.findViewById(R.id.switch_terms_conditions)");
        this.b = (SwitchCompat) findViewById;
        View findViewById2 = findViewById(C0707R.id.switch_personal_information);
        h.d(findViewById2, "this.findViewById(R.id.s…tch_personal_information)");
        this.c = (SwitchCompat) findViewById2;
        View findViewById3 = findViewById(C0707R.id.required_tag_personal_information);
        h.d(findViewById3, "this.findViewById(R.id.r…tag_personal_information)");
        this.f = (TextView) findViewById3;
        View findViewById4 = findViewById(C0707R.id.switch_third_party);
        h.d(findViewById4, "this.findViewById(R.id.switch_third_party)");
        this.n = (SwitchCompat) findViewById4;
        SwitchCompat switchCompat = this.b;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(new a(koreanAgreementsView$setupToggles$listener$1));
            SwitchCompat switchCompat2 = this.c;
            if (switchCompat2 != null) {
                switchCompat2.setOnCheckedChangeListener(new a(koreanAgreementsView$setupToggles$listener$1));
                SwitchCompat switchCompat3 = this.n;
                if (switchCompat3 != null) {
                    switchCompat3.setOnCheckedChangeListener(new a(koreanAgreementsView$setupToggles$listener$1));
                    SwitchCompat switchCompat4 = this.b;
                    if (switchCompat4 != null) {
                        nVar.c(switchCompat4, getContext().getString(C0707R.string.korean_agreements_terms_and_conditions_text));
                        SwitchCompat switchCompat5 = this.c;
                        if (switchCompat5 != null) {
                            nVar.c(switchCompat5, getContext().getString(C0707R.string.korean_agreements_personal_information_text));
                            SwitchCompat switchCompat6 = this.n;
                            if (switchCompat6 != null) {
                                nVar.c(switchCompat6, getContext().getString(C0707R.string.korean_agreements_third_party_text));
                                nVar.c((TextView) findViewById(C0707R.id.txt_privacy_policy), getContext().getString(C0707R.string.korean_agreements_privacy_policy_text));
                                return;
                            }
                            h.k("thirdPartyToggle");
                            throw null;
                        }
                        h.k("personalInformationToggle");
                        throw null;
                    }
                    h.k("termsAndConditionToggle");
                    throw null;
                }
                h.k("thirdPartyToggle");
                throw null;
            }
            h.k("personalInformationToggle");
            throw null;
        }
        h.k("termsAndConditionToggle");
        throw null;
    }
}
