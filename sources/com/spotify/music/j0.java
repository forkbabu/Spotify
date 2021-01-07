package com.spotify.music;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.b;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.freetierallsongsdialog.FreeTierAllSongsDialogActivity;
import com.spotify.music.freetiercommon.models.a;
import java.util.ArrayList;

public class j0 implements wk9 {
    private final Activity a;
    private final Bundle b;

    public j0(Activity activity) {
        this.a = activity;
        this.b = b.a(activity, 17432576, 17432577).c();
    }

    @Override // defpackage.wk9
    public void a(c cVar, ArrayList<a> arrayList, String str, String str2) {
        Activity activity = this.a;
        int i = FreeTierAllSongsDialogActivity.X;
        if (MoreObjects.isNullOrEmpty(str)) {
            Assertion.p("No title provided. A title MUST be provided.");
        }
        Intent intent = new Intent(activity, FreeTierAllSongsDialogActivity.class);
        cVar.getClass();
        intent.putExtra("FlagsArgumentHelper.Flags", cVar);
        intent.putExtra("tracks_title", str);
        intent.putParcelableArrayListExtra("tracks", arrayList);
        intent.putExtra("context_uri", str2);
        Bundle bundle = this.b;
        int i2 = androidx.core.content.a.b;
        int i3 = Build.VERSION.SDK_INT;
        activity.startActivity(intent, bundle);
    }
}
