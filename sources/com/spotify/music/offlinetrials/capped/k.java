package com.spotify.music.offlinetrials.capped;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.music.slate.model.BackgroundColor;
import com.spotify.music.slate.model.q;
import com.spotify.music.slate.model.t;
import com.spotify.music.slate.model.u;
import com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties;
import defpackage.k3d;

public class k {
    private final l a;
    private final Context b;
    private final kd0 c;
    private final r8c d;

    public k(l lVar, Context context, kd0 kd0, r8c r8c) {
        this.a = lVar;
        this.b = context;
        this.c = kd0;
        this.d = r8c;
    }

    public void a() {
        if (this.d.b() && !this.a.a()) {
            Context context = this.b;
            r8c r8c = this.d;
            k3d.a b2 = k3d.b();
            b2.g(u.c(""));
            b2.f(u.c(""));
            b2.a(new BackgroundColor(a.b(context, C0707R.color.offline_daily_cap_background), BackgroundColor.Type.HEX));
            b2.c(q.c(C0707R.drawable.slate_intro_image));
            b2.e(u.b(C0707R.string.daily_offline_intro_dialog_button_ok));
            k3d.b.a a2 = k3d.b.a();
            a2.c(C0707R.layout.capped_offline_message);
            a2.d(C0707R.layout.capped_offline_message);
            k3d.b.AbstractC0631b.a b3 = k3d.b.AbstractC0631b.b();
            b3.c(C0707R.id.image_view);
            b3.e(C0707R.id.title);
            b3.d(C0707R.id.sub_title);
            b3.a(C0707R.id.action_button);
            a2.b(b3.b());
            b2.d(a2.a());
            if (AndroidLibsOfflineTrialsProperties.OfflineDailyCap.THIRTY_MIN == r8c.a()) {
                b2.g(u.b(C0707R.string.daily_offline_intro_dialog_title_30_minutes));
                b2.f(u.b(C0707R.string.daily_offline_intro_dialog_subtitle));
            } else if (AndroidLibsOfflineTrialsProperties.OfflineDailyCap.SIXTY_MIN == r8c.a()) {
                b2.g(u.b(C0707R.string.daily_offline_intro_dialog_title_60_minutes));
                b2.f(u.b(C0707R.string.daily_offline_intro_dialog_subtitle));
            }
            t b4 = t.b(b2.b(), u.b(C0707R.string.daily_offline_intro_dialog_button_cancel));
            this.a.b();
            kd0 kd0 = this.c;
            int i = CappedOfflineDialogFragment.o0;
            Intent intent = new Intent("com.spotify.music.internal.intent.view.CAPPED_OFFLINE_DIALOG");
            intent.putExtra("extra_dialog_view_model", b4);
            kd0.c(intent);
            Logger.b("OfflineTrialsDialogManager: Did show intro message message", new Object[0]);
        }
    }

    public void b() {
        if (!this.d.b()) {
            Logger.b("Tried to show 'daily offline cap reached'-dialog but was not in eligible test cell.", new Object[0]);
            return;
        }
        Context context = this.b;
        r8c r8c = this.d;
        int i = l.d;
        k3d.a b2 = k3d.b();
        b2.g(u.c(""));
        b2.f(u.c(""));
        b2.a(new BackgroundColor(a.b(context, C0707R.color.offline_daily_cap_background), BackgroundColor.Type.HEX));
        b2.c(q.c(C0707R.drawable.offline_daily_cap_reached));
        b2.e(u.b(C0707R.string.daily_offline_cap_reached_dialog_button_ok));
        k3d.b.a a2 = k3d.b.a();
        a2.c(C0707R.layout.capped_offline_message);
        a2.d(C0707R.layout.capped_offline_message);
        k3d.b.AbstractC0631b.a b3 = k3d.b.AbstractC0631b.b();
        b3.c(C0707R.id.image_view);
        b3.e(C0707R.id.title);
        b3.d(C0707R.id.sub_title);
        b3.a(C0707R.id.action_button);
        a2.b(b3.b());
        b2.d(a2.a());
        if (AndroidLibsOfflineTrialsProperties.OfflineDailyCap.THIRTY_MIN == r8c.a()) {
            b2.g(u.b(C0707R.string.daily_offline_cap_reached_dialog_title_30_minutes));
            b2.f(u.b(C0707R.string.daily_offline_cap_reached_slate_dialog_subtitle_30_minutes));
        } else if (AndroidLibsOfflineTrialsProperties.OfflineDailyCap.SIXTY_MIN == r8c.a()) {
            b2.g(u.b(C0707R.string.daily_offline_cap_reached_dialog_title_60_minutes));
            b2.f(u.b(C0707R.string.daily_offline_cap_reached_slate_dialog_subtitle_60_minutes));
        }
        t b4 = t.b(b2.b(), u.b(C0707R.string.daily_offline_cap_reached_dialog_button_cancel));
        kd0 kd0 = this.c;
        int i2 = CappedOfflineDialogFragment.o0;
        Intent intent = new Intent("com.spotify.music.internal.intent.view.CAPPED_OFFLINE_DIALOG");
        intent.putExtra("extra_dialog_view_model", b4);
        kd0.c(intent);
        Logger.b("OfflineTrialsDialogManager: Did show cap reached message", new Object[0]);
    }
}
