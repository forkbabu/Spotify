package com.spotify.music.features.fullscreen.story.logger;

import com.google.protobuf.u;
import com.spotify.messages.EndStory;
import com.spotify.music.features.fullscreen.story.logger.FullscreenStoryLogger;
import com.spotify.music.libs.fullscreen.story.domain.k;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.e1;
import defpackage.mqe;
import defpackage.nqe;

public class a implements FullscreenStoryLogger {
    private final ere a;
    private final e1 b;
    private final InteractionLogger c;
    private final ImpressionLogger d;
    private final gl0<u> e;
    private final String f;

    public a(ere ere, e1 e1Var, InteractionLogger interactionLogger, ImpressionLogger impressionLogger, gl0<u> gl0, String str) {
        ere.getClass();
        this.a = ere;
        e1Var.getClass();
        this.b = e1Var;
        interactionLogger.getClass();
        this.c = interactionLogger;
        impressionLogger.getClass();
        this.d = impressionLogger;
        gl0.getClass();
        this.e = gl0;
        str.getClass();
        this.f = str;
    }

    private void b(lqe<mqe, mqe.b> lqe, FullscreenStoryLogger.Impression impression, String str, int i, ImpressionLogger.ImpressionType impressionType, ImpressionLogger.RenderType renderType) {
        this.a.a(lqe);
        this.d.a(impression.toString(), str, i, impressionType, renderType);
    }

    private void c(lqe<mqe, mqe.b> lqe, FullscreenStoryLogger.Impression impression, String str, ImpressionLogger.ImpressionType impressionType, ImpressionLogger.RenderType renderType) {
        b(lqe, impression, str, -1, impressionType, renderType);
    }

    private void d(lqe<nqe, nqe.b> lqe, FullscreenStoryLogger.Interaction interaction, String str, int i, InteractionLogger.InteractionType interactionType, FullscreenStoryLogger.UserIntent userIntent) {
        this.a.a(lqe);
        this.c.a(interaction.toString(), str, i, interactionType, userIntent.toString());
    }

