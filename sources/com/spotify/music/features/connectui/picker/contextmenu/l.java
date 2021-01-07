package com.spotify.music.features.connectui.picker.contextmenu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

class l implements k {
    private final DeviceContextMenuFragment a;
    TextView b;
    ImageView c;
    RecyclerView d;
    TextView e;

    l(DeviceContextMenuFragment deviceContextMenuFragment) {
        this.a = deviceContextMenuFragment;
    }

    @Override // com.spotify.music.features.connectui.picker.contextmenu.k
    public void a(Uri uri) {
        DeviceContextMenuFragment deviceContextMenuFragment = this.a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        deviceContextMenuFragment.G4(intent, null);
    }

    @Override // com.spotify.music.features.connectui.picker.contextmenu.k
    public void b() {
        View a3 = this.a.a3();
        if (a3 != null) {
            this.b = (TextView) a3.findViewById(C0707R.id.picker_device_menu_name);
            this.c = (ImageView) a3.findViewById(C0707R.id.picker_device_menu_icon);
            this.d = (RecyclerView) a3.findViewById(C0707R.id.picker_device_menu_recycler);
            this.e = (TextView) a3.findViewById(C0707R.id.picker_device_menu_close);
            a3.findViewById(C0707R.id.picker_device_menu_dialog).setOnClickListener(new b(this));
            a3.findViewById(C0707R.id.picker_device_menu_container).setOnClickListener(c.a);
        }
        this.e.setOnClickListener(new d(this));
        this.d.setLayoutManager(new LinearLayoutManager(this.a.F2()));
        this.d.setHasFixedSize(false);
    }

    @Override // com.spotify.music.features.connectui.picker.contextmenu.k
    public void c(RecyclerView.e<?> eVar) {
        this.d.setAdapter(eVar);
    }

    @Override // com.spotify.music.features.connectui.picker.contextmenu.k
    public void close() {
        this.a.a5(0);
    }

    @Override // com.spotify.music.features.connectui.picker.contextmenu.k
    public boolean d(Uri uri) {
        Context F2 = this.a.F2();
        if (F2 == null || uri == null) {
            return false;
        }
        PackageManager packageManager = F2.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        return !packageManager.queryIntentActivities(intent, 0).isEmpty();
    }

    @Override // com.spotify.music.features.connectui.picker.contextmenu.k
    public void e(String str) {
        this.b.setText(str);
    }

    @Override // com.spotify.music.features.connectui.picker.contextmenu.k
    public void f(int i) {
        this.a.a5(i);
    }

    @Override // com.spotify.music.features.connectui.picker.contextmenu.k
    public void setIcon(Drawable drawable) {
        this.c.setImageDrawable(drawable);
    }
}
