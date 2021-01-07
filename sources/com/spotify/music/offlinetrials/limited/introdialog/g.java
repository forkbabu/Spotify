package com.spotify.music.offlinetrials.limited.introdialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.t;

public class g implements a3d {
    protected View a;
    private final i b;
    private final t c;

    public g(i iVar, t tVar) {
        this.b = iVar;
        this.c = tVar;
    }

    @Override // defpackage.a3d
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.limited_offline_message, viewGroup, false);
        this.a = inflate;
        View findViewById = inflate.findViewById(C0707R.id.title);
        findViewById.getClass();
        View findViewById2 = this.a.findViewById(C0707R.id.sub_title);
        findViewById2.getClass();
        View findViewById3 = this.a.findViewById(C0707R.id.action_button);
        findViewById3.getClass();
        Button button = (Button) findViewById3;
        this.b.c().a((TextView) findViewById);
        this.b.b().a((TextView) findViewById2);
        this.b.a().a(button);
        button.setOnClickListener(new b(this));
        View view = this.a;
        view.getClass();
        return view;
    }

    public /* synthetic */ void a(View view) {
        this.c.d("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne");
    }
}
