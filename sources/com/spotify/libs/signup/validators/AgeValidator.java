package com.spotify.libs.signup.validators;

import com.spotify.music.C0707R;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AgeValidator {
    private final Calendar a;
    private final Calendar b;
    private final Calendar c;

    public enum AgeVerification {
        OK(false, 0),
        BAD_AGE(true, C0707R.string.choose_username_bad_age),
        TOO_YOUNG(true, C0707R.string.choose_username_too_young),
        NOT_SET(true, C0707R.string.signup_v1_no_birth_date_error);
        
        private final boolean mErrorState;
        private final int mMessageResource;

        private AgeVerification(boolean z, int i) {
            this.mErrorState = z;
            this.mMessageResource = i;
        }
    }

    public AgeValidator(Calendar calendar) {
        this.a = calendar;
        this.b = new GregorianCalendar(calendar.get(1) - 112, calendar.get(2), calendar.get(5));
        GregorianCalendar gregorianCalendar = new GregorianCalendar(calendar.get(1) - 13, calendar.get(2), calendar.get(5), 23, 59, 59);
        this.c = gregorianCalendar;
        gregorianCalendar.set(14, 999);
    }

    public void a(int i) {
        this.c.set(this.a.get(1) - i, this.a.get(2), this.a.get(5), 23, 59, 59);
        this.c.set(14, 999);
    }

    public AgeVerification b(Calendar calendar) {
        if (calendar.before(this.b)) {
            return AgeVerification.BAD_AGE;
        }
        if (calendar.after(this.c)) {
            return AgeVerification.TOO_YOUNG;
        }
        return AgeVerification.OK;
    }
}
