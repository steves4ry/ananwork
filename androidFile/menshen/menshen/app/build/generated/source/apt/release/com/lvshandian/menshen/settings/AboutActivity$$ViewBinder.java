// Generated code from Butter Knife. Do not modify!
package com.lvshandian.menshen.settings;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AboutActivity$$ViewBinder<T extends com.lvshandian.menshen.settings.AboutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558540, "field 'view'");
    target.view = view;
    view = finder.findRequiredView(source, 2131558542, "field 'ivBack'");
    target.ivBack = finder.castView(view, 2131558542, "field 'ivBack'");
    view = finder.findRequiredView(source, 2131558541, "field 'llParentView'");
    target.llParentView = finder.castView(view, 2131558541, "field 'llParentView'");
    view = finder.findRequiredView(source, 2131558543, "field 'tvTitle'");
    target.tvTitle = finder.castView(view, 2131558543, "field 'tvTitle'");
    view = finder.findRequiredView(source, 2131558545, "field 'textView'");
    target.textView = finder.castView(view, 2131558545, "field 'textView'");
  }

  @Override public void unbind(T target) {
    target.view = null;
    target.ivBack = null;
    target.llParentView = null;
    target.tvTitle = null;
    target.textView = null;
  }
}