package com.spotify.music.storage;

import android.os.Bundle;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.DialogLayout;

public class MoveCacheConfirmationActivity extends ss2 {
    public static final /* synthetic */ int G = 0;

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogLayout dialogLayout = new DialogLayout(this);
        String stringExtra = getIntent().getStringExtra("volume");
        long longExtra = getIntent().getLongExtra("estimated-size", 0);
        dialogLayout.setTitle(C0707R.string.cache_migration_confirmation_title);
        dialogLayout.setBody(C0707R.string.cache_migration_confirmation_body);
        dialogLayout.a(C0707R.string.cache_migration_confirmation_cancel, new c(this));
        dialogLayout.c(C0707R.string.two_button_dialog_button_ok, new b(this, stringExtra, longExtra));
        setContentView(dialogLayout);
    }
}
