package com.spotify.music.sociallistening.dialogs.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class SocialListeningInfoDialogActivity extends ss2 {

    static final class a implements View.OnClickListener {
        final /* synthetic */ SocialListeningInfoDialogActivity a;

        a(SocialListeningInfoDialogActivity socialListeningInfoDialogActivity) {
            this.a = socialListeningInfoDialogActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.finish();
        }
    }

    public static final Intent U0(Context context, String str, String str2) {
        h.e(context, "context");
        h.e(str, "title");
        Intent intent = new Intent(context, SocialListeningInfoDialogActivity.class);
        intent.putExtra("title", str);
        if (str2 != null) {
            intent.putExtra(ContextTrack.Metadata.KEY_SUBTITLE, str2);
        }
        return intent;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.info_dialog);
        String stringExtra = getIntent().getStringExtra("title");
        String stringExtra2 = getIntent().getStringExtra(ContextTrack.Metadata.KEY_SUBTITLE);
        TextView textView = (TextView) findViewById(C0707R.id.title);
        h.d(textView, "titleTextView");
        textView.setText(stringExtra);
        TextView textView2 = (TextView) findViewById(C0707R.id.subtitle);
        if (MoreObjects.isNullOrEmpty(stringExtra2)) {
            h.d(textView2, "subtitleTextView");
            textView2.setVisibility(8);
        } else {
            h.d(textView2, "subtitleTextView");
            textView2.setText(stringExtra2);
        }
        ((Button) findViewById(C0707R.id.confirm_button)).setOnClickListener(new a(this));
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SOCIAL_LISTENING_NOTIFICATIONDIALOG, null);
        h.d(b, "PageViewObservable.creat…ENING_NOTIFICATIONDIALOG)");
        return b;
    }
}
