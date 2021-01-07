package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.util.h0;
import com.spotify.music.C0707R;

/* renamed from: no8  reason: default package */
public class no8 extends h0 {
    public no8(Resources resources) {
        super(resources);
    }

    public String d() {
        return c(C0707R.string.free_tier_taste_onboarding_artist_picker_done, new Object[0]);
    }

    public String e() {
        return c(C0707R.string.free_tier_taste_onboarding_error_view_general_subtitle, new Object[0]);
    }

    public String f() {
        return c(C0707R.string.free_tier_taste_onboarding_error_view_general_title, new Object[0]);
    }

    public String g() {
        return c(C0707R.string.free_tier_taste_onboarding_error_view_artists_are_saved_go_online, new Object[0]);
    }

    public String h() {
        return c(C0707R.string.free_tier_taste_onboarding_error_view_go_online_and_try_again, new Object[0]);
    }

    public String i() {
        return c(C0707R.string.free_tier_taste_onboarding_error_view_lost_internet_connection, new Object[0]);
    }

    public String j() {
        return c(C0707R.string.free_tier_taste_onboarding_error_view_no_internet_connection, new Object[0]);
    }

    public String k(int i, boolean z) {
        if (z) {
            return c(C0707R.string.free_tier_taste_onboarding_artist_picker_title_update_instruction, new Object[0]);
        }
        return c(C0707R.string.free_tier_taste_onboarding_artist_picker_title_choose_n_or_more, Integer.valueOf(i));
    }
}
