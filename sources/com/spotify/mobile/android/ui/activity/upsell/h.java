package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import androidx.core.app.q;
import com.spotify.music.C0707R;

public class h {
    public h(int i, int i2) {
    }

    public g a(Context context) {
        return new PremiumActivationNotificationStyleStrategy(context, q.e(context), C0707R.id.notification_premium_activation, C0707R.id.notification_premium_activation_done_or_failed, context.getString(C0707R.string.trial_activation_notification_title), context.getString(C0707R.string.trial_activation_notification_text), context.getString(C0707R.string.trial_activation_notification_ticker), context.getString(C0707R.string.trial_activation_done_notification_title), context.getString(C0707R.string.trial_activation_done_notification_text), context.getString(C0707R.string.trial_activation_done_notification_ticker), context.getString(C0707R.string.trial_activation_failed_notification_title), context.getString(C0707R.string.trial_activation_failed_notification_text), context.getString(C0707R.string.trial_activation_failed_notification_ticker));
    }
}
