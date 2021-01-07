package com.spotify.libs.otp.ui;

import android.content.Context;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class a0 {
    private final Context a;

    public a0(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    public final String a() {
        String string = this.a.getString(C0707R.string.error_dialog_body_generic_error);
        h.d(string, "context.getString(R.stri…ialog_body_generic_error)");
        return string;
    }

    public final String b() {
        String string = this.a.getString(C0707R.string.error_dialog_body_invalid_phone_number);
        h.d(string, "context.getString(R.stri…ody_invalid_phone_number)");
        return string;
    }

    public final String c() {
        String string = this.a.getString(C0707R.string.error_dialog_body_no_internet_connection);
        h.d(string, "context.getString(R.stri…y_no_internet_connection)");
        return string;
    }

    public final String d(int i) {
        String quantityString = this.a.getResources().getQuantityString(C0707R.plurals.error_dialog_body_resend_limit, i, Integer.valueOf(i));
        h.d(quantityString, "context.resources\n      …imitSeconds\n            )");
        return quantityString;
    }

    public final String e() {
        String string = this.a.getString(C0707R.string.error_dialog_body_timeout);
        h.d(string, "context.getString(R.stri…rror_dialog_body_timeout)");
        return string;
    }

    public final String f() {
        String string = this.a.getString(C0707R.string.error_dialog_body_too_many_tries);
        h.d(string, "context.getString(R.stri…alog_body_too_many_tries)");
        return string;
    }

    public final String g() {
        String string = this.a.getString(C0707R.string.error_dialog_body_try_again_later);
        h.d(string, "context.getString(R.stri…log_body_try_again_later)");
        return string;
    }

    public final String h() {
        String string = this.a.getString(C0707R.string.error_dialog_button_ok);
        h.d(string, "context.getString(R.string.error_dialog_button_ok)");
        return string;
    }

    public final String i() {
        String string = this.a.getString(C0707R.string.error_dialog_button_try_again);
        h.d(string, "context.getString(R.stri…_dialog_button_try_again)");
        return string;
    }

    public final String j() {
        String string = this.a.getString(C0707R.string.error_dialog_title_generic_error);
        h.d(string, "context.getString(R.stri…alog_title_generic_error)");
        return string;
    }

    public final String k() {
        String string = this.a.getString(C0707R.string.error_dialog_title_invalid_phone_number);
        h.d(string, "context.getString(R.stri…tle_invalid_phone_number)");
        return string;
    }

    public final String l() {
        String string = this.a.getString(C0707R.string.error_dialog_title_no_internet_connection);
        h.d(string, "context.getString(R.stri…e_no_internet_connection)");
        return string;
    }

    public final String m(int i) {
        String quantityString = this.a.getResources().getQuantityString(C0707R.plurals.error_dialog_title_resend_limit, i, Integer.valueOf(i));
        h.d(quantityString, "context.resources\n      …imitSeconds\n            )");
        return quantityString;
    }

    public final String n() {
        String string = this.a.getString(C0707R.string.error_dialog_title_timeout);
        h.d(string, "context.getString(R.stri…ror_dialog_title_timeout)");
        return string;
    }

    public final String o() {
        String string = this.a.getString(C0707R.string.error_dialog_title_too_many_tries);
        h.d(string, "context.getString(R.stri…log_title_too_many_tries)");
        return string;
    }

    public final String p() {
        String string = this.a.getString(C0707R.string.error_dialog_title_try_again_later);
        h.d(string, "context.getString(R.stri…og_title_try_again_later)");
        return string;
    }
}
