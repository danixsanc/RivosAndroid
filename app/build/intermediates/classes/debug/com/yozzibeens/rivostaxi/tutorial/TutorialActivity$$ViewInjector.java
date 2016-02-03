// Generated code from Butter Knife. Do not modify!
package com.yozzibeens.rivostaxi.tutorial;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class TutorialActivity$$ViewInjector<T extends com.yozzibeens.rivostaxi.tutorial.TutorialActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558562, "field 'viewPager'");
    target.viewPager = finder.castView(view, 2131558562, "field 'viewPager'");
    view = finder.findRequiredView(source, 2131558563, "field 'circleIndicator'");
    target.circleIndicator = finder.castView(view, 2131558563, "field 'circleIndicator'");
    view = finder.findRequiredView(source, 2131558566, "field 'nextBtn' and method 'nextClicked'");
    target.nextBtn = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.nextClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558565, "field 'skipBtn' and method 'skipClicked'");
    target.skipBtn = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.skipClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558564, "field 'doneBtn' and method 'skipClicked'");
    target.doneBtn = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.skipClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558561, "field 'bg'");
    target.bg = finder.castView(view, 2131558561, "field 'bg'");
  }

  @Override public void reset(T target) {
    target.viewPager = null;
    target.circleIndicator = null;
    target.nextBtn = null;
    target.skipBtn = null;
    target.doneBtn = null;
    target.bg = null;
  }
}
