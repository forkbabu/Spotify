package com.spotify.music.carmode.nowplaying.podcast.view.speedmenu;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.common.collect.ImmutableList;
import com.spotify.android.goldenpath.a;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.common.view.BackgroundColorView;
import java.util.List;

public class PlaybackSpeedMenuDialog extends AppCompatDialogFragment {
    public static final /* synthetic */ int x0 = 0;
    h u0;
    private List<g> v0;
    private PlaybackSpeedCloseButton w0;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.u0.d(this.v0, this.w0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.u0.e();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        Dialog dialog = new Dialog(l4(), C0707R.style.res_2132083506_theme_glue_noactionbar);
        View inflate = LayoutInflater.from(l4()).inflate(C0707R.layout.dialog_playback_speed_menu, (ViewGroup) null);
        ((BackgroundColorView) q4.G(inflate, C0707R.id.background_color_view)).setColor(D2().getInt("background_color"));
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.mo53add((ImmutableList.Builder) inflate.findViewById(C0707R.id.speed_control_1_button));
        builder.mo53add((ImmutableList.Builder) inflate.findViewById(C0707R.id.speed_control_2_button));
        builder.mo53add((ImmutableList.Builder) inflate.findViewById(C0707R.id.speed_control_3_button));
        builder.mo53add((ImmutableList.Builder) inflate.findViewById(C0707R.id.speed_control_4_button));
        builder.mo53add((ImmutableList.Builder) inflate.findViewById(C0707R.id.speed_control_5_button));
        this.v0 = builder.build();
        this.w0 = (PlaybackSpeedCloseButton) inflate.findViewById(C0707R.id.close_button);
        if (Build.VERSION.SDK_INT >= 21) {
            inflate.setSystemUiVisibility(768);
            q4.P(inflate, new ho2(inflate));
        }
        dialog.setContentView(inflate);
        a.a(dialog);
        dialog.getWindow().getAttributes().windowAnimations = C0707R.style.PlaybackSeedMenuDialogAnimation;
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }
}
