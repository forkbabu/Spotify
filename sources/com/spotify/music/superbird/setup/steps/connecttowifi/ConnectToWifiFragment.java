package com.spotify.music.superbird.setup.steps.connecttowifi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.android.g;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.superbird.setup.domain.p;
import com.spotify.music.superbird.setup.j;
import com.spotify.music.superbird.setup.m;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class ConnectToWifiFragment extends DaggerFragment implements s {
    public j h0;
    public m i0;
    private ImageView j0;
    private TextView k0;
    private TextView l0;
    private Button m0;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                m mVar = ((ConnectToWifiFragment) this.b).i0;
                if (mVar != null) {
                    mVar.g();
                } else {
                    h.k("delegate");
                    throw null;
                }
            } else if (i == 1) {
                m mVar2 = ((ConnectToWifiFragment) this.b).i0;
                if (mVar2 != null) {
                    mVar2.d();
                } else {
                    h.k("delegate");
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    static final class b<T> implements v<p> {
        final /* synthetic */ ConnectToWifiFragment a;

        b(ConnectToWifiFragment connectToWifiFragment) {
            this.a = connectToWifiFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(p pVar) {
            if (pVar.k()) {
                ConnectToWifiFragment.M4(this.a).setVisibility(4);
                ConnectToWifiFragment.L4(this.a).setVisibility(0);
                ConnectToWifiFragment.N4(this.a).setImageResource(C0707R.drawable.ic_wifi_connected);
                ConnectToWifiFragment.K4(this.a).setVisibility(8);
                return;
            }
            ConnectToWifiFragment.M4(this.a).setVisibility(0);
            ConnectToWifiFragment.L4(this.a).setVisibility(4);
            ConnectToWifiFragment.N4(this.a).setImageResource(C0707R.drawable.ic_wifi_disconnected);
            ConnectToWifiFragment.K4(this.a).setVisibility(0);
        }
    }

    public ConnectToWifiFragment() {
        super(C0707R.layout.fragment_connect_to_wifi);
    }

    public static final /* synthetic */ Button K4(ConnectToWifiFragment connectToWifiFragment) {
        Button button = connectToWifiFragment.m0;
        if (button != null) {
            return button;
        }
        h.k("downloadUsingCellularButton");
        throw null;
    }

    public static final /* synthetic */ TextView L4(ConnectToWifiFragment connectToWifiFragment) {
        TextView textView = connectToWifiFragment.l0;
        if (textView != null) {
            return textView;
        }
        h.k("wifiConnectedDescription");
        throw null;
    }

    public static final /* synthetic */ TextView M4(ConnectToWifiFragment connectToWifiFragment) {
        TextView textView = connectToWifiFragment.k0;
        if (textView != null) {
            return textView;
        }
        h.k("wifiDisconnectedDescription");
        throw null;
    }

    public static final /* synthetic */ ImageView N4(ConnectToWifiFragment connectToWifiFragment) {
        ImageView imageView = connectToWifiFragment.j0;
        if (imageView != null) {
            return imageView;
        }
        h.k("wifiIcon");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        c j4 = j4();
        h.d(j4, "requireActivity()");
        j jVar = this.h0;
        if (jVar != null) {
            e0 a2 = new g0(j4.Z(), jVar).a(g.class);
            h.d(a2, "ViewModelProvider(owner,…ctory).get(T::class.java)");
            ((ImageButton) view.findViewById(C0707R.id.button_close)).setOnClickListener(new a(0, this));
            View findViewById = view.findViewById(C0707R.id.wifi_icon);
            h.d(findViewById, "view.findViewById(R.id.wifi_icon)");
            this.j0 = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0707R.id.wifi_connected_description);
            h.d(findViewById2, "view.findViewById(R.id.wifi_connected_description)");
            this.l0 = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0707R.id.wifi_disconnected_description);
            h.d(findViewById3, "view.findViewById(R.id.w…disconnected_description)");
            this.k0 = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0707R.id.button_download_using_cellular);
            h.d(findViewById4, "view.findViewById(R.id.b…_download_using_cellular)");
            Button button = (Button) findViewById4;
            this.m0 = button;
            button.setOnClickListener(new a(1, this));
            ((g) a2).i().h(b3(), new b(this));
            return;
        }
        h.k("viewModelFactory");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SUPERBIRD_SETUP_CONNECTTOWIFI.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b2 = ij9.b(PageIdentifiers.SUPERBIRD_SETUP_CONNECTTOWIFI, ViewUris.v2.toString());
        h.d(b2, "PageViewObservable.creat…CTTOWIFI.toString()\n    )");
        return b2;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.r1;
        h.d(ifd, "FeatureIdentifiers.SUPERBIRD");
        return ifd;
    }
}
