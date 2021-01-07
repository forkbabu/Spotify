package com.spotify.music.share.logging;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.player.model.PlayerState;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class LegacyShareEventEmitterImpl implements z7e {
    private final jz1 b;
    private final Context c;
    private final String d;
    private final String e = UUID.randomUUID().toString();
    private final String f;
    private final String g;
    private final PlayerState h;
    private boolean i;

    /* access modifiers changed from: package-private */
    public enum Destination {
        OVERFLOW_SHARE("overflow-share"),
        COPY_LINK("copy-link"),
        SELECT_RECIPIENT("select-recipient"),
        EMAIL("email"),
        SMS("sms"),
        FACEBOOK_POPUP("facebook-popup"),
        NONE(null);
        
        private final String mId;

        private Destination(String str) {
            this.mId = str;
        }

        public String d() {
            return this.mId;
        }
    }

    public enum Interaction {
        HIT("hit"),
        EVENT("event"),
        NONE(null);
        
        private final String mTypeValue;

        private Interaction(String str) {
            this.mTypeValue = str;
        }

        public String d() {
            return this.mTypeValue;
        }
    }

    public enum Result {
        SUCCESS("success"),
        CANCEL("cancel"),
        FAILURE("failure"),
        NO_RESULT(null);
        
        private final String mValue;

        private Result(String str) {
            this.mValue = str;
        }

        public String d() {
            return this.mValue;
        }
    }

    public enum UserIntent {
        START_SHARE_SESSION("session-start"),
        END_SHARE_SESSION("cancel"),
        NAVIGATE_FORWARD("navigate-forward"),
        DEEPLINK(Constants.DEEPLINK),
        OPEN_COMPOSER("open-composer"),
        COPY_LINK("copy-link"),
        OPEN_MENU("open-menu");
        
        private final String mValue;

        private UserIntent(String str) {
            this.mValue = str;
        }

        public String d() {
            return this.mValue;
        }
    }

    public LegacyShareEventEmitterImpl(Context context, String str, String str2, String str3, PlayerState playerState, jz1 jz1) {
        this.c = context;
        str.getClass();
        this.d = str;
        str2.getClass();
        this.f = str2;
        this.g = str3;
        this.h = playerState;
        this.b = jz1;
    }

    private int k(int i2) {
        return i2 == C0707R.string.share_whatsapp_log_id_gabito ? C0707R.string.share_whatsapp_log_id : i2 == C0707R.string.share_facebook_stories_log_id ? C0707R.string.share_facebook_stories_explicitly_log_id : i2 == C0707R.string.share_facebook_feed_log_id ? C0707R.string.share_facebook_feed_explicitly_log_id : i2 == C0707R.string.share_copy_link_log_id_gabito ? C0707R.string.share_copy_link_log_id : i2 == C0707R.string.share_native_share_menu_log_id ? C0707R.string.share_more_log_id : i2 == C0707R.string.share_facebook_messenger_log_id_gabito ? C0707R.string.share_facebook_messenger_log_id : i2;
    }

    private void l(String str, Destination destination, long j, Interaction interaction, UserIntent userIntent, Result result, boolean z, boolean z2) {
        n(str, destination.d(), j, interaction, userIntent, result, z, z2);
    }

    public static void m(String str, String str2, long j, Interaction interaction, UserIntent userIntent, Result result, String str3, String str4, String str5, boolean z, List<String> list, String str6, String str7, jz1 jz1) {
        o(false, str, str2, j, interaction, userIntent, result, str3, str4, str5, z, list, str6, null, jz1);
    }

    private static void o(boolean z, String str, String str2, long j, Interaction interaction, UserIntent userIntent, Result result, String str3, String str4, String str5, boolean z2, List<String> list, String str6, String str7, jz1 jz1) {
        str.getClass();
        interaction.getClass();
        userIntent.getClass();
        result.getClass();
        str3.getClass();
        str5.getClass();
        list.getClass();
        if (!z) {
            jz1.a(new ba1(str, userIntent.d(), interaction.d(), result.d(), str3, str4, z2, str5, str2, j, list, str6, "link-share", str7));
            Logger.l("Log Share Event: \n sessionId: %s\n userIntent: %s\n interaction: %s\n result: %s\n entityUri: %s\n contextUri: %s\n textChanged: %s\n sourcePageId: %s\n destination: %s\n destinationIndex: %d\n testGroups: %s\n shareId: %s", str, userIntent.d(), interaction.d(), result.d(), str3, str4, Boolean.valueOf(z2), str5, str2, Long.valueOf(j), list, str6);
            return;
        }
        throw new IllegalStateException("This ShareEventLogger session has already ended.");
    }

    @Override // defpackage.z7e
    public void a(String str, long j) {
        l(str, Destination.OVERFLOW_SHARE, j, Interaction.HIT, UserIntent.OPEN_MENU, Result.NO_RESULT, false, false);
    }

    @Override // defpackage.z7e
    public void b(String str, int i2, long j) {
        n(str, this.c.getString(k(i2)), j, Interaction.HIT, UserIntent.DEEPLINK, Result.NO_RESULT, false, false);
    }

    @Override // defpackage.z7e
    public void c() {
        l(null, Destination.NONE, -1, Interaction.NONE, UserIntent.START_SHARE_SESSION, Result.NO_RESULT, false, false);
    }

    @Override // defpackage.z7e
    public void d(String str, long j) {
        l(str, Destination.COPY_LINK, j, Interaction.HIT, UserIntent.COPY_LINK, Result.NO_RESULT, false, false);
    }

    @Override // defpackage.z7e
    public void e(long j) {
        l(null, Destination.FACEBOOK_POPUP, j, Interaction.HIT, UserIntent.OPEN_MENU, Result.NO_RESULT, false, false);
    }

    @Override // defpackage.z7e
    public String f() {
        return this.e;
    }

    @Override // defpackage.z7e
    public String g() {
        return this.d;
    }

    @Override // defpackage.z7e
    public void h(String str, long j) {
        l(str, Destination.SMS, j, Interaction.HIT, UserIntent.OPEN_MENU, Result.NO_RESULT, false, false);
    }

    @Override // defpackage.z7e
    public void i(String str, long j) {
        l(str, Destination.SMS, j, Interaction.HIT, UserIntent.DEEPLINK, Result.NO_RESULT, false, false);
    }

    @Override // defpackage.z7e
    public void j(int i2, int i3) {
        this.b.a(new da1("", kfd.i1.toString(), this.f, this.c.getString(k(i3)), (long) i2, "", ImpressionLogger.ImpressionType.ITEM.toString(), ImpressionLogger.RenderType.LIST.toString(), (double) System.currentTimeMillis()));
    }

    /* access modifiers changed from: package-private */
    public void n(String str, String str2, long j, Interaction interaction, UserIntent userIntent, Result result, boolean z, boolean z2) {
        interaction.getClass();
        userIntent.getClass();
        result.getClass();
        PlayerState playerState = this.h;
        o(this.i, this.e, str2, j, interaction, userIntent, result, this.f, this.g, this.d, z, Collections.emptyList(), str, (playerState == null || !playerState.isPlaying()) ? null : this.h.contextUri(), this.b);
        if (z2) {
            p();
            this.i = true;
        }
    }

    public void p() {
        l(null, Destination.NONE, -1, Interaction.NONE, UserIntent.END_SHARE_SESSION, Result.NO_RESULT, false, false);
    }
}
