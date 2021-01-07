package com.spotify.glue.dialogs;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class o implements e {
    private TextView a;
    private String b;

    o() {
    }

    @Override // com.spotify.glue.dialogs.e
    public void a() {
    }

    @Override // com.spotify.glue.dialogs.e
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView textView = (TextView) layoutInflater.inflate(C0707R.layout.glue_dialog_content_text, viewGroup, true).findViewById(C0707R.id.body);
        this.a = textView;
        textView.setText(this.b);
    }

    @Override // com.spotify.glue.dialogs.e
    public int c() {
        return (int) Math.ceil((double) Math.abs(this.a.getPaint().getFontMetrics().descent));
    }

    public void d(String str) {
        this.b = str;
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
