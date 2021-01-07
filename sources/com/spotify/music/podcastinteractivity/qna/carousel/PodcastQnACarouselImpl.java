package com.spotify.music.podcastinteractivity.qna.carousel;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.f;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replyrow.ReplyRowQnA;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.music.C0707R;
import com.spotify.music.podcastinteractivity.qna.overlay.ManageReplyBottomSheet;
import com.spotify.music.podcastinteractivity.qna.presenter.PodcastQnAPresenter;
import com.spotify.podcastinteractivity.qna.model.proto.Prompt;
import com.spotify.podcastinteractivity.qna.model.proto.Response;
import java.util.List;
import kotlin.jvm.internal.h;

public final class PodcastQnACarouselImpl implements ttc, vtc {
    private View a;
    private TextView b;
    private TextView c;
    private RecyclerView d;
    private FrameLayout e;
    private Component<ReplyRowQnA.Model, ReplyRowQnA.Events> f;
    private final a g = new a();
    private final o h;
    private final PodcastQnAPresenter i;
    private final ComponentFactory<Component<ReplyRowQnA.Model, ReplyRowQnA.Events>, ReplyRowQnA.Configuration> j;
    private final a k;
    private final g l;
    private final tvc m;
    private final rvc n;

    public static final class a extends RecyclerView.l {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            h.e(rect, "outRect");
            h.e(view, "view");
            h.e(recyclerView, "parent");
            h.e(yVar, "state");
            ((RecyclerView.LayoutParams) view.getLayoutParams()).b();
            rect.set(0, 0, 0, 0);
            rect.right = 16;
        }
    }

    static final class b implements DialogInterface.OnClickListener {
        final /* synthetic */ PodcastQnACarouselImpl a;

        b(PodcastQnACarouselImpl podcastQnACarouselImpl) {
            this.a = podcastQnACarouselImpl;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.a.i.a();
        }
    }

    static final class c implements DialogInterface.OnClickListener {
        public static final c a = new c();

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            h.e(dialogInterface, "dialog");
            dialogInterface.dismiss();
        }
    }

    public PodcastQnACarouselImpl(o oVar, PodcastQnAPresenter podcastQnAPresenter, ComponentFactory<Component<ReplyRowQnA.Model, ReplyRowQnA.Events>, ReplyRowQnA.Configuration> componentFactory, a aVar, g gVar, tvc tvc, rvc rvc) {
        h.e(oVar, "supportFragmentManager");
        h.e(podcastQnAPresenter, "presenter");
        h.e(componentFactory, "replyRowQnAFactory");
        h.e(aVar, "featuredResponseAdapter");
        h.e(gVar, "glueDialogBuilderFactory");
        h.e(tvc, "stringLinksHelper");
        h.e(rvc, "snackbarHelper");
        this.h = oVar;
        this.i = podcastQnAPresenter;
        this.j = componentFactory;
        this.k = aVar;
        this.l = gVar;
        this.m = tvc;
        this.n = rvc;
    }

    @Override // defpackage.vtc
    public void A(String str) {
        h.e(str, "episodeUri");
        h.e(str, "episodeUri");
        ManageReplyBottomSheet manageReplyBottomSheet = new ManageReplyBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putString("episodeUri", str);
        manageReplyBottomSheet.r4(bundle);
        manageReplyBottomSheet.Y4(this.h, "ManageReplyBottomSheetDialogFragment");
    }

    @Override // defpackage.vtc
    public void B() {
        this.n.a(C0707R.string.podcast_qna_response_sent_confirmation);
    }

    @Override // defpackage.vtc
    public void C() {
        this.n.a(C0707R.string.podcast_qna_response_deleted_confirmation);
    }

    @Override // defpackage.vtc
    public void D() {
        View view = this.a;
        if (view != null) {
            Resources resources = view.getResources();
            f c2 = this.l.c(resources.getString(C0707R.string.podcast_qna_terms_and_conditions_education_title), this.m.a(C0707R.string.podcast_qna_terms_and_conditions_education_body));
            c2.a(true);
            c2.e(resources.getString(C0707R.string.podcast_qna_cancel_button), PodcastQnACarouselImpl$showTermsAndConditions$1.a);
            c2.f(resources.getString(C0707R.string.podcast_qna_accept_button), new b(this));
            c2.b().a();
            return;
        }
        h.k("view");
        throw null;
    }

    @Override // defpackage.ttc
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "layoutInflater");
        h.e(viewGroup, "parentView");
        this.i.f(this);
        View inflate = layoutInflater.inflate(C0707R.layout.podcast_qna_carousel_view, viewGroup, false);
        h.d(inflate, "layoutInflater.inflate(R…_view, parentView, false)");
        this.a = inflate;
        if (inflate != null) {
            this.e = (FrameLayout) inflate.findViewById(C0707R.id.reply_row_container);
            this.b = (TextView) inflate.findViewById(C0707R.id.prompt_text_view);
            this.c = (TextView) inflate.findViewById(C0707R.id.featured_responses_text_view);
            this.d = (RecyclerView) inflate.findViewById(C0707R.id.featured_responses_recycler_view);
            Component<ReplyRowQnA.Model, ReplyRowQnA.Events> make = this.j.make();
            this.f = make;
            FrameLayout frameLayout = this.e;
            if (frameLayout != null) {
                if (make != null) {
                    frameLayout.addView(make.getView());
                } else {
                    h.k("replyRowQnAComponent");
                    throw null;
                }
            }
            View view = this.a;
            if (view != null) {
                return view;
            }
            h.k("view");
            throw null;
        }
        h.k("view");
        throw null;
    }

    @Override // defpackage.ttc
    public void b(String str) {
        h.e(str, "episodeUri");
        this.i.d(str);
    }

    @Override // defpackage.ttc
    public void stop() {
    }

    @Override // defpackage.vtc
    public void v(Prompt prompt) {
        h.e(prompt, "prompt");
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(prompt.i());
        }
    }

    @Override // defpackage.vtc
    public void w(boolean z) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        } else {
            h.k("view");
            throw null;
        }
    }

    @Override // defpackage.vtc
    public void x(ReplyRowQnA.Model model) {
        h.e(model, "model");
        Component<ReplyRowQnA.Model, ReplyRowQnA.Events> component = this.f;
        if (component != null) {
            component.render(model);
            component.onEvent(new PodcastQnACarouselImpl$bindReplyRowComponent$$inlined$with$lambda$1(this, model));
            return;
        }
        h.k("replyRowQnAComponent");
        throw null;
    }

    @Override // defpackage.vtc
    public void y() {
        View view = this.a;
        if (view != null) {
            f.a aVar = new f.a(view.getContext());
            aVar.m(C0707R.string.podcast_qna_blocked_user_title);
            aVar.g(C0707R.string.podcast_qna_blocked_user_message);
            aVar.i(C0707R.string.podcast_qna_blocked_user_text_button, c.a);
            aVar.a().show();
            return;
        }
        h.k("view");
        throw null;
    }

    @Override // defpackage.vtc
    public void z(List<Response> list) {
        h.e(list, "responses");
        if (list.isEmpty()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            TextView textView = this.c;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.d;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        RecyclerView recyclerView3 = this.d;
        if (recyclerView3 != null) {
            recyclerView3.k(this.g, -1);
            View view = this.a;
            if (view != null) {
                view.getContext();
                recyclerView3.setLayoutManager(new LinearLayoutManager(0, false));
                a aVar = this.k;
                aVar.X(list);
                recyclerView3.setAdapter(aVar);
                return;
            }
            h.k("view");
            throw null;
        }
    }
}
