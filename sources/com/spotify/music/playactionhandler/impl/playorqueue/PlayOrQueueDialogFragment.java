package com.spotify.music.playactionhandler.impl.playorqueue;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.subjects.PublishSubject;

public class PlayOrQueueDialogFragment extends BottomSheetDialogFragment implements c.a, mfd {
    x9d v0;
    PublishSubject<DialogResult> w0;

    public enum DialogResult {
        PLAY,
        QUEUE,
        CANCELED
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        Dialog R4 = super.R4(bundle);
        ((com.google.android.material.bottomsheet.c) R4).e().x(3);
        return R4;
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.SOCIAL_LISTENING_TAPTOQUEUE;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.o2;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.v0.x();
        this.w0.onNext(DialogResult.CANCELED);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string = k4().getString("uri");
        View inflate = layoutInflater.inflate(C0707R.layout.play_or_queue_dialog, viewGroup);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(F2(), SpotifyIconV2.PLAY, (float) nud.g(24.0f, R2()));
        Context l4 = l4();
        int i = R.color.gray_85;
        spotifyIconDrawable.r(androidx.core.content.a.b(l4, i));
        TextView textView = (TextView) inflate.findViewById(C0707R.id.play);
        textView.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setOnClickListener(new j(this, string));
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(F2(), SpotifyIconV2.ADD_TO_QUEUE, (float) nud.g(24.0f, R2()));
        spotifyIconDrawable2.r(androidx.core.content.a.b(l4(), i));
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.queue);
        textView2.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setOnClickListener(new k(this, string));
        return inflate;
    }
}