    @Override // com.spotify.music.features.fullscreen.story.logger.FullscreenStoryLogger
    public void a(k kVar) {
        FullscreenStoryLogger.UserIntent userIntent = FullscreenStoryLogger.UserIntent.MORE;
        ImpressionLogger.ImpressionType impressionType = ImpressionLogger.ImpressionType.ERROR;
        FullscreenStoryLogger.UserIntent userIntent2 = FullscreenStoryLogger.UserIntent.DISMISS;
        ImpressionLogger.ImpressionType impressionType2 = ImpressionLogger.ImpressionType.ITEM;
        ImpressionLogger.RenderType renderType = ImpressionLogger.RenderType.PAGE;
        InteractionLogger.InteractionType interactionType = InteractionLogger.InteractionType.HIT;
        if (kVar instanceof k.m) {
            k.m mVar = (k.m) kVar;
            String a2 = mVar.a();
            int b2 = mVar.b();
            d(this.b.h(a2, Integer.valueOf(b2), this.f).a(""), FullscreenStoryLogger.Interaction.NEXT_CHAPTER, this.f, b2, interactionType, FullscreenStoryLogger.UserIntent.NAVIGATE_FORWARD);
        } else if (kVar instanceof k.s) {
            k.s sVar = (k.s) kVar;
            String a3 = sVar.a();
            int b3 = sVar.b();
            d(this.b.k(a3, Integer.valueOf(b3), this.f).a(""), FullscreenStoryLogger.Interaction.PREVIOUS_CHAPTER, this.f, b3, interactionType, FullscreenStoryLogger.UserIntent.NAVIGATE_BACKWARD);
        } else if (kVar instanceof k.c) {
            k.c cVar = (k.c) kVar;
            String a4 = cVar.a();
            int b4 = cVar.b();
            d(this.b.o().b(a4, Integer.valueOf(b4), this.f).a(), FullscreenStoryLogger.Interaction.CLOSE, this.f, b4, interactionType, userIntent2);
        } else if (kVar instanceof k.d) {
            k.d dVar = (k.d) kVar;
            d(this.b.d(dVar.a(), Integer.valueOf(dVar.b()), this.f).a(), FullscreenStoryLogger.Interaction.CONTEXT_PLAYER, this.f, -1, interactionType, userIntent2);
        } else if (kVar instanceof k.b) {
            k.b bVar = (k.b) kVar;
            String a5 = bVar.a();
            int b5 = bVar.b();
            d(this.b.c(a5, Integer.valueOf(b5), this.f).a(), FullscreenStoryLogger.Interaction.BACK_BUTTON, this.f, b5, interactionType, userIntent2);
        } else if (kVar instanceof k.l) {
            k.l lVar = (k.l) kVar;
            String b6 = lVar.b();
            int c2 = lVar.c();
            boolean a6 = lVar.a();
            FullscreenStoryLogger.UserIntent userIntent3 = a6 ? FullscreenStoryLogger.UserIntent.HEARTED : FullscreenStoryLogger.UserIntent.UNHEARTED;
            e1.i.c d2 = this.b.i(b6, Integer.valueOf(c2), this.f).d(b6, Integer.valueOf(c2), this.f);
            d(a6 ? d2.a(b6) : d2.b(b6), FullscreenStoryLogger.Interaction.HEART_BUTTON, this.f, c2, interactionType, userIntent3);
        } else if (kVar instanceof k.i) {
            k.i iVar = (k.i) kVar;
            String b7 = iVar.b();
            int c3 = iVar.c();
            boolean a7 = iVar.a();
            FullscreenStoryLogger.UserIntent userIntent4 = a7 ? FullscreenStoryLogger.UserIntent.FOLLOWED : FullscreenStoryLogger.UserIntent.UNFOLLOWED;
            e1.i.b c4 = this.b.i(b7, Integer.valueOf(c3), this.f).c(b7, Integer.valueOf(c3), this.f);
            d(a7 ? c4.a(b7) : c4.b(b7), FullscreenStoryLogger.Interaction.FOLLOW_BUTTON, this.f, c3, interactionType, userIntent4);
        } else if (kVar instanceof k.p) {
            k.p pVar = (k.p) kVar;
            String a8 = pVar.a();
            int b8 = pVar.b();
            d(this.b.i(a8, Integer.valueOf(b8), this.f).b(a8, Integer.valueOf(b8), this.f).a(), FullscreenStoryLogger.Interaction.TRACK_CONTEXT_MENU_BUTTON, this.f, b8, interactionType, userIntent);
        } else if (kVar instanceof k.C0292k) {
            k.C0292k kVar2 = (k.C0292k) kVar;
            String a9 = kVar2.a();
            int b9 = kVar2.b();
            d(this.b.p(a9, Integer.valueOf(b9), this.f).a(), FullscreenStoryLogger.Interaction.VIDEO_CONTEXT_MENU_BUTTON, this.f, b9, interactionType, userIntent);
        } else if (kVar instanceof k.r) {
            k.r rVar = (k.r) kVar;
            String a10 = rVar.a();
            int b10 = rVar.b();
            d(this.b.o().c(a10, Integer.valueOf(b10), this.f).a(), FullscreenStoryLogger.Interaction.PLAYLIST_COVER, this.f, b10, interactionType, userIntent2);
        } else if (kVar instanceof k.o) {
            k.o oVar = (k.o) kVar;
            String b11 = oVar.b();
            int c5 = oVar.c();
            d(this.b.i(b11, Integer.valueOf(c5), this.f).e(oVar.a()), FullscreenStoryLogger.Interaction.TRACK_OVERLAY_BUTTON, this.f, c5, interactionType, FullscreenStoryLogger.UserIntent.PLAY);
        } else if (kVar instanceof k.w) {
            k.w wVar = (k.w) kVar;
            String a11 = wVar.a();
            int b12 = wVar.b();
            b(this.b.q(a11, Integer.valueOf(b12), this.f).a(), FullscreenStoryLogger.Impression.VIDEO_PLAYING, this.f, b12, impressionType2, renderType);
        } else if (kVar instanceof k.a) {
            k.a aVar = (k.a) kVar;
            String a12 = aVar.a();
            int b13 = aVar.b();
            b(this.b.b(a12, Integer.valueOf(b13), this.f).a(), FullscreenStoryLogger.Impression.AUDIO_PLAYING, this.f, b13, impressionType2, renderType);
        } else if (kVar instanceof k.v) {
            c(this.b.n(this.f).a(), FullscreenStoryLogger.Impression.STORY_VIEW_SHOWN, this.f, impressionType2, renderType);
        } else if (kVar instanceof k.h) {
            c(this.b.g(this.f).a(), FullscreenStoryLogger.Impression.ENTIRE_STORY_SHOWN, this.f, impressionType2, renderType);
        } else if (kVar instanceof k.t) {
            c(this.b.l(this.f).a(), FullscreenStoryLogger.Impression.STORY_FETCHED, this.f, impressionType2, renderType);
        } else if (kVar instanceof k.u) {
            c(this.b.m(this.f, ((k.u) kVar).a()).a(), FullscreenStoryLogger.Impression.STORY_FETCHING_FAILED, this.f, impressionType, renderType);
        } else if (kVar instanceof k.n) {
            ((k.n) kVar).a().isEmpty();
        } else if (kVar instanceof k.j) {
            ((k.j) kVar).a().isEmpty();
        } else if (kVar instanceof k.f) {
            c(this.b.f(this.f).a(), FullscreenStoryLogger.Impression.EMPTY_STORY, this.f, impressionType, renderType);
        } else if (kVar instanceof k.e) {
            c(this.b.e(this.f).a(), FullscreenStoryLogger.Impression.EMPTY_CHAPTER, this.f, impressionType, renderType);
        } else if (kVar instanceof k.q) {
            k.q qVar = (k.q) kVar;
            String a13 = qVar.a();
            int b14 = qVar.b();
            b(this.b.j(a13, Integer.valueOf(b14), this.f).a(), FullscreenStoryLogger.Impression.PLAYBACK_ERROR, this.f, b14, impressionType, renderType);
        } else if (kVar instanceof k.g) {
            long a14 = ((k.g) kVar).a();
            EndStory.b l = EndStory.l();
            l.n(this.f);
            l.m(a14);
            this.e.c(l.build());
        } else {
            throw new IllegalStateException("Unknown FullscreenStoryLog: " + kVar);
        }
    }
}
