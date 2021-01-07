package com.spotify.player.esperanto.proto;

import io.reactivex.s;
import io.reactivex.z;

public class k {

    public interface b {
        z<EsSessionResponse$SessionResponse> a(EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest);

        s<EsContextPlayerState$ContextPlayerState> b(EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest);

        z<EsResponseWithReasons$ResponseWithReasons> c(EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest);

        z<EsResponseWithReasons$ResponseWithReasons> d(EsPlay$PlayRequest esPlay$PlayRequest);

        s<EsQueue$Queue> e(EsGetQueueRequest$GetQueueRequest esGetQueueRequest$GetQueueRequest);

        z<EsResponseWithReasons$ResponseWithReasons> f(EsStop$StopRequest esStop$StopRequest);

        z<EsResponseWithReasons$ResponseWithReasons> g(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest);

        z<EsResponseWithReasons$ResponseWithReasons> h(EsResume$ResumeRequest esResume$ResumeRequest);

        z<EsResponseWithReasons$ResponseWithReasons> i(EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest);

        z<EsResponseWithReasons$ResponseWithReasons> j(EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest);

        s<EsContextPlayerError$ContextPlayerError> k(EsGetErrorRequest$GetErrorRequest esGetErrorRequest$GetErrorRequest);

        z<EsResponseWithReasons$ResponseWithReasons> l(EsPause$PauseRequest esPause$PauseRequest);

        z<EsResponseWithReasons$ResponseWithReasons> m(EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest);

        z<EsResponseWithReasons$ResponseWithReasons> n(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest);

        z<EsResponseWithReasons$ResponseWithReasons> o(EsSeekTo$SeekToRequest esSeekTo$SeekToRequest);

        z<EsResponseWithReasons$ResponseWithReasons> p(EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest);
    }

    private static class c extends uj0 implements b {
        c(vj0 vj0, a aVar) {
            super(vj0);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsSessionResponse$SessionResponse> a(EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "PreparePlay", esPreparePlay$PreparePlayRequest).A(c.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public s<EsContextPlayerState$ContextPlayerState> b(EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest) {
            return r("spotify.player.esperanto.proto.ContextPlayer", "GetState", esGetStateRequest$GetStateRequest).j0(d.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> c(EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "SetShufflingContext", esSetShufflingContext$SetShufflingContextRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> d(EsPlay$PlayRequest esPlay$PlayRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "Play", esPlay$PlayRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public s<EsQueue$Queue> e(EsGetQueueRequest$GetQueueRequest esGetQueueRequest$GetQueueRequest) {
            return r("spotify.player.esperanto.proto.ContextPlayer", "GetQueue", esGetQueueRequest$GetQueueRequest).j0(e.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> f(EsStop$StopRequest esStop$StopRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "Stop", esStop$StopRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> g(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "SetOptions", esSetOptions$SetOptionsRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> h(EsResume$ResumeRequest esResume$ResumeRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "Resume", esResume$ResumeRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> i(EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "SkipNext", esSkipNext$SkipNextRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> j(EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "PlayPrepared", esPlay$PlayPreparedRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public s<EsContextPlayerError$ContextPlayerError> k(EsGetErrorRequest$GetErrorRequest esGetErrorRequest$GetErrorRequest) {
            return r("spotify.player.esperanto.proto.ContextPlayer", "GetError", esGetErrorRequest$GetErrorRequest).j0(a.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> l(EsPause$PauseRequest esPause$PauseRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "Pause", esPause$PauseRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> m(EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "AddToQueue", esAddToQueueRequest$AddToQueueRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> n(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "SetQueue", esSetQueueRequest$SetQueueRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> o(EsSeekTo$SeekToRequest esSeekTo$SeekToRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "SeekTo", esSeekTo$SeekToRequest).A(b.a);
        }

        @Override // com.spotify.player.esperanto.proto.k.b
        public z<EsResponseWithReasons$ResponseWithReasons> p(EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest) {
            return q("spotify.player.esperanto.proto.ContextPlayer", "SkipPrev", esSkipPrev$SkipPrevRequest).A(b.a);
        }
    }

    public static b a(vj0 vj0) {
        return new c(vj0, null);
    }
}
