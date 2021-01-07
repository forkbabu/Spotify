package com.spotify.music.features.settings.soundeffects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.spotify.glue.dialogs.e;
import com.spotify.music.C0707R;

public class c implements e {
    private TextView a;
    private TextView b;
    private CheckBox c;
    private String d;
    private String e;
    private String f;

    @Override // com.spotify.glue.dialogs.e
    public void a() {
    }

    @Override // com.spotify.glue.dialogs.e
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.settings_dialog_content_title_body_checkbox, viewGroup, true);
        this.a = (TextView) inflate.findViewById(C0707R.id.title);
        this.b = (TextView) inflate.findViewById(C0707R.id.body);
        this.c = (CheckBox) inflate.findViewById(C0707R.id.checkbox);
        if (!inflate.isInEditMode()) {
            vc0.h(this.a);
            vc0.i(this.b);
            vc0.g(inflate);
        }
        this.a.setText(this.d);
        this.b.setText(this.e);
        this.c.setText(this.f);
    }

    @Override // com.spotify.glue.dialogs.e
    public int c() {
        return (int) Math.ceil((double) Math.abs(this.b.getPaint().getFontMetrics().descent));
    }

    public boolean d() {
        return this.c.isChecked();
    }

    public void e(String str) {
        this.e = str;
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void f(String str) {
        this.f = str;
        if (this.b != null) {
            this.c.setText(str);
        }
    }

    public void g(String str) {
        this.d = str;
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
