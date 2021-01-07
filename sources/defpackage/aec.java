package defpackage;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: aec  reason: default package */
public class aec implements g<ddc, bdc> {
    private final SwitchCompat a;
    private bla b;
    private final Button c;
    private final View f;
    private final View n;
    private bla o;
    private final Button p;
    private final View q;
    private final View r;
    private final View s;

    /* renamed from: aec$a */
    class a implements h<ddc> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            aec.a(aec.this, (ddc) obj);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            aec.this.a.setOnCheckedChangeListener(null);
            aec.this.c.setOnClickListener(null);
            aec.this.p.setOnClickListener(null);
            aec.this.n.setOnClickListener(null);
            aec.this.r.setOnClickListener(null);
        }
    }

    public aec(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.layout_partners_settings, viewGroup, false);
        this.a = (SwitchCompat) viewGroup2.findViewById(C0707R.id.navigationAppsMasterToggle);
        this.c = (Button) viewGroup2.findViewById(C0707R.id.googleMapsButton);
        this.f = viewGroup2.findViewById(C0707R.id.googleMapsConnected);
        this.n = viewGroup2.findViewById(C0707R.id.googleMapsEntry);
        this.p = (Button) viewGroup2.findViewById(C0707R.id.wazeButton);
        this.q = viewGroup2.findViewById(C0707R.id.wazeConnected);
        this.r = viewGroup2.findViewById(C0707R.id.wazeEntry);
        TextView textView = (TextView) viewGroup2.findViewById(C0707R.id.safetyDisclaimer);
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
        this.s = viewGroup2;
    }

    static void a(aec aec, ddc ddc) {
        aec.getClass();
        Optional<Boolean> c2 = ddc.c();
        if (c2.isPresent() && c2.get().booleanValue() != aec.a.isChecked()) {
            aec.a.setChecked(c2.get().booleanValue());
        }
        ImmutableMap<PartnerType, bla> b2 = ddc.b();
        PartnerType partnerType = PartnerType.GOOGLE_MAPS;
        if (b2.containsKey(partnerType)) {
            aec.n.setVisibility(0);
            bla bla = b2.get(partnerType);
            bla.getClass();
            bla bla2 = bla;
            aec.b = bla2;
            g(bla2, aec.c, aec.f);
        } else {
            aec.n.setVisibility(8);
        }
        PartnerType partnerType2 = PartnerType.WAZE;
        if (b2.containsKey(partnerType2)) {
            aec.r.setVisibility(0);
            bla bla3 = b2.get(partnerType2);
            bla3.getClass();
            bla bla4 = bla3;
            aec.o = bla4;
            g(bla4, aec.p, aec.q);
            return;
        }
        aec.r.setVisibility(8);
    }

    private static void g(bla bla, Button button, View view) {
        if (bla.b() && bla.c()) {
            view.setVisibility(0);
            button.setVisibility(8);
        } else if (!bla.c()) {
            view.setVisibility(8);
            button.setVisibility(0);
            button.setText(C0707R.string.partner_settings_install);
        } else {
            view.setVisibility(8);
            button.setVisibility(0);
            button.setText(C0707R.string.partner_settings_connect);
        }
    }

    private static void i(da2<bdc> da2, bla bla, PartnerType partnerType) {
        if (!bla.c()) {
            da2.accept(bdc.i(partnerType));
        } else if (!bla.b()) {
            da2.accept(bdc.h(partnerType));
        }
    }

    public View h() {
        return this.s;
    }

    public void j(da2 da2, View view) {
        bla bla = this.b;
        bla.getClass();
        i(da2, bla, PartnerType.GOOGLE_MAPS);
    }

    public void k(da2 da2, View view) {
        bla bla = this.o;
        bla.getClass();
        i(da2, bla, PartnerType.WAZE);
    }

    public void l(da2 da2, View view) {
        bla bla = this.b;
        bla.getClass();
        PartnerType partnerType = PartnerType.GOOGLE_MAPS;
        if (bla.b() && bla.c()) {
            da2.accept(bdc.j(partnerType));
        }
    }

    public void m(da2 da2, View view) {
        bla bla = this.o;
        bla.getClass();
        PartnerType partnerType = PartnerType.WAZE;
        if (bla.b() && bla.c()) {
            da2.accept(bdc.j(partnerType));
        }
    }

    @Override // com.spotify.mobius.g
    public h<ddc> t(da2<bdc> da2) {
        a aVar = new a();
        this.a.setOnCheckedChangeListener(new ydc(da2));
        this.c.setOnClickListener(new wdc(this, da2));
        this.p.setOnClickListener(new xdc(this, da2));
        this.n.setOnClickListener(new vdc(this, da2));
        this.r.setOnClickListener(new zdc(this, da2));
        return aVar;
    }
}
