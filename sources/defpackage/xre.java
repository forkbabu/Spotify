package defpackage;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.net.HostAndPort;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.j;
import io.netty.buffer.n;
import io.netty.channel.d;
import io.netty.channel.g;
import io.netty.channel.j0;
import io.netty.handler.codec.http.c0;
import io.netty.handler.codec.http.d0;
import io.netty.handler.codec.http.p;
import io.netty.handler.codec.http.q;
import io.netty.handler.codec.http.r;
import io.netty.handler.codec.http.u;
import io.netty.handler.ssl.g0;
import io.netty.util.c;
import io.netty.util.concurrent.s;
import io.reactivex.h;
import io.reactivex.i;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: xre  reason: default package */
public class xre implements i<d> {
    private static final byte[] k;
    private static final byte[] l;
    private final String a;
    private final String b;
    private final String c;
    private final ObjectMapper d;
    private final g0 e;
    private final j0 f;
    private final PlayerState g;
    private final byte[] h;
    private final HostAndPort i;
    private final pre j;

    /* renamed from: xre$a */
    public interface a {
        @JsonIgnore
        @JsonProperty("future")
        ImmutableList<ContextTrack> nextTracks();

        @JsonIgnore
        @JsonProperty("reverse")
        ImmutableList<ContextTrack> prevTracks();
    }

    static {
        Charset charset = Charsets.UTF_8;
        k = "\r\n".getBytes(charset);
        l = "content-type: application/json\r\ncontent-disposition: form-data; name=\"player-state\"\r\n\r\n".getBytes(charset);
    }

    public xre(String str, ObjectMapper objectMapper, g0 g0Var, j0 j0Var, PlayerState playerState, String str2, j jVar, pre pre, yre yre, String str3) {
        this.b = str;
        this.c = yre.a();
        this.d = objectMapper;
        this.e = g0Var;
        this.f = j0Var;
        this.g = playerState;
        this.h = str2.getBytes(Charsets.US_ASCII);
        this.i = HostAndPort.fromParts(jVar.b(), jVar.e());
        this.j = pre;
        this.a = str3;
    }

    public void a(h hVar, g gVar) {
        if (!gVar.x()) {
            Logger.d("Bootstrap connection was not successful", new Object[0]);
            if (!hVar.isCancelled()) {
                hVar.onError(new VoiceSessionException(ErrorDomain.CONNECTION, com.spotify.voice.api.model.i.d, gVar.r()));
                return;
            }
            return;
        }
        io.netty.handler.codec.http.h hVar2 = new io.netty.handler.codec.http.h(d0.r, u.n, this.c);
        r f2 = hVar2.f();
        c cVar = p.d;
        StringBuilder V0 = je.V0("multipart/mixed; boundary=");
        V0.append(this.a.substring(2));
        f2.y(cVar, V0.toString());
        f2.y(p.e, this.i.toString());
        c cVar2 = p.a;
        StringBuilder V02 = je.V0("Bearer ");
        V02.append(this.b);
        f2.y(cVar2, V02.toString());
        int i2 = c0.b;
        r f3 = hVar2.f();
        if (hVar2.c().g()) {
            f3.y(p.b, q.c);
        } else {
            f3.t(p.b);
        }
        c0.b(hVar2, true);
        Logger.b("sending speech-proxy request %s", hVar2);
        gVar.h().z(hVar2).mo86d((s<? extends io.netty.util.concurrent.r<? super Void>>) new lre(this, hVar));
    }

    public void b(h hVar, g gVar) {
        if (!hVar.isCancelled()) {
            if (!gVar.x()) {
                Throwable r = gVar.r();
                Logger.e(r, "Error while writing HTTP headers to speech-proxy active=%s", Boolean.valueOf(gVar.h().isActive()));
                hVar.onError(new VoiceSessionException(ErrorDomain.CONNECTION, com.spotify.voice.api.model.i.e, r));
                return;
            }
            d h2 = gVar.h();
            if (h2.isActive()) {
                io.netty.buffer.j c2 = h2.t().c();
                byte[] bytes = this.a.getBytes(Charsets.UTF_8);
                c2.U1(bytes);
                byte[] bArr = k;
                c2.U1(bArr);
                c2.U1(l);
                ObjectWriter writer = this.d.writer();
                n nVar = new n(c2);
                PlayerState playerState = this.g;
                if (playerState != null) {
                    writer.writeValue(nVar, playerState);
                } else {
                    writer.writeValue(nVar, new JSONObject());
                }
                c2.U1(bArr);
                c2.U1(bytes);
                c2.U1(bArr);
                c2.U1(this.h);
                c2.U1(bArr);
                c2.U1(bArr);
                h2.z(c2).mo86d((s<? extends io.netty.util.concurrent.r<? super Void>>) new kre(hVar));
            }
        }
    }

    @Override // io.reactivex.i
    public void subscribe(h<d> hVar) {
        fkf fkf = new fkf();
        fkf.j(this.f);
        fkf fkf2 = fkf;
        fkf2.d(vkf.class);
        fkf fkf3 = fkf2;
        fkf3.k(this.j.a(hVar, this.e, this.d, this.i));
        fkf3.v(this.i.getHost(), this.i.getPort()).mo86d((s<? extends io.netty.util.concurrent.r<? super Void>>) new mre(this, hVar));
    }
}
