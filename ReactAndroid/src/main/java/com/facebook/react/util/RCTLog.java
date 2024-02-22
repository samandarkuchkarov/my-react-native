/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.util;

import com.facebook.react.bridge.JavaScriptModule;

/**
 * JS module interface for RCTLog
 *
 * <p>The RCTLog module allows for showing native logs in JavaScript.
 */
public interface RCTLog extends JavaScriptModule {

  /**
   * Send a log to JavaScript.
   *
   * @param level The level of the log.
   * @param message The message to log.
   */
  void logIfNoNativeHook(String level, String message);
}
