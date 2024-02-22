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
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.LayoutShadowNode;

public class ModalHostViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & ModalHostViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public ModalHostViewManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "animationType":
        mViewManager.setAnimationType(view, (String) value);
        break;
      case "presentationStyle":
        mViewManager.setPresentationStyle(view, (String) value);
        break;
      case "transparent":
        mViewManager.setTransparent(view, value == null ? false : (boolean) value);
        break;
      case "statusBarTranslucent":
        mViewManager.setStatusBarTranslucent(view, value == null ? false : (boolean) value);
        break;
      case "hardwareAccelerated":
        mViewManager.setHardwareAccelerated(view, value == null ? false : (boolean) value);
        break;
      case "animated":
        mViewManager.setAnimated(view, value == null ? false : (boolean) value);
        break;
      case "supportedOrientations":
        mViewManager.setSupportedOrientations(view, (ReadableArray) value);
        break;
      case "identifier":
        mViewManager.setIdentifier(view, value == null ? 0 : ((Double) value).intValue());
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }
}
