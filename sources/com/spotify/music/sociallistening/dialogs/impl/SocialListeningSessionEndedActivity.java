package com.spotify.music.sociallistening.dialogs.impl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class SocialListeningSessionEndedActivity extends ss2 {

    static final class a implements View.OnClickListener {
        final /* synthetic */ SocialListeningSessionEndedActivity a;

        a(SocialListeningSessionEndedActivity socialListeningSessionEndedActivity) {
            this.a = socialListeningSessionEndedActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.session_ended_dialog);
        String string = getResources().getString(getIntent().getStringExtra("host-display-name") != null ? C0707R.string.social_listening_session_ended_dialog_title_containing_host_name : C0707R.string.social_listening_session_ended_dialog_title);
        h.d(string, "resources.getString(\n   …ed_dialog_title\n        )");
        TextView textView = (TextView) findViewById(C0707R.id.title);
        h.d(textView, "titleTextView");
        textView.setText(string);
        ((Button) findViewById(C0707R.id.confirm_button)).setOnClickListener(new a(this));
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SOCIAL_LISTENING_ENDSESSIONDIALOG, null);
        h.d(b, "PageViewObservable.creat…STENING_ENDSESSIONDIALOG)");
        return b;
    }
}
