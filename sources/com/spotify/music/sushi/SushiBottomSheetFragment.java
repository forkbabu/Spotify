package com.spotify.music.sushi;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.c;
import com.spotify.mobile.android.util.d0;
import com.spotify.music.C0707R;
import com.spotify.music.sushi.badge.SushiBadgeView;
import com.spotify.music.sushi.badge.a;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.spotify.player.model.BitrateLevel;
import java.io.Serializable;
import kotlin.jvm.internal.h;

public final class SushiBottomSheetFragment extends BottomSheetDialogFragment {

    static final class a implements DialogInterface.OnShowListener {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            BottomSheetBehavior<FrameLayout> e = this.a.e();
            h.d(e, "dialog.behavior");
            e.x(3);
            BottomSheetBehavior<FrameLayout> e2 = this.a.e();
            h.d(e2, "dialog.behavior");
            e2.w(true);
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ SushiBottomSheetFragment a;

        b(SushiBottomSheetFragment sushiBottomSheetFragment) {
            this.a = sushiBottomSheetFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.M4();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        c cVar = (c) super.R4(bundle);
        cVar.setOnShowListener(new a(cVar));
        return cVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        h.e(layoutInflater, "inflater");
        boolean z = false;
        View inflate = LayoutInflater.from(l4()).inflate(C0707R.layout.sushi_bottom_sheet, viewGroup, false);
        Bundle D2 = D2();
        Serializable serializable = D2 != null ? D2.getSerializable("key_current_level") : null;
        if (serializable != null) {
            BitrateLevel bitrateLevel = (BitrateLevel) serializable;
            SushiBadgeView sushiBadgeView = (SushiBadgeView) inflate.findViewById(C0707R.id.sushi_badge);
            BitrateLevel bitrateLevel2 = BitrateLevel.NORMALIZED;
            if (bitrateLevel == bitrateLevel2) {
                z = true;
            }
            sushiBadgeView.render(new a.C0351a(true, z));
            View findViewById = inflate.findViewById(C0707R.id.current_level_header);
            h.d(findViewById, "root.findViewById<TextVi….id.current_level_header)");
            ((TextView) findViewById).setText(d0.c("c68877321065083742680074196418781433226c47740d73106e19325272206206610c3206610533173713770335", "3976343265657a373068657477646c783433636c32746973796e76327272716273616d326a616c3363376a773935"));
            View findViewById2 = inflate.findViewById(C0707R.id.current_level_title);
            h.d(findViewById2, "root.findViewById<TextVi…R.id.current_level_title)");
            ((TextView) findViewById2).setText(com.spotify.music.superbird.setup.a.a(bitrateLevel));
            View findViewById3 = inflate.findViewById(C0707R.id.current_level_subtitle);
            h.d(findViewById3, "root.findViewById<TextVi…d.current_level_subtitle)");
            TextView textView = (TextView) findViewById3;
            h.e(bitrateLevel, "$this$subtitle");
            if (bitrateLevel == BitrateLevel.LOW) {
                str = d0.c("9b96506d5431516c1b7a066a0f674d6c4a69406a", "6468696d6231716c707a646a6667396c6569336a");
            } else if (bitrateLevel == BitrateLevel.NORMAL) {
                str = d0.c("cccb5d755771077a5861116307340c7512705a7a406f", "33356c756171377a78617a63653465756670757a336f");
            } else if (bitrateLevel == BitrateLevel.HIGH) {
                str = d0.c("938746674575006c497801331a6f0b39406f5b70046c", "6c7974677075366c69786a33786f6239346f7470776c");
            } else if (bitrateLevel == BitrateLevel.VERYHIGH) {
                str = d0.c("8ccb4b315e6d406c4a7118630b635c6516635b6f1a34", "733578316c6d706c6a717363696335656263746f6934");
            } else {
                str = bitrateLevel == bitrateLevel2 ? d0.c("95cd587043314532466a5e3815631e6f40381c6f4772", "6a336f7073317532666a35387763776f3438336f3472") : "";
            }
            textView.setText(str);
            ((SpotifyIconView) inflate.findViewById(C0707R.id.close_button)).setOnClickListener(new b(this));
            return inflate;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.player.model.BitrateLevel");
    }
}
