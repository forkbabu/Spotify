package com.spotify.music.spotlets.scannables.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;

public class h implements g {
    private final Activity a;
    private final ViewGroup b;
    private final FrameLayout c;
    private final ProgressDialog d;
    private final ygd e;

    public h(Activity activity, ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z, ygd ygd) {
        this.a = activity;
        this.e = ygd;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.activity_scannable, viewGroup, false);
        this.b = viewGroup2;
        this.c = (FrameLayout) viewGroup2.findViewById(C0707R.id.camera_preview);
        ygd.c(this);
        this.d = new ProgressDialog(activity);
        ImageButton imageButton = (ImageButton) viewGroup2.findViewById(C0707R.id.scannable_cancel);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(activity, SpotifyIconV2.X, (float) activity.getResources().getDimensionPixelSize(C0707R.dimen.actionbar_search_drawables_size));
        spotifyIconDrawable.r(a.b(activity, R.color.white));
        imageButton.setImageDrawable(spotifyIconDrawable);
        imageButton.setOnClickListener(new d(this));
        Button button = (Button) viewGroup2.findViewById(C0707R.id.scannable_select_from_photos);
        button.setOnClickListener(new c(this));
        if (z) {
            button.setVisibility(8);
            ((TextView) viewGroup2.findViewById(C0707R.id.social_listening_privacy_notice)).setVisibility(0);
            ((TextView) viewGroup2.findViewById(C0707R.id.txt_scannable_instructions)).setText(C0707R.string.scannables_social_listening_viewfinder_hint);
        }
    }

    @Override // com.spotify.music.spotlets.scannables.view.g
    public void a() {
        this.e.k(g.p(new dhd(new ihd(), this.a, this.c), BackpressureStrategy.DROP));
    }

    @Override // com.spotify.music.spotlets.scannables.view.g
    public void b() {
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        if (intent.resolveActivityInfo(this.a.getPackageManager(), 0) != null) {
            this.a.startActivityForResult(intent, 4567);
        } else {
            Toast.makeText(this.a, (int) C0707R.string.scannables_no_gallery_app_installed, 0).show();
        }
    }

    @Override // com.spotify.music.spotlets.scannables.view.g
    public void c() {
        Activity activity = this.a;
        int i = ScannablesOnboardingActivity.H;
        activity.startActivityForResult(new Intent(activity, ScannablesOnboardingActivity.class), 10001);
    }

    @Override // com.spotify.music.spotlets.scannables.view.g
    public void d() {
        Vibrator vibrator = (Vibrator) this.a.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(100);
        }
    }

    @Override // com.spotify.music.spotlets.scannables.view.g
    public void e(String str) {
        this.e.a(str);
        Intent intent = new Intent();
        intent.putExtra("com.spotify.music.spotlets.scannables.RESULT", str);
        this.a.setResult(-1, intent);
        this.a.finish();
    }

    @Override // com.spotify.music.spotlets.scannables.view.g
    public void f() {
        Toast.makeText(this.a, (int) C0707R.string.scannables_error_message_toast, 0).show();
        this.a.setResult(0);
        this.a.finish();
    }

    @Override // com.spotify.music.spotlets.scannables.view.g
    public void g() {
        Toast.makeText(this.a, (int) C0707R.string.scannables_cant_retrieve_scannable, 1).show();
    }

    @Override // com.spotify.music.spotlets.scannables.view.g
    public void h() {
        this.d.dismiss();
    }

    @Override // com.spotify.music.spotlets.scannables.view.g
    public void i(int i, int i2) {
        this.d.setTitle(i);
        this.d.setMessage(this.a.getString(i2));
    }

    @Override // com.spotify.music.spotlets.scannables.view.g
    public void j() {
        this.d.show();
    }

    public View k() {
        return this.b;
    }

    public /* synthetic */ void l(View view) {
        this.a.setResult(0);
        this.e.h();
        this.a.finish();
    }

    public /* synthetic */ void m(View view) {
        this.e.j();
    }

    public void n(int i, int i2, Intent intent) {
        if (i != 4567) {
            if (i == 10001) {
                if (i2 == -1) {
                    this.e.e(this.a);
                    this.e.k(g.p(new dhd(new ihd(), this.a, this.c), BackpressureStrategy.DROP));
                    return;
                }
                this.a.setResult(0);
                this.a.finish();
            }
        } else if (i2 == -1) {
            this.e.b();
            this.e.i(this.a.getContentResolver(), intent.getData());
        } else {
            this.e.f();
        }
    }

    public void o() {
        this.e.g(this.a);
    }

    public void p() {
        this.e.d();
    }
}
