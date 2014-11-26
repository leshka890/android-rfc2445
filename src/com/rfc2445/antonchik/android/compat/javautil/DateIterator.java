// Copyright (C) 2006 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.rfc2445.antonchik.android.compat.javautil;

import java.util.Date;
import java.util.Iterator;

public interface DateIterator extends Iterator<Date> {

  /**
   * skips all dates in the series before the given date.
   *
   * @param newStartUtc non null.
   */
  void advanceTo(Date newStartUtc);

}
