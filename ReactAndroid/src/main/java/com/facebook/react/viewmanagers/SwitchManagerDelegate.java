/**
* Copyright (c) Facebook, Inc. and its affiliates.
*
* This source code is licensed under the MIT license found in the
* LICENSE file in the root directory of this source tree.
*
* @generated by codegen project: GeneratePropsJavaDelegate.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;

public class SwitchManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & SwitchManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public SwitchManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "disabled":
        mViewManager.setDisabled(view, value == null ? false : (boolean) value);
        break;
      case "value":
        mViewManager.setValue(view, value == null ? false : (boolean) value);
        break;
      case "tintColor":
        mViewManager.setTintColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      case "onTintColor":
        mViewManager.setOnTintColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      case "thumbTintColor":
        mViewManager.setThumbTintColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      case "thumbColor":
        mViewManager.setThumbColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      case "trackColorForFalse":
        mViewManager.setTrackColorForFalse(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      case "trackColorForTrue":
        mViewManager.setTrackColorForTrue(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }

  @Override
  public void receiveCommand(T view, String commandName, ReadableArray args) {
    switch (commandName) {
      case "setValue":
        mViewManager.setValue(view, args.getBoolean(0));
        break;
    }
  }
}
