package com.spotify.encore.consumer.components.authentication.impl.authenticationbutton;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.core.widget.c;
import com.spotify.android.glue.components.common.SpotifyIconSpan;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.impl.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class DefaultAuthenticationButtonViewBinder {
    private final StateListAnimatorButton view;

    /* access modifiers changed from: private */
    public static final class ButtonValue {
        private final Integer background;
        private final Integer icon;
        private final int name;
        private final Integer textColor;

        public ButtonValue(int i, Integer num, Integer num2, Integer num3) {
            this.name = i;
            this.icon = num;
            this.background = num2;
            this.textColor = num3;
        }

        public static /* synthetic */ ButtonValue copy$default(ButtonValue buttonValue, int i, Integer num, Integer num2, Integer num3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = buttonValue.name;
            }
            if ((i2 & 2) != 0) {
                num = buttonValue.icon;
            }
            if ((i2 & 4) != 0) {
                num2 = buttonValue.background;
            }
            if ((i2 & 8) != 0) {
                num3 = buttonValue.textColor;
            }
            return buttonValue.copy(i, num, num2, num3);
        }

        public final int component1() {
            return this.name;
        }

        public final Integer component2() {
            return this.icon;
        }

        public final Integer component3() {
            return this.background;
        }

        public final Integer component4() {
            return this.textColor;
        }

        public final ButtonValue copy(int i, Integer num, Integer num2, Integer num3) {
            return new ButtonValue(i, num, num2, num3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonValue)) {
                return false;
            }
            ButtonValue buttonValue = (ButtonValue) obj;
            return this.name == buttonValue.name && h.a(this.icon, buttonValue.icon) && h.a(this.background, buttonValue.background) && h.a(this.textColor, buttonValue.textColor);
        }

        public final Integer getBackground() {
            return this.background;
        }

        public final Integer getIcon() {
            return this.icon;
        }

        public final int getName() {
            return this.name;
        }

        public final Integer getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            int i = this.name * 31;
            Integer num = this.icon;
            int i2 = 0;
            int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.background;
            int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.textColor;
            if (num3 != null) {
                i2 = num3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ButtonValue(name=");
            V0.append(this.name);
            V0.append(", icon=");
            V0.append(this.icon);
            V0.append(", background=");
            V0.append(this.background);
            V0.append(", textColor=");
            V0.append(this.textColor);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ButtonValue(int i, Integer num, Integer num2, Integer num3, int i2, f fVar) {
            this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3);
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            AuthenticationButton.AuthenticationType.values();
            int[] iArr = new int[10];
            $EnumSwitchMapping$0 = iArr;
            AuthenticationButton.AuthenticationType authenticationType = AuthenticationButton.AuthenticationType.GOOGLE;
            iArr[3] = 1;
            AuthenticationButton.AuthenticationType authenticationType2 = AuthenticationButton.AuthenticationType.PHONE_NUMBER;
            iArr[1] = 2;
            AuthenticationButton.AuthenticationType authenticationType3 = AuthenticationButton.AuthenticationType.FACEBOOK;
            iArr[2] = 3;
            AuthenticationButton.AuthenticationType authenticationType4 = AuthenticationButton.AuthenticationType.EMAIL;
            iArr[4] = 4;
            AuthenticationButton.AuthenticationType authenticationType5 = AuthenticationButton.AuthenticationType.EMAIL_LOG_IN;
            iArr[5] = 5;
            AuthenticationButton.AuthenticationType authenticationType6 = AuthenticationButton.AuthenticationType.EMAIL_LOGIN_LEGACY;
            iArr[6] = 6;
            AuthenticationButton.AuthenticationType authenticationType7 = AuthenticationButton.AuthenticationType.EMAIL_SIGNUP_LEGACY;
            iArr[8] = 7;
            AuthenticationButton.AuthenticationType authenticationType8 = AuthenticationButton.AuthenticationType.EMAIL_SIGNUP_PREMIUM;
            iArr[7] = 8;
            AuthenticationButton.AuthenticationType authenticationType9 = AuthenticationButton.AuthenticationType.MORE_OPTIONS;
            iArr[9] = 9;
        }
    }

    public DefaultAuthenticationButtonViewBinder(Activity activity) {
        h.e(activity, "activity");
        View inflate = View.inflate(activity, R.layout.view_default_authentication_button, null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.view = (StateListAnimatorButton) inflate;
    }

    private final void applyButtonValue(AuthenticationButton.AuthenticationType authenticationType, ButtonValue buttonValue) {
        CharSequence charSequence;
        Context context = this.view.getContext();
        StateListAnimatorButton stateListAnimatorButton = this.view;
        Integer background = buttonValue.getBackground();
        stateListAnimatorButton.setBackground(background != null ? a.d(context, background.intValue()) : null);
        StateListAnimatorButton stateListAnimatorButton2 = this.view;
        if (authenticationType == AuthenticationButton.AuthenticationType.MORE_OPTIONS) {
            h.d(context, "context");
            charSequence = getMoreOptionsText(context, buttonValue.getName());
        } else {
            charSequence = context.getText(buttonValue.getName());
        }
        stateListAnimatorButton2.setText(charSequence);
        StateListAnimatorButton stateListAnimatorButton3 = this.view;
        Integer textColor = buttonValue.getTextColor();
        stateListAnimatorButton3.setTextColor(a.b(context, textColor != null ? textColor.intValue() : R.color.authentication_button_default_color));
        Integer icon = buttonValue.getIcon();
        Drawable d = icon != null ? a.d(context, icon.intValue()) : null;
        StateListAnimatorButton stateListAnimatorButton4 = this.view;
        int dimensionPixelSize = stateListAnimatorButton4.getResources().getDimensionPixelSize(C0707R.dimen.multiline_button_padding);
        if (d != null) {
            stateListAnimatorButton4.setPaddingRelative(dimensionPixelSize, stateListAnimatorButton4.getPaddingTop(), d.getIntrinsicWidth() + dimensionPixelSize, stateListAnimatorButton4.getPaddingBottom());
        }
        c.h(stateListAnimatorButton4, d, null, null, null);
    }

    private final ButtonValue getButtonValue(AuthenticationButton.Model model) {
        int ordinal = model.getType().ordinal();
        Integer valueOf = Integer.valueOf((int) C0707R.color.glue_button_primary_blue_text);
        Integer valueOf2 = Integer.valueOf((int) C0707R.drawable.sthlm_blk_outline_button);
        Integer valueOf3 = Integer.valueOf((int) C0707R.drawable.glue_button_primary_green);
        switch (ordinal) {
            case 1:
                if (model.isPreferred()) {
                    return new ButtonValue(R.string.continue_with_phone, Integer.valueOf((int) C0707R.drawable.button_icon_mobile_white_24dp), valueOf3, valueOf);
                }
                return new ButtonValue(R.string.continue_with_phone, Integer.valueOf((int) C0707R.drawable.button_icon_mobile_white_24dp), valueOf2, valueOf);
            case 2:
                if (model.isPreferred()) {
                    return new ButtonValue(R.string.signup_experiment_copy_facebook_button, Integer.valueOf((int) C0707R.drawable.button_icon_facebook_white_24dp), Integer.valueOf((int) C0707R.drawable.glue_button_primary_blue), valueOf);
                }
                return new ButtonValue(R.string.signup_experiment_copy_facebook_button, Integer.valueOf((int) C0707R.drawable.button_icon_facebook_color_24dp), valueOf2, null, 8, null);
            case 3:
                if (model.isPreferred()) {
                    return new ButtonValue(R.string.continue_with_google, Integer.valueOf((int) C0707R.drawable.button_icon_google_color_24dp), Integer.valueOf((int) C0707R.drawable.glue_button_primary_white), Integer.valueOf((int) C0707R.color.glue_button_primary_black_text));
                }
                return new ButtonValue(R.string.continue_with_google, Integer.valueOf((int) C0707R.drawable.button_icon_google_color_24dp), valueOf2, null, 8, null);
            case 4:
                if (model.isPreferred()) {
                    return new ButtonValue(R.string.continue_with_email, Integer.valueOf((int) C0707R.drawable.button_icon_email_white_24dp), valueOf3, valueOf);
                }
                return new ButtonValue(R.string.continue_with_email, Integer.valueOf((int) C0707R.drawable.button_icon_email_white_24dp), valueOf2, null, 8, null);
            case 5:
                if (model.isPreferred()) {
                    return new ButtonValue(R.string.login_go_to_login_button, null, valueOf3, valueOf, 2, null);
                }
                return new ButtonValue(R.string.login_go_to_login_button, null, valueOf2, null, 10, null);
            case 6:
                return new ButtonValue(R.string.login_go_to_login_button, null, null, 17170443, 6, null);
            case 7:
                return new ButtonValue(R.string.korea_signup_button, null, valueOf3, 17170443, 2, null);
            case 8:
                return new ButtonValue(R.string.login_go_to_create_account_button, null, valueOf3, 17170443, 2, null);
            case 9:
                return new ButtonValue(R.string.more_options, null, null, 17170443, 6, null);
            default:
                throw new IllegalStateException("Button is not supported by ViewBinder");
        }
    }

    private final CharSequence getMoreOptionsText(Context context, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHEVRON_DOWN, context.getResources().getDimension(R.dimen.more_options_chevron_size));
        spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), spotifyIconDrawable.getIntrinsicHeight());
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) spotifyIconDrawable.n());
        append.setSpan(new SpotifyIconSpan(spotifyIconDrawable, SpotifyIconSpan.Alignment.CAPITAL_LETTER_MIDDLE), 0, spotifyIconDrawable.n().length(), 33);
        SpannableStringBuilder append2 = append.append((CharSequence) " ").append(context.getText(i));
        h.d(append2, "SpannableStringBuilder()…nd(context.getText(name))");
        return append2;
    }

    public final StateListAnimatorButton getView() {
        return this.view;
    }

    public final void onEvent(nmf<? super AuthenticationButton.Events, kotlin.f> nmf) {
        h.e(nmf, "event");
        this.view.setOnClickListener(new DefaultAuthenticationButtonViewBinder$onEvent$1(nmf));
    }

    public final void render(AuthenticationButton.Model model) {
        h.e(model, "model");
        applyButtonValue(model.getType(), getButtonValue(model));
    }
}
