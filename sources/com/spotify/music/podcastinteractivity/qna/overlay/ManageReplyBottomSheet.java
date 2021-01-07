package com.spotify.music.podcastinteractivity.qna.overlay;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.protobuf.StringValue;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.podcastinteractivity.qna.model.proto.Prompt;
import com.spotify.podcastinteractivity.qna.model.proto.Response;
import com.spotify.podcastinteractivity.qna.model.proto.ShowMetadata;
import com.spotify.podcastinteractivity.qna.proto.Timestamp;
import kotlin.jvm.internal.h;

public final class ManageReplyBottomSheet extends BottomSheetDialogFragment implements b {
    public mvc A0;
    private final b B0 = new b(this);
    private ImageView C0;
    private TextView D0;
    private EditText E0;
    private TextView F0;
    private TextView G0;
    private TextView H0;
    private Button I0;
    private ImageView J0;
    private TextView K0;
    private TextView L0;
    private Group M0;
    private Group N0;
    private TextView O0;
    public a v0;
    public nvc w0;
    public lqa x0;
    public pvc y0;
    public ovc z0;

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
                ((ManageReplyBottomSheet) this.b).e5().d();
            } else if (i == 1) {
                EditText editText = ((ManageReplyBottomSheet) this.b).E0;
                if (editText != null) {
                    ((ManageReplyBottomSheet) this.b).e5().i(editText.getText().toString());
                }
            } else if (i == 2) {
                ((ManageReplyBottomSheet) this.b).e5().b();
            } else {
                throw null;
            }
        }
    }

    public static final class b extends l62 {
        final /* synthetic */ ManageReplyBottomSheet a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ManageReplyBottomSheet manageReplyBottomSheet) {
            this.a = manageReplyBottomSheet;
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Button button;
            int i = 0;
            if (!(editable == null || (button = this.a.I0) == null)) {
                boolean z = true;
                if ((editable.length() == 0) || editable.length() > 250) {
                    z = false;
                }
                button.setEnabled(z);
            }
            ManageReplyBottomSheet manageReplyBottomSheet = this.a;
            if (editable != null) {
                i = editable.length();
            }
            ManageReplyBottomSheet.d5(manageReplyBottomSheet, 250 - i);
        }
    }

    public static final void d5(ManageReplyBottomSheet manageReplyBottomSheet, int i) {
        int i2;
        TextView textView;
        if (i > 30) {
            i2 = R.color.gray_50;
        } else if (i > 0) {
            i2 = R.color.gold;
        } else {
            i2 = R.color.bright_red;
        }
        if (manageReplyBottomSheet.F2() != null && (textView = manageReplyBottomSheet.O0) != null) {
            textView.setTextColor(androidx.core.content.a.b(textView.getContext(), i2));
            textView.setText(String.valueOf(i));
        }
    }

    @Override // com.spotify.music.podcastinteractivity.qna.overlay.b
    public void C1() {
        M4();
    }

    @Override // com.spotify.music.podcastinteractivity.qna.overlay.b
    public void F1() {
        mvc mvc = this.A0;
        if (mvc != null) {
            mvc.c();
        } else {
            h.k("errorStateHelper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        EditText editText = this.E0;
        String valueOf = String.valueOf(editText != null ? editText.getText() : null);
        a aVar = this.v0;
        if (aVar != null) {
            aVar.e(valueOf);
        } else {
            h.k("presenter");
            throw null;
        }
    }

    @Override // com.spotify.music.podcastinteractivity.qna.overlay.b
    public void M1(Response response) {
        ConstraintLayout constraintLayout;
        h.e(response, "response");
        View a3 = a3();
        if (!(a3 == null || (constraintLayout = (ConstraintLayout) a3.findViewById(C0707R.id.manage_reply_bottom_sheet_root)) == null)) {
            Resources R2 = R2();
            h.d(R2, "resources");
            double d = (double) R2.getDisplayMetrics().heightPixels;
            Double.isNaN(d);
            Double.isNaN(d);
            constraintLayout.setMinHeight(anf.a(d * 0.8d));
        }
        Group group = this.M0;
        if (group != null) {
            group.setVisibility(0);
        }
        Group group2 = this.N0;
        if (group2 != null) {
            group2.setVisibility(8);
        }
        TextView textView = this.F0;
        if (textView != null) {
            textView.setText(response.m());
        }
        TextView textView2 = this.F0;
        if (textView2 != null) {
            textView2.setMovementMethod(new ScrollingMovementMethod());
        }
        TextView textView3 = this.G0;
        if (textView3 != null) {
            pvc pvc = this.y0;
            if (pvc != null) {
                Timestamp l = response.l();
                h.d(l, "response.repliedAt");
                Resources R22 = R2();
                h.d(R22, "resources");
                textView3.setText(pvc.a(l, R22));
                return;
            }
            h.k("podcastQnADateUtils");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        String string;
        super.O3();
        Dialog P4 = P4();
        if (P4 != null) {
            BottomSheetBehavior o = BottomSheetBehavior.o(P4.findViewById(C0707R.id.design_bottom_sheet));
            o.t(false);
            o.x(3);
            View a3 = a3();
            if (a3 != null) {
                a3.requestLayout();
            }
        }
        Bundle D2 = D2();
        if (D2 != null && (string = D2.getString("episodeUri")) != null) {
            a aVar = this.v0;
            if (aVar != null) {
                h.d(string, "episodeUri");
                aVar.g(string);
                return;
            }
            h.k("presenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        a aVar = this.v0;
        if (aVar != null) {
            aVar.h();
        } else {
            h.k("presenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(F2(), SpotifyIconV2.EXCLAMATION_CIRCLE, (float) nud.g(16.0f, R2()));
        spotifyIconDrawable.r(androidx.core.content.a.b(l4(), R.color.white_70));
        TextView textView = this.H0;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setLinkTextColor(androidx.core.content.a.b(textView.getContext(), R.color.green));
        }
        ((Button) view.findViewById(C0707R.id.cancel_button)).setOnClickListener(new a(0, this));
        EditText editText = this.E0;
        if (editText != null) {
            editText.addTextChangedListener(this.B0);
        }
        Button button = this.I0;
        if (button != null) {
            button.setOnClickListener(new a(1, this));
        }
        TextView textView2 = this.L0;
        if (textView2 != null) {
            textView2.setOnClickListener(new a(2, this));
        }
        ovc ovc = this.z0;
        if (ovc != null) {
            LayoutInflater from = LayoutInflater.from(l4());
            h.d(from, "LayoutInflater.from(requireContext())");
            ovc.a(from, view);
            mvc mvc = this.A0;
            if (mvc != null) {
                View findViewById = view.findViewById(C0707R.id.error_overlay);
                h.c(findViewById);
                mvc.b((ViewGroup) findViewById);
                return;
            }
            h.k("errorStateHelper");
            throw null;
        }
        h.k("loadingIndicatorHelper");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int Q4() {
        return C0707R.style.DialogStyle;
    }

    @Override // com.spotify.music.podcastinteractivity.qna.overlay.b
    public void S1(ShowMetadata showMetadata) {
        h.e(showMetadata, "showMetadata");
        nvc nvc = this.w0;
        if (nvc != null) {
            ImageView imageView = this.C0;
            String i = showMetadata.i();
            h.d(i, "showMetadata.showImageUri");
            Context l4 = l4();
            h.d(l4, "requireContext()");
            nvc.a(imageView, i, l4);
            return;
        }
        h.k("imageLoaders");
        throw null;
    }

    @Override // com.spotify.music.podcastinteractivity.qna.overlay.b
    public void a2() {
        mvc mvc = this.A0;
        if (mvc != null) {
            mvc.d();
        } else {
            h.k("errorStateHelper");
            throw null;
        }
    }

    public final a e5() {
        a aVar = this.v0;
        if (aVar != null) {
            return aVar;
        }
        h.k("presenter");
        throw null;
    }

    @Override // com.spotify.music.podcastinteractivity.qna.overlay.b
    public void o0(String str) {
        h.e(str, "draft");
        Group group = this.M0;
        if (group != null) {
            group.setVisibility(8);
        }
        Group group2 = this.N0;
        if (group2 != null) {
            group2.setVisibility(0);
        }
        EditText editText = this.E0;
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(str.length());
            editText.requestFocus();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.music.podcastinteractivity.qna.overlay.b
    public void t1(IdentityV3$UserProfile identityV3$UserProfile) {
        h.e(identityV3$UserProfile, "currentUserProfile");
        StringValue n = identityV3$UserProfile.n();
        h.d(n, "currentUserProfile.name");
        String i = n.i();
        TextView textView = this.K0;
        if (textView != null) {
            textView.setText(i);
        }
        ImageView imageView = this.J0;
        if (imageView != null) {
            lqa lqa = this.x0;
            if (lqa != null) {
                String d = dqa.d(identityV3$UserProfile);
                StringValue o = identityV3$UserProfile.o();
                h.d(o, "currentUserProfile.username");
                lqa.a(imageView, d, o.i(), i, false, null);
                return;
            }
            h.k("profilePictureLoader");
            throw null;
        }
    }

    @Override // com.spotify.music.podcastinteractivity.qna.overlay.b
    public void v(Prompt prompt) {
        h.e(prompt, "prompt");
        TextView textView = this.D0;
        if (textView != null) {
            textView.setText(prompt.i());
        }
    }

    @Override // com.spotify.music.podcastinteractivity.qna.overlay.b
    public void v1(boolean z) {
        ovc ovc = this.z0;
        if (ovc != null) {
            ovc.b(z);
        } else {
            h.k("loadingIndicatorHelper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        a aVar = this.v0;
        if (aVar != null) {
            aVar.f(this);
            View inflate = layoutInflater.inflate(C0707R.layout.podcast_qna_manage_reply_bottom_sheet, viewGroup, false);
            this.C0 = (ImageView) inflate.findViewById(C0707R.id.show_image_view);
            this.D0 = (TextView) inflate.findViewById(C0707R.id.prompt_text_view);
            this.E0 = (EditText) inflate.findViewById(C0707R.id.reply_edit_text);
            this.F0 = (TextView) inflate.findViewById(C0707R.id.reply_text_view);
            this.G0 = (TextView) inflate.findViewById(C0707R.id.replied_time_text_view);
            this.H0 = (TextView) inflate.findViewById(C0707R.id.disclaimer_text_view);
            this.I0 = (Button) inflate.findViewById(C0707R.id.send_button);
            this.J0 = (ImageView) inflate.findViewById(C0707R.id.user_image_view);
            this.K0 = (TextView) inflate.findViewById(C0707R.id.user_name_text_view);
            this.L0 = (TextView) inflate.findViewById(C0707R.id.delete_button);
            this.M0 = (Group) inflate.findViewById(C0707R.id.see_response_group);
            this.N0 = (Group) inflate.findViewById(C0707R.id.reply_group);
            this.O0 = (TextView) inflate.findViewById(C0707R.id.response_count_text_view);
            return inflate;
        }
        h.k("presenter");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
    }
}
