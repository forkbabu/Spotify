package com.spotify.music.cyoa.game;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.music.C0707R;
import com.spotify.music.cyoa.game.t;
import com.spotify.music.cyoa.model.CyoaGame;
import com.spotify.music.cyoa.model.CyoaGameOption;
import com.spotify.music.cyoa.model.CyoaGameStatus;
import com.squareup.picasso.Picasso;
import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class u implements t {
    private final y a;
    private final h b;
    private t.b c;
    private t.a d;
    private t.a e;
    private CyoaGameStatus f;
    private final Player g;
    private b h;
    private View i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private Button m;
    private Button n;
    private LayoutInflater o;

    public u(Context context, Player player, y yVar, Picasso picasso) {
        this.g = player;
        this.b = new h(context, picasso);
        this.a = yVar;
    }

    private void n() {
        ((Button) this.i.findViewById(C0707R.id.revealOptionsButton)).setVisibility(8);
        CyoaGameStatus cyoaGameStatus = this.f;
        if (cyoaGameStatus != null) {
            if (cyoaGameStatus.getAdditionalText() != null && !this.f.getAdditionalText().isEmpty()) {
                TextView textView = (TextView) this.i.findViewById(C0707R.id.additionalText);
                textView.setText(this.f.getAdditionalText());
                textView.setVisibility(0);
            }
            if (this.f.getOptions() == null || !this.f.getOptions().isEmpty()) {
                List<CyoaGameOption> options = this.f.getOptions();
                LinearLayout linearLayout = (LinearLayout) this.i.findViewById(C0707R.id.options);
                for (CyoaGameOption cyoaGameOption : options) {
                    TextView textView2 = (TextView) this.o.inflate(C0707R.layout.option_item, (ViewGroup) null);
                    textView2.setText(cyoaGameOption.getText());
                    textView2.setOnClickListener(new n(this, cyoaGameOption));
                    linearLayout.addView(textView2);
                }
                return;
            }
            this.i.findViewById(C0707R.id.gameOverNotice).setVisibility(0);
            this.n.setVisibility(0);
        }
    }

    @Override // com.spotify.music.cyoa.game.t
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.o = layoutInflater;
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_cyoa, viewGroup, false);
        this.i = inflate;
        this.k = (TextView) inflate.findViewById(C0707R.id.name);
        this.l = (TextView) this.i.findViewById(C0707R.id.desc);
        this.j = (ImageView) this.i.findViewById(C0707R.id.image);
        Button button = (Button) this.i.findViewById(C0707R.id.button);
        this.m = button;
        button.setOnClickListener(new m(this));
        Button button2 = (Button) this.i.findViewById(C0707R.id.tryAgainButton);
        this.n = button2;
        button2.setOnClickListener(new k(this));
        ((Button) this.i.findViewById(C0707R.id.revealOptionsButton)).setOnClickListener(new l(this));
        return this.i;
    }

    @Override // com.spotify.music.cyoa.game.t
    public View b() {
        return this.i;
    }

    @Override // com.spotify.music.cyoa.game.t
    public void c() {
        b bVar = this.h;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.spotify.music.cyoa.game.t
    public void d(t.b bVar) {
        this.c = bVar;
    }

    @Override // com.spotify.music.cyoa.game.t
    public void e(CyoaGameStatus cyoaGameStatus) {
        this.f = cyoaGameStatus;
        this.l.setVisibility(8);
        this.m.setVisibility(8);
        this.i.findViewById(C0707R.id.gameOverNotice).setVisibility(8);
        this.n.setVisibility(8);
        ((LinearLayout) this.i.findViewById(C0707R.id.options)).removeAllViews();
        PlayerContext create = PlayerContext.create(cyoaGameStatus.getEpisodeId(), new PlayerTrack[]{PlayerTrack.create(cyoaGameStatus.getEpisodeId())});
        PlayOptions.Builder builder = new PlayOptions.Builder();
        Boolean bool = Boolean.FALSE;
        this.g.play(create, builder.playerOptionsOverride(bool, bool, bool).seekTo(0L).build());
        ((Button) this.i.findViewById(C0707R.id.revealOptionsButton)).setVisibility(0);
        b bVar = this.h;
        if (bVar != null) {
            bVar.dispose();
        }
        double episodeDuration = (double) cyoaGameStatus.getEpisodeDuration();
        Double.isNaN(episodeDuration);
        this.h = s.W0(Math.round(episodeDuration * 0.8d), TimeUnit.MILLISECONDS).o0(this.a).subscribe(new j(this));
    }

    @Override // com.spotify.music.cyoa.game.t
    public void f(t.a aVar) {
        this.d = aVar;
    }

    @Override // com.spotify.music.cyoa.game.t
    public void g(t.a aVar) {
        this.e = aVar;
    }

    @Override // com.spotify.music.cyoa.game.t
    public void h(CyoaGame cyoaGame) {
        this.k.setText(cyoaGame.getName());
        this.l.setText(cyoaGame.getDescription());
        this.m.setText(cyoaGame.isContinue() ? "Continue" : "Start");
        this.b.d(this.j, cyoaGame.getImage());
    }

    public void i(CyoaGameOption cyoaGameOption, View view) {
        t.b bVar = this.c;
        if (bVar != null) {
            f fVar = (f) bVar;
            fVar.a.a(fVar.b, cyoaGameOption);
        }
    }

    public /* synthetic */ void j(View view) {
        t.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public /* synthetic */ void k(View view) {
        t.a aVar = this.e;
        if (aVar != null) {
            aVar.a();
        }
    }

    public /* synthetic */ void l(View view) {
        b bVar = this.h;
        if (bVar != null) {
            bVar.dispose();
        }
        n();
    }

    public /* synthetic */ void m(Long l2) {
        n();
    }
}
