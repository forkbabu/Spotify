package com.spotify.music.concat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;

public class g implements com.spotify.mobius.g<ls2, ks2> {
    private final View a;
    private final RadioButton b;
    private final TextView c;
    private final TextView f;
    private final Button n;
    private final TextView o;

    class a implements h<ls2> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            g.this.o.setText(((ls2) obj).a());
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            g.this.a.setOnClickListener(null);
        }
    }

    public g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.concat, viewGroup, false);
        this.a = inflate;
        this.b = (RadioButton) inflate.findViewById(C0707R.id.concat_exercise_selector);
        this.c = (TextView) inflate.findViewById(C0707R.id.first_string);
        this.f = (TextView) inflate.findViewById(C0707R.id.second_string);
        this.n = (Button) inflate.findViewById(C0707R.id.concatenate_button);
        this.o = (TextView) inflate.findViewById(C0707R.id.result_view);
    }

    public View c() {
        return this.a;
    }

    public /* synthetic */ void d(da2 da2, View view) {
        da2.accept(ks2.a(this.c.getText().toString(), this.f.getText().toString(), this.b.isChecked()));
    }

    @Override // com.spotify.mobius.g
    public h<ls2> t(da2<ks2> da2) {
        this.n.setOnClickListener(new b(this, da2));
        return new a();
    }
}
