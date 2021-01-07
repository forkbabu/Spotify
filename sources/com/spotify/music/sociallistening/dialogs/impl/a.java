package com.spotify.music.sociallistening.dialogs.impl;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.C0707R;
import com.spotify.music.sociallistening.models.JoinType;
import kotlin.jvm.internal.h;

public final class a implements t7d {
    private final Context a;

    public a(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    @Override // defpackage.t7d
    public Intent a() {
        Context context = this.a;
        String string = context.getString(C0707R.string.social_listening_premium_only_dialog_title);
        h.d(string, "context.getString(\n     …ialog_title\n            )");
        return SocialListeningInfoDialogActivity.U0(context, string, this.a.getString(C0707R.string.social_listening_premium_only_dialog_subtitle));
    }

    @Override // defpackage.t7d
    public void b(String str) {
        String str2;
        String string = this.a.getString(C0707R.string.social_listening_session_ended_dialog_title_multi_output_design);
        h.d(string, "context.getString(\n     …i_output_design\n        )");
        if (str != null) {
            str2 = this.a.getString(C0707R.string.social_listening_session_ended_dialog_subtitle_containing_host_name, str);
            h.d(str2, "context.getString(\n     …DisplayName\n            )");
        } else {
            str2 = this.a.getString(C0707R.string.social_listening_session_ended_dialog_subtitle);
            h.d(str2, "context.getString(R.stri…on_ended_dialog_subtitle)");
        }
        Intent U0 = SocialListeningInfoDialogActivity.U0(this.a, string, str2);
        U0.setFlags(268435456);
        this.a.startActivity(U0);
    }

    @Override // defpackage.t7d
    public void c(String str) {
        h.e(str, "participantDisplayName");
        String string = this.a.getResources().getString(C0707R.string.social_listening_education_dialog_title_host_multi_output_design, str);
        h.d(string, "context.resources\n      …DisplayName\n            )");
        Context context = this.a;
        h.e(context, "context");
        h.e(string, "title");
        Intent intent = new Intent(context, SocialListeningEducationActivity.class);
        intent.putExtra("title", string);
        intent.setFlags(268435456);
        this.a.startActivity(intent);
    }

    @Override // defpackage.t7d
    public void d(String str) {
        h.e(null, "hostDisplayName");
        String string = this.a.getResources().getString(C0707R.string.social_listening_education_dialog_title_participant, null);
        h.d(string, "context.resources.getStr…hostDisplayName\n        )");
        Context context = this.a;
        h.e(context, "context");
        h.e(string, "title");
        Intent intent = new Intent(context, SocialListeningEducationActivity.class);
        intent.putExtra("title", string);
        intent.setFlags(268435456);
        this.a.startActivity(intent);
    }

    @Override // defpackage.t7d
    public Intent e(String str, JoinType joinType, boolean z) {
        h.e(str, "token");
        h.e(joinType, "joinType");
        Context context = this.a;
        h.e(context, "context");
        h.e(str, "token");
        h.e(joinType, "joinType");
        Intent intent = new Intent(context, SocialListeningJoinConfirmationActivity.class);
        intent.putExtra("token", str);
        intent.putExtra("join_type", joinType.d());
        intent.putExtra("nearby_session", z);
        return intent;
    }
}
