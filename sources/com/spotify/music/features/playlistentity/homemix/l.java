package com.spotify.music.features.playlistentity.homemix;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.b;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.spotify.music.features.playlistentity.homemix.tasteviz.TasteVizDialogActivity;
import com.spotify.music.features.playlistentity.homemix.usertoggle.UserToggleDialogActivity;

public class l {
    private final Context a;
    private final Fragment b;
    private final String c;
    private final kv5 d;

    public l(Context context, Fragment fragment, String str, kv5 kv5) {
        this.a = context;
        this.b = fragment;
        this.c = str;
        this.d = kv5;
    }

    public void a(boolean z) {
        c j4 = this.b.j4();
        this.b.G4(this.d.a(j4, z), b.a(j4, 17432576, 17432577).c());
    }

    public void b() {
        Context context = this.a;
        String str = this.c;
        int i = TasteVizDialogActivity.K;
        Intent y = je.y(context, TasteVizDialogActivity.class, "KEY_PLAYLIST_URI", str);
        y.putExtra("KEY_IS_WELCOME_SCREEN", false);
        Bundle c2 = b.a(context, 17432576, 17432577).c();
        int i2 = a.b;
        int i3 = Build.VERSION.SDK_INT;
        context.startActivity(y, c2);
    }

    public void c() {
        Context context = this.a;
        String str = this.c;
        int i = UserToggleDialogActivity.M;
        Intent y = je.y(context, UserToggleDialogActivity.class, "KEY_PLAYLIST_URI", str);
        Bundle c2 = b.a(context, 17432576, 17432577).c();
        int i2 = a.b;
        int i3 = Build.VERSION.SDK_INT;
        context.startActivity(y, c2);
    }
}
