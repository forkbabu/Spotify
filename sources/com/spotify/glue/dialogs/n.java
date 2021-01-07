package com.spotify.glue.dialogs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.squareup.picasso.z;

/* access modifiers changed from: package-private */
public class n implements e {
    private TextView a;
    private TextView b;
    private ImageView c;
    private z d;
    private String e;
    private String f;
    private final boolean g;

    public n(boolean z) {
        this.g = z;
    }

    @Override // com.spotify.glue.dialogs.e
    public void a() {
        ImageView imageView;
        z zVar = this.d;
        if (zVar != null && (imageView = this.c) != null) {
            zVar.m(imageView);
        }
    }

    @Override // com.spotify.glue.dialogs.e
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.glue_dialog_content_image_title_body, viewGroup, true);
        this.a = (TextView) inflate.findViewById(C0707R.id.title);
        this.b = (TextView) inflate.findViewById(C0707R.id.body);
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.image);
        this.c = imageView;
        if (this.g && imageView != null) {
            imageView.getLayoutParams().width = nud.g(168.0f, viewGroup.getResources());
            this.c.getLayoutParams().height = nud.g(168.0f, viewGroup.getResources());
        }
        if (!inflate.isInEditMode()) {
            if (this.c != null) {
                TextView[] textViewArr = {this.a};
                vc0.i(textViewArr);
                vc0.h(textViewArr);
            } else {
                vc0.h(this.a);
            }
            vc0.i(this.b);
            vc0.g(inflate);
        }
        this.a.setText(this.e);
        this.b.setText(this.f);
    }

    @Override // com.spotify.glue.dialogs.e
    public int c() {
        return (int) Math.ceil((double) Math.abs(this.b.getPaint().getFontMetrics().descent));
    }

    public void d(String str) {
        this.f = str;
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void e(z zVar) {
        this.d = zVar;
    }

    public void f(String str) {
        this.e = str;
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
