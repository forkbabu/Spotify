package com.spotify.music.features.partneraccountlinking.dialog;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingActivity;

public class u implements a3d {
    private ImageView a;
    private TextView b;
    private TextView c;
    private Button f;
    private final a n;

    public interface a {
    }

    u(a aVar) {
        this.n = aVar;
    }

    @Override // defpackage.a3d
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.partner_account_linking_fragment_view, viewGroup, false);
        this.a = (ImageView) inflate.findViewById(C0707R.id.connect_image);
        this.b = (TextView) inflate.findViewById(C0707R.id.title);
        this.c = (TextView) inflate.findViewById(C0707R.id.subtitle);
        Button button = (Button) inflate.findViewById(C0707R.id.link_button);
        this.f = button;
        button.setOnClickListener(new e(this));
        return inflate;
    }

    public void a(View view) {
        PartnerAccountLinkingSlateFragment partnerAccountLinkingSlateFragment = (PartnerAccountLinkingSlateFragment) this.n;
        partnerAccountLinkingSlateFragment.getClass();
        partnerAccountLinkingSlateFragment.H4(new Intent(partnerAccountLinkingSlateFragment.F2(), PartnerAccountLinkingActivity.class), 0, null);
        partnerAccountLinkingSlateFragment.h0.d();
    }

    public /* synthetic */ void b(View view) {
        ((PartnerAccountLinkingSlateFragment) this.n).O4();
    }

    public /* synthetic */ void c(View view) {
        ((PartnerAccountLinkingSlateFragment) this.n).O4();
    }

    public void d() {
        ImageView imageView = this.a;
        imageView.getClass();
        imageView.setImageDrawable(this.a.getResources().getDrawable(C0707R.drawable.connect_fail));
        TextView textView = this.b;
        textView.getClass();
        textView.setText(C0707R.string.account_linking_error_title);
        TextView textView2 = this.c;
        textView2.getClass();
        textView2.setText(C0707R.string.account_linking_error_subtitle);
        Button button = this.f;
        button.getClass();
        button.setText(C0707R.string.account_linking_got_it);
        Button button2 = this.f;
        button2.getClass();
        button2.setOnClickListener(new f(this));
    }

    /* access modifiers changed from: package-private */
    public void e() {
        ImageView imageView = this.a;
        imageView.getClass();
        imageView.setImageDrawable(this.a.getResources().getDrawable(C0707R.drawable.connect_success));
        TextView textView = this.b;
        textView.getClass();
        textView.setText(C0707R.string.account_linking_success_title);
        TextView textView2 = this.c;
        textView2.getClass();
        textView2.setText(C0707R.string.account_linking_success_subtitle);
        Button button = this.f;
        button.getClass();
        button.setText(C0707R.string.account_linking_got_it);
        Button button2 = this.f;
        button2.getClass();
        button2.setOnClickListener(new g(this));
    }
}
