package com.google.android.material.bottomappbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

class b extends FloatingActionButton.a {
    final /* synthetic */ int a;
    final /* synthetic */ BottomAppBar b;

    class a extends FloatingActionButton.a {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public void b(FloatingActionButton floatingActionButton) {
            BottomAppBar.P(b.this.b);
        }
    }

    b(BottomAppBar bottomAppBar, int i) {
        this.b = bottomAppBar;
        this.a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(BottomAppBar.Q(this.b, this.a));
        floatingActionButton.u(new a());
    }
}
